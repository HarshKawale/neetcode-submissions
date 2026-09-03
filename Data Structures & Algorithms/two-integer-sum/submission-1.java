class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;int j=1;
        int op[] = new int[2];
        while (true){
            if(j==nums.length){
                i++;j=i+1;
            }else if(nums[i]+nums[j] == target){
                op[0] = i;op[1] = j;
                return op;
            }else{
                j++;
            }
            if(i==nums.length){
                break;
            }
        }
    return op;
    }
}
