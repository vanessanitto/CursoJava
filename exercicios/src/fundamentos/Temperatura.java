package fundamentos;

public class Temperatura {
public static void main(String[] args) {
	// (ºF - 32) x 5 / 9.0 = ºC
	
	double f = 86;
	final double x = 32;
	double divisor = 5 / 9.0;
	double c = (f-x) * divisor;
	
	System.out.println(c + "ºC");
	
	f = 150;
			System.out.println("O resutado é" + c + "ºC");
}
}
