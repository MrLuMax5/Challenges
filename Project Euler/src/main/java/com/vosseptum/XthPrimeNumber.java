package com.vosseptum;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
class XthPrimeNumber
{
    /**
     * Because 2 is the only even prime number we can only check odd numbers.
     *
     * @param x the xth Prime Number to find.
     * @return the xth Prime number.
     */
    private int findXthPrimeNumber(int x)
    {
        int counter = 2;
        int potentialPrimeNumber = 3;

        while(counter < x)
        {
            potentialPrimeNumber += 2;
            if(isPrime(potentialPrimeNumber))
            {
                counter++;
            }
        }
        return potentialPrimeNumber;
    }

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

    XthPrimeNumber(int prime)
    {
        System.out.println(findXthPrimeNumber(prime));
    }
}
