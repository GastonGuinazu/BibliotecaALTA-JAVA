
package bibliotecalab4;

import controlador.controladorLibros;
import vista.JFMenu;


public class BibliotecaLab4 {

    
    public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            
        Class.forName("com.mysql.jdbc.Driver");   
        new JFMenu(new controladorLibros()).setVisible(true);
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
