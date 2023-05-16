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

    // Test per verificare che venga lanciata un InvalidLetterException qualora venisse passata una lettera errata
    @Test(expected = InvalidLetterException.class)
    public void nonRomanLetter() throws InvalidLetterException, InvalidNumberException 
    {
        // Arrange
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> { IntegerToRoman.convert(2); })
            .thenReturn("Y");
        }

            //Act
            RomanPrinter.print(2);
    }
}