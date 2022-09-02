package estructurasdecontrol;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		  Scanner lec=new Scanner (System.in);
		  double a, b;
		  int Entrada, potencia;
		  double respuesta;
		  boolean salir = false;
		  
		  System.out.println("********CALCULADORA*******");
		  System.out.println("Que operacion deseea realizar");
		  System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Residuo\n6. Potencia\n7. Raiz cuadrada\n8. Inverso multiplicador\n9. Salir\n");

		  Entrada = lec.nextInt();
		  switch(Entrada) {
		  case 1:
			  System.out.println("Ingrese num1");
			  a=lec.nextInt(); 
			  
			  System.out.println("Ingrese num2");
			  b=lec.nextInt();
			  
			  respuesta = a + b;
			  
			  System.out.println("La suma de " +a+ " y " + b+ " es: " + respuesta);
			  
			  break;
		  case 2:
			  System.out.println("Ingrese num1");
			  a=lec.nextInt(); 
			  
			  System.out.println("Ingrese num2");
			  b=lec.nextInt();
			  
			  respuesta = a - b;
			  
			  System.out.println("La resta de " +a+ " y " + b+ " es: " + respuesta);
			  
			  break;
		  case 3:
			  System.out.println("Ingrese num1");
			  a=lec.nextInt(); 
			  
			  System.out.println("Ingrese num2");
			  b=lec.nextInt();
			  
			  respuesta = a * b;
			  
			  System.out.println("La Multiplicasion de " +a+ " y " + b+ " es: " + respuesta);
			  
			  break;
		  case 4:
			  System.out.println("Ingrese num1");
			  a=lec.nextInt(); 
			  
			  System.out.println("Ingrese num2");
			  b=lec.nextInt();
			  if(b<=0) {
				  System.out.println("No se puede dividir");
			  }else {
			  
			  respuesta = a / b;
			  
			  System.out.println("La division de " +a+  " y "  + b+ " es: " + respuesta);
			  }
			  break;
		  case 5:
			  System.out.println("Ingrese num1");
			  a=lec.nextInt(); 
			  
			  System.out.println("Ingrese num2");
			  b=lec.nextInt();
			  
			  respuesta = a - b;
			  
			  System.out.println("El residuo de " +a+ " y " + b+ " es: " + respuesta);
			  
			  break;
		  case 6:
			  System.out.println("Ingrese num1");
			  a=lec.nextInt(); 
			  
			  System.out.println("Ingrese potencia");
			  b=lec.nextInt();
			  
			  respuesta =  Math.pow(a, b);
			  
			  System.out.println("La potencia de " +a+ " es: " + respuesta);
			  
			  break;
		  case 7:
			  System.out.println("Ingrese num1");
			  a=lec.nextDouble(); 
			  
			  respuesta = Math.sqrt(a);
			  
			  System.out.println("La raiz cuadrada de " +a+ "es: " + respuesta);
			  
			  break;
		  case 8:
			  System.out.println("no se");
			  
			  break;
		  case 9:
			  salir= true;
			  break;
			  
		  }
	}

}
