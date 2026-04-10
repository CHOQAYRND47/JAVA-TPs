package tp3_java;

public class TestParking {

	public static void main(String[] args) {

		Vehicule[] v = new Vehicule[4];
		
		v[0]=new Voiture("B-2021", "BMV", 4);
		v[1]=new Voiture("F-2020", "Ferrari", 2);
		
		v[2]=new Moto("R1M-2024", "Yamaha yzf R1M", true);
		
		v[3]=new Camion("M-2022", "Mercides", 12.0);
		
		for(Vehicule vehicule :v) {
			vehicule.stationner();
			vehicule.afficher();
			System.out.println("\n");
		}
		
		System.out.println("=============================================\njust voitures :\n");
		
		for(Vehicule vehicule :v) {
			
			if(vehicule instanceof Voiture) {
			vehicule.stationner();
			vehicule.afficher();
			System.out.print("\n");
			}
		}
		
		
		System.out.println("=============================================");
		
		
			
		Vehicule x =  new Moto("11C22", "Yamaha", true);

		if (x instanceof Voiture) {
		    Voiture v1 = (Voiture) x;
		    System.out.println("Downcasting réussi !");
		} else {
		    System.out.println("Impossible de convertir !");
		}
		
	}

}
