package nd.pkg5;

import java.util.Arrays;
import java.util.Scanner;

public class ND5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("------- Bubble Sort ------- ");
        System.out.println();
        System.out.println("Enter array size:");
        System.out.println();
        int amount = sc.nextInt();
        System.out.println();
        System.out.println("Generated arrays numbers");

        int[] numbers = new int[amount];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 90f) + 1;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println();
        System.out.println("------------------");
        System.out.println();
        System.out.println("Select sorting order:");
        System.out.println();
        System.out.println("'1' for increasing");
        System.out.println();
        System.out.println("'2' for decreasing");
        System.out.println();
        int order = sc.nextInt();
        System.out.println();

        if (order == 1) {
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }

        if (order == 2) {
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] < numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.println((i + 1) + " - " + numbers[i]);
        }
        System.out.println();
    }

}
