package pers.crazymouse.exercises;

public class Ex6_30 {
    public static void main(String[] args) {
        int sum = displayRollAndReturnSum();
        if (getResult(sum) == 0)
            System.out.println("You lose");
        else if (getResult(sum) == 1)
            System.out.println("You win");
        else {
            int point = sum;
            System.out.printf("point is %d\n", sum);
            while (true) {
                sum = displayRollAndReturnSum();
                if (sum == 7) {
                    System.out.print("You lose");
                    break;
                }
                if (sum == point) {
                    System.out.print("You win");
                    break;
                }
            }
        }
    }

    public static int getResult(int x) {
        if (x == 2 || x == 3 || x == 12)
            return 0;
        else if (x == 7 || x == 11)
            return 1;
        else
            return -1;
    }

    public static int GetRandomNumber(int x) {
        return (int) (Math.random() * (x)) + 1;
    }

    public static int displayRollAndReturnSum() {
        int x = GetRandomNumber(12);
        int y = GetRandomNumber(12);
        System.out.printf("Your rolled %d + %d = %d\n", x, y, x + y);
        return x + y;
    }
}
