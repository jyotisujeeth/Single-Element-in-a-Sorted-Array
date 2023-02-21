/* Single-Element-in-a-Sorted-Array
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.  Return the single element that appears only once.  Your solution must run in O(log n) time and O(1) space.*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
      if (nums.length==1)
          return nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                i++;
            }
            else {
                return nums[i];
            }
        }
         return nums[nums.length-1];
          
    }
}
       
    
