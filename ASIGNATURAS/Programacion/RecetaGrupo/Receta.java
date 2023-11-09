public class Receta {
	public static void main (String [] args) {
		
		double coliflor = 600;
		double cebolleta = 1;
		int zanahoria = 3;
		double pechugaPollo = 500;
		double pinon = 25;
		double pasa = 75;
		double caldo = 220;
		double curry = 1.5;
		
		System.out.print("\nIntroduzca la cantidad de gente para la que realizará la receta: ");
		int input = Integer.parseInt(System.console().readLine());
		
		
		coliflor = ((coliflor * input) / 6);
		if(coliflor <= 100) {
			coliflor = 100;
		}
		
		cebolleta = ((cebolleta * input) / 6);
		if(cebolleta <= 0.5) {
			cebolleta = 0.5;
		}
		
		zanahoria = ((zanahoria * input) / 6);
		if(zanahoria <= 1) {
			zanahoria = 1;
		}
		
		pechugaPollo = ((pechugaPollo * input) / 6);
		if(pechugaPollo <= 83.3) {
			pechugaPollo = 83.3;
		}
		
		pinon = ((pinon * input) / 6);
		if(pinon <= 10) {
			pinon = 10;
		}
		
		pasa = ((pasa * input) / 6);
		if(pasa <= 20) {
			pasa = 20;
		}
		
		caldo = ((caldo * input) / 6);
		if(caldo <= 36.7) {
			caldo = 36.7;
		}
		
		curry = ((curry * input) / 6);
		if(curry <= 0.5) {
			curry = 0.5;
		}
		
		System.out.printf("%nVa a requerir... %.1fgr de coliflor %.1f de cebolleta, %d zanahorias, %.1fgr de pechuga de pollo, %.1fgr de piñones, %.1fgr de pasas, %.1fml de caldo y %.1f cucharillas de curry.%n", coliflor, cebolleta, zanahoria, pechugaPollo, pinon, pasa, caldo, curry);
	}
}