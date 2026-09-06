class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> maps=new HashMap<>();
        maps.put('}','{');
        maps.put(']','[');
        maps.put(')','(');

        Stack<Character> sta=new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);

            if(!maps.containsKey(c)){
                sta.push(c);
            }
            else{
                if(sta.empty()){
                    return false;
                }
                       char topElement= sta.pop();
                    if(topElement != maps.get(c) ){
                        return false;
                    }
                }
            }
            
        
        return sta.isEmpty();
    }
}