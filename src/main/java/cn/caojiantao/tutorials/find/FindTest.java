package cn.caojiantao.tutorials.find;

import cn.caojiantao.tutorials.utils.ArrayUtils;

/**
 * @author caojiantao
 */
public class FindTest {


    public static void main(String[] args) {
        long s;

        ArrayFind find = new ArrayFind();
        int k = 1_000;
        int n = 100_0000;
        int[] a = ArrayUtils.initArray(n);

        s = System.currentTimeMillis();
        find.find(a, 0, a.length - 1, k);
        System.out.println("bubble cost " + (System.currentTimeMillis() - s));

        int[] b = ArrayUtils.initArray(n);
        s = System.currentTimeMillis();
        find.find(b, k);
        System.out.println("binary cost " + (System.currentTimeMillis() - s));
    }
}
