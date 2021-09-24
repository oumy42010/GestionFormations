package Classes.listes;

import java.util.ArrayList;
import Classes.Session;

public class Sessions {
	public static ArrayList<Session> ListSessions = new ArrayList<Session>();

	public static void addToList(Session s) {
		ListSessions.add(s);
	}

	public static void ShowSessions() {
		for (Session s : ListSessions) {
			System.out.println(s.toString());

		}
	}
}
