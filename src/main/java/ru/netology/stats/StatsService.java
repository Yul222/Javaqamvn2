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

    public int calculateMinSale(long[] sales) {
        int minSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] < sales[(int) minSale]) {
                minSale = i;
            }
        }
        return (int) minSale;
    }

    public int calculateMaxSale(long[] sales) {
        int maxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[Math.toIntExact(i)] > sales[(int) maxSale]) {
                maxSale = i;

            }
        }
        return (int) maxSale;
    }

    public int calculateMonthBelow(long[] sales) {
        long monthAverageSale = (long) calculateAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < monthAverageSale) {
                count++;
            }
        }
        System.out.println(count);

        return (int) count;
    }

    public int calculateMonthAbove(long[] sales) {
        long monthAverageSale = (long) calculateAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > monthAverageSale) {
                count++;
            }
        }
        System.out.println(count);
        return (int) count;
    }
}



