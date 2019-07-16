package com.example.webdemo.job;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建定时任务
 *
 * 1、fixedDelay控制方法执行的间隔时间，是以上一次方法执行完开始算起，如上一次方法执行阻塞住了，那么直到上一次执行完，并间隔给定的时间后，执行下一次。

   2、fixedRate是按照一定的速率执行，是从上一次方法执行开始的时间算起，如果上一次方法阻塞住了，下一次也是不会执行，但是在阻塞这段时间内累计应该执行的次数，当不再阻塞时，一下子把这些全部执行掉，而后再按照固定速率继续执行。

   3、cron表达式可以定制化执行任务，但是执行的方式是与fixedDelay相近的，也是会按照上一次方法结束时间开始算起。
 */
@Component
public class ScheduledTasks {

    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //每6秒执行一次
//    @Scheduled(fixedRate = 6000)
    public void test(){

        System.out.println("定时任务测试"+dateFormat.format(new Date()));

    }

    //隔6秒执行一次
//    @Scheduled(fixedDelay = 6000)
    public void test2(){

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }

        System.out.println("定时任务测试"+dateFormat.format(new Date()));

    }

    //隔6秒执行一次
    @Scheduled(initialDelay=10000,fixedDelay = 6000)
    public void test3(){

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }

        System.out.println("定时任务测试"+dateFormat.format(new Date()));

    }

}
