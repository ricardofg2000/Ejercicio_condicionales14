package unico;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/* Realiza un programa que nos diga si hay 
		 * probabilidad de que nuestra pareja nos está siendo infiel. 
		 * El programa irá haciendo preguntas que el usuario contestará 
		 * con verdadero o falso. Cada pregunta contestada como verdadero 
		 * sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. 
		 * A continuación se listan las preguntas del test.
		 * A continuación se muestran los mensajes que deberá dar el programa según la puntuación obtenida.

			Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.
			
			Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida 
			o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.
			
			Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar 
			viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y 
			averigües que es lo que está pasando por su cabeza.*/
		
		Scanner leer = new Scanner(System.in);
		
		final String pregunta1 = "1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.";
		final String pregunta2 = "2. Ha aumentado sus gastos de vestuario.";
		final String pregunta3 = "3. Ha perdido el interés que mostraba anteriormente por ti.";
		final String pregunta4 = "4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).";
		final String pregunta5 = "5. No te deja que mires la agenda de su teléfono móvil.";
		final String pregunta6 = "6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.";
		final String pregunta7 = "7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.";
		final String pregunta8 = "8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.";
		final String pregunta9 = "9. Has notado que últimamente se perfuma más.";
		final String pregunta10 = "10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.";
		
		final String resultado1 = "¡Enhorabuena! tu pareja parece ser totalmente fiel.";
		final String resultado2 = "Quizás exista el peligro de otra persona en su vida o en su mente, "
				+ "aunque seguramente será algo sin importancia. No bajes la guardia.";
		final String resultado3 = "Tu pareja tiene todos los ingredientes para estar "
				+ "viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y "
				+ "averigües que es lo que está pasando por su cabeza";
		
		String respuesta;
		int puntos = 0;
		
		System.out.println("Programa para conocer la probabilidad de que nuestra pareja nos esté siendo infiel");
		System.out.println("Conteste a las siguientes preguntas con v(Verdadero) o f(Falso)");
		
		System.out.println(pregunta1);
		respuesta = leer.next();
			if (respuesta.equals("v"))  {
				puntos = puntos + 3;
			}
		System.out.println(pregunta2);
		respuesta = leer.next();
			if (respuesta.equals("v")) {
				puntos = puntos + 3;
			}
		System.out.println(pregunta3);
		respuesta = leer.next();
			if (respuesta.equals("v"))  {
				puntos = puntos + 3;
			}
		System.out.println(pregunta4);
		respuesta = leer.next();
			if (respuesta.equals("v"))  {
				puntos = puntos + 3;
			}
		System.out.println(pregunta5);
		respuesta = leer.next();
			if (respuesta.equals("v"))  {
				puntos = puntos + 3;
			}
		System.out.println(pregunta6);
		respuesta = leer.next();
			if (respuesta.equals("v")) {
				puntos = puntos + 3;
			}
		System.out.println(pregunta7);
		respuesta = leer.next();
			if (respuesta.equals("v"))  {
				puntos = puntos + 3;
			}
		System.out.println(pregunta8);
		respuesta = leer.next();
			if (respuesta.equals("v"))  {
				puntos = puntos + 3;
			}
		System.out.println(pregunta9);
		respuesta = leer.next();
			if (respuesta.equals("v"))  {
				puntos = puntos + 3;
			}
		System.out.println(pregunta10);
		respuesta = leer.next();
			if (respuesta.equals("v"))  {
				puntos = puntos + 3;
			}
			
		System.out.println(puntos);

		if ( puntos <= 10 ) {
		        System.out.print(resultado1);
		      }
		      
		if ( (puntos > 11 ) && (puntos <= 22) ) {
		        System.out.print(resultado2);    
		      }
		      
		if ( puntos >= 22 ) {
		        System.out.print(resultado3);
		      }

	}

}
