class leetcode3 {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        if(s.length()==1){
        return 1;
    }
    int left=0;
    int right=0;
    int sub=0;
    HashSet<Character> str= new HashSet<>();

    while(right < s.length()){
        char c = s.charAt(right);
        while(str.contains(c)){
            str.remove(s.charAt(left));
            left++;
        }
        str.add(c);
        sub=Math.max(sub,right-left+1);
        right++;
    }
    return sub;    
}
}// sliding window