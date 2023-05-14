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

                        assertEquals(result, RomanPrinter.charI);

                }
        }

        @Test
        public void carattere_V() {
                try (
                                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
                        utilities.when(() -> IntegerToRoman.convert(5))
                                        .thenReturn("V");

                        String result = RomanPrinter.print(5);

                        assertEquals(result, RomanPrinter.charV);

                }
        }

        @Test
        public void carattere_X() {
                try (
                                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
                        utilities.when(() -> IntegerToRoman.convert(10))
                                        .thenReturn("X");

                        String result = RomanPrinter.print(10);

                        assertEquals(result, RomanPrinter.charX);
                }
        }

        @Test
        public void carattere_L() {
                try (
                                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
                        utilities.when(() -> IntegerToRoman.convert(50))
                                        .thenReturn("L");

                        String result = RomanPrinter.print(50);

                        assertEquals(result, RomanPrinter.charL);
                }
        }

        @Test
        public void carattere_C() {
                try (
                                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
                        utilities.when(() -> IntegerToRoman.convert(100))
                                        .thenReturn("C");

                        String result = RomanPrinter.print(100);

                        assertEquals(result, RomanPrinter.charC);
                }
        }

        @Test
        public void carattere_D() {
                try (
                                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
                        utilities.when(() -> IntegerToRoman.convert(500))
                                        .thenReturn("D");

                        String result = RomanPrinter.print(500);

                        assertEquals(result, RomanPrinter.charD);
                }
        }

        @Test
        public void carattere_M() {
                try (
                                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
                        utilities.when(() -> IntegerToRoman.convert(1000))
                                        .thenReturn("M");

                        String result = RomanPrinter.print(1000);

                        assertEquals(result, RomanPrinter.charM);
                }
        }

        @Test
        public void caratteri_IV() {
                try (
                                MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
                        utilities.when(() -> IntegerToRoman.convert(4))
                                        .thenReturn("IV");

                        String result = RomanPrinter.print(4);
                        String expected = "";

                        for (int i = 0; i < RomanPrinter.charI.split("\n").length; i++) {
                                expected += RomanPrinter.charI.split("\n")[i];
                                expected += RomanPrinter.charV.split("\n")[i];
                                if (i != RomanPrinter.charI.split("\n").length - 1) {
                                        expected += "\n";
                                }
                        }
                        assertEquals(result, expected);
                }
        }
}
