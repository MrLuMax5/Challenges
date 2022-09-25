package com.vosseptum;

import java.util.LinkedList;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
class LargestPrimeFactor
{
    private List<Long> allPrimeFactors = new LinkedList<>();

    private long inputNumber = 600851475143L;


    private void findPrimeFactors()
    {
        for(long i = 2; i < Math.sqrt(600851475143L); i++)
        {
            while(inputNumber % i == 0)
            {
                allPrimeFactors.add(i);
                inputNumber /= i;
            }
        }
    }

    private long outputLargestPrimeFactor()
    {
        long listMaxValue = 0L;
        for(Long primeFactor : allPrimeFactors)
        {
            if(listMaxValue < primeFactor)
            {
                listMaxValue = primeFactor;
            }
        }
        return listMaxValue;
    }

    LargestPrimeFactor()
    {
        findPrimeFactors();
        System.out.print(outputLargestPrimeFactor());
    }
}
