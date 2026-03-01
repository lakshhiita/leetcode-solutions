class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums.length ==0){
                return new int[]{first,last};
            }
            if(nums.length == 1 && nums[i] == target){
                first = i;
                last = i;   
            }
            if(nums[i] == target && first == -1){
                first = i;
            }
            if(nums[i] == target && first != -1){
                last = i;
            }
        }
        return new int[]{first,last}; 
        
    }
}