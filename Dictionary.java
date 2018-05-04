package dictionary;
import java.util.*;

public class Dictionary {
	protected Map<String, Entry> dictionary;
	protected Map<String, List<String>> defHistory;
	protected List<String> w;
	protected int k;
	
	
	public Dictionary(int number_of_definitons) {
		dictionary = new HashMap<String, Entry>();
		defHistory = new HashMap<String, List<String>>();
		k = number_of_definitons;
		
	}
	
	public void addDefinition(String word, String definition, String author) {
		dictionary.put(word, new Entry(word, definition, author));
	}
	
	public void addToHistory(String word, String def) {
		if (!defHistory.containsKey(word)) {
			defHistory.put(word, w = new LinkedList<String>());
		}
	     if (w.size() >= k) {
	    	 w.remove(0);
	    	 defHistory.get(word).add(getDefinition(word));
	     }else {
	    	 defHistory.get(word).add(getDefinition(word));
	     }
	}
	
	public String getDefinition(String word) {
		return (dictionary.get(word).getDef() + "\nAuthor: "+ dictionary.get(word).getAuthor() + "\nAdded on: " + dictionary.get(word).getDate());
	}
}