package kunal.Arrays.assignment;
/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have. Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies.
Leetcode link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxCandies {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int extraCandies= sc.nextInt();
        int n= sc.nextInt();
        int[] candies= new int[n];
        for(int i=0; i<n; i++)
            candies[i]= sc.nextInt();
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        ArrayList<Boolean> result= new ArrayList<>(candies.length);
        int maxCandies=candies[0];
        for(int i=1; i<candies.length; i++)
            if(candies[i]> maxCandies)
                maxCandies= candies[i];

        for(int i=0; i<candies.length; i++){
            if(candies[i]+ extraCandies >= maxCandies)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
