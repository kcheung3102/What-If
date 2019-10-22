import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2,sumofNum;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sumofNum = num1 + num2;

        if(sumofNum > 200 && sumofNum < 1000) {
            System.out.println("*" + "~" + sumofNum);
        } else {
            System.out.println(sumofNum);
        }
    }
}
