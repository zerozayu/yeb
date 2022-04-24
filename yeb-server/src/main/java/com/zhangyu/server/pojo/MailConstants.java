package com.zhangyu.server.pojo;

/**
 * 消息状态
 *
 * @author zhangyu
 * @date 2022/4/22 16:41
 */
public class MailConstants {
    // 投递中
    public static final Integer DELIVERING = 0;

    // 消息投递成功
    public static final Integer SUCCESS = 1;

    // 消息投递失败
    public static final Integer FAILURE = 2;

    // 最大尝试次数
    public static final Integer MAX_TRY_COUNT = 3;

    // 消息超时时间
    public static final Integer MSG_TIMEOUT = 1;

    // 队列
    public static final String MAIL_QUEUE_NAME = "mail.queue";

    // 交换机
    public static final String MAIL_EXCHANGE_NAME = "mail.exchange";

    // 路由键
    public static final String MAIL_ROUTING_KEY_NAME = "mail.routing.key";
}
