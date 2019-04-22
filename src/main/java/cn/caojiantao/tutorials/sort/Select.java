package cn.caojiantao.tutorials.sort;

/**
 * @author caojiantao
 */
public class Select implements ISort {

    @Override
    public void sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int m = -1;
            for (int j = i; j < data.length; j++) if (m == -1 || data[j] < data[m]) m = j;
            ArrayUtils.swap(data, i, m);
        }
    }
}
