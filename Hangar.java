public class Hangar{
	public static void main(String[] args) {
		//nouvelles référence pour Cars :
		Cars porsche = new Cars("Porsche");
		System.out.println("1. Je suis "+ porsche.getBrand()+ porsche.doStuff());

		//nouvelles références pour Boat :
		Boat yamaha = new Boat("Yamaha");
		System.out.println("3. Je suis "+ yamaha.getBrand()+ yamaha.doStuff());
		
	}
}