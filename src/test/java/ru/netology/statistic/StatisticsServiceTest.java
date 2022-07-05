package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNewArray() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 0, 8, 13, 5, 3, 8, 6, 11, 11, 4};
        long expected = 13;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegative() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 0, 8, -1, 5, 3, 8, 6, 11, 11, 4};
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}
