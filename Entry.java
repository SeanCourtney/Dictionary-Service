package dictionary;

import java.util.*;

public class Entry {
	private String word;
	private String definition;
	private String author;
	private Date date;
	
	
	public Entry(String word, String definition, String author) {
		this.word = word;
		this.definition = definition;
		this.author = author;
		date = new Date();
	}
	
	public String getDef() {
		return definition;
	}
	
	public String getDate() {
		return date.toString();
	}
	
	public String getWord() {
		return word;
	}
	
	public String getAuthor() {
		return author;
	}
}
