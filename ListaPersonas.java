package ClasesCoder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaPersonas {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Persona> listaPersonas = new ArrayList<>();
		
		listaPersonas.add(new Persona("Roberto", "Ibarra"));
		
		listaPersonas.add(new Persona("Dalma", "Gomez"));
		
		listaPersonas.add(new Persona("Esteban", "Sanchez"));
		
		listaPersonas.add(new Persona("Damian", "Manso"));
		
		listaPersonas.add(new Persona("Sergio", "Giacomini"));
		System.out.println("LISTA SIN ORDENAR -------------------------------");
		
		System.out.println(listaPersonas);
		
		
		
		System.out.println("LISTA POR NOMBRE -------------------------------");
		listaPersonas.sort(Comparator.comparing(persona -> persona.getNombre()));
		
		System.out.println(listaPersonas);
		

		System.out.println("LISTA POR APELLIDO -------------------------------");
		listaPersonas.sort(Comparator.comparing(persona -> persona.getApellido()));
		
		System.out.println(listaPersonas);
		
		System.out.println("LISTA POR APELLIDO INVERSO -------------------------------");
		listaPersonas.sort(Comparator.comparing(persona -> persona.getApellido(), Comparator.reverseOrder()));
		
		System.out.println(listaPersonas);
			
		Persona mati = new Persona("Mati", "Maini");
		
		Persona lucas = new Persona("Lucas", "Diaz");
		
		System.out.println(List.of(mati, lucas));
		}
		
}