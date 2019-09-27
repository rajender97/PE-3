package com.stackroute;
import java.util.*;

public class chess {
    public static void main(String[] args){
        int i=8;
        int j;
        for(i=0;i<8;i++){
            if (i%2==0){
            for(j=0;j<4;j++){

                    System.out.print("WW");
                    System.out.print("|");
                    System.out.print("BB");
                    System.out.print("|");
                }

            }


            else {
                for(j=0;j<4;j++){

                    System.out.print("BB");
                    System.out.print("|");
                    System.out.print("WW");
                    System.out.print("|");

                }
            }
            System.out.println(" ");
        }
    }
}
