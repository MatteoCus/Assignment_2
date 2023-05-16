package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;
import java.util.Arrays;
import org.junit.experimental.runners.Enclosed;
import org.junit.Test;

@RunWith(Enclosed.class)
public class IntegerToRomanTest
{
    @RunWith(Parameterized.class)
    public static class IntegerToRomanParamTests
    {
        private int numero;
        private String expected;

        public IntegerToRomanParamTests(int numero, String expected)
        {
            super();
            this.numero = numero;
            this.expected = expected;
        }

        @Parameterized.Parameters
        public static Collection input()
        {
            return Arrays.asList(new Object[][] {{1,"I"},{2,"II"},{3,"III"},{4,"IV"},{5,"V"},{6,"VI"},{7,"VII"},
                {8,"VIII"},{9,"IX"},{10,"X"},{20,"XX"},{40,"XL"},{50,"L"},{90,"XC"},{100,"C"},{400,"CD"},{500,"D"},
                {900,"CM"},{1000,"M"}});
        }

        @Test
        public void testIntegerToRomanTest() throws InvalidNumberException
        {
            // Arrange
            String actual = "";

            // Act
            actual = IntegerToRoman.convert(numero);

            // Assert
            assertEquals(expected, actual);
        }
    }
    

    public static class IntegerToRomanSingleTests
    {
        @Test(expected = InvalidNumberException.class)
        public void negativeNumber() throws InvalidNumberException 
        {
            // Arrange
        
            //Act
            IntegerToRoman.convert(-1);
        }

        @Test(expected = InvalidNumberException.class)
        public void overflowNumber() throws InvalidNumberException 
        {
            // Arrange
        
            //Act
            IntegerToRoman.convert(1001);
        }
    }

}