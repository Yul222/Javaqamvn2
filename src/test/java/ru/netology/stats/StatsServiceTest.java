package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.calculateSumSales(sale);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void Average() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long x;
        double actual = service.calculateAverage(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateMinSale() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMinSale(sale);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calculateMaxSale() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateMaxSale(sale);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calculateMonthBelow() {
        StatsService service = new StatsService();
        long [] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateMonthBelow(sale);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateMonthAbove() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateMonthAbove(sale);
        Assertions.assertEquals(expected, actual);
    }
}




