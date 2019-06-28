
package ejerecicioJavaEmpresa;

import java.util.ArrayList;

public class Sucursal implements Interfaz {
    
    ArrayList<Persona> personas = new ArrayList();
    
    

    @Override
    public void crearEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() {
        
        Administrativo admin1 = new Administrativo();
        Desarrollador desa1 =  new Desarrollador();
        Consultor consu1 = new Consultor();
        
        personas.add(desa1);
        personas.add(admin1);
        personas.add(consu1);
    }

    @Override
    public void calcularPagoTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularPagoPorCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
    
    
}
