package cn.caojiantao.tutorials.sort;

/**
 * @author caojiantao
 */
public class Fast implements ISort {

    @Override
    public void sort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private void sort(int[] data, int start, int end) {
        if (start < end) {
            int i = start, j = end, key = data[i];
            while (i < j) {
                while (i < j && data[j] >= key) j--;
                ArrayUtils.swap(data, i, j);
                while (i < j && data[i] < key) i++;
                ArrayUtils.swap(data, i, j);
            }
            sort(data, start, i - 1);
            sort(data, j + 1, end);
        }
    }
}
