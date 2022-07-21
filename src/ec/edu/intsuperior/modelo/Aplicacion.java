
package ec.edu.intsuperior.modelo;

import java.util.Scanner;




public class Aplicacion {
    
    
    public static void main(String args[]) {
     
     Scanner leer = new Scanner(System.in);
      
      
     
     
      Empleado E = new Empleado();
      
        E.idP = 1;        
      
      Cliente C = new Cliente();
       
        E.idP = 2;
                
      Directivo D = new Directivo ();
        
      E.idP = 3;
      
      Cliente_empleados CE = new Cliente_empleados();
      
      CE.idCE = 3;
      CE.idEP = 6;
      CE.idC = 1;
      CE.mostrar();
      
      Empresa  EP = new Empresa();
      
       EP.idEP = 6;     
       
       
       Empleado_Directivo ED = new Empleado_Directivo();
       
       ED.idED = 7;
       ED.idE = 1;
       ED.idD = 3;
      
       ED.mostrar();
    }
    
}
