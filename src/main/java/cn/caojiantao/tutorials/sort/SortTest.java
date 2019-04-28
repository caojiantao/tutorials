package cn.caojiantao.tutorials.sort;

import cn.caojiantao.tutorials.utils.ArrayUtils;

/**
 * @author caojiantao
 */
public class SortTest {

    public static void main(String[] args) {
        ISort sort = new Fast();
        int size = 1000_0000;
        int[] data = ArrayUtils.initArray(size);
        long s = System.currentTimeMillis();
        sort.sort(data);
        long e = System.currentTimeMillis();
        System.out.println("sort completed, cost " + (e - s) + " mills");
//        System.out.println(Arrays.toString(data));
    }
}
