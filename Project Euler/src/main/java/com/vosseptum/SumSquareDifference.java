package com.vosseptum;

/**
 * The sum of the squares of the first ten natural numbers is,
 *
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 */
class SumSquareDifference
{
    private long sumOfSquares = 0L;
    private long sumOfNumbersSquared = 0L;

    private long findTheDifference()
    {
        for(long i = 1L; i <= 100L; i++)
        {
            sumOfSquares += i*i;
            sumOfNumbersSquared += i;
        }
        sumOfNumbersSquared = sumOfNumbersSquared * sumOfNumbersSquared;
        return sumOfNumbersSquared - sumOfSquares;
    }

    SumSquareDifference()
    {
        System.out.print(findTheDifference());
    }
}
