package Example5.Main;

import java.util.Scanner;
import java.util.Vector;
import Example5.Class.Numbers;
/**
 * [Esta clase tiene como objetivo prinicipal iniciar la ejecucuin del
 * programa en la cual se realizara el registro de una serie de numeros
 * a un vector]
 *
 * @version ["VS" 1.0.0,2022-02-21
 *
 * 1.0.0,2022-02-21, La clase corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings ]
 *
 * @author [Diego Felipe Muñoz, dfmunoz@unimayor.edu.co]
 * 
 * @since [1.0.0]
 *
 */
public class Main {
   /**
     * [ [Esta clase tiene como objetivo prinicipal iniciar la ejecucuin del
     * programa en la cual se realizara el registro de una serie de numeros
     * a un vector estos registros los hara el usario por medio de la consola]
     * ]
     *
     * @param args
     * 
     *@author [Diego Felipe Muñoz, dfmunoz@unimayor.edu.co]
     *      
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Vector vector = new Vector();
        Numbers numeros;
        Integer number;
        boolean flag=true;
      
        while (flag) { 
           
            try {
                System.out.println("Ingresa un numero al vector");
                number=keyboard.nextInt();
                vector=Numbers.vector_creation(vector, number);
                
                 if (vector.size() > 1){
                    if (vector.lastElement().equals(
                        vector.elementAt(vector.size() - 2)))
                    {
                        System.out.println("Has ingresado 2 valores iguales"
                                + "Consecutivamente:\n");
                        
                        Numbers.show_vector_data(vector);
                        System.out.println(
                                "Vector: " + vector.toString());
                        flag = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Dato invalido");
            }
        }
    }
    
}
