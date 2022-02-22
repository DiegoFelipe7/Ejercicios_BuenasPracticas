package Example4.Class;
import java.time.LocalDate;
/**
 * [ Esta clase extiende "hereda" de la clase vehiculo una serie de atributos 
 * y metodos]
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
public class Motorcycle extends Vehicle{
    private int motor_power;
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
     * @param means_of_transportation hace referencia al medio por el que se 
     * mueve el vehiculo
     * @param motor_power hace referencia al cilidraje del motor del vehiculo
     */
    public Motorcycle(
            String mark, 
            int model, 
            int capacity, 
            int occupied_positions, 
            int available_positions,
            int number_of_wheels,
            LocalDate enrollment_date, 
            String means_of_transportation,
            int motor_power) {
        super(  mark,
                model,
                capacity,
                occupied_positions,
                available_positions, 
                number_of_wheels, 
                enrollment_date,
                means_of_transportation);
        
        this.motor_power=motor_power;
    }//fin constructor

    public Motorcycle() {
    }


    public int getMotor_power() {
        return motor_power;
    }

    public void setMotor_power(int motor_power) {
        this.motor_power = motor_power;
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
        return "Motorcycle{"+ super.toString()+"motor_power=" + motor_power + '}';
    }
    
    
}
