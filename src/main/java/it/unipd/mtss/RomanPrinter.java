////////////////////////////////////////////////////////////////////
// FRANCESCO FERRAIOLI 2003606
// MATTEO CUSIN 2008073
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) throws InvalidLetterException, InvalidNumberException {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) throws InvalidLetterException {
        String[] result = new String[6];
        for(int i = 0; i < result.length; i++) { result[i] = ""; }
        char[] letters = romanNumber.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            switch (letters[i]) {
                case 'I':
                    result[0] +=   "  _____  ";  
                    result[1] +=   " |_   _| " ; 
                    result[2] +=   "   | |   " ;
                    result[3] +=   "   | |   " ;
                    result[4] +=   "  _| |_  " ; 
                    result[5] +=   " |_____| ";
                    break;
                case 'V':
                    result[0] +=   " __      __ ";
                    result[1] +=   " \\ \\    / / ";
                    result[2] +=   "  \\ \\  / /  ";
                    result[3] +=   "   \\ \\/ /   ";
                    result[4] +=   "    \\  /    ";
                    result[5] +=   "     \\/     ";
                    break;
                case 'X':
                    result[0] +=   " __   __ ";
                    result[1] +=   " \\ \\ / / ";
                    result[2] +=   "  \\ V /  ";
                    result[3] +=   "   > <   ";
                    result[4] +=   "  / . \\  ";
                    result[5] +=   " /_/ \\_\\ " ;
                    break;
                case 'L':
                    result[0] +=   "  _       ";
                    result[1] +=   " | |      ";
                    result[2] +=   " | |      ";
                    result[3] +=   " | |      ";
                    result[4] +=   " | |____  ";
                    result[5] +=   " |______| " ;
                    break;
                case 'C':
                    result[0] +=   "   _____  ";
                    result[1] +=   "  / ____| ";
                    result[2] +=   " | |      ";
                    result[3] +=   " | |      ";
                    result[4] +=   " | |____  ";
                    result[5] +=   "  \\_____| ";
                    break;
                case 'D':
                    result[0] +=   "  _____   ";
                    result[1] +=   " |  __ \\  ";
                    result[2] +=   " | |  | | ";
                    result[3] +=   " | |  | | ";
                    result[4] +=   " | |__| | ";
                    result[5] +=   " |_____/  ";
                    break;
                case 'M':
                    result[0] +=   "  __  __  ";
                    result[1] +=   " |  \\/  | ";
                    result[2] +=   " | \\  / | ";
                    result[3] +=   " | |\\/| | ";
                    result[4] +=   " | |  | | ";
                    result[5] +=   " |_|  |_| " ;
                    break;
                default:
                    throw new InvalidLetterException();
            }
        }
        for (int i = 0; i < 6; i++) { result[i] += "\n";}
        return result[0] + result[1] + result[2] + result[3] + result[4] + result[5];
    }
}