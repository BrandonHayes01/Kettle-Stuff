
public class Testing {

	public static void main(String[] args) {
		System.out.println("Hello World!"); // Prints Hello World
		Kettle brandon = new Kettle ("Chrome","Dunno",500); // Creates a new instance of Kettle and specifies the state of the new instance
		System.out.println(brandon); // Returns the state of the Kettle
		brandon.fillUp(100); // Runs the fillUp function with the argument of 100 to be added to the variable currentCapacity
		System.out.println(brandon); // Returns the state of the Kettle
		brandon.pour(); // Runs the pour function
		System.out.println(brandon);
		brandon.pour();
		System.out.println(brandon);
		brandon.pour();
		System.out.println(brandon);
		brandon.fillUp(400); // Runs the fillUp function with the argument of 300 to be added to the variable currentCapacity
		System.out.println(brandon);
		brandon.fillUp(150);
		System.out.println(brandon);
	}
}
