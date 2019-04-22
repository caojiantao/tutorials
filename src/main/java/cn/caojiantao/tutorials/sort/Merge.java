package cn.caojiantao.tutorials.sort;

/**
 * @author caojiantao
 */
public class Merge implements ISort {

    @Override
    public void sort(int[] data) {
        sort(data, 0, data.length - 1);
    }

    private void sort(int[] data, int start, int end) {
        if (start < end) {
            int m = (start + end) / 2, i = start, j = m + 1, cursor = 0;
            // 分
            sort(data, start, m);
            sort(data, m + 1, end);
            // 而治之
            int[] tmp = new int[end - start + 1];
            while (i <= m && j <= end) tmp[cursor++] = (data[i] <= data[j]) ? data[i++] : data[j++];
            while (i <= m) tmp[cursor++] = data[i++];
            while (j <= end) tmp[cursor++] = data[j++];
            System.arraycopy(tmp, 0, data, start, tmp.length);
        }
    }
}
