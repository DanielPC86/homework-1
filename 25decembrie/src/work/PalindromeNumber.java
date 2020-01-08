package work;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(palindrome());
    }

    public static String palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number.");
        int a = sc.nextInt();

        int rest, sum = 0, temp;

        temp = a;

        while(a > 0){
            rest = a%10;
            sum = (sum * 10) + rest;
            a = a / 10;
        }

        if(temp==sum)
            return ("Numbers is palindrome.");
        else
            return ("Number is not palindrome.");
    }
}
