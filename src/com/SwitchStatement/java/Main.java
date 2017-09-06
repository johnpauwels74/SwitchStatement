package com.SwitchStatement.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Using a switch statement to convert numbers 1 to 10 to the Mandarin language.
        String OutputString;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();
        int NumberEntered = Integer.parseInt(input);
        
        switch (NumberEntered){
            case 1: OutputString = "壹";
                break;
            case 2: OutputString = "贰";
                break;
            case 3: OutputString = "叁";
                break;
            case 4: OutputString = "肆";
                break;
            case 5: OutputString = "伍";
                break;
            case 6: OutputString = "陆";
                break;
            case 7: OutputString = "柒";
                break;
            case 8: OutputString = "捌";
                break;
            case 9: OutputString = "玖";
                break;
            case 10: OutputString = "拾";
                break;
            default: OutputString = "Invalid entry. Please enter a number between 1 and 10.";
        }
        System.out.println(OutputString);
    }
}