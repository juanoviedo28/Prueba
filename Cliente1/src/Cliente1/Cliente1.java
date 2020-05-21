
package Cliente1;


public class Cliente1 {
    
      private String Apellido,Nombre,NumeroDocumento,Codigo;
    
    
       public Cliente1(String Apellido, String Nombre, String NumeroDocumento, String Codigo) {
        super();
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.NumeroDocumento = NumeroDocumento;
        this.Codigo = Codigo;
    }
       
       public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
      
    
    
}
