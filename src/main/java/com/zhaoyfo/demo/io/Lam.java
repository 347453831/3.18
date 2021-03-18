package com.zhaoyfo.demo.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lam {
    public static void main(String[] args) {
        Lam lam = new Lam();
        lam.test1();

    }

    public void test1() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(6);
        integers.add(2);
        integers.add(5);
        integers.sort((o1, o2) -> o1 - o2);


    }
}
