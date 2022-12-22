package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

/*Crear un programa en Java que realice lo siguiente
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras con su respectiva traducción
Utiliza un objeto HashMap para almacenar pares de palabras

Input
Solicitar a usuario una palabra en español
Output
Mostrar por consola la palabra en inglés
En caso de no encontrar su traducción en el diccionario, debe imprimir un mensaje indicándolo*/

public class Diccionario {

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
	
	//Creamos Scanner para solicitar una palabra al usuario
	Scanner scanner = new Scanner(System.in);
	//Es importante mandar el mensaje primero para que lo vea el usuario
	System.out.println("Escribe una palabra en español para mostrarte su traducción en inglés: ");
	String key = scanner.nextLine();
	scanner.close();
	
	//Obtenemos el valor (value) de la key del HashMap usando el método get()
	String value = diccionario.get(key);
	
	//Crear una condicional que encuentre la coincidencia de la key con el value, si no existe, mostrar el mensaje
	//"No se encuentra la palabra que desea consultar, intente nuevamente."
	
	if (value != null) {
		System.out.println("La traducción de la palabra " + key + " es " + value);
	} else {
		System.out.println("No se encuentra la palabra que desea traducir, intente nuevamente.");
	}
	
	
	}

}
