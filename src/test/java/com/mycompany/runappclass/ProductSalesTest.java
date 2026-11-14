package com.mycompany.runappclass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class tests the ProductSales class.
 * It must be placed in the Test Packages folder of the project,
 * not in the normal Source Packages folder.
 *
 * If your NetBeans project uses JUnit 4 instead of JUnit 5,
 * change the two import lines to:
 * import org.junit.Test;
 * import static org.junit.Assert.assertEquals;
 *
 * @author Amahle Lisah Khumalo
 */
public class ProductSalesTest {

    // The same data given in the question, used by both tests
    private final int[][] data = {
        {300, 150, 700},
        {250, 200, 600}
    };

    // One ProductSales object, used by both tests
    private final ProductSales ps = new ProductSales();

    // Tests that TotalSales returns the correct total (300+150+700+250+200+600 = 2200)
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        assertEquals(2200, ps.TotalSales(data));
    }

    // Tests that AverageSales returns the correct average (2200 / 6)
    // The third value (0.001) is the delta, which is needed because
    // we are comparing decimal numbers
    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        assertEquals(2200.0 / 6, ps.AverageSales(data), 0.001);
    }
}