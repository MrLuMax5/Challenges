package com.vosseptum;

/**
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 */
class CollatzSequence
{
    private int highestNumberOfSteps = 0;

    private int recursiveCollatzSequence(int number, int steps)
    {
        int numberOfSteps = steps;

        if(number == 1)
        {
        }
        else if (number % 2 == 0)
        {
            numberOfSteps += 1;
            recursiveCollatzSequence(number / 2, numberOfSteps);
        }
        else
        {
            numberOfSteps += 1;
            recursiveCollatzSequence(number * 3 + 1, numberOfSteps);
        }
        return steps;
    }

    private void findLongestChain(int chainNumber)
    {
        for(int i = 1; i < chainNumber; i++)
        {
            int currentSequenceNumberSteps = recursiveCollatzSequence(i, 0);
            highestNumberOfSteps = Math.max(currentSequenceNumberSteps, highestNumberOfSteps);
        }
    }

    CollatzSequence(int number)
    {
        findLongestChain(number);
        System.out.println(highestNumberOfSteps);
    }
}
