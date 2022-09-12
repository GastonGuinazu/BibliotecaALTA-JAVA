
package DTO;


public class reporteDosDTO {
    
    private String descripcion;
    private String nombre;
    private String nacionalidad;

    public reporteDosDTO(String descripcion, String nombre, String nacionalidad) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return  descripcion + ", " + nombre + ", " + nacionalidad;
    }
    
    
}
