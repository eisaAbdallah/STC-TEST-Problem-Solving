package com.example.stctest;

import javax.swing.*;
import java.util.Scanner;

public class STCApplication {


    public static void main(String[] args) {
        JFrame f=new JFrame();
        String input=JOptionPane.showInputDialog(f,"Enter Input Need To Reverse : ");

        STCApplication.resverseString(input);

        JOptionPane.showMessageDialog(f, "thank you Check Your IDE Console");
    }


    public static void resverseString(String input) {

        boolean doubled = false;
        if (input.contains("(")) {
            String pranthesesData = input.substring(input.indexOf('(') + 1, input.indexOf(')'));
            char[] pranthesesDataToArray = pranthesesData.toCharArray();
            char firstCharacter = pranthesesDataToArray[0];
            char lastCharacter = pranthesesDataToArray[pranthesesDataToArray.length - 1];
            pranthesesDataToArray[0] = lastCharacter;
            pranthesesDataToArray[pranthesesDataToArray.length - 1] = firstCharacter;
            String reversedResult = new String(pranthesesDataToArray);
            String[] splittedFirstInput = input.split("\\(");
            String SecondPartInput = input.substring(input.indexOf(')') + 1);
            String reversedResultOfDoubledPrantheses = null;
            if (SecondPartInput.contains("(")) {
                String doubledPranthesesData = SecondPartInput.substring(input.indexOf('('), input.indexOf(')') + 1);

                char[] doublePranthesesDataToArray = doubledPranthesesData.toCharArray();
                char firstCharacterDoubled = doublePranthesesDataToArray[0];
                char lastCharacterDoubled = doublePranthesesDataToArray[doublePranthesesDataToArray.length - 1];
                doublePranthesesDataToArray[0] = lastCharacterDoubled;
                doublePranthesesDataToArray[doublePranthesesDataToArray.length - 1] = firstCharacterDoubled;

                reversedResultOfDoubledPrantheses = new String(doublePranthesesDataToArray);

                doubled = true;


            }

            if (doubled == true) {
                System.out.println("Input: " + input);
                System.out.println("output: " + splittedFirstInput[0] + "(" + reversedResult + ")" + SecondPartInput.split("\\(")[0] + "(" + reversedResultOfDoubledPrantheses + ")");

            } else {


                System.out.println("Input: " + input);
                System.out.println("output: " + splittedFirstInput[0] + "(" + reversedResult + ")" + SecondPartInput);
            }

        } else {
            String output = input;
            System.out.println("Input: " + input);
            System.out.println("output: " + output);
        }

    }
}





