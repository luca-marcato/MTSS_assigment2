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
        String result40 = IntegerToRoman.convert(40);
        String result49 = IntegerToRoman.convert(49);
        String result50 = IntegerToRoman.convert(50);

        assertEquals(result21, "XXI");
        assertEquals(result40, "XL");
        assertEquals(result49, "XLIX");
        assertEquals(result50, "L");
    }

    @Test
    public void primiCentoNumeri()
    {
        String result51 = IntegerToRoman.convert(51);
        String result90 = IntegerToRoman.convert(90);
        String result99 = IntegerToRoman.convert(99);
        String result100 = IntegerToRoman.convert(100);

        assertEquals(result51, "LI");
        assertEquals(result90, "XC");
        assertEquals(result99, "XCIX");
        assertEquals(result100, "C");
    }

    @Test
    public void primiCinquecentoNumeri()
    {
        String result101 = IntegerToRoman.convert(101);
        String result400 = IntegerToRoman.convert(400);
        String result499 = IntegerToRoman.convert(499);
        String result500 = IntegerToRoman.convert(500);

        assertEquals(result101, "CI");
        assertEquals(result400, "CD");
        assertEquals(result499, "CDXCIX");
        assertEquals(result500, "D");
    }

    @Test
    public void primiMilleNumeri()
    {
        String result501 = IntegerToRoman.convert(501);
        String result900 = IntegerToRoman.convert(900);
        String result999 = IntegerToRoman.convert(999);
        String result1000 = IntegerToRoman.convert(1000);

        assertEquals(result501, "DI");
        assertEquals(result900, "CM");
        assertEquals(result999, "CMXCIX");
        assertEquals(result1000, "M");
    }

    @Test(expected = IllegalArgumentException.class)
    public void lowerOutOfBounds()
    {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void upperOutOfBounds()
    {
        IntegerToRoman.convert(1001);
    }
}
