package com.Automation.Java;

public class CG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Str=A@ma!n&
		//		O/P:- n@am!A&
		
		String str = "A@ma!n&";
		StringBuffer sb = new StringBuffer();
	
		for(char c:str.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				sb.append(c);
					
				}
			
			}
			StringBuffer result = new StringBuffer(str);
			int alphabeticIndex = sb.length() -1;
			
			for(int i =0; i<result.length();i++) {
				if(Character.isAlphabetic(result.charAt(i))) {
					result.setCharAt(i, sb.charAt(alphabeticIndex--));
				}
		}
			System.out.println(result.toString());

	}

}
