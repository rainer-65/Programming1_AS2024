package lecture13.examples;

// see http://www.coderanch.com/t/491713/java/java/Sorting-ArrayList-giving-fits

import java.util.Comparator;

public class NameComparator implements Comparator<Player> {

	public int compare(Player p1, Player p2) {
		// Uses compareTo method of String class to compare names of the employees
		return p1.getName().compareTo(p2.getName());
	}

}
