package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter any string:");
        Scanner input = new Scanner(System.in);
        String input2 = input.nextLine();
        System.out.println("the middle of the string: " + middle(input2));
    }
    public static String middle(String input) {
        int position = 0;
        int length = 0;
        if(input.length() % 2 ==0) {
            position = (input.length()/2) - 1;
            length = 2;
        } else {
            position = (input.length())/2;
            length = 1;
        }
        return input.substring(position ,position + length);
    }
}
