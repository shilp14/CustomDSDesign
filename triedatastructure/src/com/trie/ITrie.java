package com.trie;

public interface ITrie{
	
	boolean add(String input);
	boolean search(String pattern);
	boolean isPrefix(String prefix);
	int size();
	

}
