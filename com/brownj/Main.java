package com.brownj;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("#######################################");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of fibonacci Sequence you want: ");
        String a = input.nextLine();
        try{
            int num = Integer.parseInt(a);
            FibSeq fibSeq = new FibSeq(num);
            fibSeq.showFib();
        } catch(NumberFormatException nfe) {
            System.out.println("The entry you provided is not a whole number, please try again...");
            System.out.println(nfe.getMessage());
            try{
                input.reset();
                System.out.print("Enter the length of fibonacci Sequence you want: ");
                a = input.nextLine();
                int num = Integer.parseInt(a);
                FibSeq fibSeq = new FibSeq(num);
                fibSeq.showFib();
            } catch(NumberFormatException nf) {
                System.out.println("You provided an entry again that is not a whole number, Have a good day...");
                System.out.println(nf.getMessage());
            }
        } finally{
            input.close();
        }
    }

}