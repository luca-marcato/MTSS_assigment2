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

    @Test
    public void primiVentiNumeri()
    {
        String result11 = IntegerToRoman.convert(11);
        String result15 = IntegerToRoman.convert(15);
        String result19 = IntegerToRoman.convert(19);
        String result20 = IntegerToRoman.convert(20);

        assertEquals(result11, "XI");
        assertEquals(result15, "XV");
        assertEquals(result19, "XIX");
        assertEquals(result20, "XX");
    }

    @Test
    public void primiCinquantaNumeri()
    {
        String result21 = IntegerToRoman.convert(21);
        String result40 = IntegerToRoman.convert(15);
        String result49 = IntegerToRoman.convert(49);
        String result50 = IntegerToRoman.convert(50);

        assertEquals(result21, "XXI");
        assertEquals(result40, "XL");
        assertEquals(result49, "XLIX");
        assertEquals(result50, "L");
    }
}
