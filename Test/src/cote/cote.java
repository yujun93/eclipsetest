package cote;

public class cote{
	
	
	public String reverse(String src) {
		
		char[] alpa = new char[src.length()];
		
		for(int i =0; i < src.length(); i++) {
			
			alpa[i] = src.charAt(src.length()-i-1);
			
		}
		return new String(alpa);
	}
	
	
	public static void main(String[] args) {
		
		cote rev = new cote();
		
		System.out.print(rev.reverse("abcdef"));
		
	}
}