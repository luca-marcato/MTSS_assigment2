package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class IntegerToRomanTest {
    
    @Test
    public void primiTreNumeri()
    {
        String result1 = IntegerToRoman.convert(1);
        String result3 = IntegerToRoman.convert(3);

        assertEquals(result1, "I");
        assertEquals(result3, "III");
    }

    @Test
    public void primiSeiNumeri()
    {
        String result4 = IntegerToRoman.convert(4);
        String result6 = IntegerToRoman.convert(6);

        assertEquals(result4, "IV");
        assertEquals(result6, "VI");
    }

    @Test
    public void primiDieciNumeri()
    {
        String result7 = IntegerToRoman.convert(7);
        String result9 = IntegerToRoman.convert(9);
        String result10 = IntegerToRoman.convert(10);

        assertEquals(result7, "VII");
        assertEquals(result9, "IX");
        assertEquals(result10, "X");
    }
}
