package com.codewithakshar;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Annual Interest Rate: ");
       double interestRate = Double.parseDouble(scanner.nextLine().trim());
       System.out.print("Period (Years): ");
       int years = Integer.parseInt(scanner.nextLine().trim());
       double monthlyInterestRate = (interestRate/100) / 12;
       double rn = Math.pow((1 + monthlyInterestRate), years);
       double upperEquation = monthlyInterestRate * rn;
       double lowerEquation = rn - 1;
       double mortgage = principal * (upperEquation / lowerEquation);
       String result = NumberFormat.getCurrencyInstance().format(mortgage);
       System.out.println("Mortgage: "+result);

    }
}



