package com.zhangyu.server.config;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.zhangyu.server.pojo.MailConstants;
import com.zhangyu.server.pojo.MailLog;
import com.zhangyu.server.service.MailLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置类
 *
 * @author zhangyu
 * @date 2022/4/24 21:48
 */
@Configuration
@Slf4j
public class RabbitMQConfig {
    @Autowired
    private CachingConnectionFactory cachingConnectionFactory;
    @Autowired
    private MailLogService mailLogService;

    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(cachingConnectionFactory);
        /**
         * 消息确认回调，确认消息是否到达broker
         * data：消息唯一标识
         * ack：确认结果
         * cause：失败原因
         */
        rabbitTemplate.setConfirmCallback((data, ack, cause) -> {
            String msgId = data.getId();
            if (ack) {
                log.info("{}===========>消息发送成功", msgId);
                mailLogService.update(new UpdateWrapper<MailLog>().set("status", 1).eq("msgId", msgId));
            } else {
                log.info("{}===========>消息发送失败", msgId);
            }
        });

        /**
         * 消息失败回调，比如router不到queue时回调
         * msg：消息主题
         * repCode：响应码
         * repText：响应描述
         * exchange：交换机
         * routingkey：路由键
         */
        rabbitTemplate.setReturnCallback((msg, resCode, repText, exchange, routingkey) -> {
            log.info("{}===========>消息发送queue失败", msg.getBody());
        });


        return rabbitTemplate;
    }


    @Bean
    public Queue queue() {
        return new Queue(MailConstants.MAIL_QUEUE_NAME);
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(MailConstants.MAIL_EXCHANGE_NAME);
    }

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue()).to(directExchange()).with(MailConstants.MAIL_ROUTING_KEY_NAME);
    }
}
