////////////////////////////////////////////////////////////////////
// Mircea Plamadeala 2009996
// Luca Marcato 2014720
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number) throws IllegalArgumentException {
    if (number < 1 || number > 1000){
        throw new IllegalArgumentException(number + " is not valid");
    }
    String result = "";
    while (number >= 1000) {
        result += "M";
        number -= 1000;        }
    if (number >= 900) {
        result += "CM";
        number -= 900;
    }
    if (number >= 500) {
        result += "D";
        number -= 500;
    }
    if (number >= 400) {
        result += "CD";
        number -= 400;
    }
    while (number >= 100) {
        result += "C";
        number -= 100;
    }
    if (number >= 90) {
        result += "XC";
        number -= 90;
    }
    if (number >= 50) {
        result += "L";
        number -= 50;
    }
    while (number >= 40) {
        result += "XL";
        number -= 40;
    }
    while (number >= 10) {
        result += "X";
        number -= 10;
    }
    if (number >= 9) {
        result += "IX";
        number -= 9;
    }
    if (number >= 5) {
        result += "V";
        number -= 5;
    }
    if (number >= 4) {
        result += "IV";
        number -= 4;
    }
    while (number >= 1) {
        result += "I";
        number -= 1;
    }
    return result;
  }
}