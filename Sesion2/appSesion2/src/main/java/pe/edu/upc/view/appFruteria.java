package pe.edu.upc.view;

import pe.edu.upc.entity.Fruta;
import pe.edu.upc.entity.Mermelada;

public class appFruteria {
	
	public static void main(String[] args){
		
		Fruta f = new Fruta("Amarillo", "Dulce");
		
		Mermelada  mer = new Mermelada("Rojo", "Acido", 1, "Vidrio");
		
		System.out.println(f.toString());
		f.SoyunMetodoObjeto();
		
		System.out.println(mer.toString());
		mer.SoyunMetodoObjeto();
		
		Fruta.LugarOrigen="Tierra";
		Fruta.SoyunMetodoGlobal();
		
	}

}
