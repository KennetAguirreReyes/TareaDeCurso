package tarea_de_curso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App{
	static int opcion, opcion1, opcion2, opcion3;
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Distribuidora obj = new Distribuidora();
		
		double buscado;
		boolean continua;
		do {
			do {
				try { 
				continua = false;
				System.out.println("");
				System.out.println("");
				System.out.println("            ��BIENVENIDO!!              ");
				System.out.println("");
				System.out.println("Seleccione la Opci�n de su Preferencia: ");
				System.out.println("");
				System.out.println("Opci�n 1: Ingresar a la Aplicaci�n de Control Financiero: ");
				System.out.println("Opci�n 2: Salir de la Aplicaci�n.");
				System.out.print("Opci�n: ");
				opcion = lector.nextInt();
				System.out.println("");
				a: switch(opcion) {
					case 1:
					do {
						try {
							continua = false;
						System.out.println("-----------------------------------------------------------------");
						System.out.println("        Bienvenido a la Aplicaci�n de Control Financiero         ");
						System.out.println("-----------------------------------------------------------------");
						System.out.println("");
						System.out.println("");
						System.out.println("Seleccione la Opci�n de su preferencia: ");
						System.out.println("1: Pago de N�minas.");
						System.out.println("2: Estados financieros.");
						System.out.println("3: ");
						System.out.println("4: ");
						System.out.println("5: Salir. ");
						System.out.print("Opci�n: ");
						opcion1 = lector.nextInt();
						System.out.println();
						System.out.println();
						b: switch(opcion1) {
							case 1: 
								obj.calcsalario();
								break b;
							case 2:
								do {
									try {
										continua = false;
										System.out.println("Seleccione la Opci�n de su preferencia: ");
										System.out.println("1: Balance General.");
										System.out.println("2: Estado de Resultado.");
										System.out.println("3: Variaci�n  de Capital.");
										System.out.println("4: Volver.");
										System.out.println("5: Salir.");
										System.out.print("Opci�n: ");
										opcion2 = lector.nextInt();
										System.out.println();
										System.out.println();
										switch(opcion2) {
										case 1:
											obj.balanceG();
											break b;
										case 2:
											obj.estadoR();
											break b;
										case 3:
											obj.variac();
											break b;
										case 4:
											break b;
										case 5:
											opcion = 2;
										}
									} catch (InputMismatchException e) {
										System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
										System.out.println();
										System.out.println();
										lector.next();
										continua = true;
									}
								} while (continua);	
							case 5:
								opcion = 2;
						}
						} catch (InputMismatchException e) {
							System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
							System.out.println();
							System.out.println();
							lector.next();
							continua = true;
						}
					} while (continua);	
			}
				} catch (InputMismatchException e) {
					System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
					System.out.println();
					System.out.println();
					lector.next();
					continua = true;
				}
			} while (continua);	
		}while(opcion==1);  
		System.out.println("");
		System.out.println("");
		System.out.println("��Muchas Gracias por Utilizar Nuestra Aplicaci�n de Control de Fininanciero, Vuelva Pronto!!");

	}

}
