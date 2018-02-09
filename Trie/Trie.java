package Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TrieNode{
	HashMap<Character, TrieNode> map;
	List<String> strings;
	boolean endofWord;
	
	TrieNode(){
		map=new HashMap();
		strings=new ArrayList();
		endofWord=false;
	}
};

public class Trie{
	Trie(){
		root=new TrieNode();
	}
	
	private TrieNode root;	
	public void insertintoTrie(String str) {
		TrieNode current=root,node =null;
		for(Character c:str.toCharArray()) {
			if(current.map.get(c)==null) {
				node =new TrieNode();
			}
			if(!current.map.containsKey(c))
			   current.map.put(c, node);
			   current.strings.add(str);
			current=current.map.get(c);
		}
		current.endofWord=true;
	}
	
	
	public boolean search(String str) {
		TrieNode current=root;
		for(Character c:str.toCharArray()) {
			if(current.map.get(c)==null) {
				return false;
			}
		
			current=current.map.get(c);
		}
		return current.endofWord;
	}
	
	
	
	public static void main(String[] args) {
		Trie t=new Trie();
		t.insertintoTrie("maitri");
		t.insertintoTrie("mongoose");
		t.insertintoTrie("mia");
		t.insertintoTrie("milky");
		t.insertintoTrie("and");
		t.insertintoTrie("sexy");
		System.out.println(t.search("maitri"));
		System.out.println(t.search("javya"));
	}

}

