package com.zhaoyfo.demo.io;

import java.util.concurrent.Callable;

public class Nio {
    public static void main(String[] args) {
        Nio nio = new Nio();
       for (int i=0;i<5;i++){
           nio.test();
           System.out.println("===========");
       }
    }

    public void test1() {
        System.out.println("test1被执行");
    }

    public void test2() {
        System.out.println("test2被执行");
    }

    public void test() {
        new Thread() {
            @Override
            public void run() {
                test1();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                test2();
            }
        }.start();
    }

}
