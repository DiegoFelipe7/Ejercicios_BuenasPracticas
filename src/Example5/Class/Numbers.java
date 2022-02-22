package Example5.Class;
import java.util.Vector;
/**
 * [ Esta clase extiende de la  clase vector se definirarn una serie de metodos
 * y atributos 
 * ]
 *
 * @version ["VS" 1.0.0,2022-02-21
 *
 * 1.0.0,2022-02-18, La clase corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings ]
 *
 * @author [Diego Felipe Muñoz, dfmunoz@unimayor.edu.co]
 * 
 * @since [1.0.0]
 */
public class Numbers extends Vector{
    private Integer number;
     /**
     * Constructor de la clase 
     * @param number Hace referencia al numero que se quiere crear como objeto
     * de la clase numero.
     */

    public Numbers(Integer number) {
        this.number = number;
    }
    
    public Numbers(){
        
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
     /**
     * [El objetivo principal de este método es agregar datosa un vector los 
     * cuales son de tipo integer
     * ]
     *
     * @author [Diego Felipe Muñoz, dfmunoz@unimayor.edu.co]
     * 
     * @param numberVector
     * @param number
     * 
     * @return el método retorna un vector con todos los datos almacenados
     *      
     * @since [1.0.0]
     */
      public static Vector<Integer> vector_creation(
        Vector<Integer> numberVector, Integer number)
    {
        numberVector.add(number);
        return numberVector;
    } 
      /**
     * [El objetivo principal de este método es realizar un recorrido 
     * por cada uno de los elementos y mostrar su informacion
     * ]
     *
     * @author [Diego Felipe Muñoz, dfmunoz@unimayor.edu.co]
     * 
     * @param numberVector
     *      
     * @since [1.0.0]
     */
    public static void show_vector_data (Vector<Integer> numberVector){
        numberVector.forEach((number) -> {
            System.out.println(number.toString());
        });
    }
    
    
}
