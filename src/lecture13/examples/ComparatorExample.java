package lecture13.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();
		players.add(new Player("Wawrinka"));
		players.add(new Player("Federer"));
		players.add(new Player("Thiem"));
		players.add(new Player("Murray"));
		players.add(new Player("Nadal"));
		Collections.sort(players, new NameComparator());
		System.out.println(players);
	}
}
