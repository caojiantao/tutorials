package cn.caojiantao.tutorials.sort;

/**
 * @author caojiantao
 */
public class ArrayUtils {

    public static void swap(int[] data, int i, int j) {
        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }
}
