
public class Actor {

	String firstname, lastname;
	
	public Actor(String first, String last) { //contructor
		// TODO Auto-generated constructor stub
	firstname = first;
			
	lastname = 	last;	
	
	}

	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub

		Actor actor = new Actor ("Arnold", "Smith");
		
		System.out.println(actor.firstname + "\t" + actor.lastname);
		
	}

}
