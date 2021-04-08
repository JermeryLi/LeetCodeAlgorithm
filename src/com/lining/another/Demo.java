package com.lining.another;

import java.util.concurrent.TimeUnit;

/**
 * @author lining
 * @date 2021/2/26 15:01
 */
public class Demo {

}

class MyData {
    volatile int number = 0;

    public void valueTo60() {
        this.number = 60;
    }

    public static void main(String[] args) {
        MyData myData = new MyData();
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.valueTo60();
        }).start();

        while (myData.number == 0) {

        }
        //越过绵绵的高山 越过无尽的沧海
        System.out.println(myData.number);
    }
}