////////////////////////////////////////////////////////////////////
// Mircea Plamadeala 2009996
// Luca Marcato 2014720
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    public static String charI = " _____  \n"
            + "|_   _| \n"
            + "  | |   \n"
            + "  | |   \n"
            + " _| |_  \n"
            + "|_____| ";
    public static String charV = "__      __ \n"
            + "\\ \\    / / \n"
            + " \\ \\  / /  \n"
            + "  \\ \\/ /   \n"
            + "   \\  /    \n"
            + "    \\/     ";
    public static String charX = "__   __ \n"
            + "\\ \\ / / \n"
            + " \\ V /  \n"
            + "  > <   \n"
            + " / . \\  \n"
            + "/_/ \\_\\ ";
    public static String charL = " _       \n"
            + "| |      \n"
            + "| |      \n"
            + "| |      \n"
            + "| |____  \n"
            + "|______| ";
    public static String charC = "  _____  \n"
            + " / ____| \n"
            + "| |      \n"
            + "| |      \n"
            + "| |____  \n"
            + " \\_____| ";
    public static String charD = " _____   \n"
            + "|  __ \\  \n"
            + "| |  | | \n"
            + "| |  | | \n"
            + "| |__| | \n"
            + "|_____/  ";
    public static String charM = " __  __  \n"
            + "|  \\/  | \n"
            + "| \\  / | \n"
            + "| |\\/| | \n"
            + "| |  | | \n"
            + "|_|  |_| ";

    private static String printAsciiArt(String romanNumber) {
        String[] value = { "", "", "", "", "", "" };
        for (char i : romanNumber.toCharArray()) {
            switch (i) {
                case 'I':
                    value[0] += charI.split("\n")[0];
                    value[1] += charI.split("\n")[1];
                    value[2] += charI.split("\n")[2];
                    value[3] += charI.split("\n")[3];
                    value[4] += charI.split("\n")[4];
                    value[5] += charI.split("\n")[5];
                    break;
                case 'V':
                    value[0] += charV.split("\n")[0];
                    value[1] += charV.split("\n")[1];
                    value[2] += charV.split("\n")[2];
                    value[3] += charV.split("\n")[3];
                    value[4] += charV.split("\n")[4];
                    value[5] += charV.split("\n")[5];
                    break;
                case 'X':
                    value[0] += charX.split("\n")[0];
                    value[1] += charX.split("\n")[1];
                    value[2] += charX.split("\n")[2];
                    value[3] += charX.split("\n")[3];
                    value[4] += charX.split("\n")[4];
                    value[5] += charX.split("\n")[5];
                    break;
                case 'L':
                    value[0] += charL.split("\n")[0];
                    value[1] += charL.split("\n")[1];
                    value[2] += charL.split("\n")[2];
                    value[3] += charL.split("\n")[3];
                    value[4] += charL.split("\n")[4];
                    value[5] += charL.split("\n")[5];
                    break;
                case 'C':
                    value[0] += charC.split("\n")[0];
                    value[1] += charC.split("\n")[1];
                    value[2] += charC.split("\n")[2];
                    value[3] += charC.split("\n")[3];
                    value[4] += charC.split("\n")[4];
                    value[5] += charC.split("\n")[5];
                    break;
                case 'D':
                    value[0] += charD.split("\n")[0];
                    value[1] += charD.split("\n")[1];
                    value[2] += charD.split("\n")[2];
                    value[3] += charD.split("\n")[3];
                    value[4] += charD.split("\n")[4];
                    value[5] += charD.split("\n")[5];
                    break;
                case 'M':
                    value[0] += charM.split("\n")[0];
                    value[1] += charM.split("\n")[1];
                    value[2] += charM.split("\n")[2];
                    value[3] += charM.split("\n")[3];
                    value[4] += charM.split("\n")[4];
                    value[5] += charM.split("\n")[5];
                    break;
                default:
                    break;
            }
        }
        return value[0] + "\n" +
                value[1] + "\n" +
                value[2] + "\n" +
                value[3] + "\n" +
                value[4] + "\n" +
                value[5];
    }
}
