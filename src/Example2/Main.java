
package Example2;
public class Main {
    /**
     * [El objetivo principal de este método es dar respuesta a las siguientes
     * preguntas ¿Es posible ejecutar un programa en java que contenga varias
     * clases con métodos main? En caso positivo, ¿cómo se determina el punto 
     * de entrada a un programa?
     * podemos decir que Java puede tener múltiples métodos principales pero
     * con el concepto de sobrecarga. Debe haber solo un método principal con
     * parámetro como string[ ] arg.
    
     * ]
     *
     * @param args
     *
     * @author [Diego Felipe Muñoz, dfmunoz@unimayor.edu.co]
     *      
     * @since [1.0.0]
     */
   public static void main(int i)
    {

        // Print statement for method 1
        System.out.println(i);
    }
 
    // Method 2
    // Main driver method
    public static void main(String s)
    {
 
        // Print statement for method 2
        System.out.println(s);
    }
 
    // Metodo 3
   // Método del controlador principal
    public static void main(String[] args)
    {
 
        // Calling above 2 main methods
        main(1);
        main("Hola desde el metodo principal");
    }
}
