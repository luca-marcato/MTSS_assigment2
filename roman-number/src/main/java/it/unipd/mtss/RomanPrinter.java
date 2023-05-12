////////////////////////////////////////////////////////////////////
// Mircea Plamadeala 2009996
// Luca Marcato 2014720
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] value = { "", "", "", "", "", "" };
        if (romanNumber.charAt(0) == 'I') {
            value[0] += " _____  ";
            value[1] += "|_   _| ";
            value[2] += "  | |   ";
            value[3] += "  | |   ";
            value[4] += " _| |_  ";
            value[5] += "|_____| ";
        }
        if (romanNumber.charAt(0) == 'V') {
            value[0] += "__      __ ";
            value[1] += "\\ \\    / / ";
            value[2] += " \\ \\  / /  ";
            value[3] += "  \\ \\/ /   ";
            value[4] += "   \\  /    ";
            value[5] += "    \\/     ";
        }
        return value[0] + "\n" + value[1] + "\n" + value[2] + "\n" + value[3] + "\n" + value[4] + "\n" + value[5];
    }
}
