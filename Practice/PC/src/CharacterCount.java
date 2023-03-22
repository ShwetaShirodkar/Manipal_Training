import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    
    public String countChars(String ip) {
        String str = "sdddfffggg";
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {

            System.out.println(entry.getKey() + "" + entry.getValue() + ",");
        }

        return null;
    }
}