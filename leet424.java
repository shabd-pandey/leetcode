class Solution {
    public int characterReplacement(String s, int k) {
        int [] occu=new int[26];
        int left=0;
        
        int max=0;
        int ans=0;
        for(int right=0; right<s.length(); right++){
            max=Math.max(max,++occu[s.charAt(right)-'A']);
            if(right-left+1-max>k){
               
                occu[s.charAt(left)-'A']--;
                 left++;

            }
            ans=Math.max(ans,right-left+1);

        }
        return ans;
        
    }
}