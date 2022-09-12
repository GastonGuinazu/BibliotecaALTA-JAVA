
package DTO;


public class reporteTresDTO {
    
    private int codigo;
    private String nombreLibro;
    private String nombre;

    public reporteTresDTO(int codigo, String nombreLibro, String nombre) {
        this.codigo = codigo;
        this.nombreLibro = nombreLibro;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  codigo + ", " + nombreLibro + ", " + nombre;
    }
    
    
}
