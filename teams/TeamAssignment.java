import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class TeamAssignment 
{
	static final int TEAM_SIZE = 3;

    static final Map<Integer, String> STUDENTS = new HashMap<Integer, String>() {{
	    put(1, "Barach");
	    put(2, "Brumagin");
	    put(3, "Choffel");
	    put(4, "Christiansen");
	    put(5, "Craft");
	    put(6, "Dinga");
	    put(7, "Ginoza");
	    put(8, "Hanko");
	    put(9, "Hawk");
	    put(10, "Kineer");
	    put(11, "Koo");
	    put(12, "Lange");
	    put(13, "Lawrence");
	    put(14, "Livingston");
	    put(15, "McCool");
	    put(16, "McCurdy");
	    put(17, "McIntyre");
	    put(18, "Mulvay");
	    put(19, "Nelson");
	    put(20, "Ocampo");
	    put(21, "Person");	
	    put(22, "Popey");
	    put(23, "Schweitzer");
	    put(24, "Smith");
	    put(25, "Tang");	
	    put(26, "Zheng");	
	}};

    public static void main(String[] args) {

	ArrayList<Integer> students = new ArrayList<Integer>();

	// populate the arraylist with the integers
	for(int i = 1; i <= 26; i++) {
	    Integer I = new Integer(i);
	    students.add(I);
	}

	// pick the ordering for the talks today
	ArrayList<Integer> studentsTodaysOrdering = (ArrayList<Integer>)students.clone();
	Collections.shuffle(studentsTodaysOrdering);
	System.out.println("Today's random ordering of the students: "); // + studentsTodaysOrdering);
	System.out.println();

	for(Integer studentToday : studentsTodaysOrdering) {

	    System.out.println(STUDENTS.get(studentToday));

	}

	System.out.println();

	System.out.println("These are the teams for today's laboratory assignment:");

	int i = 0;
	int team = 1;
	for(Integer studentToday : studentsTodaysOrdering) {

		if(i % TEAM_SIZE == 0) {
		
			System.out.println();
			System.out.println("Team " + team);
			team++;

		}

		System.out.println(STUDENTS.get(studentToday));

		i++;

	}

	}

}
