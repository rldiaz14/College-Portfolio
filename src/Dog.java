//.java
	//5-4 Milestone: Menu Loop and Monkey Class
	//Ramon L. Diaz Ortiz
	//Dr. Mahendra Gossai
	//April/01/2021

public class Dog extends RescueAnimal{

	    // Instance variable
	    private String breed;

	    // Constructor
	    public Dog(String name, String breed, String gender, String age,
	    String weight, String acquisitionDate, String acquisitionCountry,
		String trainingStatus, boolean reserved, String inServiceCountry) {
	        setName(name);
	        setBreed(breed);
	        setGender(gender);
	        setAge(age);
	        setWeight(weight);
	        setAcquisitionDate(acquisitionDate);
	        setAcquisitionLocation(acquisitionCountry);
	        setTrainingStatus(trainingStatus);
	        setReserved(reserved);
	        setInServiceCountry(inServiceCountry);

	    }

	    // Accessory Method
	    public String getBreed() {
	        return breed;
	    }

	    // Mutator Method
	    public void setBreed(String dogBreed) {
	        breed = dogBreed;
	    }
}
