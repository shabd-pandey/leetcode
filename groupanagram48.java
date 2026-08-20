//leet coe question 49
import java.util.*; 
class groupanagram49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anarray = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            String s = strs[i];

            int[] count = new int[26];

            for (int j = 0; j < s.length(); j++) {

                char c = s.charAt(j);

                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < count.length; j++) {

                sb.append("#");
                sb.append(count[j]);
            }

            String key = sb.toString();

            if (!anarray.containsKey(key)) {
                anarray.put(key, new ArrayList<>());
            }

            anarray.get(key).add(s);
        }

        return new ArrayList<>(anarray.values());
    }
}//med level question major syntax error