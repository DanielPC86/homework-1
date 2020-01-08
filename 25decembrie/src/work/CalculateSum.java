package work;

public class CalculateSum {
    public static void main(String[] args) {

        System.out.println("Sum of the first 100 numbers is: " + count());
    }

    public static int count() {
        int a = 1;
        int b = 100;
        int sum = 0;

        while (a <= b) {
            sum += a;
            a++;
        }
        return sum;
    }
}
