package Solutions;

public class ReverseInteger {
	public int reverse(int x) {
		int reverse = 0;
		boolean sign = (x >= 0)? true: false;
		if(!sign) x = 0 - x;
		String intStr = String.valueOf(x);
		StringBuffer sb = new StringBuffer();
		if(!sign) sb.append("-");
		for (int i = intStr.length() - 1; i >= 0; i--) 
			sb.append(intStr.charAt(i));
		try {
			reverse = Integer.parseInt(sb.toString());
		} catch (Exception e) {
			reverse = 0;
		}
		return reverse;
	}
}
