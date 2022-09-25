package com.vosseptum;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
public class SumOfAllPrimes
{
    private long theSum = 2;

    private boolean isPrime(int number)
    {
        for(int i = 3; i <= Math.sqrt(number); i += 2)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    private void checkAllNumbersToALimit(int limit)
    {
        for(int i = 3; i < limit; i+=2)
        {
            if(isPrime(i))
            {
                theSum += i;
            }
        }
    }

    SumOfAllPrimes(int limit)
    {
        checkAllNumbersToALimit(limit);
        System.out.println(theSum);
    }
}
