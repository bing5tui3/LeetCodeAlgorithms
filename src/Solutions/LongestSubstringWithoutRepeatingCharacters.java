package Solutions;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
    	int maxLen = 0;
    	int len = 0;
    	int firstRepeatChar = 0;
    	int lastRepeatChar = 0;
    	int a[] = new int[1000];
    	int hashCode = 0;
        for (int i = 0; i < s.length(); i++) {
        	hashCode = String.valueOf(s.charAt(i)).hashCode();
        	if (a[hashCode] != 0) {
        		firstRepeatChar = (a[hashCode] > firstRepeatChar)? a[hashCode] : firstRepeatChar;
        		lastRepeatChar = i + 1;
        		a[hashCode] = lastRepeatChar;
        		len = lastRepeatChar - firstRepeatChar;
        		maxLen = (len > maxLen)? len: maxLen;
        	} else {
        		a[hashCode] = i + 1;
        		len++;
        		maxLen = (len > maxLen)? len: maxLen;
        	}
        }
        return maxLen;
    }
}
