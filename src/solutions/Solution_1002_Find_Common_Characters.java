import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_1002_Find_Common_Characters {

	public List<String> commonChars(String[] A) {
		List<String> commonChars = new ArrayList<>();
		List<HashMap<Character, Integer>> letterCountList = new ArrayList<>();
		
		HashMap<Character, Integer> letterCountMap = new HashMap<>();
        for(int i=0; i<A.length; i++) {
        	letterCountList.add(getLetterCount(A[i]));
        }
        for(int i=0; i<letterCountList.get(0).keySet().size(); i++) {
        	char letter = (char) letterCountList.get(0).keySet().toArray()[i];
        	int flag = 1;
        	int minCount = Integer.MAX_VALUE;
        	for(int j=0; j<letterCountList.size(); j++) {
        		if (!letterCountList.get(j).containsKey(letter)) {
        			flag = 0;
        		}else {
        			if (letterCountList.get(j).get(letter) < minCount) {
        				minCount = letterCountList.get(j).get(letter);
        			}
        		}
        	}
        	if (flag == 1) {
        		letterCountMap.put(letter, minCount);
        	}
        }
        for (int i=0; i<letterCountMap.keySet().size(); i++) {
        	char letter = (char)letterCountMap.keySet().toArray()[i];
        	int appearTime = letterCountMap.get(letter);
        	for (int n=0; n<appearTime; n++) {
        		commonChars.add(String.valueOf(letter));
        	}
        }
        System.out.println(letterCountMap.toString());
        System.out.println(letterCountList.toString());
        return commonChars;
    }
	
	public HashMap<Character, Integer> getLetterCount(String word) {
		HashMap<Character, Integer> letterCount = new HashMap<>();
		for (int i=0; i<word.length(); i++) {
			char letter = word.charAt(i);
			if (!letterCount.containsKey(letter)) {
				letterCount.put(letter, 0);
			}
			letterCount.put(letter, letterCount.get(letter) + 1);
		}
		return letterCount;
	}
	
	public static void main(String[] args) {
		String[] input0 = {"bella","label","roller"};
		String[] input1 = {"cool","lock","cook"};
		String[] input2 = {"dadaabaa","bdaaabcc","abccddbb","bbaacdba","ababbbab","ccddbbba","bbdabbda","bdabaacb"};
		Solution_1002_Find_Common_Characters obj = new Solution_1002_Find_Common_Characters();
		System.out.println(obj.commonChars(input2));
		
	}

}
