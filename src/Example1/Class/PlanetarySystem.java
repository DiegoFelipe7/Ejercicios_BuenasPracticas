package Example1.Class;
/**
* [Esta es la clase abstracta la cual tiene un serie de atributos y metodos que
* posterior mente seran extendidos a otras clases "hijas",el objetivo principal
* de esta clase es ser un modelde sobre el cual se construyen otras clases
*
* ]
*
* @version [ "VS" 1.0.0,2022-02-15
*
* 1.0.0,2022-02-13, La clase corresponde a la versión 1.0.0 del sistema,
* la misma a hasta el momento no a recibido ningun refactorings ]
* @author [Diego felipe , diegofelipem99@gmailcom.]
* 
* @since [1.0.0]
*/
public abstract class PlanetarySystem {
    private double mass;
    private double density;
    private double diameter;
    private double distanceToTheSun;
    private int identifier;
    private String name;
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
    public PlanetarySystem(
            double mass, 
            double density,
            double diameter, 
            double distanceToTheSun, 
            int identifier,
            String name) 
    {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToTheSun = distanceToTheSun;
        this.identifier = identifier;
        this.name = name;
    }//Cierre del constructor
    
    public PlanetarySystem(){
        
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     /**
    * [el objetivo de este metodo abstracto es enviar un mensaje con la 
    * informacion de algun planeta ]
    *
    * @return Messague
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
    public abstract String Messague();
    
    
    
    
}
