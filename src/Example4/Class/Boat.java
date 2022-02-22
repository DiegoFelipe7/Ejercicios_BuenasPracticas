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
public class Boat extends Vehicle{
    private int anchors;
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
     * @param anchors hace referencia al numero de anclas del vehiculo
     */
    public Boat(
            String mark,
            int model,
            int capacity,
            int occupied_positions, 
            int available_positions, 
            int number_of_wheels,
            LocalDate enrollment_date, 
            String means_of_transportation,
            int anchors) {
        super(mark,
              model, 
              capacity,
              occupied_positions,
              available_positions,
              number_of_wheels,
              enrollment_date,
              means_of_transportation);
        this.anchors=anchors;
    }

    public Boat() {
    }

    public int getAnchors() {
        return anchors;
    }

    public void setAnchors(int anchors) {
        this.anchors = anchors;
    }

    @Override
    public String toString() {
        return "Boat{"+super.toString() +" , " + "N° anclas=" + anchors + '}';
    }
    
            
}
