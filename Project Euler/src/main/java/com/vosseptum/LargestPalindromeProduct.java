package com.vosseptum;

import java.util.LinkedList;
import java.util.List;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
class LargestPalindromeProduct
{
    private int a = 999;
    private int b = 999;

    private String product = Integer.toString(a * b);

    private List<Integer> allPrimeNumbers = new LinkedList<>();

    private void findLargestPalindrome()
    {
        while(! stringPalindromeCondition(product))
        {
            if(b == 0)
            {
                a -= 1;
                b = 999;
            }
            else
            {
                b -= 1;
            }
            product = Integer.toString(a*b);
        }
        allPrimeNumbers.add(a*b);
        if(a >= 800)
        {
            a -= 1;
            b = 999;
            product = Integer.toString(999 * 999);
            findLargestPalindrome();
        }
    }

    private int findLargestListMember()
    {
        int maxValue = 0;
        for (int i : allPrimeNumbers)
        {
            if (maxValue < i)
            {
                maxValue = i;
            }
        }
        return maxValue;
    }

    private boolean stringPalindromeCondition(String testedProduct)
    {
        int i = 0;
        while(testedProduct.charAt(i) == (testedProduct.charAt(testedProduct.length() - i - 1)))
        {
            if(i == testedProduct.length() - 1)
            {
                return true;
            }
            i++;
        }
        return false;
    }

    LargestPalindromeProduct()
    {
        findLargestPalindrome();
        System.out.print(findLargestListMember());
    }
}
