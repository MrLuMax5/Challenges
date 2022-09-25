package com.vosseptum;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20?
 */
class SmallestMultiple
{
    /**
     * This one is about common (prime) divisors. 2520 for all numbers up to 10 because it's equal to 5*7*8*9.
     * Every number which is divisible by 2*2*2 = 8 and 5 is also divisible by 5*2*2*2 = 40, ..., 5*2 = 10 and so on.
     * 20 = 5*2*2
     * 19 = 19
     * 18 = 3*3*2
     * 17 = 17
     * 16 = 2*2*2*2
     * 15 = 5*3
     * 14 = 7*2
     * 13 = 13
     * 12 = 2*2*3
     * 11 = 11
     * 10 = 2*5
     * 9 = 3*3
     * 8 = 2*2*2
     * 7 = 7
     * 6 = 2*3
     * 5 = 5
     * 4 = 2*2
     * 3 = 3
     * 2 = 2
     * Therefore: 2*3*2*5*7*2*3*11*13*2*17*19
     */
    SmallestMultiple()
    {
        System.out.print(2*3*2*5*7*2*3*11*13*2*17*19);
    }
}
