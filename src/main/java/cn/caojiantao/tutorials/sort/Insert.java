package cn.caojiantao.tutorials.sort;

/**
 * @author caojiantao
 */
public class Insert implements ISort {

    @Override
    public void sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i], j = i - 1;
            for (; j >= 0; j--) {
                if (key < data[j]) data[j + 1] = data[j];
                else break;
            }
            data[j + 1] = key;
        }
    }
}
