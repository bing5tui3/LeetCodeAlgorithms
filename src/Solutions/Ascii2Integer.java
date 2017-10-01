package Solutions;

public class Ascii2Integer {
    public int myAtoi(String str) {
    	StringBuffer sb = new StringBuffer();
    	boolean first = false;
    	boolean isEnd = false;
    	for(int i = 0; i <= str.length()-1&&!isEnd; i++) {
    		if(str.charAt(i) == '-' || (str.charAt(i) >= '0' && str.charAt(i) <= '9') || str.charAt(i) == '+') {
    			if(first) {
    				if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) isEnd = true;
    			}
    			sb.append(str.charAt(i));
    			if(!first) first = true;
    		} else if(str.charAt(i) != ' ' || first) {
    			isEnd = true;
    		}
    	}
    	String intStr = sb.toString();
    	if(!intStr.isEmpty()) {
    		try {
    			double d = Double.parseDouble(intStr);
    			if(d > Integer.MAX_VALUE) {
    				return Integer.MAX_VALUE;
    			} else if(d < Integer.MIN_VALUE) {
    				return Integer.MIN_VALUE;
    			} else {
    				return (int)d;
    			}
    		} catch (Exception e) {
    			return 0;
    		}
    	}
    	return 0;
    }
}
