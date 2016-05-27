package pers.crazymouse.exercises;

import java.math.BigDecimal;

public class Ex10_20 {
    public static void main(String[] args) {
        BigDecimal result = new BigDecimal("1");

        for (int i = 1; i <= 10; i++) {
            BigDecimal tmp = new BigDecimal("1");
            tmp = tmp.setScale(2, BigDecimal.ROUND_HALF_UP);
            for (int j = 1; j <= i * 100; j++) {
                tmp = tmp.divide(new BigDecimal("" + j));

                System.out.println(tmp);
                result.add(tmp);
            }
        }
        System.out.println(result);
    }

}
