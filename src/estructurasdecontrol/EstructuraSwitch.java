package estructurasdecontrol;
import java.util.Scanner;
public class EstructuraSwitch {

	public static void main(String[] args) {
		// Estructuras condicionales
		// Estructura condicional simple (if)
        // Estructura condicional doble (if else)
		// Estructura condicional anidada (multiple - if else if)
		// Para hoy - Estructura condicional multiple (switch)
		Scanner lec = new Scanner(System.in);
		int op = 2;
		//System.out.println("Ingrese el color de semaforo");
		//char car = lec.next().charAt(0);
		
		System.out.println("Cual es su nombre");
		String nombre = lec.nextLine();
		
		
		switch(nombre) {
		// El valor puede ser una variable byte, short, int, char, string
		case "Alejandro":
			System.out.println("Hola alejandro");
			break;
		
		case "Anwar":
			System.out.println("Hola Anwar");
			break;
		
		case "Josue":
			System.out.println("Hola josue");
			break;
		default:
			System.out.println("Caracter incorrecto");
		}
	
		System.out.println("FIN DEL PROGRAMA");
		
		lec.close();
	}

}
