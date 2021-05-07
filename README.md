This repository contains Practice Questions from GeeksForGeeks.

Q.1Dupliactes in a given array:Given an array of size n that has the following specifications:
Each element in the array contains either a policeman or a thief.
Each policeman can catch only one thief.
A policeman cannot catch a thief who is more than K units away from the policeman.
We need to find the maximum number of thieves that can be caught.

Examples:

a)Input : arr[] = {'P', 'T', 'T', 'P', 'T'},
            k = 1.
Output : 2.
Here maximum 2 thieves can be caught, first
policeman catches first thief and second police-
man can catch either second or third thief.

b)Input : arr[] = {'T', 'T', 'P', 'P', 'T', 'P'},
            k = 2.
Output : 3.

Input : arr[] = {'P', 'T', 'P', 'T', 'T', 'P'},
            k = 3.
Output : 3.


Q.2 Duplicates in a given Array:Find duplicates in a given array when elements are not limited to a range
Given an array of n integers. The task is to print the duplicates in the given array.If there are no duplicates then print -1.
=>Examples:

        Input: {2, 10,10, 100, 2, 10, 11,2,11,2}
        Output: 2 10 11

        Input: {5, 40, 1, 40, 100000, 1, 5, 1}
        Output: 5 40 1
        Note: The duplicate elements can be printed in any order


Q.3 Substrings: Given a string, find the smallest window length with all distinct characters of the given string.
 For eg. str = “aabcbcdbca”, then the result would be 4 as of the smallest window will be “dbca” .
Examples:

Input: aabcbcdbca
Output: dbca
Explanation:
Possible substrings= {aabcbcd, abcbcd,
bcdbca, dbca....}
Of the set of possible substrings 'dbca'
is the shortest substring having all the
distinct characters of given string.

Input: aaab
Output: ab
Explanation:
Possible substrings={aaab, aab, ab}
Of the set of possible substrings 'ab'
is the shortest substring having all
the distinct characters of given string.
