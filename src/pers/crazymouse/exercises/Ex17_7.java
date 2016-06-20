package pers.crazymouse.exercises;

import pers.crazymouse.exercises.myclass.Loan;

import java.io.*;

/**
 * Created by crazymouse on 6/16/16.
 */
public class Ex17_7 {
    public static void main(String[] args) throws IOException {
        File file = new File("file/Exercise17_07.dat");
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                Loan loan = (Loan) (input.readObject());
                System.out.println(loan.getTotalPayment());
            }
        } catch (EOFException ex) {
            System.out.println("All data were read");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found");
        }
    }
}
