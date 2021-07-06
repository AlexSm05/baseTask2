package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String readingFileName = "E://file.txt";
        try {
            Scanner scanner= new Scanner(new FileReader(readingFileName));
            int maxNumber=0,minNumber=999,sum=0;
            while (scanner.hasNext()){
                int buff=Integer.parseInt(scanner.next());
                if (maxNumber<buff) maxNumber=buff;
                if (minNumber>buff) minNumber=buff;
                sum=sum+buff;
            }
            System.out.println("Max number="+maxNumber+", min number="+minNumber+", Sum all numbers="+sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
