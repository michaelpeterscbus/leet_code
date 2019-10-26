package problems.BullsAndCows;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	public String getHint(String secret, String guess) {
		int bulls = 0;
		int cows = 0;
		Map<Character, Integer> secretCountMap = new HashMap<Character, Integer>();
		Map<Character, Integer> guessCountMap = new HashMap<Character, Integer>();
		for (int i = 0; i < secret.length(); i++) {
			if (!secretCountMap.containsKey(secret.charAt(i))) {
				secretCountMap.put(secret.charAt(i), 1);
			} else {
				secretCountMap.put(secret.charAt(i), secretCountMap.get(secret.charAt(i)) + 1);
			}
			if (!guessCountMap.containsKey(guess.charAt(i))) {
				guessCountMap.put(guess.charAt(i), 1);
			} else {
				guessCountMap.put(guess.charAt(i), guessCountMap.get(guess.charAt(i)) + 1);
			}
		}
		for (int i = 0; i < guess.length(); i++) {
			if (guess.charAt(i) == secret.charAt(i)) {
				bulls++;
				guessCountMap.put(guess.charAt(i), guessCountMap.get(guess.charAt(i)) - 1);
				secretCountMap.put(guess.charAt(i), secretCountMap.get(guess.charAt(i)) - 1);
			}
		}
		for (int i = 0; i < guess.length(); i++) {
			if (secret.contains(Character.toString(guess.charAt(i))) 
					&& guessCountMap.get(guess.charAt(i)) > 0 && secretCountMap.get(guess.charAt(i)) > 0) {
				cows++;
				guessCountMap.put(guess.charAt(i), guessCountMap.get(guess.charAt(i)) - 1);
				secretCountMap.put(guess.charAt(i), secretCountMap.get(guess.charAt(i)) - 1);
			}
		}
		return bulls + "A" + cows + "B";
	}
}