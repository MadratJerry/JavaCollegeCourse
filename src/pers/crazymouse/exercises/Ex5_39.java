package pers.crazymouse.exercises;

public class Ex5_39 {
    public static void main(String[] args) {
        double money = 0;
        double rateArr[] = {0.08, 0.1, 0.12};
        double taxArr[] = {5000, 10000};
        double computeArr[] = {5000, 5000};
        double res = 0;
        for (int i = 0; i < 2; i++) {
            if (money + computeArr[i] * rateArr[i] < 25000)
                money += computeArr[i] * rateArr[i];
            else
                res = (25000 - money) / rateArr[i] + taxArr[i];
        }
        if (res == 0)
            res = (25000 - money) / rateArr[2] + taxArr[1];
        System.out.println(res);
    }
}
