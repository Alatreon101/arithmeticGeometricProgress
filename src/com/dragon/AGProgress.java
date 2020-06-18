package src.com.dragon;

/*
 *
 */

import java.util.Scanner;

public class AGProgress {

    public static void main(String[] args) {
        System.out.println("Ведите - geo для расчета геометрической прогрессии или - ari для арифметической. ");
        Scanner sc = new Scanner(System.in);
        String userChoose = sc.nextLine();

        if (userChoose.equals("geo")) {
            System.out.println("Ведите число для рассчета геометрической прогрессии: ");
        } else if (userChoose.equals("ari")) {
            System.out.println("Ведите число для рассчета арифметической прогрессии: ");
        } else {
            System.out.println("Ошибка ввода названия прогресии (ari/geo)");
            System.exit(1);
        }

        long userNumber = sc.nextLong();
        long sum = 0;

        switch (userChoose) {
            case "geo":
                for (int i = 0; i < userNumber; i++) {
                    sum += sum + sum + i;
                    System.out.print(sum + " ");
                }
                break;
            case "ari":
                for (int i = 0; i < userNumber; i++) {
                    sum += i;
                    System.out.print(sum + " ");
                }
                break;
        }
    }
}
