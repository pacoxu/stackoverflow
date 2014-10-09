package com.stackoverflow.q26250244;
import java.util.regex.Pattern;


public class Test {

	static String p1 = "[A-Za-z0-9 ]*";
	static String p2 = "HHHHHHHH";
	static String p3 = "ZZZZZZZZ";
	/**
	* @param args
	*/
	public static void main(String[] args) {
		String[] patternStr = { "I can say "+ p2 +" to " + p2, 
				};
		String input = "I can say hello to Jack";
		String input1 = "I can say hello jack to Jack Lee";
		splits( input, patternStr ) ;
		
		splits( input1, patternStr ) ;
	}
	
	public static void splits(String input , String[] patternStr){
		for(int i = 0; i < patternStr.length; i ++ ){
			String regex = patternStr[i].replaceAll(p2, p1);
			if( input.matches(regex) ) {
				Pattern hhh = Pattern.compile(p2);
				String[] m = hhh.split(patternStr[i]);
				for(String each: m){
					input = input.replaceFirst(each, p3);
				}
				Pattern zzz = Pattern.compile(p3);
				String[] zm = zzz.split(input);
				for(String each: zm){
					System.out.println( "Result:" + each);
				}
				System.out.println( );
						
				break;
			}

		}
		
	}

}