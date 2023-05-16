////////////////////////////////////////////////////////////////////
// FRANCESCO FERRAIOLI 2003606
// MATTEO CUSIN 2008073
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman 
{
    public static String convert(int number) throws InvalidNumberException
    {
        if(number < 1 || number > 1000) 
        {
            throw new InvalidNumberException();
        }
        final int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        final String[] rom = {"L","XL","X","IX","V","IV","I"};

        StringBuilder ans = new StringBuilder();
        for (int i = 0; number > 0; i++)
        {
            while (number >= val[i]) 
            {
                ans.append(rom[i]);
                number -= val[i];
            }
        }
        return ans.toString();
    }
}