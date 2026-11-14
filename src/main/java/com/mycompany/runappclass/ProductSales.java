package com.mycompany.runappclass;

/**
 * This class implements the IProduct interface.
 * It has one method for each calculation: total, average, maximum
 * and minimum sales. All four methods work on the same 2D array,
 * where each row is a year and each column is a quarter.
 *
 * @author Amahle Lisah Khumalo
 */
public class ProductSales implements IProduct {

    // Adds up every sale in the 2D array and returns the total
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;

        // Go through every row (year)
        for (int row = 0; row < productSales.length; row++) {
            // Go through every column (quarter) in that row
            for (int col = 0; col < productSales[row].length; col++) {
                total = total + productSales[row][col];
            }
        }

        return total;
    }

    // Returns the average sale. It reuses TotalSales so the
    // adding up is not written twice (no duplicate code)
    @Override
    public double AverageSales(int[][] productSales) {
        int count = 0;

        // Count how many sales there are in total
        for (int row = 0; row < productSales.length; row++) {
            count = count + productSales[row].length;
        }

        // (double) is used so the division does not drop the decimals
        return (double) TotalSales(productSales) / count;
    }

    // Finds and returns the biggest sale in the 2D array
    @Override
    public int MaxSale(int[][] productSales) {
        // Start with the very first sale, not 0,
        // in case every sale is smaller than 0
        int max = productSales[0][0];

        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > max) {
                    max = productSales[row][col];
                }
            }
        }

        return max;
    }

    // Finds and returns the smallest sale in the 2D array
    @Override
    public int MinSale(int[][] productSales) {
        // Start with the very first sale, not 0,
        // or the minimum would always come out as 0
        int min = productSales[0][0];

        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] < min) {
                    min = productSales[row][col];
                }
            }
        }

        return min;
    }
}