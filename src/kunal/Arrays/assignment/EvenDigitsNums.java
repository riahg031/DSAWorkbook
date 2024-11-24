//package kunal.Arrays.assignment;
//
//import java.util.Scanner;
//
////Find count of numbers with even digits in given array. 1<= arr[i] <= 10^5
////Leetcode link:https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//public class EvenDigitsNums {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] arr= new int[n];
//        for(int i=0; i<n; i++)
//            arr[i]= sc.nextInt();
//        System.out.println(countNums(arr));
//        System.out.println(countNums2(arr));
//    }
//    //Brute force
//    public static int countNums(int[] arr){
//        int count=0;
//        int digit=0;
//        for(int i=0; i<arr.length; i++){
//            digit=0;
//            while(arr[i] >0){
//                arr[i]/= 10;
//                digit++;
//            }
//            if(digit%2==0)
//                count++;
//        }
//        return count;
//    }
//    //Optimal approach
//    public static int countNums2(int[] arr){
//        int count=0;
//        for(int i=0; i<arr.length; i++) {
//            int x = arr[i];
//            if( (x >= 10 && x <100) || (x >=1000 && x<10000) || (x==100000))
//                count+= 1;
//            System.out.println(arr[i]);
//        }
//        return count;
//    }
//}
