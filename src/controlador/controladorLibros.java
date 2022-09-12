
package controlador;

import DTO.reporteDosDTO;
import DTO.reporteTresDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.autor;
import modelo.libros;


public class controladorLibros {
    
    private String conexion;
    
    public controladorLibros(){
        this.conexion = "jdbc:mysql://localhost:3306/libros?user=root&password=gasti123";
    }
    
    public List<autor> obtenerCorredores() {

        List<autor> lst = new ArrayList<>();
        String query = "SELECT * FROM autores";
        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {

                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String nacionalidad = rs.getString("nacionalidad");
                

                lst.add(new autor(id, nombre,nacionalidad));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public boolean registrarLibro(libros libro) {
        boolean ok = true;

        try (Connection cnn = DriverManager.getConnection(conexion);
                PreparedStatement ps = cnn.prepareStatement("INSERT INTO libros (descripcion, tipoPrestamo, idAutor) VALUES(?, ?, ?)");) {

            ps.setString(1, libro.getDescripcion());
            ps.setString(2, libro.getTipoPrestamo());
            ps.setInt(3, libro.getAutor().getId());
          
            ok = ps.execute();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            ok = false;
        }

        return ok;
    }
    
    
    public List<libros> obtenerLibros() {

        List<libros> lst = new ArrayList<>();
        
        String query = "SELECT l.codigo, l.descripcion, l.tipoPrestamo, a.nombre, a.nacionalidad, a.id " +
"FROM autores a JOIN libros l ON (a.id = l.idAutor) "
                + "ORDER BY l.codigo";

        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {

                int id = rs.getInt("codigo");            
                String descripcion = rs.getString("descripcion");
                String tipoPrestamo = rs.getString("tipoPrestamo");
                
                String nombre = rs.getString("nombre");
                String nacionalidad = rs.getString("nacionalidad");
                int idAutor = rs.getInt("id");                
                autor au = new autor (idAutor,nombre, nacionalidad);            
                
                lst.add (new libros (id,descripcion,tipoPrestamo,au));
                
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public List<reporteDosDTO> obtenerReporteDos() {

        List<reporteDosDTO> lst = new ArrayList<>();
        
        String query = "SELECT l.descripcion, a.nombre, a.nacionalidad " +
"FROM libros l JOIN autores a ON (l.idAutor = a.id)";

        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {

                            
                String descripcion = rs.getString("descripcion");
                String nombre = rs.getString("nombre");
                String nacionalidad = rs.getString("nacionalidad");              
                
  
                lst.add (new reporteDosDTO (descripcion,nombre,nacionalidad));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public List<reporteTresDTO> obtenerReporteTres() {

        List<reporteTresDTO> lst = new ArrayList<>();
        
        String query = "SELECT l.codigo,l.descripcion, a.nombre " +
"FROM libros l JOIN autores a ON (l.idAutor = a.id) " +
"WHERE a.nacionalidad LIKE 'Argentina'";

        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {

                            
                int id = rs.getInt("codigo");
                String descripcion = rs.getString("descripcion");
                String nombre = rs.getString("nombre");              
                
  
                lst.add (new reporteTresDTO (id,descripcion,nombre));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
    public List<reporteDosDTO> obtenerReporteCuatro(int string) {

        List<reporteDosDTO> lst = new ArrayList<>();
        
        String query = "SELECT l.descripcion, a.nombre, a.nacionalidad " +
"FROM libros l JOIN autores a ON (l.idAutor = a.id) " +
"WHERE a.id LIKE " + string;

        try (Connection cnn = DriverManager.getConnection(conexion);
                Statement st = cnn.createStatement();
                ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {

                            
                String descripcion = rs.getString("descripcion");
                String nombre = rs.getString("nombre");
                String nacionalidad = rs.getString("nacionalidad");              
                
  
                lst.add (new reporteDosDTO (descripcion,nombre,nacionalidad));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lst;
    }
    
}
