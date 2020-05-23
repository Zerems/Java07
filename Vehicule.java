public abstract class Vehicule {

	// attributs :
	private String brand;
	private int kilometers;

	//Constructor : 
	public Vehicule(String brand) {
		this.brand = brand;
		this.kilometers = 0;
	}
	 //getters & setters :
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}

	public int getKilometers(){
		return kilometers;
	}
	public void setKilometers(int kilometers){
		this.kilometers = kilometers;
	}

	//méthodes abstraite :

	public abstract String doStuff();

}