package tarea_de_curso;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App{
	static int opcion, opcion1, opcion2, opcion3, control, pregunta;
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Distribuidora obj = new Distribuidora();
		ControlDeCV cont = new ControlDeCV();
		LeerTxt lect = new LeerTxt();
		
		double buscado;
		boolean continua;
		do {
			do {
				try { 
				continua = false;
				System.out.println("");
				System.out.println("");
				System.out.println("            ¡¡BIENVENIDO!!              ");
				System.out.println("");
				System.out.println("Seleccione la Opción de su Preferencia: ");
				System.out.println("");
				System.out.println("Opción 1: Ingresar a la Aplicación de Control Financiero: ");
				System.out.println("Opción 2: Salir de la Aplicación.");
				System.out.print("Opción: ");
				opcion = lector.nextInt();
				System.out.println("");
				a: switch(opcion) {
					case 1:
					do {
						try {
							continua = false;
						System.out.println("-----------------------------------------------------------------");
						System.out.println("        Bienvenido a la Aplicación de Control Financiero         ");
						System.out.println("-----------------------------------------------------------------");
						System.out.println("");
						System.out.println("");
						System.out.println("Seleccione la Opción de su preferencia: ");
						System.out.println("1: Pago de Nóminas.");
						System.out.println("2: Estados financieros.");
						System.out.println("3: Control de Compra y venta");
						System.out.println("4: Salir. ");
						System.out.print("Opción: ");
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
								System.out.println("Desea ver una breve explicacion de Estados Financieros?"
										+ "\n1. si"
										+ "\n2. no");
								pregunta = lector.nextInt();
									} catch (InputMismatchException e) {
										System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
										lector.nextLine();
										continua = true;
									}
								}while (continua);
								
								if(pregunta == 1) {
									try {
										lect.leer(new File("estadosFinancieros.txt"));
										System.out.println("\n");
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
								do {
									try {
										continua = false;
										System.out.println("Seleccione la Opción de su preferencia: ");
										System.out.println("1: Balance General.");
										System.out.println("2: Estado de Resultado.");
										System.out.println("3: Variación  de Capital.");
										System.out.println("4: Volver.");
										System.out.println("5: Salir.");
										System.out.print("Opción: ");
										opcion2 = lector.nextInt();
										System.out.println();
										System.out.println();
										switch(opcion2) {
										case 1:
											do {
												try {
													continua = false;
											System.out.println("Desea ver una breve explicacion de Balance general?"
													+ "\n1. si"
													+ "\n2. no");
											pregunta = lector.nextInt();
												} catch (InputMismatchException e) {
													System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
													lector.nextLine();
													continua = true;
												}
											}while (continua);
											
											if(pregunta == 1) {
												try {
													lect.leer(new File("balanceGeneral.txt"));
													System.out.println("\n");
												} catch (IOException e) {
													e.printStackTrace();
												}
											}
											obj.balanceG();
											break b;
										case 2:
											do {
												try {
													continua = false;
											System.out.println("Desea ver una breve explicacion de estado de resultado?"
													+ "\n1. si"
													+ "\n2. no");
											pregunta = lector.nextInt();
												} catch (InputMismatchException e) {
													System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
													lector.nextLine();
													continua = true;
												}
											}while (continua);
											
											if(pregunta == 1) {
												try {
													lect.leer(new File("estadoDeResultado.txt"));
													System.out.println("\n");
												} catch (IOException e) {
													e.printStackTrace();
												}
											}
											obj.estadoR();
											break b;
										case 3:
											do {
												try {
													continua = false;
											System.out.println("Desea ver una breve explicacion de variacion de capital?"
													+ "\n1. si"
													+ "\n2. no");
											pregunta = lector.nextInt();
												} catch (InputMismatchException e) {
													System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
													lector.nextLine();
													continua = true;
												}
											}while (continua);
											
											if(pregunta == 1) {
												try {
													lect.leer(new File("variacionDeCapital.txt"));
													System.out.println("\n");
												} catch (IOException e) {
													e.printStackTrace();
												}
											}
											obj.variac();
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
								break;
								
							case 3: 
								do {
									try {
										continua = false;
								System.out.println("Desea ver una breve explicacion de Control de compra y venta?"
										+ "\n1. si"
										+ "\n2. no");
								pregunta = lector.nextInt();
									} catch (InputMismatchException e) {
										System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
										lector.nextLine();
										continua = true;
									}
								}while (continua);
								
								if(pregunta == 1) {
									try {
										lect.leer(new File("controlDeCompraVenta.txt"));
										System.out.println("\n");
									} catch (IOException e) {
										e.printStackTrace();
									}
								}
								
								do {
									try {
										continua = false;
										System.out.println("Seleccione la Opción de su preferencia: "
												+ "\n1. Control de compras"
												+ "\n2. Control de ventas"
												+ "\n3. salir");
								control = lector.nextInt();
									} catch (InputMismatchException e) {
										System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
										lector.nextLine();
										continua = true;
									}
								}while (continua);
								
								switch(control) {
								
								case 1:
									cont.pedirControlDeCompras(lector);
									cont.mostrarControlDeCompras();
									break b;
								
								case 2:
									cont.pedirControlDeVentas(lector);
									cont.mostrarControlDeVentas();
									break b;
									
								case 3: 
									opcion = 2;
									break;
									
								default:
									System.out.println("La opcion que usted eligio no es valida.\n");
									do {
										try {
											continua = false;
											System.out.println("Seleccione la Opción de su preferencia: "
													+ "\n1. Control de compras"
													+ "\n2. Control de ventas"
													+ "\n3. salir");
									control = lector.nextInt();
										} catch (InputMismatchException e) {
											System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
											lector.nextLine();
											continua = true;
										}
									}while (continua);
								}
							case 5:
								opcion = 2;
								break;
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
		}while(opcion != 2);  
		System.out.println("");
		System.out.println("¡¡Muchas Gracias por Utilizar Nuestra Aplicación de Control de Financiero, Vuelva Pronto!!");

	}

}
