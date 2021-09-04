package ws.synopsis.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
		System.out.println("Seleccione la operación a realizar");
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. MULTIPLICAR");
		System.out.println("4. DIVIDIR");
		Scanner string = new Scanner(System.in);
		String op = string.next();
		//String op = args[0];
		Scanner sc  = new Scanner(System.in);
		System.out.println("Introduzca el primero número");
		double num1 = sc.nextDouble();
		//int num1 = Integer.parseInt(args[1]);
		System.out.println("Introduzca el segundo número número");
		double num2= sc.nextDouble();
		//int num2 = Integer.parseInt(args[2]);

		switch(op){
			case "SUMA":
				Suma sum1 = new Suma(num1, num2);
				sum1.mostrarresultado();
				break;
			case "RESTA":
				Resta res1 = new Resta(num1, num2);
				res1.mostrarresultado();
				break;
			case "MULTIPLICAR":
				Multiplicar mult1 = new Multiplicar(num1, num2);
				mult1.mostrarresultado();
				break;
			case "DIVIDIR":
				Dividir div1 = new Dividir(num1, num2);
				div1.mostrarresultado();
				break;

		}

	}
}
