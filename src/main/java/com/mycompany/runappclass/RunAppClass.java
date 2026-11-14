package com.mycompany.runappclass;

/**
 * This class runs the program (it has the main method).
 * It builds the product sales data, prints it as a table of rows
 * and columns, and then prints the total, average, maximum and
 * minimum sales using the ProductSales class.
 *
 * @author Amahle Lisah Khumalo
 */
public class RunAppClass {

    public static void main(String[] args) {

        // 1D array to store the column headings (the quarters)
        String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};

        // 2D array to store the sales
        // Each row = a year, each column = a quarter
        int[][] productSales = {
            {300, 150, 700},   // Year 1
            
            {250, 200, 600}    // Year 2
        };

        // One ProductSales object is used for all the calculations
        ProductSales ps = new ProductSales();

        // ---------- Print the report heading ----------
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("--------------------------------");

        // ---------- Print the column headings (the quarters) ----------
        System.out.printf("%-8s", "");
        for (int col = 0; col < quarters.length; col++) {
            System.out.printf("%-12s", quarters[col]);
        }
        System.out.println();

        // ---------- Print each year (row) and its sales (columns) ----------
        for (int row = 0; row < productSales.length; row++) {
            System.out.printf("%-8s", "YEAR " + (row + 1));

            for (int col = 0; col < productSales[row].length; col++) {
                System.out.printf("%-12d", productSales[row][col]);
            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        // ---------- Print the total, average, maximum and minimum ----------
        System.out.println("Total sales:   " + ps.TotalSales(productSales));
        System.out.printf("Average sales: %.0f%n", ps.AverageSales(productSales));
        System.out.println("Maximum sale:  " + ps.MaxSale(productSales));
        System.out.println("Minimum sale:  " + ps.MinSale(productSales));
        System.out.println("--------------------------------");
    }
}