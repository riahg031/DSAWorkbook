package kunal.Arrays.assignment;
/*
Calculate maximum altitude reached by a bike on mountains. Given, gain[] array denoting net gain altitude; bike initialy starting at 0.
Leetcode link:  https://leetcode.com/problems/find-the-highest-altitude/description/
 */

import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] gain= new int[n];
        for(int i=0; i<n; i++)
            gain[i]= sc.nextInt();
        System.out.println(findMaxAltitude(gain));
    }
    public static int findMaxAltitude(int[] gain){
        int highesAlt=0;
        int max=0;
        for(int i=0; i<gain.length; i++){
            max += gain[i];
            highesAlt= Math.max(highesAlt, max);
        }
        return highesAlt;
    }
}
