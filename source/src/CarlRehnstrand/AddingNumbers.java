package CarlRehnstrand;

import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 2 numbers: ");

    int intNumber1 = input.nextInt();
    int intNumber2 = input.nextInt();

    System.out.println(intNumber1 + intNumber2);
    input.close();
    }
}

