package dictionary;
//Sean Courtney & Nick McCue
import java.util.*;

public class testDictionary {

	private static Scanner scan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Dictionary d = new Dictionary(3);
		
		boolean loop = true;
		
		
		
		while (loop) {
			scan = new Scanner(System.in);
			System.out.println("Enter a word or q to quit: ");
			String w = scan.nextLine();
			String w1 = w.substring(0, w.length()-1);
			if (w.contains("#")){
				for (int i=d.defHistory.get(w1).size()-1; i >= 0; i--) {
					System.out.println("\n" + d.defHistory.get(w1).get(i));
				}
				System.out.println("\nWould you like to update the definition of " + w1 + " (Y/N)");
				String ia = scan.nextLine();
				if (ia.equalsIgnoreCase("Y")) {
					System.out.println("Enter your name: ");
					String a = scan.nextLine();
					System.out.println("Enter the new definition of the "+w1 + ":");
					String def = scan.nextLine();
					d.dictionary.put(w1, new Entry(w1, def, a));
					d.addToHistory(w1, def);
				}else {
					continue;
				}
			}
			else if (w.equalsIgnoreCase("q")) {
				System.out.println("terminating program...");
				loop = false;
				break;
			}else if (d.dictionary.containsKey(w)){
				System.out.println(d.getDefinition(w));
				System.out.println("Would you like to update the definition of " + w + " (Y/N)");
				String i = scan.nextLine();
				if (i.equalsIgnoreCase("Y")) {
					System.out.println("Enter your name: ");
					String a = scan.nextLine();
					System.out.println("Enter the new definition of the "+w + ":");
					String def = scan.nextLine();
					d.dictionary.put(w, new Entry(w, def, a));
					d.addToHistory(w, def);
				} else {
					continue;
				}
					
			}else {
				System.out.println(w + " is not defined in the dictionary");
				System.out.println("would you like to enter a new definition for " + w + "? (Y/N)");
				String i = scan.nextLine();
				if (i.equalsIgnoreCase("Y")) {
					System.out.println("Enter your name: ");
					String a = scan.nextLine();
					System.out.println("Enter the new definition of the "+w + ":");
					String def = scan.nextLine();
					d.dictionary.put(w, new Entry(w, def, a));
					d.addToHistory(w, def);
					
				}else {
					continue;
				}
				
			}
					
		}
	}
}
