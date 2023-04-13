package boletin1EstructuraDatos.chatInstituto_ej5;

public class Main {

	public static void main(String[] args) {
		Persona p = new Profesor("Pepe",19);
		Persona p1 = new Profesor("Jose",20);
		Mensaje m = new Mensaje(new Profesor("Jesus",26),"Hola que tal");
		p1.enviarMensaje(p, "Hola que tal pepe");
		p.enviarMensaje(p1, "Bien jose");
		try {
			System.out.println(p1.leerMensajesBuzon());
			System.out.println(p.leerMensajesBuzon());
			System.out.println(p1.encontrarMensajeContieneFrase("jose"));
			p.recibirMensaje(m);
			System.out.println(p.leerMensajesBuzon());
			System.out.println(p.leerMensajesBuzonOrdenadorAlfabeticamente());
			
			p.borrarMensajeBuzon(0);
			System.out.println(p.leerMensajesBuzon());
		} catch (ExceptionsPersona e) {
			e.printStackTrace();
		}
	}

}
