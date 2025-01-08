class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[result] != nums[i]){
                result++;
                nums[result] = nums[i];
            }
        }
        return result + 1;
    }
}