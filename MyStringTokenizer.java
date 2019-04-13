package com.securifi.stringTokenizer;

import java.util.StringTokenizer;
/**
 * @author abbas bin abdulla created on 13/04/2019
 * Intention is to know Stringtokenizer
 *
 */
public class MyStringTokenizer {
	
public static void main(String[] args) {
	String str=new String("i love you so much abbas.");
	System.out.println("Entered string ");
	StringTokenizer token=new StringTokenizer(str, " ");
	while(token.hasMoreElements()) {
		System.out.println("number of tokens  "+ token.countTokens());
		System.out.println(" string token "+token.nextToken().toCharArray());
		char []c=token.nextToken().toCharArray();
		System.out.println("length of token "+c.length);
		System.out.println(c[0]=Character.toUpperCase(c[0]));
		String cap=new String(c);
		System.out.println("converter string "+cap);
		for (int l = 0; l < c.length; l++) {
			
			System.out.println("arraay vaues are "+c[l]);
		}
	}
}
}
