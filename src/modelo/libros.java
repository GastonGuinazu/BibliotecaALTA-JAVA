
package modelo;


public class libros {
    
    private int codigo;
    private String descripcion;
    private String tipoPrestamo;
    private autor _autor;

    public libros(int codigo, String descripcion, String tipoPrestamo, autor _autor) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipoPrestamo = tipoPrestamo;
        this._autor = _autor;
    }

    public libros(String descripcion, String tipoPrestamo, autor _autor) {
        this.descripcion = descripcion;
        this.tipoPrestamo = tipoPrestamo;
        this._autor = _autor;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoPrestamo() {
        return tipoPrestamo;
    }

    public void setTipoPrestamo(String tipoPrestamo) {
        this.tipoPrestamo = tipoPrestamo;
    }

    public autor getAutor() {
        return _autor;
    }

    public void setAutor(autor _autor) {
        this._autor = _autor;
    }

    @Override
    public String toString() {
        return  codigo + ", " + descripcion + ", " + tipoPrestamo + ", _" + _autor;
    }
    
    

    
    
    
    
}
