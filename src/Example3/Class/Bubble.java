package Example3.Class;
/**
* [Esta es la clase burbuja no tiene ningun atributo o metodo ]
*
* @version [ "VS" 1.0.0,2022-02-15
*
* 1.0.0,2022-02-13, La clase corresponde a la versión 1.0.0 del sistema,
* la misma a hasta el momento no a recibido ningun refactorings ]
* @author [Diego felipe , diegofelipem99@gmailcom.]
* 
* @since [1.0.0]
*/
public class Bubble {
    
    /**
    * [El objetivo principal de este metodo es realizar un ordenamiento
    * de menor a mayor este metodo es conocido como metodo burbuja]
    *
    * @param arreglo
    * @return arregloOrdenado de tipo int
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
     public static int[] Burbuja(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 0; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-i-1;j++)
        {
            
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
      
          }  
          
            System.out.print("["+arreglo[j]+"]");
        }
          System.out.println("");
        
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }
}
