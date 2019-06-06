package com.teamtreehouse.reviews;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Craig", "Dennis", 5, "Love it!");
            printer.printRecord("Chris", "Racacciotti", "Pretty good, would be better with annotation.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
