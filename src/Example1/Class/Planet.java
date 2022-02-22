package Example1.Class;
/**
 * [ Esta clase implementa de la clase abstracta Su objetivo es la creación 
 * de las planetas, la lista de estas y sus métodos.]
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
public class Planet extends PlanetarySystem{
    //varible statica con la costante gravitacional
    private static final double gravitationalConstant =6.672E-11;
     /**
     * Constructor con los atributos de la clase
     * @param mass hace referencia a la masa de un planeta.
     * @param density hace referencia a la densidad de un planeta
     * @param diameter hace referencia a la dimension del planeta.
     * @param distanceToTheSun hace refencia a la distancia que hay 
     * desde el planeta hasta el sol
     * @param identifier referencia al identificador unico de cada planeta.
     * @param name hace referencia al nombre del planeta.
     */
    public Planet(
            double mass, 
            double density,
            double diameter, 
            double distanceToTheSun, 
            int identifier,
            String name) 
    {
        super(mass, density, diameter, distanceToTheSun, identifier, name);
    }//fin del constructor

    public Planet() {
    }

    public static double getGravitationalConstant() {
        return gravitationalConstant;
    }
    /**
    * [El objetivo principal de este metodo es evaluar la distancia
    * gravitacional entre 2 cuerpos cualesquiera
    * ]
    *
    * @param planet1 , planet2
    * @return Mensaje
    * @throws ArithmeticException
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
    public static void gravitationalAttraction(
        Planet planet1, 
        Planet planet2) 
    {
        try{
            double gravitationalAttraction;
            double distance;
            distance = planet1.getDistanceToTheSun()-planet2.getDistanceToTheSun();

            if (planet1.getDistanceToTheSun() == planet2.getDistanceToTheSun()) 
            {
                throw new ArithmeticException();
            } else{
                gravitationalAttraction = (getGravitationalConstant() * 
                    (planet1.getMass() * planet2.getMass())) 
                    / (Math.pow(distance * 1000,2));
                System.out.println("La atracción gravitacional entre: "
                        + planet1.getName() + 
                        " y " + planet2.getName() + " es: " + 
                        gravitationalAttraction + "\n");
            }   
        } catch (ArithmeticException exc)
        {
                    System.out.println("Por favor seleccione dos objetos "
                            + "planetarios distintos.\n Al ser "
                            + "objetos iguales, su distancia es cero y la "
                            + "división por cero no está definida.");
        }

    }
      /**
    * [El objetivo principal de este metodo es retornar un objeto planetario
    * con toda la informacion
    * ]
    *
    * @return String
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/

    @Override
    public String Messague() {
        return "Objeto planetario " + getIdentifier() + "\n Nombre: " + getName()
                + "\n masa en Kg: " + getMass() + "\n Densidad en gr/cm^3: " + 
                getDensity() + "\n Diametro en Km: " + getDiameter() + 
                "\n Distancia al sol en Km: " + getDistanceToTheSun() + "\n";
    }

 
    
    
    
}
