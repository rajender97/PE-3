package com.stackroute;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FirstAndLastWeek {

        public static void main(String []args){

            Calendar c = Calendar.getInstance();//get calender and set to current date and time

            c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);//set the calender to monday of currunt week

            System.out.println();

           // DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
            SimpleDateFormat simpleDate = new SimpleDateFormat("EEE dd/MM/yyyy");//print the dates of current week starting on monday

            System.out.println(simpleDate.format(c.getTime()));
            for (int i = 0; i <6; i++) {
                c.add(Calendar.DATE, 1);
            }
            System.out.println(simpleDate.format(c.getTime()));
            System.out.println();
        }
    }




