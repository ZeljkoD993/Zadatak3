package BildGitVjezba;

public class Zadatak3 {
	
	public static double  izKilogramaUFunte(double funte, double kilogrami) {
		
		return funte = kilogrami * 0.454;
	}
	
	public static double izFuntiUKilograme(double funte, double kilogrami) {
		
		return kilogrami = funte / 0.454;
		
	}
	
	
	public static double  izCentimetaraUInce(double centimetri, double inci) {
		
		return inci = centimetri * 0.39370;
	}
	
	public static double izInciUCentimetre(double centimetri, double inci) {
		
		return centimetri = inci / 0.39370;
		
	}
	
	public static double izCelzijusaUFarenhajde(double celzijus, double farenhajd) {
		
		return farenhajd = (celzijus * 1.8000) + 32.00;
		
	}

	public static double izFarenhajdaUCelzijuse(double celzijus, double farenhajd) {
		
		return celzijus = (farenhajd - 32) / 1.800;
	}
}
