package com.vosseptum;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a**2 + b**2 = c**2
 * For example, 3**2 + 4**2 = 9 + 16 = 25 = 5**2.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class PythagoreanTriplet
{
    private boolean isPythagoreanTriplet(int firstLeg, int secondLeg, int hypotenuse)
    {
        return Math.pow(firstLeg , 2) + Math.pow(secondLeg , 2) == Math.pow(hypotenuse , 2);
    }

    private int searchForPythagoreanTriplet()
    {
        for(int i = 1; i <= 1000; i++)
        {
            for(int j = 1; j <= 1000; j++)
            {
                for(int k = 1; k <= 1000; k++)
                {
                    if(isPythagoreanTriplet(i,j,k) && i + j + k == 1000)
                    {
                        return i*j*k;
                    }
                }
            }
        }
        return 0;
    }

    PythagoreanTriplet()
    {
        System.out.println(searchForPythagoreanTriplet());
    }
}
