package ru.netology.stats;

public class StatsService {
    public int calculateSumSales(int[] sales) {
        int sum = 0; // сумма всех продаж

        for (int sale : sales) {
            sum += sale;
        }


        System.out.println(sum);


        return sum;
    }

    public double calculateAverage(int[] sales) {
        int sum = calculateSumSales(sales);
        int average = sum / 12;

        System.out.println(average);


        return average;

    }

    public int calculateMinSale(int[] sales) {
        int minSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSale]) {
                minSale = i;
            }
        }
        return minSale;
    }

    public int calculateMaxSale(int[] sales) {
        int maxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSale]) {
                maxSale = i;

            }
        }
        return maxSale;
    }

    public double calculateBelow(int[] sales) {
        int below = (int) calculateAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale < below) {
                count++;
            }
        }
        return count;
    }

    public double calculateAbove(int[] sales) {
        int below = (int) calculateAverage(sales);
        int count = 0;
        for (int sale : sales) {
            if (sale > below) {
                count++;
            }
        }
        return count;
    }
}



