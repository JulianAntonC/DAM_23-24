public class OrganizarAnimales {
	public static void main(String[] args) {
		String animal = System.console().readLine();
		
		switch (animal){
			
		case "cat": System.out.println("Es un animal dom�stico");break;
		case "dog": System.out.println("Es un animal dom�stico");break;
		case "lion": System.out.println("Es un animal salvaje");break;
		case "cow": System.out.println("Es un animal salvaje");break;
		case "tiger": System.out.println("Es un animal salvaje");break;
		
		default: System.out.println("Introduzca un animal v�lido");break;
		
		}
	}
}