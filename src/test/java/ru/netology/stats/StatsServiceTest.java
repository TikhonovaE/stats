package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalcSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSalesSum = 180;
        long actualSalesSum = service.salesSum(sales);
        Assertions.assertEquals(expectedSalesSum, actualSalesSum);
    }

    @Test
    public void shouldCalcAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSalesAveragePerMonth = 15;
        long actualSalesAveragePerMonth = service.salesAveragePerMonth(sales);
        Assertions.assertEquals(expectedSalesAveragePerMonth, actualSalesAveragePerMonth);
    }

    @Test
    public void shouldGetMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxSalesMonth = 8;
        long actualMaxSalesMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }

    @Test
    public void shouldGetMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinSalesMonth = 9;
        long actualMinSalesMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
    }

    @Test
    public void shouldCountMonthsLowerThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthsLowerThanAverage = 5;
        long actualMonthsLowerThanAverage = service.monthsLowerThanAverage(sales);
        Assertions.assertEquals(expectedMonthsLowerThanAverage, actualMonthsLowerThanAverage);
    }

    @Test
    public void shouldCountMonthsHigherThanAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonthsHigherThanAverage = 5;
        long actualMonthsHigherThanAverage = service.monthsHigherThanAverage(sales);
        Assertions.assertEquals(expectedMonthsHigherThanAverage, actualMonthsHigherThanAverage);
    }


}
