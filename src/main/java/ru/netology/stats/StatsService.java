package ru.netology.stats;

public class StatsService {
    public long salesSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long salesAveragePerMonth(long[] sales) {
        return salesSum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int monthsLowerThanAverage(long[] sales) {
        int monthsLower = 0;
        for (long sale : sales) {
            if (sale < salesAveragePerMonth(sales)) {
                monthsLower = monthsLower + 1;
            }
        }
        return monthsLower;
    }

    public int monthsHigherThanAverage(long[] sales) {
        int monthsHigher = 0;
        for (long sale : sales) {
            if (sale > salesAveragePerMonth(sales)) {
                monthsHigher = monthsHigher + 1;
            }
        }
        return monthsHigher;
    }

}

