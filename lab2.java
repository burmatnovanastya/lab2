import java.util.Scanner;

public class Main{

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Введите число: ");
            int inputNum = 0;
            while (s.hasNext()) {
                if ( s.hasNextInt() ) {
                    int number = s.nextInt();
                    if ( number > 0 && number < 15 ) {
                        inputNum = number;
                        break;
                    } else {
                        System.out.print("Ошибка! Введите целое неотрицательное число меньше 15: ");
                    }
                } else {
                    System.out.print("Ошибка! Введите целое неотрицательное число меньше 15: ");
                    s.next();
                }

            }
            long factorial = 1;
            for (int i = 1; i < inputNum + 1; i++) {
                factorial *= i;
            }
            System.out.println("Факториал = " + factorial);
            s.close();
        }


}
