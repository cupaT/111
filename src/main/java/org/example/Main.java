package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        int n = 500;
        List<String> result = sequence(n);
        System.out.println("First:");
        System.out.println(result);

        //2
        System.out.println("Second:");
        String str = "make install";
        System.out.println(reverseString(str));

        //3
        System.out.println("Third:");
        double a = 1, b = -3, c = 2;
        System.out.println(quadraticRoots(a, b, c));

        //4
        System.out.println("Fourth: ");
        System.out.println(calculateSeries(1e-6));

        //5
        System.out.println("Fifth:");
        String str1 = "level";
        System.out.println(isPalindrome(str1));
    }

    //1
    public static List<String> sequence(int n) {
        if (n <= 0)
            return null;

        List<String> sequence = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                if (i % 7 == 0)
                    sequence.add("fizzbuzz");
                else
                    sequence.add("fizz");
            } else if (i % 7 == 0) {
                sequence.add("buzz");
            } else
                sequence.add(String.valueOf(i));
        }

        return sequence;
    }

    //2
    public static String reverseString(String str) {
        if (str == null || str.isEmpty())
            return null;

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    //3
    public static String quadraticRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return "No real roots";
        }

        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        return root1 == root2 ? String.valueOf(root1) : root1 + ", " + root2;
    }

    //4
    public static double calculateSeries(double precision) {
        double sum = 0;
        int n = 2;
        double term;

        do {
            term = 1.0 / (n * n + n - 2);
            sum += term;
            n++;
        } while (term >= precision);

        return sum;
    }

    //5
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return false;

        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}