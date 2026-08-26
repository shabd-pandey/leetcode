//two pointers leetcode167
//neetcode150 9 day streak one day 2 code questions lets go

class leetcode167 {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right= numbers.length-1;

        while(left<right ){
            if(numbers[left]+numbers[right]>target){
                right--;
            }
            else if(numbers[left]+numbers[right]<target){
                left++;
            }
            else{
                return new int[] {left+1,right+1};
            }
        }
        return null;
        
    }
}