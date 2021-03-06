/**
 * 
 * Class WordList (store and manipulate a list of words)
 * @author Michelle Li
 * Period 1
 *
 */

import java.util.*;

public class WordList extends ArrayList<String> {
		
	/**
	 * Return the number of words in the wordlist that are exactly len long
	 * @param len - length to check for
	 * @return count - number of words of length len
	 */
	public int numWordsOfLength(int len) {
		int count = 0;
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).length() == len) count++;
		}
		return count;
	}
	
	/**
	 * Remove all words in the wordlist that are exactly len long
	 * @param len - length to check for
	 */
	public void removeWordsOfLength(int len) {
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).length() == len) {
				this.remove(i);
				i--;
			}
		}
	}
	
	/**
	 * Return the length of the longest word in the wordlist
	 * @return length of longest word
	 */
	public int lengthOfLongestWord() {
		int max = -1;
		for (int i = 0; i < this.size(); i++) {
			int size = this.get(i).length();
			if (size > max) max = size;
		}
		return max;
	}
	
}
