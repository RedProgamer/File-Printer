package com.company;

import java.io.*;
import java.util.*;

class Reader {
    private String file1, file2;

    Reader(String file1, String file2) {
        this.file1 = file1;
        this.file2 = file2;
    }

    public void perform() {
        try {
            File creator = new File(file1);
//            creator.createNewFile();
            Scanner sc = new Scanner(creator);
            FileWriter myWriter = new FileWriter(file2);

            while(sc.hasNextLine()) {
                String data = sc.nextLine();
                myWriter.write(data);
            }
            sc.close();
            myWriter.close();
            System.out.println("Successfully Printed");

        }catch (IOException ect) {
            System.out.println("An error occurred");
            System.out.println(ect);
        }

    }
}

public class Main {
    public static void main(String[] args) {

        String file1 = "Text1.txt", file2 = "Text2.txt";

        Reader fileCalc = new Reader(file1, file2);
        fileCalc.perform();

    }
}
