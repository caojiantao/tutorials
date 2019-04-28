package cn.caojiantao.tutorials.find;

import cn.caojiantao.tutorials.utils.ArrayUtils;

/**
 * @author caojiantao
 */
public class ArrayFind {

    /**
     * 二分法
     */
    public int find(int[] data, int p, int q, int k) {
        int left = p, right = q;
        while (p < q) {
            int key = data[p];
            while (p < q && data[q] <= key) q--;
            ArrayUtils.swap(data, left, q);
            while (p < q && data[p] <= key) p++;
            ArrayUtils.swap(data, left, p);
        }
        if (k == p + 1) {
            return data[p];
        } else if (k > p + 1) {
            return find(data, p + 1, right, k);
        } else {
            return find(data, left, p - 1, k);
        }
    }

    /**
     * 冒泡法
     */
    public int find(int[] data, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j + 1] < data[j]) ArrayUtils.swap(data, j + 1, j);
            }
        }
        return data[data.length - k];
    }
}
