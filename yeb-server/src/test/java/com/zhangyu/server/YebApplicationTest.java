package com.zhangyu.server;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhangyu
 * @date 2022/4/7 09:51
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class YebApplicationTest {

    @Test
    void main() {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        new Thread(() -> {
            long time1start = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(String.valueOf(i));
            }
            long time1end = System.currentTimeMillis();
            System.out.println("time1end:"+time1end);
            System.out.println((time1end - time1start));
            System.out.println("list" + list);
        }).start();
        new Thread(() -> {
            long time2start = System.currentTimeMillis();
            for (int i = 100; i < 200; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(String.valueOf(i));
            }
            long time2end = System.currentTimeMillis();
            System.out.println("time2end:"+time2end);
            System.out.println((time2end - time2start));
            System.out.println("list" + list);
        }).start();

        long time2 = System.currentTimeMillis();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i <200; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(String.valueOf(i));
        }
        System.out.println(list2);
        System.out.println("--list2 -- time--" + (System.currentTimeMillis() - time2));


    }

}