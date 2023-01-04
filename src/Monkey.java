//.java
	//5-4 Milestone: Menu Loop and Monkey Class
	//Ramon L. Diaz Ortiz
	//Dr. Mahendra Gossai
	//April/01/2021
//Project

public class Monkey extends RescueAnimal {
	
		private double tailLength;
		private String species;
		private double height;
		private double bodyLength;
		

		public double getTailLength() {
			return tailLength;
		}







		public void setTailLength(double tailLength) {
			this.tailLength = tailLength;
		}







			public String getSpecies() {
			return species;
		}







		public void setSpecies(String species) {
			this.species = species;
		}







		public double getHeight() {
			return height;
		}







		public void setHeight(double height) {
			this.height = height;
		}







		public double getBodyLength() {
			return bodyLength;
		}







		public void setBodyLength(double bodyLength) {
			this.bodyLength = bodyLength;
		}



		public Monkey(String name, String species, String gender, String age,
				String weigth, String acquisitionDate, String acquisitionCountry,
				String trainingStatus, boolean reserved, String inServiceCountry) {
			
			setName(name);
			setGender(gender);
	        setTailLength(tailLength);
	        setSpecies(species);
	        setHeight(height);
	        setBodyLength(bodyLength);
			setAge(age);
			setWeight(weigth);
			setAcquisitionDate(acquisitionDate);
			setAcquisitionLocation(acquisitionCountry);
			setTrainingStatus(trainingStatus);
			setReserved(reserved);
			setInServiceCountry(inServiceCountry);
	      
			
		}
		
		public Monkey() {
			// TODO Auto-generated constructor stub
		}

}
