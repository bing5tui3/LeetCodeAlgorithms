package Solutions;


public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {

    	String mStr = this.manacheriseString(s);
    	int strLen = mStr.length();
    	int R[] = new int[strLen];
    	int maxRad = 1;
    	int center = 0;
    	int lastPos = 0;
    	int lastRad = 1;
    	
    	for(int i = 1; i <= strLen - 2; i++) {
    		if(i < lastPos + lastRad - 1 && R[2*lastPos - i] != lastPos + lastRad - i) {
    			R[i] = Math.min(lastPos + lastRad - i,R[2*lastPos - i]);
    		} else {
	    		int j = 1;
	    		while((i - j >= 0)&&(i + j <= strLen - 1)&&mStr.charAt(i-j) == mStr.charAt(i+j)) {
	    			j ++;
	    		}
	    		R[i] = j;	
	    		lastRad = j;
	    		lastPos = i;
	    		if(maxRad < j) {
	    			maxRad = j;
	    			center = i;
	    		}
    		}
    	}
    	
    	int end = (center + maxRad - 1) / 2;
    	int begin = (center - maxRad + 1) / 2;
    	return s.substring(begin,end);
    	
    }
    
    public String manacheriseString(String s) {
    	StringBuffer sb = new StringBuffer("#");
    	for(int i = 0; i < s.length(); i++) {
    		sb.append(s.charAt(i));
    		sb.append("#");
    	}
    	return sb.toString();
    }
    
}
