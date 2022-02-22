package Example3.Class;
/**
* [Esta es la clase quicksort no tiene ningun atributo o metodo ]
*
* @version [ "VS" 1.0.0,2022-02-15
*
* 1.0.0,2022-02-13, La clase corresponde a la versión 1.0.0 del sistema,
* la misma a hasta el momento no a recibido ningun refactorings ]
* @author [Diego felipe , diegofelipem99@gmailcom.]
* 
* @since [1.0.0]
*/
public class Quicksort {
    
    
   public int[] quicksort1(int numeros[]){
   return quicksort2(numeros,0,numeros.length-1); 
  }
       /**
    * [El objetivo principal de este metodo es imprimir el arreglo ordenado de
    * menor a mayor para esto utilizamos pivotes en este caso izq y der
    * mientras no se crucen las búsquedas busca elemento mayor y  busca 
    * elemento menor que pivote y empieza a ordenar ]
    *
    * @param numeros numero
    * @param izq numero
    * @param der numero
    * @return numeros arreglo de tipo int
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
  public int[] quicksort2(int numeros[],int izq, int der){
   if(izq>=der)
    return numeros;
     int i=izq, d=der;
   if(izq!=der){
        int pivote;
        int aux;
        pivote = izq;
        while(izq!=der){
            imprimir_arreglo(numeros);
            System.out.println("");
            while(numeros[der]>=numeros[pivote] && izq<der)
             der--;
            while(numeros[izq]<numeros[pivote] && izq<der)
             izq++;
            if(der!=izq){
             aux = numeros[der];
             numeros[der]=numeros[izq];
             numeros[izq]=aux;
            }
        }
         
       if(izq==der){
        quicksort2(numeros,i,izq-1);
        quicksort2(numeros,izq+1,d);
       }
   }
   else
    return numeros;
    return numeros; 
  }
     /**
    * [El objetivo principal de este metodo es imprimir el arreglo ordenado]
    *
    * @param arreglo
    * @return arregloOrdenado de tipo int
    *
    * @author [Diego felipe , diegofelipem99@gmailcom.]
    *      
    * @since [1.0.0]*/
  public void imprimir_arreglo(int arreglo[]){
      System.out.println("");
      for (int i = 0; i <arreglo.length; i++) {
          if (i!=arreglo.length) 
             System.out.print("["+arreglo[i]+"]");        
      }
      
  }
}
