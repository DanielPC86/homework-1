package home.work;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        System.out.println(areaAndPerimeter());
    }

    public static String areaAndPerimeter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length.");
        double length = sc.nextDouble();
        System.out.println("Input width.");
        double width = sc.nextDouble();

        double area = length * width;
        double perim = 2 * (length + width);

        if ((length < 0) || (width < 0))
            return ("Error, lenght or width are negative.");

        else
            return (("The rectangle with the input numbers has area " + area) + (" and perimeter " + perim));

    }
}
