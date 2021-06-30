package tarea_de_curso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlDeCV {
	
	private int compras, gastosCompras, devolucionesSC, descuentosSC, ventas, devolucionesSV, descuentosSV, excep = 2;
	private int totalCompras, comprasNetas, ventasNetas;

	public void pedirControlDeCompras(Scanner entrada) {
		
		do {
			excep = 2;
		try{
		System.out.print("Ingrese monto total de sus compras: C$");
		compras = entrada.nextInt();
		
		while(compras < 0) {
			   System.out.println("Las compras no pueden ser negativas\n");
			   System.out.print("Ingrese monto total de sus compras: C$");
				compras = entrada.nextInt();
			}
		}catch(InputMismatchException ex) {
			System.out.println("Debe de introducir un numero entero\n");
			entrada.nextLine();
			excep = 1;
		}
		}while(excep != 2);
		
		do {
			excep = 2;
		try{
		System.out.print("Ingrese monto total de sus gastos de compras: C$");
		gastosCompras = entrada.nextInt();
		
		while(gastosCompras < 0) {
			   System.out.println("Los gastos de compras no pueden ser negativas\n");
			   System.out.print("Ingrese monto total de sus gastos de compras: C$");
				gastosCompras = entrada.nextInt();
			}
		}catch(InputMismatchException ex) {
			System.out.println("Debe de introducir un numero entero\n");
			entrada.nextLine();
			excep = 1;
		}
		}while(excep != 2);
		
		do {
			excep = 2;
		try{
		System.out.print("Ingrese monto total de las devoluciones sobre compra: C$");
		devolucionesSC = entrada.nextInt();
		
		while(devolucionesSC < 0) {
			   System.out.println("Las devoluciones sobre compra no pueden ser negativas\n");
			   System.out.print("Ingrese monto total de las devoluciones sobre compra: C$");
				devolucionesSC = entrada.nextInt();
			}
		}catch(InputMismatchException ex) {
			System.out.println("Debe de introducir un numero entero\n");
			entrada.nextLine();
			excep = 1;
		}
		}while(excep != 2);
		
		do {
			excep = 2;
		try{
		System.out.print("Ingrese monto total de los descuentos sobre compra: C$");
		descuentosSC = entrada.nextInt();
		
		while(descuentosSC < 0) {
			   System.out.println("Los descuentos sobre compra no pueden ser negativas\n");
			   System.out.print("Ingrese monto total de los descuentos sobre compra: C$");
				descuentosSC = entrada.nextInt();
			}
		}catch(InputMismatchException ex) {
			System.out.println("Debe de introducir un numero entero\n");
			entrada.nextLine();
			excep = 1;
		}
		}while(excep != 2);
		
		totalCompras = compras + gastosCompras;
		
		while(totalCompras < descuentosSC + devolucionesSC) {
			System.out.println("\nLos descuentos y devoluciones sobre compra no pueden ser mayores que el total de compras");
			
			do {
				excep = 2;
			try{
			System.out.print("Ingrese monto total de las devoluciones sobre compra: C$");
			devolucionesSC = entrada.nextInt();
			
			while(devolucionesSC < 0) {
				   System.out.println("Las devoluciones sobre compra no pueden ser negativas\n");
				   System.out.print("Ingrese monto total de las devoluciones sobre compra: C$");
					devolucionesSC = entrada.nextInt();
				}
			}catch(InputMismatchException ex) {
				System.out.println("Debe de introducir un numero entero\n");
				entrada.nextLine();
				excep = 1;
			}
			}while(excep != 2);
			
			do {
				excep = 2;
			try{
			System.out.print("Ingrese monto total de los descuentos sobre compra: C$");
			descuentosSC = entrada.nextInt();
			
			while(descuentosSC < 0) {
				   System.out.println("Los descuentos sobre compra no pueden ser negativas\n");
				   System.out.print("Ingrese monto total de los descuentos sobre compra: C$");
					descuentosSC = entrada.nextInt();
				}
			}catch(InputMismatchException ex) {
				System.out.println("Debe de introducir un numero entero\n");
				entrada.nextLine();
				excep = 1;
			}
			}while(excep != 2);
		}
	}
	
	public void mostrarControlDeCompras() {
		
		System.out.println("\n-----Control de compras-----\n");
		totalCompras = compras + gastosCompras;
		System.out.println("Total de compras = C$" + compras + " + C$" + gastosCompras);
		System.out.println("Total de compras = C$" + totalCompras);
		comprasNetas = totalCompras - devolucionesSC - descuentosSC ;
		System.out.println("\nCompras netas = C$" + totalCompras + " - C$" + devolucionesSC + " - C$" + descuentosSC);
		System.out.println("Compras netas = C$" + comprasNetas + "\n");
		
	}
	
	public void pedirControlDeVentas(Scanner entrada) {
		
		do {
			excep = 2;
		try{
		System.out.print("Ingrese monto total de sus ventas: C$");
		ventas = entrada.nextInt();
		
		while(ventas < 0) {
			   System.out.println("Las ventas no pueden ser negativas\n");
			   System.out.print("Ingrese monto total de sus ventas: C$");
				ventas = entrada.nextInt();
			}
		}catch(InputMismatchException ex) {
			System.out.println("Debe de introducir un numero entero\n");
			entrada.nextLine();
			excep = 1;
		}
		}while(excep != 2);
		
		do {
			excep = 2;
		try{
		System.out.print("Ingrese monto total de las devoluciones sobre venta: C$");
		devolucionesSV = entrada.nextInt();
		
		while(devolucionesSV < 0) {
			   System.out.println("Las devoluciones sobre ventas no pueden ser negativas\n");
			   System.out.print("Ingrese monto total de las devoluciones sobre venta: C$");
				devolucionesSV = entrada.nextInt();
			}
		}catch(InputMismatchException ex) {
			System.out.println("Debe de introducir un numero entero\n");
			entrada.nextLine();
			excep = 1;
		}
		}while(excep != 2);
		
		do {
			excep = 2;
		try{
		System.out.print("Ingrese monto total de los descuentos sobre venta: C$");
		descuentosSV = entrada.nextInt();
		
		while(descuentosSV < 0) {
			   System.out.println("Las descuentos sobre ventas no pueden ser negativas\n");
			   System.out.print("Ingrese monto total de los descuentos sobre venta: C$");
				descuentosSV = entrada.nextInt();
			}
		}catch(InputMismatchException ex) {
			System.out.println("Debe de introducir un numero entero\n");
			entrada.nextLine();
			excep = 1;
		}
		}while(excep != 2);
		
		while(ventas < descuentosSV + devolucionesSV) {
			System.out.println("\nLos descuentos y devoluciones sobre ventas no pueden ser mayores que el total de ventas");
			
			do {
				excep = 2;
			try{
			System.out.print("Ingrese monto total de las devoluciones sobre venta: C$");
			devolucionesSV = entrada.nextInt();
			
			while(devolucionesSV < 0) {
				   System.out.println("Las devoluciones sobre ventas no pueden ser negativas\n");
				   System.out.print("Ingrese monto total de las devoluciones sobre venta: C$");
					devolucionesSV = entrada.nextInt();
				}
			}catch(InputMismatchException ex) {
				System.out.println("Debe de introducir un numero entero\n");
				entrada.nextLine();
				excep = 1;
			}
			}while(excep != 2);
			
			do {
				excep = 2;
			try{
			System.out.print("Ingrese monto total de los descuentos sobre venta: C$");
			descuentosSV = entrada.nextInt();
			
			while(descuentosSV < 0) {
				   System.out.println("Las descuentos sobre ventas no pueden ser negativas\n");
				   System.out.print("Ingrese monto total de los descuentos sobre venta: C$");
					descuentosSV = entrada.nextInt();
				}
			}catch(InputMismatchException ex) {
				System.out.println("Debe de introducir un numero entero\n");
				entrada.nextLine();
				excep = 1;
			}
			}while(excep != 2);
		}
	}
	
	public void mostrarControlDeVentas() {
		
		System.out.println("\n-----Control de ventas-----\n");
		System.out.println("Total de ventas = C$" + ventas);
		ventasNetas = ventas - devolucionesSV - descuentosSV;
		System.out.println("\nVentas netas = C$" + ventas + " - C$" + devolucionesSV + " - C$" + descuentosSV);
		System.out.println("Ventas netas = C$" + ventasNetas + "\n");
		
	}

	public int getCompras() {
		return compras;
	}

	public void setCompras(int compras) {
		this.compras = compras;
	}

	public int getGastosCompras() {
		return gastosCompras;
	}

	public void setGastosCompras(int gastosCompras) {
		this.gastosCompras = gastosCompras;
	}

	public int getDevolucionesSC() {
		return devolucionesSC;
	}

	public void setDevolucionesSC(int devolucionesSC) {
		this.devolucionesSC = devolucionesSC;
	}

	public int getDescuentosSC() {
		return descuentosSC;
	}

	public void setDescuentosSC(int descuentosSC) {
		this.descuentosSC = descuentosSC;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public int getDevolucionesSV() {
		return devolucionesSV;
	}

	public void setDevolucionesSV(int devolucionesSV) {
		this.devolucionesSV = devolucionesSV;
	}

	public int getDescuentosSV() {
		return descuentosSV;
	}

	public void setDescuentosSV(int descuentosSV) {
		this.descuentosSV = descuentosSV;
	}

	public int getExcep() {
		return excep;
	}

	public void setExcep(int excep) {
		this.excep = excep;
	}

	public int getTotalCompras() {
		return totalCompras;
	}

	public void setTotalCompras(int totalCompras) {
		this.totalCompras = totalCompras;
	}

	public int getComprasNetas() {
		return comprasNetas;
	}

	public void setComprasNetas(int comprasNetas) {
		this.comprasNetas = comprasNetas;
	}

	public int getVentasNetas() {
		return ventasNetas;
	}

	public void setVentasNetas(int ventasNetas) {
		this.ventasNetas = ventasNetas;
	}
}
