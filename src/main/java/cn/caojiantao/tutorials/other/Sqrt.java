package cn.caojiantao.tutorials.other;

import java.math.BigDecimal;

/**
 * 求一个数的平方根，指定保留小数位
 *
 * @author caojiantao
 */
public class Sqrt {

    /**
     * 递归法
     *
     * @param n       数值
     * @param i       左边界
     * @param j       右边界
     * @param decimal 保留小数位
     * @return 指定精度平方根
     */
    public double sqrt(int n, double i, double j, int decimal) {
        double m = (j - i) / 2 + i, threshold = Math.pow(0.1, decimal), tmp = m * m;
        if (Math.abs(tmp - n) > threshold) {
            return tmp > n ? sqrt(n, i, m, decimal) : sqrt(n, m, j, decimal);
        } else {
            return new BigDecimal(m).setScale(decimal, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
    }

    /**
     * 循环法
     *
     * @param n       数值
     * @param decimal 保留小数位
     * @return 指定精度平方根
     */
    public double sqrt(int n, int decimal) {
        double i = 0, j = n, m, threshold = Math.pow(0.1, decimal);
        while (true) {
            m = (j - i) / 2 + i;
            double tmp = m * m;
            if (Math.abs(tmp - n) > threshold) {
                if (tmp > n) {
                    j = m;
                } else {
                    i = m;
                }
            } else {
                return new BigDecimal(m).setScale(decimal, BigDecimal.ROUND_HALF_UP).doubleValue();
            }
        }
    }
}
