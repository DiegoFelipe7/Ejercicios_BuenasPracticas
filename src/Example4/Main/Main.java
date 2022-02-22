package Example4.Main;

import Example4.Class.Boat;
import Example4.Class.Motorcycle;
import Example4.Class.Truck;
import Example4.Class.Vehicle;
import Example4.Class.Vehicle;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * [ Esta clase tiene como objetivo iniciar la aplicación en la cual se 
 * podrá realizar la creacion y listado de los vehiculos]
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Vehicle>Vehic = new ArrayList<>();
        Vehicle Vehicles = null;
        int value,modelo,capacidad,posicione_ocupadas,anclas,
        posiciones_disponibles,numero_ruedas,cilindraje,carga ;
        String marca,date,medio_trasporte,input;
        boolean flang=true;
        while (flang) {
            System.out.println("1.Crear de Vehiculos \n"
                    + "2.Listar Vehiculos \n"
                    + "3.Salir");

            input = keyboard.nextLine();
            value = consoleInputVerificationNumber(input);
            switch(value){
                case 1:
                    for (int i = 1; i <=1; i++) {      
                    try {
                        System.out.println("---Creacion del carro N° "+i+"---");
                        System.out.println("Ingrese la marca del vehiculo");
                        marca=keyboard.next();
                        System.out.println("Ingrese el modelo");
                        modelo=keyboard.nextInt();
                        System.out.println("Ingrese la capacidad"
                                + " de pasajeros del vehiculo");
                        capacidad=keyboard.nextInt();
                        System.out.println("Ingrese el numero de"
                                + " pasajeros vehiculo");
                        posicione_ocupadas=keyboard.nextInt();
                        posiciones_disponibles=Vehicle.available_capacity
                        (capacidad,posicione_ocupadas);
                        System.out.println("Ingrese los numero de ruedas");
                        numero_ruedas = keyboard.nextInt();
                        System.out.println("Ingrese, por favor, la fecha de "
                                   + "matricula del vehiculo que desea agregar,"
                                   + " la estructura debe ser: yyyy-mm-dd.");
                        date=keyboard.next();
                        LocalDate dateConvert=consoleInputVerificationDate(date);
                        System.out.println("Ingrese el medio por el que se"
                                + " mueve el vehiculo");
                        medio_trasporte=keyboard.next();
                        if(numero_ruedas<=0){
                            System.out.println("Ingresa el numero de anclas");
                            anclas=keyboard.nextInt();
                            Vehicle barco = new Boat(marca,
                                    modelo,
                                    capacidad,
                                    posicione_ocupadas,
                                    posiciones_disponibles,
                                    numero_ruedas,
                                    dateConvert, 
                                    medio_trasporte,
                                    anclas);
                            Vehic.add(barco);
                        }
                        else if(numero_ruedas==2){
                            System.out.println("Cilindraje del motor");
                            cilindraje=keyboard.nextInt();
                            Vehicle moto = new Motorcycle(
                                    marca,
                                    modelo, 
                                    capacidad,
                                    posicione_ocupadas,
                                    posiciones_disponibles,
                                    numero_ruedas,
                                    dateConvert,       
                                    medio_trasporte,
                                    cilindraje);
                            Vehic.add(moto);
                        }else if(numero_ruedas>=3  || numero_ruedas<=18){
                            System.out.println("Capacidad de carga en");
                            carga=keyboard.nextInt(); 
                            Vehicle camion = new Truck(
                                  marca, 
                                  modelo, 
                                  capacidad,
                                  posicione_ocupadas,
                                  posiciones_disponibles,
                                  numero_ruedas,
                                  dateConvert,
                                  medio_trasporte,
                                  capacidad);
                            Vehic.add(camion);
                        }
                       
                    } catch (Exception e) {
                       System.out.println("Ingresa valores validos"+e);
                    }
                    
                    }
                break;
                case 2:
                     System.out.println("----------Listado Vehiculos--------");
                     if(!Vehic.isEmpty()){
                     
                        for (Vehicle vehicle : Vehic) {
                            System.out.println( vehicle.toString());
                        }
                      }else{
                         System.out.println("No existen vehiculos");
                     }
                     System.out.println("-----------------------------------");
                    break;
                case 3:
                    System.out.println("Hasta Pronto ");
                    flang=false;
                   
                break;
                default:
                    System.out.println("Esta opcion no existe");
                    break;
           }
        
        }
    }
     /**
     * [El objetivo principal de este método es evaluar si el argumento puede
     * ser convertido a tipo localdate, el método se utilizará para validar los
     * datos pasados por el usuario en los casos en los que se requiera que 
     * sean una fecha en el formato yyyy-mm-dd.
     * ]
     *
     *
     * @author [Diego Felipe Muñoz , diegofelipem99@gmail.com]
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar si es una fecha en el formato yyyy-mm-dd.
     * @return el método retorna el parametro dado convertido a tipo localdate
     * si es posible, de no ser posible retorna nada (null).
     *      
     * @since [1.0.0]
     */
    public static LocalDate consoleInputVerificationDate(String input){
        try{
            LocalDate choice = LocalDate.parse(input);
            return choice;
        }
        catch (Exception e){
            return null;
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
