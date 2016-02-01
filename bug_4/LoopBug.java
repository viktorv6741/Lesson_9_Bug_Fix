package bug_4;

import java.util.Scanner;

public class LoopBug {
    public static void main(String[] args) {

        System.out.println("Enter an integer: ");

        Scanner entry = new Scanner(System.in);
        int input1 = entry.nextInt();

        System.out.println("Enter another integer: ");
        int input2 = entry.nextInt();

        int total = input1 + input2;



        while (total > 0) // I would like to change this condition
        {
            System.out.println(total + "\nEnter another interger:  ");
            total += entry.nextInt();
        }


        /*  while (input2 > 0) {
            System.out.println(total + "\nEnter another interger:  ");
            total += entry.nextInt();

            break;
        }*/


    }
}
