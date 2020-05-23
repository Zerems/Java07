public class Boat extends Vehicule {
	//méthode

	public Boat(String brand){
		super(brand);
	}

	@Override
	public String doStuff(){
		return " et je fais glouglou !";
	}
}