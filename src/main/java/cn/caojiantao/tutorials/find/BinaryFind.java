package cn.caojiantao.tutorials.find;

/**
 * 二分法查找有序数据集合中，指定元素是否存在
 *
 * @author caojiantao
 */
public class BinaryFind {

    public boolean find(int[] data, int i, int j, int target) {
        if (i > j) return false;
        int middle = (j - i) / 2 + i;
        if (target > data[middle]) {
            return find(data, middle + 1, j, target);
        } else if (target < data[middle]) {
            return find(data, i, middle - 1, target);
        } else {
            return true;
        }
    }
}
