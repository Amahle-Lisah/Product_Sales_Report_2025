package com.mycompany.runappclass;

/**
 * This is the interface for the product sales report.
 * It only lists the four methods that must be made. It does not say
 * how they work - the ProductSales class writes the actual code.
 *
 * Note: the question text calls this "IProductSales", but the marking
 * rubric names the interface IProduct, so IProduct is used here.
 *
 * @author Amahle Lisah Khumalo
 */
public interface IProduct {

    // Returns the total of all the sales in the 2D array
    int TotalSales(int[][] productSales);

    // Returns the average of all the sales in the 2D array
    double AverageSales(int[][] productSales);

    // Returns the biggest sale in the 2D array
    int MaxSale(int[][] productSales);

    // Returns the smallest sale in the 2D array
    int MinSale(int[][] productSales);
}