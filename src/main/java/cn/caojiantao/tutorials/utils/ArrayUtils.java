package cn.caojiantao.tutorials.utils;

import java.util.Random;

/**
 * @author caojiantao
 */
public class ArrayUtils {

    public static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static int[] initArray(int n) {
        int[] data = new int[n];
        for (int i = 0; i < data.length; i++) data[i] = new Random().nextInt(n * 10);
        return data;
    }
}
