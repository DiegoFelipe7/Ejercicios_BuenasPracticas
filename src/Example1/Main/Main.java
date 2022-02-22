package Example1.Main;
import Example1.Class.Planet;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * [ Esta clase tiene como objetivo iniciar la aplicación en la cual se 
 * podrá realizar la visualización, de planetas]
 *
 * @version ["VS" 1.0.0,2022-02-18
 *
 * 1.0.0,2022-02-18, La clase corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings ]
 *
 * @author [Diego Felipe Muñoz, dfmunnoz@unimayor.edu.co]
 * 
 * @since [1.0.0]
 *
 */
public class Main {

    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar la visualización,de los planetas
     * tambien podra calcular la atracion gravitacional de 2 planetas
     * ]
     *
     * @param args
     *
     * @author [Diego Felipe Muñoz, dfmunoz@unimayor.edu.co]
     *      
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean flang=true;
        int value=0 , planet1,planet2;
        String input="";
        ArrayList<Planet> planets = new ArrayList<>();
       planets.add(new Planet(
        3.302E23, 5.430, 4879.4, 58E6, 0, "Mercurio"));
       planets.add(new Planet(
       4.869E24, 5.240, 12103.6, 108E6, 1, "Venus"));
       planets.add(new Planet(
        5.974E24, 5.515, 12742.0, 150E6, 2, "Planeta tierra"));
       planets.add(new Planet(
       6.418E23, 3.933, 6794.4, 250E6, 3, "Marte"));
       planets.add(new Planet(
        1.899E27, 1.336, 142984.0, 750E6, 4, "Jupiter"));
       planets.add(new Planet(
        5.688E26, 0.690, 120536.0, 1418E6, 5, "Saturno"));
       planets.add(new Planet(
        8.686E25, 1.274, 51118.0, 3000E6, 6, "Urano"));
       planets.add(new Planet(
        1.024E26, 1.640, 49572.0, 4500E6, 7, "Neptuno"));
       planets.add(new Planet(
       1.9891E30, 1.411, 1.39E6, 0, 8, "El sol"));   

        while (flang) {    
            System.out.println("1.Sistemas planetarios disponibles \n"+
                    "2.Calcular la atraccion gravitaccionl de 2 planetas \n"+
                    "3.salir");
                 input = keyboard.nextLine();
                 value = consoleInputVerificationNumber(input);
            
            switch(value){
                case 1: 
                    for (Planet planet : planets) {
                        System.out.println(planet.Messague());
                    }
                    break;
                case 2:
                    System.out.println("Ingresa el id del primer planta");
                     input = keyboard.nextLine();
                     planet1 = consoleInputVerificationNumber(input);
   
                    System.out.println("Ingresa el id del segundo planta");
                     input = keyboard.nextLine();
                     planet2 = consoleInputVerificationNumber(input);
                     try{
                        Planet.gravitationalAttraction(planets.get(planet1),
                            planets.get(planet2));                        
                    } 
                    catch (Throwable e){
                        System.out.println("Ingrese solo numeros entre " + 
                                planets.get(0).getIdentifier() 
                                + " y " + planets.get(8)
                                        .getIdentifier() + " por favor. \n");                     
                    }  
                                   
                    break;
                case 3:
                    System.out.println("Hasta pronto XD");
                    flang=false;
                default:
                    System.out.println("Esta opcion no existe");
                    break;
             
           }
      
        }
        
       
     }
    
    /*
    *
     * [El objetivo principal de este método es evaluar si el argumento puede
     * ser convertido a tipo entero, el método se utilizará para validar los
     * datos pasados por el usuario en los casos en los que se requiera que 
     * sean numeros enteros.
     * ]
     *
     *
     * @author [Diego Felipem Muñoz, dfmunoz@unimayot.edu.co]
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar si es un numero entero.
     * @return el método retorna el parametro dado convertido a tipo entero si 
     * es posible, de no ser posible retorna el numero cero.
     *      
     * @since [1.0.0]
     */
    public static int consoleInputVerificationNumber(String input){
        try{
            int choice;
            choice = Integer.parseInt(input);
            return choice;
        }
        catch (Exception e){
            return 0;
        }
    }

      
}
    

