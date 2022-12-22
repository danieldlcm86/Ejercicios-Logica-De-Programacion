package ejercicios;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/*Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras su respectiva traducción
Utilizar un objeto HashMap para almacenar los pares de palabras
Escoger al azar 5 palabars en español del mini diccionario

Input
Pedir al usuario que teclee la traducción al inglés de cada una de las palabras
Comprobar si el input es correcto

Output
Mostrar cuántas respuestas correctas e incorrectas tiene el usuario*/
public class DiccionarioRandom {

	public static void main(String[] args) {
		
		//Crear un objeto HashMap llamado diccionario con parámetros de tipo String
		//Importamos el HashMap
		HashMap<String, String> diccionario = new HashMap<String, String>();	

		//Agregamos llaves (keys) y valores (values) (Español, Inglés)
		diccionario.put("Diseño", "Design");
		diccionario.put("Empleado", "Employee");
		diccionario.put("Negocio", "Business");
		diccionario.put("Desarrollador", "Developer");
		diccionario.put("Responsivo", "Responsive");
		diccionario.put("Estilos", "Styles");
		diccionario.put("Remoto", "Remote");
		diccionario.put("Interfaz", "Fronted");
		diccionario.put("Problemas", "Issues");
		diccionario.put("Conocimiento", "Insight");
		diccionario.put("Tablero", "Board");
		diccionario.put("Fuentes", "Fonts");
		diccionario.put("Parámetros", "Parameters");
		diccionario.put("Función", "Function");
		diccionario.put("Importar", "Import");
		diccionario.put("Constructor", "Builder");
		diccionario.put("Estático", "Static");
		diccionario.put("Nulo", "Null");
		diccionario.put("Vacío", "Void");
		diccionario.put("Pendientes", "Backlog");	
		
		//Creamos el Scanner para pedir al usuario que teclee la traducción al inglés de cada una de las palabras
		Scanner scanner = new Scanner(System.in);
		
		//Escoger al azar 5 palabras en español del mini diccionario
		Random rand = new Random();
		
		//Creamos variables para contador de incremento y decremento
		int correctas = 0;
		int incorrectas = 0;
		
		//Creamos un bucle para elegir 5 palabras al azar
		for (int i = 0; i < 5; i++) {
			String palabra = (String) diccionario.keySet().toArray()[rand.nextInt(diccionario.size())];
		
		
		//Pedimos al usuario la traducción de la palabra mostrada
		System.out.println("Escribe la traducción de la palabra mostrada: " + palabra);
		String resultado = scanner.nextLine();
		
		//Creamos una función para corrobar si la traducción es correcta
		if (resultado.equals(diccionario.get(palabra))) {
			correctas++;
		}else {
			incorrectas++;
		}
		}
		
		//Creamos un sysout para mostrar las respuestas correctas e incorrectas
		System.out.println("Respuestas correctas: " + correctas);
		System.out.println("Respuestas incorrectas: " + incorrectas);
	}

}
