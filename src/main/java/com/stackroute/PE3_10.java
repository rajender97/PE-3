package com.stackroute;
//package com.java2novice.files;
import java.io.File;
import java.io.FilenameFilter;

public class PE3_10 {

        public static void main(String a[]){
            File file = new File("C:/MyFolder/");
            File[] files = file.listFiles(new FilenameFilter() {

                @Override
                public boolean accept(File dir, String name) {
                    if(name.toLowerCase().endsWith(".csv")){
                        return true;
                    } else {
                        return false;
                    }
                }
            });
            for(File f:files){
                System.out.println(f.getName());
            }
        }
    }

