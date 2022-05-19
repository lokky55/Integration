package ru.netology.javaqa;

public class IncomeService {

    public int calcIncome(int age) {
        // if (age > 5 && age < 18)

        if (age < 5) {
            return 0;
        }

        if (age < 18) {
            return 1000;
        }

        if (age < 80) {
            return 50_000;
        }

        if (age >= 80) {
            return 20_000;
        }
        return -1;
    }
}
