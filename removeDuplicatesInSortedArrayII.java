public class removeDuplicatesInSortedArrayII {
    static int removeDuplicate(int[] nums){
        if(nums.length <= 2) return  nums.length;
        int i = 2;
        for(int j = 2; j<nums.length; j++){
            if(nums[i-2] != nums[j]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,3,3};
        int length = removeDuplicate(nums);
        for(int i = 0; i<length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
