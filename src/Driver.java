//Driver.java
//Ramon L. Diaz Ortiz
//IT-145 
//Dr. Mahendra Gossai
//April/01/2021


import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	
		//Project
		private static Scanner scanner = new Scanner(System.in);
		
		
	    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
	        // Array list of monkey
	    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
	    

	    public static void main(String[] args) {
	    	
	    	String menuOption = ""; //local variable


	        initializeDogList();
	        initializeMonkeyList();

	        // Add a loop that displays the menu, accepts the users input
	        // and takes the appropriate action.
		    // For the project submission you must also include input validation
	        // and appropriate feedback to the user.
	        // Hint: create a Scanner and pass it to the necessary
	        // methods 
		    // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
	       while( !menuOption.equalsIgnoreCase("q") ) {
	    	   displayMenu();
	    	   menuOption = scanner.nextLine(); // 
	    	   switch(menuOption) {
	    	   case "1":
	    		   intakeNewDog(scanner);
	    		   System.out.println("\n     - intakeNewDog() method method will be completed later in Project Two");
	    		   break; 
	    	   case "2":
	    		   intakeNewMonkey(scanner);
	    		   break;
	    	   case "3":
	    		   reserveAnimal(scanner);
	    		   break;
	    	   case "4":
	    		   printAnimals();
	    		   break;
	    	   case "5":
	    		   printAnimals();
	    		   break;		   
	    	   case "6":
	    		   printAnimals();
	    		   break;	 
	    	   default:
	    		   if(!menuOption.equalsIgnoreCase("q") ) {
	    			  System.out.println("\nInvalid input, please try again.");  
	    		   }
	    		   break;
	    		      
	    	   }
	       }
	       System.out.println("Goodbye. \nThank you for using the Grazioso Salvare system");
	    }

	    // This method prints the menu options
	    public static void displayMenu() {
	        System.out.println("\n\n");
	        System.out.println("\t\t\t\tRescue Animal System Menu");
	        System.out.println("[1] Intake a new dog");
	        System.out.println("[2] Intake a new monkey");
	        System.out.println("[3] Reserve an animal");
	        System.out.println("[4] Print a list of all dogs");
	        System.out.println("[5] Print a list of all monkeys");
	        System.out.println("[6] Print a list of all animals that are not reserved");
	        System.out.println("[q] Quit application");
	        System.out.println();
	        System.out.println("Enter a menu selection");
	    }


	    // Adds dogs to a list for testing
	    public static void initializeDogList() {
	        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
	        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
	        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

	        dogList.add(dog1);
	        dogList.add(dog2);
	        dogList.add(dog3);
	    }


	    // Adds monkeys to a list for testing
	    //Optional for testing
	    public static void initializeMonkeyList() {
	    	Monkey monkey1 = new Monkey("Momo", "2","male", "3", "33", "05-08-2020", "United States", "intake", true, "United State");
	    	Monkey monkey2 = new Monkey("Lola", "3", "female", "4", "30","06-15-2019", "United States", "intake", false, "United State");
	    	Monkey monkey3 = new Monkey("Bert", "5", "male", "4", "35", "06-09-2018", "United States", "intake", false, "United State");
	    	monkeyList.add(monkey1);
	    	monkeyList.add(monkey2);
	    	monkeyList.add(monkey3);
	    	
	   
	    }
	    // Complete the intakeNewDog method
	    // The input validation to check that the dog is not already in the list
	    // is done for you
	    public static void intakeNewDog(Scanner scanner) {
	        System.out.println("What is the dog's name?");
	        String name = scanner.nextLine();
	        for(Dog dog: dogList) {
	            if(dog.getName().equalsIgnoreCase(name)) {
	                System.out.println("\n\nThis dog is already in our system\n\n");
	                return; //returns to menu
	            }
	        }

	        // Add the code to instantiate a new dog and add it to the appropriate list
	     
	        	
	        }
	   
	          
		    // to make sure the monkey doesn't already exist and the species type is allowed
	        public static void intakeNewMonkey(Scanner scanner) {
	        	// instantiate i.e  and create a new monkey object
	        	Monkey monkeyObject = new Monkey();
	           // Monkey name for the user
	        	
	        	
	            System.out.print("What is the new's monkey name?");
	            String name = scanner.nextLine();
	            for(Monkey monkey: monkeyList) { 
	                if(monkey.getName().equalsIgnoreCase(name)) {
	                    System.out.println("\n\nThis monkey is already in our system");
	                    return; // return to option
	                }
	            }
	            monkeyObject.setName(name);
	        }

	        // Complete reserveAnimal
	        // You will need to find the animal by animal type and in service country
	        public static void reserveAnimal(Scanner scanner) {
	            System.out.println("The reseved animal list is under construction and it will finish to project 2");

	        }

	        // Complete printAnimals
	        // Include the animal name, status, acquisition country and if the animal is reserved.
		// Remember that this method connects to three different menu items.
	        // The printAnimals() method has three different outputs
	        // based on the listType parameter
	        // dog - prints the list of dogs
	        // monkey - prints the list of monkeys
	        // available - prints a combined list of all animals that are
	        // fully trained ("in service") but not reserved 
		// Remember that you only have to fully implement ONE of these lists. 
		// The other lists can have a print statement saying "This option needs to be implemented".
		// To score "exemplary" you must correctly implement the "available" list.
	        public static void printAnimals() {
	            System.out.println("The reseved animal list is under uction and it will finish to project 2");

	        
	        }
}


