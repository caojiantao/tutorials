package cn.caojiantao.tutorials.sort;

import cn.caojiantao.tutorials.utils.ArrayUtils;

/**
 * @author caojiantao
 */
public class Bubble implements ISort {

    @Override
    public void sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    ArrayUtils.swap(data, j, j + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                System.out.println("the array is sorted. current i is " + i);
                break;
            }
        }
    }
}
