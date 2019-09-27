package com.stackroute;
import java.util.*;

public class vowelRemove {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of places you want : ");
        int num = scan.nextInt();
        int i;
        String[] Array = new String[num];
        for(i=0;i<num;i++){
            Scanner str = new Scanner(System.in);
            System.out.println("enter the "+(i+1)+" place String :");
            Array[i] = str.nextLine();
        }
        for(i=0;i<num;i++){
            System.out.println("the entered places are : " +Array[i]);
        }
        for(i=0;i<num;i++){
            Array[i]=Array[i].replaceAll("[aeiou]","");
        }
        for (i=0;i<num;i++){
            System.out.println(Array[i]);
        }

    }
}
