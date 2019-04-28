package cn.caojiantao.tutorials.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author caojiantao
 */
public class SortTest {

    public static void main(String[] args) {
        ISort sort = new Fast();
        int size = 1000_0000;
        int[] data = new int[size];
        for (int i = 0; i < data.length; i++) data[i] = new Random().nextInt(size * 10);
        long s = System.currentTimeMillis();
        sort.sort(data);
        long e = System.currentTimeMillis();
        System.out.println("sort completed, cost " + (e - s) + " mills");
//        System.out.println(Arrays.toString(data));
    }
}
