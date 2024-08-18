//package TestQuestions;
//
//import java.util.HashMap;
//
//public class SortUsingSetBits {
//    public static void main(String[] args) {
//                int[] arr = {0,1,2,3,4,5,6,7,8};
//                HashMap<Integer, Integer> map= new  HashMap<>();
//                for(int i=0; i<arr.length; i++){
//                    int count=0;
//                    int x=arr[i];
//                    while(x!=0){
//                        if((x&1) !=0)
//                            count++;
//                        x= x>>1;
//                    }
//                    map.put(arr[i], count);
//                }
//                HashMap<Integer, Integer> map1= new HashMap<>();
//                map1 = sortByValue(map);
//                for(int i=0; i<arr.length; i++)
//                    arr[i] = map1.get(i);
//
//
//        }
//
//    }
//}
