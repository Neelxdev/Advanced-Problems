import java.util.Scanner;

public class MaxContainer {
    public static int MaxArea(int[] height){
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;
        while(start<end){
            int h = Math.min(height[start], height[end]);
            int area = (end-start)*h;
            maxArea = Math.max(maxArea, area);
            if(height[start]<height[end]) start++;
            else end--;
        }
        return maxArea;       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] height = {5,6,45,32,2,43};
        System.out.println(MaxArea(height));
        
    }
    
}
