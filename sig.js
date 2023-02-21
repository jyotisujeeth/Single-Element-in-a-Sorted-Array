var singleNonDuplicate = function(nums) {
      if (nums.length==1)
          return nums[0];
        for(let i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                i++;
            }
            else {
                return nums[i];
            }
        }
         return nums[nums.length-1];
          
    

       
    
};
