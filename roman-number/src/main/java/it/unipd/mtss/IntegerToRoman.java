////////////////////////////////////////////////////////////////////
// Mircea Plamadeala 2009996
// Luca Marcato 2014720
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number){
    String result = "";
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