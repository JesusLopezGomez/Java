package coleccionesInicio;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MainMapas {

	public static void main(String[] args) {
			
		Map<String, Collection> animales = new HashMap();
		
		animales.put("Aves", new HashSet<String>());
		
		animales.put("Mamiferos", new HashSet<String>());
		
		animales.get("Aves").add("Gorrión");
		
		animales.get("Aves").add("Jilguero");
		
		animales.get("Mamiferos").add("vaca");
		
		animales.get("Mamiferos").add("cabra");
		
		System.out.println(animales.keySet());
		
		System.out.println(animales.get("Aves"));

		for(String k: animales.keySet()) {
			System.out.println(k);
		}
	
		
	}

}
