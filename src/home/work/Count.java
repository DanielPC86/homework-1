package home.work;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        System.out.print(run());
    }

    public static int run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number.");
        int start = sc.nextInt();
        System.out.println("Input a second number.");
        int finish = sc.nextInt();

        int aux;

        if (start > finish) {
            aux = start;
            start = finish;
            finish = aux;
        }
        System.out.println("The numbers from start to finish are: ");

        while (start < finish) {
            System.out.print(start + " ");
            start++;
        }
        return (start);
    }
}
