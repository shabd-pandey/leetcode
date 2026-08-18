// leetcode no 217
//neetcode no 1
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumber = new HashSet<>();
         for(int i=0; i<nums.length; i++){
            if(seenNumber.contains(nums[i])){
                return true;

            }
            seenNumber.add(nums[i]);
         }
         return false; //neetcode solving problem one from array and hash 
        
    }
}// approved 