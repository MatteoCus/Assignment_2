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
        String result = "";
        switch (romanNumber) {
            case "I":
                result +=   "  _____  \n" +  
                            " |_   _| \n" + 
                            "   | |   \n" +
                            "   | |   \n" +
                            "  _| |_  \n" + 
                            " |_____| \n";
                break;
            case "V":
                result +=   " __      __ \n" +
                            " \\ \\    / / \n" +
                            "  \\ \\  / /  \n" +
                            "   \\ \\/ /   \n" +
                            "    \\  /    \n" +
                            "     \\/     \n";
                break;

            case "X":
                result +=   " __   __ \n" +
                            " \\ \\ / / \n" +
                            "  \\ V /  \n" +
                            "   > <   \n" +
                            "  / . \\  \n" +
                            " /_/ \\_\\ \n" ;
                break;

            case "L":
                result +=   "  _       \n" +
                            " | |      \n" +
                            " | |      \n" +
                            " | |      \n" +
                            " | |____  \n" +
                            " |______| \n" ;
                break;

            case "C":
                result +=   "   _____  \n" +
                            "  / ____| \n" +
                            " | |      \n" +
                            " | |      \n" +
                            " | |____  \n" +
                            "  \\_____| \n";
                break;

            case "D":
                result +=   "  _____   \n" +
                            " |  __ \\  \n" +
                            " | |  | | \n" +
                            " | |  | | \n" +
                            " | |__| | \n" +
                            " |_____/  \n";
                break;

                case "M":
                result +=   "  __  __  \n" +
                            " |  \\/  | \n" +
                            " | \\  / | \n" +
                            " | |\\/| | \n" +
                            " | |  | | \n" +
                            " |_|  |_| \n" ;
                break;

            default:
                throw new InvalidLetterException();
        }
        return result;
    }
}