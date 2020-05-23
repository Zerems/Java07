public class Cars extends Vehicule {

	//méthode

	public Cars (String brand){
		super(brand);
	}

	@Override
	public String doStuff(){
		return " et je fais vroum vroum !";
	}
}