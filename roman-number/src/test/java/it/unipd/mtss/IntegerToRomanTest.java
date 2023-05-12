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
}
