package com.example.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Component
@Slf4j
public class AsynMain {

    public static Random random =new Random();

    @RequestMapping("/task2")
    public String task2() throws Exception{
        long start = System.currentTimeMillis();

        doTaskOne1();

        doTaskTwo1();

        doTaskThree1();
        long end = System.currentTimeMillis();

        log.info("完成异步任务，耗时：{}毫秒",(end - start));
        return"task2";

    }

    @RequestMapping("/task1")
    public String task1() throws Exception{
        long start = System.currentTimeMillis();
        doTaskOne();
        log.info("任务11111111111");

        doTaskTwo();
        log.info("任务2222222");

        doTaskThree();
        log.info("任务3333333");
        long end = System.currentTimeMillis();
        log.info("完成同步任务，耗时：{}毫秒",(end - start));
        return"task1";

    }

    @Async
    public void doTaskOne() throws Exception {

        System.out.println("开始做任务一");

        long start = System.currentTimeMillis();

        Thread.sleep(random.nextInt(10000));

        long end = System.currentTimeMillis();

        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");

    }


    //任务二;
    @Async
    public void doTaskTwo() throws Exception {

        System.out.println("开始做任务二");

        long start = System.currentTimeMillis();

        Thread.sleep(random.nextInt(10000));

        long end = System.currentTimeMillis();

        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");

    }



    //任务3;
    @Async
    public void doTaskThree() throws Exception {

        System.out.println("开始做任务三");

        long start = System.currentTimeMillis();

        Thread.sleep(random.nextInt(10000));

        long end = System.currentTimeMillis();

        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");

    }



    public void doTaskOne1() throws Exception {
        System.out.println("开始做任务一");
        long start = System.currentTimeMillis();

        Thread.sleep(random.nextInt(10000));

        long end = System.currentTimeMillis();

        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");

    }



    //任务二;
    public void doTaskTwo1() throws Exception {

        System.out.println("开始做任务二");

        long start = System.currentTimeMillis();

        Thread.sleep(random.nextInt(10000));

        long end = System.currentTimeMillis();

        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");

    }



    //任务三;
    public void doTaskThree1() throws Exception {

        System.out.println("开始做任务三");

        long start = System.currentTimeMillis();

        Thread.sleep(random.nextInt(10000));

        long end = System.currentTimeMillis();

        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");

    }

}
