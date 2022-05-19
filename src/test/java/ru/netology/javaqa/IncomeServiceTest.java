package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeServiceTest {

    @Test
    public void ShouldNoIncome() {
        IncomeService service = new IncomeService();
        int age = 2;
        int actual = service.calcIncome(age);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldGetPocketMoney() {
        IncomeService service = new IncomeService();
        int age = 16;
        int actual = service.calcIncome(age);
        int expected = 1000;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldGetSalary() {
        IncomeService service = new IncomeService();
        int age = 50;
        int actual = service.calcIncome(age);
        int expected = 50_000;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldGetPension() {
        IncomeService service = new IncomeService();
        int age = 90;
        int actual = service.calcIncome(age);
        int expected = 20_000;
        Assertions.assertEquals(expected, actual);
    }
}
