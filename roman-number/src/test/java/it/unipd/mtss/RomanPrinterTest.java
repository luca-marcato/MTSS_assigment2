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
    public void carattere_I() {
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
}
