package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class TestVacCalcService {

    @ParameterizedTest

    @CsvFileSource (files="src/test/resources/TestData.csv")


    public void SomeShit(int income, int expenses, int threshold, int expected) {


        VacationCalcService service = new VacationCalcService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }
}