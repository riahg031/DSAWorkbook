package striver.Arrays.easy;

import java.util.ArrayList;

//Sorted arrays
public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args){
        int[] a= {1,2,3,7,8,9,10,12};
        int[] b= {2,3,4,4,5,11,12};
        System.out.println(findIntersection(a, b));
        System.out.println(findIntersection2(a, b));
    }
    //Brute force=> TC: O(n1 * n2), SC: O(n2)
    //Use smaller array length as visited array for better SC.
    public static ArrayList<Integer> findIntersection(int[] a, int[] b){
        ArrayList<Integer> ans= new ArrayList<>();
        int[] visited= new int[b.length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j] && visited[j]==0){
                    ans.add(a[i]);
                    visited[j]=1;
                    break;
                }
                if(b[j] > a[i])
                    break;
            }
        }
        return ans;
    }
    //Optimal approach: Two pointer=> TC: O(n1+ n2), SC: O(1)
    public static ArrayList<Integer> findIntersection2(int[] a, int[] b){
        ArrayList<Integer> ans= new ArrayList<>();
        int n1= a.length;
        int n2= b.length;
        int i=0, j=0;
        while(i<n1 && j<n2){
            if(a[i]< b[j])
                i++;
            else if(a[i] > b[j])
                j++;
            else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        return ans;
    }
}
