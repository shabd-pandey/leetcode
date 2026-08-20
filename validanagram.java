// leetcode 242
//neet code 2
//array problem

class validanagram{
    public boolean isAnagram(String s, String t) {
        int [] ana=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            ana[s.charAt(i)-'a']++;
             ana[t.charAt(i)-'a']--;
        }

        for(int i=0; i<ana.length; i++){
             if(ana[i]!=0){
                return false;
             }
        }
        return true;
    }
}