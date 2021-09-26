package com.trie;

public class Trie implements ITrie {

	private TrieNode root;
    char[] inputCharArr;
    int count;
	
	public Trie() {
		this.root=new TrieNode();
	}
	
	@Override
	public boolean add(String input) {
		inputCharArr=input.toCharArray();
		TrieNode head=root;
		for(int i=0;i<inputCharArr.length;i++) {
			char c=inputCharArr[i];
			if(!head.children.containsKey(c)) {
				 TrieNode node=new TrieNode();
			head.children.put(c,node);
			count++;
			}
				head=head.children.get(c);
		}
		
		head.isEnd=true;
		return head.isEnd;
	}

	@Override
	public boolean search(String pattern) {
		inputCharArr=pattern.toCharArray();
		TrieNode head=root;
		for(int i=0;i<inputCharArr.length;i++) {
			char c=inputCharArr[i];
			if(head.children.containsKey(c)) {
				head=head.children.get(c);
			}
			else
				return false;
			
		}
		return head.isEnd;
	}

	@Override
	public boolean isPrefix(String prefix) {
		inputCharArr=prefix.toCharArray();
		TrieNode head=root;
		for(int i=0;i<inputCharArr.length;i++) {
			char c=inputCharArr[i];
			if(head.children.containsKey(c)) {
				head=head.children.get(c);
			}
			else
				return false;
		}
		
		return true;
	}

	@Override
	public int size() {
		return count;
	}

	
}
