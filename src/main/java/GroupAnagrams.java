import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagrams(strs);
        System.out.println(res);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String string = new String(charArray);
            if (hashMap.containsKey(string))
                hashMap.get(string).add(strs[i]);
            else
                hashMap.put(string, new ArrayList<>(List.of(strs[i])));
        }

        System.out.println(hashMap);

        for (Map.Entry<String, List<String>> mapEntry : hashMap.entrySet()) {
            result.add(mapEntry.getValue());
        }
        return result;
    }
}
