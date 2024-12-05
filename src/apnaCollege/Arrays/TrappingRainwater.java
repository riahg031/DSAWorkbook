package apnaCollege.Arrays;
// Trapped rainwater: return the amount of rainwater trapped above the height bars. width=1 of each bar.
public class TrappingRainwater {
    public static void main(String[] args){
        int[] height ={4, 2, 0, 6, 3, 2, 5};
//        int width=1;  //Since width is 1, won't have any impact in our calculation.
        System.out.println(trappedWater(height));
    }
    public static int trappedWater(int[] height){
        //edge case
        if(height.length<3)
            return 0;
        int[] leftMax= new int[height.length];
        int[] rightMax= new int[height.length];
        //Calculate leftMax auxiliary array
        for(int i=0; i<height.length; i++)
            leftMax[i]= i==0? height[i] : Math.max(height[i], leftMax[i-1]);
        //Calculate rightMax auxiliary array
        for(int i= height.length-1; i>=0; i--)
            rightMax[i]= i== height.length-1 ? height[i] : Math.max(height[i], rightMax[i + 1]);
        //trapped water= ( min(leftMax, rightMax) - height) *width
        int trappedWater=0;
        for(int i=0; i<height.length; i++){
            int waterLevel= Math.min(leftMax[i], rightMax[i]);
            trappedWater+= waterLevel- height[i];
        }
        return trappedWater;
    }
}
