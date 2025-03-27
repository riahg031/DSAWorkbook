package striver.Arrays.medium;
//Sort an array of 0's, 1's and 2's.
import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        int[] arr= {2, 0, 1, 2, 1, 0, 0, 1};
        //Brute force
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        //Better approach
        sortArray2(arr);
        System.out.println(Arrays.toString(arr));
        //Dutch National Flag algo
        sortArray3(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Brute force=> Merge sort=> TC: O(nlogn), SC: O(n)
    public static void mergeSort(int[] arr, int low, int high){
        if(low>= high)
            return;
        int mid= low+ (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp= new ArrayList<>();
        int left= low;
        int right= mid+1;
        while(left<= mid && right<= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<= high){
            temp.add(arr[right++]);
        }
        for(int i=low; i<=high; i++)
            arr[i]= temp.get(i-low);
    }
    //Better approach=>Count the no of 0's, 1's and 2's in one iteration; then replace the arr with 0's, 1's 2's according to respective counts
    // TC:O(2n), SC: O(1)
    public static void sortArray2(int[] arr){
        int count0=0, count1=0, count2=0;
        for(int x: arr){
            if(x==0)
                count0++;
            else if(x==1)
                count1++;
            else
                count2++;
        }
        for(int i=0; i<count0; i++)
            arr[i]= 0;
        for(int i=count0; i<count0+ count1; i++)
            arr[i]= 1;
        for(int i=count0+ count1; i<arr.length; i++)
            arr[i]= 2;
    }
    //Optima approach=>Dutch National Flag algo=> TC: O(n), SC: O(1)
    public static void sortArray3(int[] arr) {
        int low = 0, mid = 0, high = 0;
        while(mid<= high){
            if(arr[mid]==0){
                //swap(arr[mid], arr[low])
                if(low!=mid){
                    int temp= arr[mid];
                    arr[mid]= arr[low];
                    arr[low]= temp;
                }
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                //swap(arr[mid], arr[high])
                if(mid != high){
                    int temp= arr[mid];
                    arr[mid]= arr[high];
                    arr[high]= temp;
                }
                high--;
            }
        }
    }
}
