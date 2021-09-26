package com.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode{

	Map<Character,TrieNode> children;
	boolean isEnd;
	
 public TrieNode() {
	 this.children=new HashMap<>();
	 
 }
	
}
