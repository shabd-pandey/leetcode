//leetcode medium 238;
//neetcode 150 series 
// i work on brute force but it surpas time limit means its greater that o(n)


class leetcoe238{
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        int pre=1 , post=1;
         for(int i=0; i<nums.length; i++){
            result[i]=pre;
            pre= nums[i]*pre;
         };
         for(int i=nums.length-1; i>=0; i--){
            result[i]=result[i]*post;
            post=nums[i]*post;

         }
         return result;

    }
}