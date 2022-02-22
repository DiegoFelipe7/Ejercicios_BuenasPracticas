package Example4.Class;
import java.time.LocalDate;
/**
 * [ Esta clase vehiculos la cual tiene una serie de metodos y atributos que
  posterior mente seran extendidos a otras clases "hijas",el objetivo principal
* de esta clase es ser un molde sobre el cual se construyen otras clases]
 *
 * @version ["VS" 1.0.0,2022-02-14
 *
 * 1.0.0,2022-02-14, La clase corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings ]
 *
 * @author [Diego felipe , diegofelipem99@gmailcom.]
 * 
 * @since [1.0.0]
 *
 */
public class Vehicle {
    private String mark;
    private int model;
    private int capacity;
    private int occupied_positions;
    private int available_positions;
    private int number_of_wheels;
    private LocalDate enrollment_date;
    private String means_of_transportation;
    
    /**
     * Constructor con los atributos de la clase
     * @param mark hace referencia a la marca de un vehiculo
     * @param model hace referencia al modelo del vehiculo;
     * @param capacity hace referencia a la capacidad del vehiculo
     * @param occupied_positions hace refencia a la ocupacion del vehiculo
     * @param available_positions referencia a los puestos disponibles del 
     * vehiculo
     * @param number_of_wheels hace referencia al numero de ruedas del vehiculo.
     * @param enrollment_date referencia a la fecha la matricula.
     * */
    public Vehicle
        (
            String mark,
            int model,
            int capacity,
            int occupied_positions,
            int available_positions,
            int number_of_wheels, 
            LocalDate enrollment_date,
            String means_of_transportation
        ) {
        this.mark = mark;
        this.model = model;
        this.capacity = capacity;
        this.occupied_positions = occupied_positions;
        if(occupied_positions>=capacity){//condicion para valida la ocupacion
            throw new IllegalArgumentException("La ocupacion exedio la "
                    + "capacidad del vehiculo");
        }
        this.available_positions = available_positions;
        this.number_of_wheels = number_of_wheels;
        if(number_of_wheels>18){//condicion para valida el numero de llantas
            throw new IllegalArgumentException("No existe vehiculos con "
                    + "este numero de llantas");
        }
        this.enrollment_date = enrollment_date;
        this.means_of_transportation = means_of_transportation;
    }//fin constructos
        
    public Vehicle(){
        
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getOccupied_positions() {
        return occupied_positions;
    }

    public void setOccupied_positions(int occupied_positions) {
        this.occupied_positions = occupied_positions;
    }

    public int getAvailable_positions() {
        return available_positions;
    }

    public void setAvailable_positions(int available_positions) {
        this.available_positions = available_positions;
    }

    public int getNumber_of_wheels() {
        return number_of_wheels;
    }

    public void setNumber_of_wheels(int number_of_wheels) {
        this.number_of_wheels = number_of_wheels;
    }

    public LocalDate getEnrollment_date() {
        return enrollment_date;
    }

    public void setEnrollment_date(LocalDate enrollment_date) {
        this.enrollment_date = enrollment_date;
    }

    public String getMeans_of_transportation() {
        return means_of_transportation;
    }

    public void setMeans_of_transportation(String means_of_transportation) {
        this.means_of_transportation = means_of_transportation;
    }
     /**
    * [el objetivo de este metodo  es enviar un mensaje con la 
    * informacion de algun vehiculo ]
    *
    * @return String
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/

    @Override
    public String toString() {
        return "{"+ "Marca=" + mark + 
                ", Modelo=" + model +
                ", Capacidad=" +capacity +
                ", Ocupacion =" + occupied_positions +
                ", Puestos disponibles=" + available_positions + 
                ", N° Ruedas=" + number_of_wheels +
                ", Matricula=" + enrollment_date + 
                ", Medio de trasporte=" + means_of_transportation;
    }

     /**
    * [el objetivo de este metodo res realizar un calculo para determinar
    * el numero de puestos disponibles en el vehiculo]
    *
    * @param capacity capacidad el vehiculo
    * @param occupied_positions ocupacion del  el vehiculo
    * @return Int con todas las puestos dispobles del vehiculo
    * @throws Exception
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
    public static int available_capacity(int capacity , int occupied_positions){
        return capacity-occupied_positions;
    }
    
        
    
    
}
