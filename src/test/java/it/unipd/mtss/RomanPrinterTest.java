package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.MockedStatic;
import org.junit.runner.RunWith;

@RunWith(MockitoJUnitRunner.class)
public class RomanPrinterTest{
    
    @Test
    public void letterI() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   "  _____  \n" +  
                            " |_   _| \n" + 
                            "   | |   \n" +
                            "   | |   \n" +
                            "  _| |_  \n" + 
                            " |_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(1); })
              .thenReturn("I");
                    
            // Act
            String actual = RomanPrinter.print(1);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void letterV() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   " __      __ \n" +
                            " \\ \\    / / \n" +
                            "  \\ \\  / /  \n" +
                            "   \\ \\/ /   \n" +
                            "    \\  /    \n" +
                            "     \\/     \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(5); })
            .thenReturn("V");

            // Act
            String actual = RomanPrinter.print(5);

            // Assert
            assertEquals(expected, actual);
        }

    }

    @Test
    public void letterX() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   " __   __ \n" +
                            " \\ \\ / / \n" +
                            "  \\ V /  \n" +
                            "   > <   \n" +
                            "  / . \\  \n" +
                            " /_/ \\_\\ \n" ;

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(10); })
            .thenReturn("X");
            // Act
            String actual = RomanPrinter.print(10);

            // Assert
            assertEquals(expected, actual);
        }
        
    }

    @Test
    public void letterL() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   "  _       \n" +
                            " | |      \n" +
                            " | |      \n" +
                            " | |      \n" +
                            " | |____  \n" +
                            " |______| \n" ;

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(50); })
            .thenReturn("L");

            // Act
            String actual = RomanPrinter.print(50);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void letterC() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   "   _____  \n" +
                            "  / ____| \n" +
                            " | |      \n" +
                            " | |      \n" +
                            " | |____  \n" +
                            "  \\_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(100); })
            .thenReturn("C");

             // Act
            String actual = RomanPrinter.print(100);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void letterD() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   "  _____   \n" +
                            " |  __ \\  \n" +
                            " | |  | | \n" +
                            " | |  | | \n" +
                            " | |__| | \n" +
                            " |_____/  \n";
        
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(500); })
            .thenReturn("D");

            // Act
            String actual = RomanPrinter.print(500);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void letterM() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   "  __  __  \n" +
                            " |  \\/  | \n" +
                            " | \\  / | \n" +
                            " | |\\/| | \n" +
                            " | |  | | \n" +
                            " |_|  |_| \n" ;

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(1000); })
            .thenReturn("M");

            // Act
            String actual = RomanPrinter.print(1000);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void twoEqualLetters() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   "  _____    _____  \n" +  
                            " |_   _|  |_   _| \n" + 
                            "   | |      | |   \n" +
                            "   | |      | |   \n" +
                            "  _| |_    _| |_  \n" + 
                            " |_____|  |_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(2); })
            .thenReturn("II");

            // Act
            String actual = RomanPrinter.print(2);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void twoDifferentLetters() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   "  _____   __      __ \n" +  
                            " |_   _|  \\ \\    / / \n" + 
                            "   | |     \\ \\  / /  \n" +
                            "   | |      \\ \\/ /   \n" +
                            "  _| |_      \\  /    \n" + 
                            " |_____|      \\/     \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(4); })
            .thenReturn("IV");

            // Act
            String actual = RomanPrinter.print(4);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void threeEqualLetters() throws InvalidLetterException, InvalidNumberException
    {
        String expected =   "   _____     _____     _____  \n" +  
                            "  / ____|   / ____|   / ____| \n" + 
                            " | |       | |       | |      \n" +
                            " | |       | |       | |      \n" +
                            " | |____   | |____   | |____  \n" + 
                            "  \\_____|   \\_____|   \\_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(300); })
            .thenReturn("CCC");

            // Act
            String actual = RomanPrinter.print(300);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void threeDifferentLetters() throws InvalidLetterException, InvalidNumberException
    {

        String expected =   " __      __   _____    _____  \n" +  
                            " \\ \\    / /  |_   _|  |_   _| \n" + 
                            "  \\ \\  / /     | |      | |   \n" +
                            "   \\ \\/ /      | |      | |   \n" +
                            "    \\  /      _| |_    _| |_  \n" + 
                            "     \\/      |_____|  |_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(7); })
            .thenReturn("VII");

            // Act
            String actual = RomanPrinter.print(7);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void fourDifferentLetters() throws InvalidLetterException, InvalidNumberException
    {

        String expected =   " __      __   _____    _____    _____  \n" +  
                            " \\ \\    / /  |_   _|  |_   _|  |_   _| \n" + 
                            "  \\ \\  / /     | |      | |      | |   \n" +
                            "   \\ \\/ /      | |      | |      | |   \n" +
                            "    \\  /      _| |_    _| |_    _| |_  \n" + 
                            "     \\/      |_____|  |_____|  |_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(8); })
            .thenReturn("VIII");

            // Act
            String actual = RomanPrinter.print(8);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void fiveDifferentLetters() throws InvalidLetterException, InvalidNumberException
    {

        String expected =   " __   __  __      __   _____    _____    _____  \n" +  
                            " \\ \\ / /  \\ \\    / /  |_   _|  |_   _|  |_   _| \n" + 
                            "  \\ V /    \\ \\  / /     | |      | |      | |   \n" +
                            "   > <      \\ \\/ /      | |      | |      | |   \n" +
                            "  / . \\      \\  /      _| |_    _| |_    _| |_  \n" + 
                            " /_/ \\_\\      \\/      |_____|  |_____|  |_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(18); })
            .thenReturn("XVIII");

            // Act
            String actual = RomanPrinter.print(18);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void sixDifferentLetters() throws InvalidLetterException, InvalidNumberException
    {

        String expected =   " __   __  __   __  __      __   _____    _____    _____  \n" +  
                            " \\ \\ / /  \\ \\ / /  \\ \\    / /  |_   _|  |_   _|  |_   _| \n" + 
                            "  \\ V /    \\ V /    \\ \\  / /     | |      | |      | |   \n" +
                            "   > <      > <      \\ \\/ /      | |      | |      | |   \n" +
                            "  / . \\    / . \\      \\  /      _| |_    _| |_    _| |_  \n" + 
                            " /_/ \\_\\  /_/ \\_\\      \\/      |_____|  |_____|  |_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(28); })
            .thenReturn("XXVIII");

            // Act
            String actual = RomanPrinter.print(28);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void sevenDifferentLetters() throws InvalidLetterException, InvalidNumberException
    {

        String expected =   " __   __  __   __  __   __  __      __   _____    _____    _____  \n" +  
                            " \\ \\ / /  \\ \\ / /  \\ \\ / /  \\ \\    / /  |_   _|  |_   _|  |_   _| \n" + 
                            "  \\ V /    \\ V /    \\ V /    \\ \\  / /     | |      | |      | |   \n" +
                            "   > <      > <      > <      \\ \\/ /      | |      | |      | |   \n" +
                            "  / . \\    / . \\    / . \\      \\  /      _| |_    _| |_    _| |_  \n" + 
                            " /_/ \\_\\  /_/ \\_\\  /_/ \\_\\      \\/      |_____|  |_____|  |_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(38); })
            .thenReturn("XXXVIII");

            // Act
            String actual = RomanPrinter.print(38);

            // Assert
            assertEquals(expected, actual);
        }
    }

    @Test
    public void eightDifferentLetters() throws InvalidLetterException, InvalidNumberException
    {

        String expected =   "  _        __   __  __   __  __   __  __      __   _____    _____    _____  \n" +  
                            " | |       \\ \\ / /  \\ \\ / /  \\ \\ / /  \\ \\    / /  |_   _|  |_   _|  |_   _| \n" + 
                            " | |        \\ V /    \\ V /    \\ V /    \\ \\  / /     | |      | |      | |   \n" +
                            " | |         > <      > <      > <      \\ \\/ /      | |      | |      | |   \n" +
                            " | |____    / . \\    / . \\    / . \\      \\  /      _| |_    _| |_    _| |_  \n" + 
                            " |______|  /_/ \\_\\  /_/ \\_\\  /_/ \\_\\      \\/      |_____|  |_____|  |_____| \n";

        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(88); })
            .thenReturn("LXXXVIII");

            // Act
            String actual = RomanPrinter.print(88);

            // Assert
            assertEquals(expected, actual);
        }
    }

    // Test per verificare che venga lanciata un InvalidLetterException qualora venisse passata una lettera errata
    @Test(expected = InvalidLetterException.class)
    public void nonRomanLetter() throws InvalidLetterException, InvalidNumberException 
    {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            // Arrange
            utilities.when(() -> { IntegerToRoman.convert(2); })
            .thenReturn("Y");

            //Act
            RomanPrinter.print(2);
        }
    }

}