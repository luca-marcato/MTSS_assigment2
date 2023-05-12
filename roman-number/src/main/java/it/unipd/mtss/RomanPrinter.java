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
        switch (romanNumber.charAt(0)) {
            case 'I':
                value[0] += " _____  ";
                value[1] += "|_   _| ";
                value[2] += "  | |   ";
                value[3] += "  | |   ";
                value[4] += " _| |_  ";
                value[5] += "|_____| ";
                break;
            case 'V':
                value[0] += "__      __ ";
                value[1] += "\\ \\    / / ";
                value[2] += " \\ \\  / /  ";
                value[3] += "  \\ \\/ /   ";
                value[4] += "   \\  /    ";
                value[5] += "    \\/     ";
                break;
            case 'X':
                value[0] += "__   __ ";
                value[1] += "\\ \\ / / ";
                value[2] += " \\ V /  ";
                value[3] += "  > <   ";
                value[4] += " / . \\  ";
                value[5] += "/_/ \\_\\ ";
                break;
            case 'L':
                value[0] += " _       ";
                value[1] += "| |      ";
                value[2] += "| |      ";
                value[3] += "| |      ";
                value[4] += "| |____  ";
                value[5] += "|______| ";
                break;
            case 'C':
                value[0] += "  _____  ";
                value[1] += " / ____| ";
                value[2] += "| |      ";
                value[3] += "| |      ";
                value[4] += "| |____  ";
                value[5] += " \\_____| ";
                break;
            case 'D':
                value[0] += " _____   ";
                value[1] += "|  __ \\  ";
                value[2] += "| |  | | ";
                value[3] += "| |  | | ";
                value[4] += "| |__| | ";
                value[5] += "|_____/  ";
                break;
        }
        return value[0] + "\n" + value[1] + "\n" + value[2] + "\n" + value[3] + "\n" + value[4] + "\n" + value[5];
    }
}
