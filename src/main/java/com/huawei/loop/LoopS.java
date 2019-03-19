package com.huawei.loop;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author rango
 * @date 2019/3/18 23:32
 */
//对于重复数据，加distinct，或注意是否有left rightjoin，没有写到
public class LoopS {
    public static int intial=0;
    public static int delay=1000;
    public static void main(String[] args) {

executeFixedDelay();

    }
        public static void executeFixedDelay() {
            ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
            executor.scheduleWithFixedDelay(
                    new EchoServer(),
                    intial,
                    delay,
                    TimeUnit.MILLISECONDS);
//                    abc(),
//                    0,
//                    1000,
//                    TimeUnit.MILLISECONDS);

        }

    private static class EchoServer implements Runnable {
        int i = -15;

        int b=-5;
        @Override
        public void run() {
            System.out.println("zhixng"+System.currentTimeMillis());

            if (i<0){

                System.out.println("执行关联");
                System.out.println(intial+"===="+delay);
                if (b>0){
                    System.out.println("关联成功");
                    Thread.currentThread().stop();
                }else {
                        intial=1;
                        delay=2000;
                    System.out.println(intial+"===="+delay);
                    System.out.println("再次执行关联");
                    b++;
                }
                i++;
                System.out.println("i="+i);
            }else {
                System.out.println("另一侧判断");
//            System.exit(0);

            }
        }
    }

//        public static Runnable abc(){
//        return ;
//        }
}
