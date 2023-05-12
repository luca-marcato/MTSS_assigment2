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
            utilities.when(() -> IntegerToRoman.convert(2))
                    .thenReturn("I");

            String result = RomanPrinter.print(1);

            assertEquals(result,
                    " _____  \n" +
                            "|_   _| \n" +
                            "  | |   \n" +
                            "  | |   \n" +
                            " _| |_  \n" +
                            "|_____| \n");

        }
    }
}
