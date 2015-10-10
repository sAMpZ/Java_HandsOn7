

public class Person {
	
	private int age;
	private float height;

    public Person(int age, float height){
		
		//default constructor 
		super();
		
		// first constructor
		this.age = age;
		
		//second constructor
		this.height = height;
	}
	
	
	public static void main(String[] args) {
		
		//new person with age and height
		Person person = new Person(27, 1.67f);

	}

}
