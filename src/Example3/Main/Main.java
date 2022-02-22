package Example3.Main;
import Example3.Class.Bubble;
import Example3.Class.Quicksort;
import java.util.Scanner;
/**
 * [ Esta clase tiene como objetivo iniciar la aplicación en la cual se 
 * podrá realizar la visualización y ordenamiento
 * de arreglos por los metodos burbuja y quickstor
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
     * programa en el que se podrá realizar la visualización y ordenamiento
     * de arreglos por los metodos burbuja y quickstor
     * ]
     *
     * @param args
     *
     * @author [Diego Felipe Muñoz, dfmunoz@unimayor.edu.co]
     *      
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        boolean flag=true;
        int value=0,size=0,i=0,j=0 ,aux;
        String input;
        while(flag) {                 
             
            System.out.println("1.Ordernar por metodo burbuja \n"
            + "2.Ordenar metodo por quick sort \n"+"3.Salir");
            input = keyboard.nextLine();
            value = consoleInputVerificationNumber(input);
            
                switch(value){
               
                    case 1:
                        System.out.println("Ingrese el tamaño del arreglo");
                        input = keyboard.nextLine();
                        size = consoleInputVerificationNumber(input); 
                        int bubble[] = new int [size];
                        for ( i = 0; i < bubble.length; i++) {
                            bubble[i]=(int)(Math.random()*100);
                        }
                        for ( j = 0; j < bubble.length; j++) {
                             System.out.print("["+bubble[j]+"]");
                        }  
                        System.out.println("");

                         int arregloOrdenado[] = Bubble.Burbuja(bubble);
                         for(i = 0; i < arregloOrdenado.length;i++){
                            System.out.print("["+arregloOrdenado[i]+"]");
                         } 
                         System.out.println("");
                         
                    break;
                    case 2:
                        System.out.println("Ingrese el tamaño del arreglo");
                        input = keyboard.nextLine();
                        size = consoleInputVerificationNumber(input);     
                        int Quicksort[] = new int [size];
                        for ( i = 0; i < Quicksort.length; i++) {
                            Quicksort[i]=(int)(Math.random()*100);
                        }
                        for ( j = 0; j < Quicksort.length; j++) {
                             System.out.print("["+Quicksort[j]+"]");
                        }  
                        Quicksort ordena = new Quicksort();
                        ordena.quicksort1(Quicksort);
                        ordena.imprimir_arreglo(Quicksort);
                        System.out.println("");
                     break;
                    case 3:
                        flag=false;
                     break;
                    default:
                        System.out.println("Esta opcion no existe");
                    break;
                }
            
        } 
    }
    


 /**
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