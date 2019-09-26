
public class Kettle {
	
	String colour; // Sets the string variable for colour
	String manufacturer; // Sets the string variable for manufacturer
	int maxCapacity; // Sets the int variable for maxCapacity
	int currentCapacity; // Sets the int variable for currentCapacity
	
	public Kettle(String c, String m, int mc) { // This is the start of the constructor called Kettle which requires 2 string variables and 1 int variable to be created
		System.out.println("A new Kettle has been created"); // Outputs to the console that a new Kettle has been created
		this.colour = c; // Sets the variable colour to the argument c for this instance
		this.manufacturer = m; // Sets the variable manufacturer to the argument m for this instance
		this.maxCapacity = mc;
		this.currentCapacity = 0; // Sets the variable to 0 as the Kettle has no current capacity
	}
	
	public void fillUp(int amount) { // This is a function that requires a numerical value to run
		if (currentCapacity + amount >= maxCapacity) { // Checks to see if the updated current capacity would go over the max capacity
			currentCapacity = maxCapacity; // If that is true then the capacity will be set to the max capacity
			System.out.println("Error: Your Kettle is overflowing now you fucking idiot"); // Prints out a message telling the user they are an idiot for overflowing the Kettle
		}
		else { // If the value is anything but over the max capacity
			currentCapacity += amount; // The amount in the argument is added to the current capacity
		}
	}
	
	public void pour() { // This is a function
		if (currentCapacity >=50) { // If the current capacity is greater than 50
			currentCapacity -= 50; // The current capacity variable is reduced by 50
		}
		else { // If the current capacity is anything but greater than 50
			System.out.println("Error: Not enough water"); // Prints out an error as there isn't enough water to pour
		}
	}
	
	public String toString() { // This is a function that assembles the previous variables into a string
		return colour + " " + manufacturer + " " + currentCapacity + "/" + maxCapacity;
	}
}
