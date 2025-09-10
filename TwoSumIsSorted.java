class Solution {
    public int[] twoSum(int[] nums, int target) {
 
   int i = 0; 
   int n = nums.length -1; 

   while(i < n){
    if(nums[n] + nums[i] == target){
        return new int []{i + 1,n + 1};
    }
    else if (nums[n] + nums[i] < target) {
        i++;
    }
    else if(nums[n] + nums[i] > target ){
        n--;
    }
    }

   return null;


    }    
        
    }