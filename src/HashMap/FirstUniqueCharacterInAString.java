package HashMap;

import java.util.HashMap;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {

    }
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> newMap = new HashMap<>();
        for(var c : s.toCharArray()){
            newMap.put(c, newMap.getOrDefault(c, 0) + 1);
        }
        for(var c : s.toCharArray()){
            if (newMap.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }

}

