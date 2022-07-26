package ru.netology.stats.javaqa41mvn.services;


public class StatsService {

    public long totalSales(long[] sales) {
        int sumMonths = 0;
        for (long sale : sales) {
            sumMonths += sale;
        }
        return sumMonths;
    }

    public long averageAmount(long[] sales) {
        int sumMonths = 0;
        int average = 0;
        if (sales.length > 0)

            for (long sale : sales) {
                sumMonths += sale;
            }
        return average = sumMonths / sales.length;
    }

    public long maxSales(long[] sales) {
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

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calcNumOfMonWithBelowAverageSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                count++;
            }
        }
        return count;
    }

    public int calcNumOfMonWithAboveAverageSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > averageAmount(sales)) {
                count++;
            }
        }
        return count;
    }
}