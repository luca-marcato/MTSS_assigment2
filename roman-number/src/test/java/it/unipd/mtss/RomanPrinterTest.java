package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest {
    @Test
    public void carattere_I() {
        try (
                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(1))
                    .thenReturn("I");

            String result = RomanPrinter.print(1);

            assertEquals(result,
                    " _____  \n" +
                            "|_   _| \n" +
                            "  | |   \n" +
                            "  | |   \n" +
                            " _| |_  \n" +
                            "|_____| ");

        }
    }

    @Test
    public void carattere_V() {
        try (
                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(5))
                    .thenReturn("V");

            String result = RomanPrinter.print(5);

            assertEquals(result,
                    "__      __ \n" +
                            "\\ \\    / / \n" +
                            " \\ \\  / /  \n" +
                            "  \\ \\/ /   \n" +
                            "   \\  /    \n" +
                            "    \\/     ");

        }
    }

    @Test
    public void carattere_X() {
        try (
                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(10))
                    .thenReturn("X");

            String result = RomanPrinter.print(10);

            assertEquals(result,
                    "__   __ \n" +
                            "\\ \\ / / \n" +
                            " \\ V /  \n" +
                            "  > <   \n" +
                            " / . \\  \n" +
                            "/_/ \\_\\ ");
        }
    }

    @Test
    public void carattere_L() {
        try (
                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(50))
                    .thenReturn("L");

            String result = RomanPrinter.print(50);

            assertEquals(result,
                    " _       \n" +
                            "| |      \n" +
                            "| |      \n" +
                            "| |      \n" +
                            "| |____  \n" +
                            "|______| ");
        }
    }

    @Test
    public void carattere_C() {
        try (
                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(100))
                    .thenReturn("C");

            String result = RomanPrinter.print(100);

            assertEquals(result,
                    "  _____  \n" +
                            " / ____| \n" +
                            "| |      \n" +
                            "| |      \n" +
                            "| |____  \n" +
                            " \\_____| ");
        }
    }

    @Test
    public void carattere_D() {
        try (
                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(500))
                    .thenReturn("D");

            String result = RomanPrinter.print(500);

            assertEquals(result,
                    " _____   \n" +
                            "|  __ \\  \n" +
                            "| |  | | \n" +
                            "| |  | | \n" +
                            "| |__| | \n" +
                            "|_____/  ");
        }
    }
}
