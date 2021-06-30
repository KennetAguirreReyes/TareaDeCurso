package tarea_de_curso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Distribuidora {
	static Scanner entrada = new Scanner(System.in);
	Date fecha = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
	String fechaActual = sdf.format(fecha);
	Scanner lector = new Scanner(System.in);
	int opcion2, excep = 2;
	//Pago de Nóminas
	double salario;
	String nombre;
	String cargo;
	double bono;
	double INSS= 0.0625, montoINSS;
	double IR, montoIR;
	double sindicato = 0.1, montoSindicato;
	double salarioB;
	double[] salarioN;
	double incentivo;
	boolean continua;
	//Balance General
		//Activos
	String nombreEmpre;
	double caja;
	double banco;
	double mercancia;
	double clientes;
	double documenxcob;
	double propaganda;
	double papeleria;
	double terreno;
	double edificio;
	double equipodeOf;
	double equipodeCom;
		//Pasivos
	double acreedores;
	double proveedores;
	double documenxpag;
	
	//Estado de Resultado
	double ventas;
	double devo;
	double rebajas;
	double invIni;
	double compras;
	double gastos;
	double devoC;
	double rebajasC;
	double invFin;
	double almacen;
	double luz;
	double comis;
	double luz2;
	double intereses;
	
	public void ordenamiento(double A[],int n){
		  for (int i = 1; i < n; i++) {
			  double valorC = A[i];
			  int posicion = i; 
			  while((posicion > 0) && (A[posicion - 1] > valorC)) {
				  A[posicion] = A[posicion - 1];
				  posicion = posicion - 1;
			  }
			  A[posicion] = valorC;
		  }
	}
	public void ascendente(double A[],int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(A[i] + " ");
		}
		System.out.println();
	}
	
	public void desendente(double A[], int n) {
		for (int i =( n - 1); i >= 0; i--) {
			System.out.println(A[i] + " ");
			}
		System.out.println();
	}
	public int busquedaLineal(double numeros[], int n, double buscado) {
		int indice = 0;
		while(indice< n) {
			if (numeros[indice] == buscado) {
				return indice;
			}
				indice += 1;
		}
		return -1;
	}

	public void calcsalario() {//acordarse de agregar los while y los trycatch y agrege entrada en argo linea 114 que sin eso se jode

		do {
			try {
				continua = false;
		System.out.println("Ingrese la Cantidad de los Trabajadores que quiere conocer el Salario Neto: ");
		int n = lector.nextInt();
		double salarioN[] = new double [n];
		
		
		for (int i = 0 ; i < n; i++) {
			do {
				try {
					continua = false;
			System.out.println("Ingrese el nombre del Trabajador: ");
			//lector.nextLine();
			String nombre = entrada.nextLine();
			System.out.println("Ingrese el Cargo del Trabajador " + nombre);
			String cargo = entrada.nextLine();
			
			do {
				excep = 2;
			try{
			System.out.print("Ingrese el Salario del Trabajador: C$ ");
			salario = lector.nextDouble();
			
			while(salario < 0) {
				   System.out.println("El salario no puede ser negativa\n");
				   System.out.print("Ingrese el Salario del Trabajador: C$ ");
					salario = lector.nextDouble();
				}
			}catch(InputMismatchException ex) {
				System.out.println("Debe de introducir uno de los numeros indicados en la aplicacion\n");
				entrada.nextLine();
				excep = 1;
			}
			}while(excep != 2);
			
			System.out.print("Ingrese el Bono del Trabajador(Sino no tiene, Ingresar O): C$ ");
			bono = lector.nextDouble();
			
			while(bono < 0) {
				   System.out.println("El bono no puede ser negativa\n");
				   System.out.print("Ingrese el Bono del Trabajador(Sino no tiene, Ingresar O): C$ ");
					bono = lector.nextDouble();
				}
			
			System.out.print("Ingrese el Incentivo del Trabajador(Sino no tiene, Ingresar O): C$ ");
			incentivo = lector.nextDouble();
			
			while(incentivo < 0) {
				   System.out.println("El incentivo no puede ser negativa\n");
				   System.out.print("Ingrese el Incentivo del Trabajador(Sino no tiene, Ingresar O): C$ ");
					incentivo = lector.nextDouble();
				}
			
			if (salario == 1 && salario >= 8333.33) {
				IR = 0;
			}else if(salario >= 8333.34 && salario <= 16666.66) {
				IR = 0.15;
			}else if(salario >= 16666.67 && salario <= 29166.66) {
				IR = 0.20;
			}else if(salario >= 29166.67 && salario <= 41666.66) {
				IR = 0.25;
			}else if(salario >= 41666.67) {
				IR = 0.30;
			}
			
			System.out.println();
			System.out.println();
			System.out.println("------------------------TASAS-------------------------");
			System.out.println("INSS: " + INSS);
			System.out.println("IR: " + IR);
			System.out.println("Sindicato: " + sindicato);
			System.out.println("----------------INGRESOS DEL EMPLEADO-----------------");
			System.out.println("Salario: C$ " + salario);
			System.out.println("Bono: C$ " + bono);
			System.out.println("Incentivo: C$ " + incentivo);
			System.out.println("--------------------SALARIO BRUTO---------------------");
			salarioB = salario + bono + incentivo;
			System.out.println("Salario Bruto: C$ " + salarioB);
			System.out.println("----------DEDUCCIONES SOBRE EL SALARIO BRUTO----------");
			montoINSS = salario * INSS;
			System.out.println("Monto INSS: C$ " + montoINSS);
			montoIR = salario * IR;
			System.out.println("Monto IR: C$ " + IR);
			montoSindicato = salario * sindicato;
			System.out.println("Monto Sindicato: C$ " + montoSindicato);
			System.out.println("--------------------SALARIO NETO----------------------");
			salarioN [i] = salarioB - montoINSS - montoIR - montoSindicato;
			System.out.println("Salario Neto: C$ " + salarioN[i]);
			
			
			
			do {
				try {
					continua = false;
					System.out.println();
					System.out.println();
					System.out.println("¿Desea Ordenar los Salarios?");
					System.out.println("1: Si.");
					System.out.println("2: Deseo Buscar los Salarios.");
					System.out.println("3: No.");
					System.out.print("Opción: ");
					opcion2 = lector.nextInt();
					a: switch(opcion2) {
					case 1:
						System.out.println("¿De qué forma?");
						System.out.println("1: Ascendentes.");
						System.out.println("2: Descendente.");
						System.out.print("Opción: ");
						opcion2 = lector.nextInt();
						System.out.println();
						b: switch(opcion2) {
							case 1: 
								ordenamiento(salarioN, salarioN.length);
								System.out.println("Salarios Ordenados de Manera Ascendente: ");
								ascendente(salarioN, salarioN.length);
								break b;
							case 2:
								ordenamiento(salarioN, salarioN.length);
								System.out.println("Salarios Ordenados de Manera Descendente: ");
								desendente(salarioN, salarioN.length);
								break b;
						}
					case 2: 
						do {
							try {
								continua = false;
						System.out.println("Ingrese el Salario que desea encontrar: ");
						double buscado = lector.nextDouble();
						 int hallado = busquedaLineal(salarioN, salarioN.length, buscado);
						  if (hallado != -1) {
							  System.out.println("El Salario " + buscado + " fue encontrado en la posición " + hallado);
						  }else {
							  System.out.println("El Salario " + buscado + " no fue encontrado");
						  }
							} catch (InputMismatchException e) {
								System.out.println("****El Dato que ha Ingresado es INCORRECTO****");
								System.out.println();
								lector.next();
								continua = true;
							}
						} while (continua);
						break a;			
					}
					} catch (InputMismatchException e) {
						System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
						System.out.println();
						System.out.println();
						lector.next();
						continua = true;
					}
				} while (continua);	
			
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
	}
	
	public void balanceG() {
		do {
			try {
				continua = false;
		System.out.println("Ingrese el nombre de la Empresa.");
		//lector.nextLine();
		System.out.print("Nombre de la Empresa: ");
		nombreEmpre = entrada.nextLine();
		//Activos Circulantes
		do {
			try {
				continua = false;
		System.out.println("¿Tiene algún monto en la cuenta de Caja?, Ingreselo.");
		System.out.print("Caja: C$");
		caja = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Banco?, Ingreselo.");
		System.out.print("Banco:  C$");
		banco = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Mercancía?(lo que se tiene en inventario), Ingreselo.");
		System.out.print("Mercancía:  C$");
		mercancia = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Clientes?(El total del dinero de ventas a Crédito y que aun no se ha recibido), Ingreselo.");
		System.out.print("Clientes:  C$");
		clientes = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Documentos por Cobrar?(es toda deuda que le deben a su empresa y por ella a firmó un contrato), Ingreselo.");
		System.out.print("Documentos por Cobrar:  C$");
		documenxcob = lector.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
				System.out.println();
				System.out.println();
				lector.next();
				continua = true;
			}
		} while (continua);
		//Activos Fijos
		do {
			try {
				continua = false;
		System.out.println("¿Tiene algún monto en la cuenta de Terreno?(Total de dinero equivalente a lo que cuesta el Terreno donde se encuentra la empresa), Ingreselo.");
		System.out.print("Terreno:  C$");
		terreno = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Edificio?(Total de dinero equivalente a lo que cuesta el Edificio donde se encuentra la empresa), Ingreselo.");
		System.out.print("Edificio:  C$");
		edificio = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Equipo de Oficina?(Total de dinero equivalente al Equipo de Oficina), Ingreselo.");
		System.out.print("Equipo de Oficina:  C$");
		equipodeOf = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Equipo de Cómputo?(Total de dinero equivalente al Equipo de Cómputo), Ingreselo.");
		System.out.print("Equipo de Cómputo:  C$");
		equipodeCom = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Propaganda?(Si la empresa gasta en Propaganda y Publicidad), Ingreselo.");
		System.out.print("Propaganda:  C$");
		propaganda = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Papelería?, Ingreselo.");
		System.out.print("Papelería:  C$");
		papeleria = lector.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
				System.out.println();
				System.out.println();
				lector.next();
				continua = true;
			}
		} while (continua);
		//Total Activos
		
		//Pasivos
		do {
			try {
				continua = false;
		System.out.println("¿Tiene algún monto en la cuenta de Proveedores?(Es lo que se le debe a una empresa que abastece lo necesario para la actividad principal de su empresa), Ingreselo.");
		System.out.print("Proveedores:  C$");
		proveedores = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Acreedores?,(Es a aquella Organización que se le debe dinero de un prestamo bancario) Ingreselo.");
		System.out.print("Acreedores:  C$");
		acreedores = lector.nextDouble();
		System.out.println("¿Tiene algún monto en la cuenta de Documentos por Pagar?(es toda deuda que tiene la empresa y por el a firmó un contrato), Ingreselo.");
		System.out.print("Documentos por Pagar:  C$");
		documenxpag = lector.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
				System.out.println();
				System.out.println();
				lector.next();
				continua = true;
			}
		} while (continua);
			} catch (InputMismatchException e) {
				System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
				System.out.println();
				System.out.println();
				lector.next();
				continua = true;
			}
		} while (continua);
		double totalActC = caja + banco + mercancia + clientes + documenxcob;
		double totalActF = terreno + edificio + equipodeOf + equipodeCom + propaganda + papeleria;
		double totalActivos = totalActC + totalActF;
		double totalPas = proveedores + acreedores + documenxpag;
		//Capital Contable
		double capital = totalActivos - totalPas;
		double activos  = capital + totalPas;
			
		//BALANCE GENERAL
		System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t"+ "\t" + "\t" + nombreEmpre + "\t" + "\t" + "\t" + "\t" + "\n" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"+ "Balance General al " + fechaActual + "\t" + "\t" + "\t" + "\t" + "\n" +  "\t" + "ACTIVOS" + "\t" + "\t" + "\t" + "\t" + "1" + "\t" + "\t" + "\t" + "2" + "\t" + "\t" + "\t" + "3" + "\t" + "\t" + "\t" + "4" + "\t" + "\n" + "\t" + "ACTIVOS CIRCULANTES" + "\n" + "\t" + " Caja" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+caja + "\n" + "\t" + "Bancos" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+ banco + "\n" + "\t" + "Mercancías" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+mercancia + "\n" + "\t" + "Clientes" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+clientes +"\n" + "\t" + "Documentos por Pagar" + "\t" + "\t" + "\t" + "\t" + "\t" +" C$"+ documenxpag + "\n" + "\t" + "TOTAL ACT. CIR" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+totalActC + "\n" + "\n" + "\t" + "ACTIVOS FIJOS" + "\n" + "\t" + "Terreno" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+terreno + "\n" + "\t" + "Edificio" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+edificio + "\n" + "\t" + "Equipo de Ofi." + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+equipodeOf + "\n" + "\t" + "Equipo de Cómp." + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+equipodeCom + "\n" + "\t" + "Propaganda" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"+ " C$"+propaganda + "\n" + "\t" + "Papelería" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+papeleria + "\n" + "\t" + "TOTAL ACT. FIJ." + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+totalActF + "\n" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "TOTAL ACTIVOS" + "\t" + "\t" + " C$"+totalActivos + "\n" + "\n" + "\t" + "PASIVOS" + "\n" + "\t" + "Proveedores" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+proveedores + "\n" + "\t" + "Acreedores" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+acreedores + "\n" + "\t" + "Documentos x Pag." + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+documenxpag + "\n" + "\t" + "TOTAL PAS. C/P" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "TOTAL PASIVOS" + "\t" + "\t" + " C$"+totalPas + "\n" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+totalPas + "\n" + "\n" + "\t" + "CAPITAL CONTABLE" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+capital);
	}
	
	public void estadoR() {
		do {
			try {
				continua = false;
				//Ingresos
				do {
					try {
					continua= false;
				System.out.println("Ingrese el nombre de la empresa: ");
				System.out.print("Nombre: ");
				nombreEmpre = entrada.nextLine();
				System.out.print("Ingrese el monto Total de sus Ventas: C$");
				ventas = lector.nextDouble();
				System.out.print("Ingrese el monto Total de las Devoluciones de las Ventas(Sino hubieron Ingresar 0): C$");
				devo = lector.nextDouble();
				System.out.print("Ingrese el monto Total de las Rebajas de las Ventas(Sino hubieron Ingresar 0): C$");
				rebajas = lector.nextDouble();
				System.out.print("Ingrese el monto Total de su Inventario Inicial: C$");
				invIni = lector.nextDouble();
				System.out.print("Ingrese el monto Total de sus Compras: C$");
				compras = lector.nextDouble();
				System.out.print("Ingrese el monto Total de sus Gastos de Compras: C$");
				gastos = lector.nextDouble();
				System.out.print("Ingrese el monto Total de las Devoluciones de las Compras(Sino hubieron Ingresar 0): C$");
				devoC = lector.nextDouble();
				System.out.print("Ingrese el monto Total de las Rebajas de las Compras(Sino hubieron Ingresar 0): C$");
				rebajasC = lector.nextDouble();
				System.out.print("Ingrese el monto Total de su Inventario Final: C$");
				invFin = lector.nextDouble();
					} catch (InputMismatchException e) {
						System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
						System.out.println();
						System.out.println();
						lector.next();
						continua = true;
					}
				} while (continua);
				//Gastos
				do {
					try {
					continua = false;
				System.out.print("Ingrese el monto Total por la renta de Almacén: C$");
				almacen = lector.nextDouble();
				System.out.print("Ingrese el monto Total por el consumo de Luz: C$");
				luz = lector.nextDouble();
				System.out.print("Ingrese el monto Total por las comisiones de Agentes y Vendedores: C$");
				comis = lector.nextDouble();
				
				System.out.print("Ingrese el monto Total por el consumo de Papelería: C$");
				papeleria = lector.nextDouble();
				System.out.print("Ingrese el monto Total por el consumo de Luz: C$");
				luz2 = lector.nextDouble();
			
				System.out.print("Ingrese el monto Total de interes cobrados: C$");
				intereses = lector.nextDouble();
					} catch (InputMismatchException e) {
						System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
						System.out.println();
						System.out.println();
						lector.next();
						continua = true;
					}
				} while (continua);
			} catch (InputMismatchException e) {
				System.out.println("******El Dato que ha Ingresado es INCORRECTO******");
				System.out.println();
				System.out.println();
				lector.next();
				continua = true;
			}
		} while (continua);
		double desem = devo + rebajas;
		double ventasN = ventas - devo - rebajas;
		double comprasT = compras + gastos;
		double desemC = devoC + rebajasC;
		double comprasN = comprasT - devoC - rebajasC;
		double totalM = invIni + comprasN;
		double costoV = totalM - invFin;
		double utilB = ventasN - costoV;
		double gastosV = almacen + luz + comis;
		double gastosAd = papeleria + luz2;
		double gastosFi = intereses;
		double gastosT = gastosV + gastosAd + gastosFi;
		double utilOp = utilB - gastosT;
		double ISR = 0.35 * utilOp;
		double PTU = 0.10 * utilOp;
		double desemT = ISR - PTU;
		double utilN = utilOp - ISR - PTU;
		 
		System.out.println("\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"+ "\t"+ nombreEmpre + "\t" + "\t" + "\t" + "\t" + "\t" + "\t"+ "\n" + "\t"+ "\t"+ "\t"+ "\t\t"+ "Estado de Pérdida y Ganancias del " + fechaActual + "\t"+ "\t"+ "\t"+ "\n"+ "\t"+ "\t"+ "\t" + "\t"+ "\t"+ "1" + "\t"+ "\t"+ "\t"+ "2" + "\t"+ "\t"+ "\t"+"3"+"\t"+"\t"+"\t"+"4"+"\t"+"\t"+"\t"+"\n"+"\t"+"Ventas Totales" + "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ " C$"+ventas +"\n"+"\t"+"Devolución S/V" + "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ " C$"+ devo + "\n"+ "\t"+ "Rebajas S/V" + "\t"+ "\t"+ "\t"+ "\t" + "\t" + "\t" + " C$"+rebajas + "\t" + "\t" + "\t" + " C$"+ desem + "\t" + "\t" + "\t" + " C$"+desemC + "\n" + "\t" + "VENTAS NETAS" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + " C$"+ventasN + "\n" + "\t" + "Inventario Inicial" + "\t" + "\t" + "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t" +" C$"+ invIni + "\n" + "\t" + "Compras" + "\t"+ "\t"+ "\t" + "\t" + " C$"+compras + "\n" + "\t" + "Gastos de Compras" + "\t"+ "\t"+ " C$"+gastos+ "\n"+ "\t" + "COMPRAS TOTALES" + "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ " C$"+comprasT + "\n" + "\t" + "Devolución S/C" + "\t" + "\t" + "\t" + " C$"+devoC + "\n"+ "\t" + "Rebajas S/C" + "\t" + "\t" + "\t"+ " C$"+rebajasC + "\n" + "\t" + "COMPRAS NETAS" + "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t" + " C$"+comprasN + "\n" + "\t" + "Total Mercan."+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+" C$"+totalM+ "\n"+ "\t"+"Inventario Final"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+" C$"+invFin+ "\n"+ "\t"+"Costo de lo Vendido" + "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+" C$"+costoV+ "\n"+ "\t"+"Utilidad Bruta"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+" C$"+utilB+ "\n"+ "\t" + "GASTOS DE OPERACIÓN"+ "\n"+ "\t"+"Gastos de Venta"+ "\n"+ "\t"+"Renta Almacén" + "\t"+ "\t"+ "\t"+ " C$"+almacen+ "\n"+ "\t"+"Propaganda"+ "\t"+ "\t"+ "\t"+" C$"+propaganda+ "\n"+ "\t"+"Comisiones de Vendedores" + "\t"+" C$"+comis+ "\n"+ "\t"+"Consumo de Luz"+ "\t"+ "\t"+ "\t"+" C$"+luz+ "\t"+"\t"+ "\t"+" C$"+gastosV+ "\n"+ "\t"+"Gastos de Administración"+ "\n"+ "\t"+"Papelería"+ "\t"+ "\t"+ "\t"+" C$"+papeleria+ "\n"+ "\t"+"Consumo de Luz" + "\t"+ "\t"+ "\t" +" C$"+luz2+ "\t"+ "\t"+ "\t"+" C$"+gastosAd+ "\n"+ "\t"+"Gastos Financieros"+ "\n"+ "\t"+"Intereses Pagados"+ "\t"+ "\t"+ " C$"+intereses+ "\n"+ "\t"+"Utilidad de Operación"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+" C$"+utilOp+ "\n"+ "\t"+"ISR"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+" C$"+ ISR+ "\n"+ "\t"+"PTU"+ "\t"+  "\t"+"\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+" C$"+PTU+ "\t"+ "\t"+ "\t"+" C$"+desemT+ "\n"+ "\t"+"Utilidad Neta del Ejer."+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+ "\t"+" C$"+utilN);
		
	}
	
	public void variac() {
		System.out.print("Ingrese el Capital Social: C$");
		double capitalS= lector.nextDouble();
		System.out.print("Ingrese la Utilidad del Ejercicio: C$");
		double util = lector.nextDouble();
		System.out.print("Ingrese los Dividendos: C$");
		double div= lector.nextDouble();
		double utilR= capitalS + util - div;
		System.out.println("\t"+"\t"+"VARIACIÓN DE CAPITAL"+"\t"+"\t"+"\t"+"\n"+"Capital Social"+"\t"+"\t"+"\t"+" C$"+capitalS+"\n"+"Utilidad del Ejercicio"+"\t"+"\t"+" C$"+util+"\n"+"Dividendos"+"\t"+"\t"+"\t"+" C$"+div+"\n"+"Utilidad Retenida"+"\t"+"\t"+" C$"+utilR);
	}
	
}
