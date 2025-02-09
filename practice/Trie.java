
import java.util.*;
public class Trie{

	static Node root = new Node();

	public static class Node{
		public boolean eow;
		public Node[] characters;
		
		public Node(){

			this.eow = false;
			this.characters = new Node[256];
			for(int i=0; i<256; i++){
				this.characters[i] = null;
			}
		}

	
	}

	public static void insert(String word){
		Node curr = root;

		for(int i=0; i<word.length(); i++){
			int idx = word.charAt(i);
			if(curr.characters[idx]==null){
				// add char
				curr.characters[idx] = new Node();
			}

			if(i==word.length()-1){
				curr.characters[idx].eow = true;
			}

			curr = curr.characters[idx];
		}

		
	}
	
	public static boolean search(String word){
		Node curr = root;
		for(int i=0; i<word.length(); i++){
			
			Node node = curr.characters[word.charAt(i)];
				
			if(node==null){
				return false;
			}

			curr = node;
		}

		return curr.eow;
		
	}

	public static boolean wordBreak(String word){

		if("".equals(word)){return true;}
		
		for(int i=1; i<=word.length(); i++){
			String firstPart = word.substring(0,i);
			String secondPart = word.substring(i);
			
			if(search(firstPart) && wordBreak(secondPart)){
				return true;
			}
		}

		return false;

	}

	public static boolean wordBreakDP(String word, Map<String, Boolean> memo){

		if("".equals(word)){return true;}

		if(memo.containsKey(word)){return true;}
		
		for(int i=1; i<=word.length(); i++){
			String firstPart = word.substring(0,i);
			String secondPart = word.substring(i);
			
			if(search(firstPart) && wordBreak(secondPart)){
				memo.put(word, true);
				return true;
			}
		}

		return false;

	}
	
	public static boolean startsWith(String prefix){
		
		Node curr = root;
		
		for(int i=0; i<prefix.length(); i++){
			if(curr.characters[prefix.charAt(i)]==null){
				return false;
			}
			curr = curr.characters[prefix.charAt(i)];
		}
		
		return true;
		
	}


	
	

	public static void main(String args[]){
		
		// Create a Trie instance
        	Trie trie = new Trie();

        	// Insert words into the Trie
        	trie.insert("hello");
        	trie.insert("world");
        	trie.insert("trie");
        	trie.insert("data");
        	trie.insert("structure");

        	// Search for words
        	System.out.println("Search 'hello': " + trie.search("hello"));       // true
        	System.out.println("Search 'world': " + trie.search("world"));       // true
        	System.out.println("Search 'trie': " + trie.search("trie"));         // true
        	System.out.println("Search 'data': " + trie.search("data"));         // true
        	System.out.println("Search 'structure': " + trie.search("structure")); // true
        	System.out.println("Search 'java': " + trie.search("java"));         // false
        	System.out.println("Search 'dat': " + trie.search("dat"));           // false
        	System.out.println("Search 'struc': " + trie.search("struc"));       // false


		// find if given key is present in the dictionary or not

		// Insert words into the Trie
        	trie.insert("i");
        	trie.insert("like");
        	trie.insert("samsung");
        	trie.insert("ice");
        	trie.insert("sam");

		if(wordBreak("ilikesamsung")){
			System.out.println("Hai ji");
		}
		if(wordBreakDP("ilikesamsung", new HashMap<String, Boolean>())){
			System.out.println("Hai ji");
		}
		
		
		// find if prefix exist in dictionary
		
		// Insert words into the Trie
        trie.insert("hello");
        trie.insert("hell");
        trie.insert("he");

        // Test startsWith function
        System.out.println("Starts with 'he': " + startsWith("he"));   // Should return true
        System.out.println("Starts with 'hell': " + startsWith("hell")); // Should return true
        System.out.println("Starts with 'hello': " + startsWith("hello")); // Should return true
        System.out.println("Starts with 'hero': " + startsWith("hero")); // Should return false
        System.out.println("Starts with 'helloo': " + startsWith("helloo")); // Should return false
		

		
		
	}




}