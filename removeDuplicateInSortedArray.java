public class removeDuplicateInSortedArray {
    static int removeDuplicate(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3 };
        int length = removeDuplicate(nums);
        System.out.print("THE REVISED ARRAY: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
