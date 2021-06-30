package tarea_de_curso;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerTxt {
	
	public void leer(File archivo) throws IOException{
		
		try {
			FileReader leer = new FileReader(archivo);
			BufferedReader br = new BufferedReader(leer);
			String texto;
			while((texto = br.readLine()) !=null) {
				System.out.println("" + texto);
			}
		}catch(Exception ex) {
			System.out.println("El archivo .txt no fue encontrado");
		}
	}
}
