package com.trie;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ITrie trie=new Trie();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter word to insert");
		String input=sc.next();
		if(trie.add(input)) {
			System.out.println("word inserted");
		}
		else {
			System.out.println("word not inserted");
		}
			
		System.out.println("Enter search word");
		String pattern = sc.next();
		System.out.println(pattern);
		if (trie.search(pattern)) {
			System.out.println("pattern found");
		} else {
			System.out.println("pattern not found");
		}
		System.out.println("Enter prefix word");
		String prefix = sc.next();
		if (trie.isPrefix(prefix)) {
			System.out.println("prefix found");
		} else {
			System.out.println("prefix not found");
		}
		 
	}

}
