package org.example;

public class Main {
    public static boolean main(String[] args) {
        System.out.println("Hello world!");
        return false;
    }

    //palindrome number:
    public static boolean isPalindrome(int num) {
        int orginalNum = Math.abs(num); //mutlak değer (negatif sayılar için)
        int reversedNum = 0;
        int temp = orginalNum;

        while (temp > 0) {
            int lastDigit = temp % 10; //son sayıyı buluyoruz
            reversedNum = reversedNum * 10 + lastDigit;
            temp /= 10;
        }
        return orginalNum == reversedNum;
    }

    //perfect number:
    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    //number to words:
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        StringBuilder result = new StringBuilder();
        String numberStr = Integer.toString(number);

        for (char digit : numberStr.toCharArray()) {
            result.append(words[digit - '0']).append(" ");
        }

        return result.toString().trim();
    }


}