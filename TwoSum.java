public class TwoSum {
    public static int[] Sum(int[] nums, int k){
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == k){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int k = 17;
        int[] result = Sum(nums, k);
        System.out.println("["+result[0]+","+result[1]+"]");

    }
}
