package ru.netology.stats;

public class StatsService {
    public long calculateSumSales(long[] sales) {
        long sum = 0; // сумма всех продаж

        for (long sale : sales) {
            sum += sale;
        }


        System.out.println(sum);


        return sum;
    }

    public double calculateAverage(long[] sales) {
        long sum = calculateSumSales(sales);
        long average = sum / 12;

        System.out.println(average);


        return average;

    }

    public long calculateMinSale(long[] sales) {
        long minSale = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] < sales[(int) minSale]) {
                minSale = i;
            }
        }
        return minSale;
    }

    public long calculateMaxSale(long[] sales) {
        long maxSale = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] > sales[(int) maxSale]) {
                maxSale = i;

            }
        }
        return maxSale;
    }

    public double calculateBelow(long[] sales) {
        long below = (long) calculateAverage(sales);
        long count = 0;
        for (long sale : sales) {
            if (sale < below) {
                count++;
            }
        }
        return count;
    }

    public double calculateAbove(long[] sales) {
        long below = (long) calculateAverage(sales);
        long count = 0;
        for (long sale : sales) {
            if (sale > below) {
                count++;
            }
        }
        return count;
    }
}



