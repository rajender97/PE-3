package com.stackroute;
import java.util.Arrays;
import java.util.Scanner;

public class series {
    public static void main(String[] args){
        Scanner Scan = new Scanner(System.in);
        int i;
        int x=0;
        try{
            String[] Array = new String[7];
            for(i=0;i<7;i++){
                Scanner str = new Scanner(System.in);
                System.out.println("enter the "+(i+1)+" number :");
                Array[i] = str.nextLine();
            }
            System.out.print("Entered Array : ");
            for(i=0;i<7;i++){

                System.out.print(Array[i]);
                System.out.print(",");
            }
            System.out.println(" ");
            Arrays.sort(Array);
            System.out.print("Sorted array :");
            for(i=0;i<7;i++){
                System.out.print(Array[i]);
                System.out.print(",");
            }

            for(i=0;i<6;i++){
                int difference = Integer.parseInt(Array[i + 1]) - Integer.parseInt(Array[i]);
                //System.out.println(difference);
                if (difference == 1 || difference == -1){
                    x++;
                }
                else{
                    for(int j=0;j<7;j++) {
                        System.out.print(Array[j]);
                        System.out.print(",");
                    }
                    System.out.print("you entered numbers are in not sequence");
                    break;
                }
            }
            if(x==6) {
                System.out.println(" ");

                for (i = 0; i < 7; i++) {

                    System.out.print(Array[i]);
                    System.out.print(",");
                }

                System.out.println("you enterd numbers are in sequence");
            }



        } catch (Exception e) {
        }
    }
}












