class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        //1 3 4 5 7 10 11 ,target=9
        //    i
        //      j
        //[2,3]~=[3,4]
        while(i<j){
            int s=nums[i]+nums[j];
            if(s>target){
                j--;
            }
            else if(s<target){
                i++;
            }
            else{
                return new int[]{i+1,j+1};
            }
        }
        return null;
        
    }
}
