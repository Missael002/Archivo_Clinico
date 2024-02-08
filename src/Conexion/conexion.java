package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import Interface.Ingresar;
import Interface.Visualizar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import informacion.paciente_tabla;
import java.util.ArrayList;


/**
 * @author Derek y Misael
 */
public class conexion {

    private Connection connect;
    private Statement st;
    private PreparedStatement pstmt;

    String database = "jdbc:sqlite:proyecto_hospital.db";
    public java.util.List<String> mostrar = new ArrayList<>();
    
    //public static List<Pacientes_tabla> pacientess = new ArrayList<Pacientes_tabla>();

    public conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection(database);
            if (connect != null) {
                System.out.println("Conexión exitosa v1.1!!!!");
            }
        } catch (SQLException ex) {
            System.out.println("Error en la conexion a la bd!!!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, "Error en la clase", ex);
        }
    }
    
    public void cerrarConexion() {
    try {
        if (pstmt != null) {
            pstmt.close();
            System.out.println("PreparedStatement cerrado");
        }
    } catch (SQLException ex) {
        System.out.println("Error al cerrar PreparedStatement");
        System.out.println(ex);
    }
    try {
        if (st != null) {
            st.close();
            System.out.println("Statement cerrado");
        }
    } catch (SQLException ex) {
        System.out.println("Error al cerrar Statement");
        System.out.println(ex);
    }
    try {
        if (connect != null) {
            connect.close();
            System.out.println("Conexión cerrada");
        }
    } catch (SQLException ex) {
        System.out.println("Error al cerrar la conexión");
        System.out.println(ex);
    }
}
/*
    public void cerrarConexion() {
        try {
            pstmt.close();
            st.close();
            connect.close();
            System.out.println("Conexión cerrada");
        } catch (SQLException ex) {
            System.out.println("Error al cerrar la conexión");
            System.out.println(ex);
        }
    }
*/
    //Funcion para extraer los pacientes
    public ArrayList<paciente_tabla> consultarPacientes() {

        ArrayList<paciente_tabla> lista = new ArrayList<paciente_tabla>();
        paciente_tabla paciente;

        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT expediente, curp, nombre, domicilio, estado FROM pacientes");
            while (rs.next()) {
                paciente = new paciente_tabla();
                paciente.setExpediente(rs.getString("expediente"));
                paciente.setCurp(rs.getString("curp"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setEstado(rs.getString("estado"));
                /*
                paciente.setFecha(rs.getString("fecha"));
                paciente.setFecha_nacimiento("fecha_nacimiento");
                paciente.setSexo("sexo");
                paciente.setClasificacion("calsificacion");
                paciente.setTelefono(("telefono"));
                paciente.setFamiliar("familiar");
                paciente.setLocalidad("localidad");
                paciente.setMunicipio("municipio");
                */
                lista.add(paciente);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar los pacientes para la tabla");
        }
        return lista;
    }
    
    //Funcion para extraer el id
    public ArrayList<paciente_tabla> consultarId() {
        
        ArrayList<paciente_tabla> lista = new ArrayList<paciente_tabla>();
        paciente_tabla paciente;

        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pacientes ORDER BY id_paciente DESC LIMIT 1;");
            while (rs.next()) {
                paciente = new paciente_tabla();
                paciente.setId_paciente(rs.getInt("id_paciente"));
                lista.add(paciente);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar los pacientes para la tabla");
        }
        return lista;
    }
    
    //Funcion para extraer los prestamos
    public ArrayList<paciente_tabla> consultarPrestamos() {

        ArrayList<paciente_tabla> lista = new ArrayList<paciente_tabla>();
        paciente_tabla paciente;

        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT expediente, curp, nombre, domicilio, estado, lugar FROM prestados");
            while (rs.next()) {
                paciente = new paciente_tabla();
                paciente.setExpediente(rs.getString("expediente"));
                paciente.setCurp(rs.getString("curp"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setEstado(rs.getString("estado"));
                paciente.setLugar(rs.getString("lugar"));
                
                /*
                paciente.setFecha(rs.getString("fecha"));
                paciente.setFecha_nacimiento("fecha_nacimiento");
                paciente.setSexo("sexo");
                paciente.setClasificacion("calsificacion");
                paciente.setTelefono(("telefono"));
                paciente.setFamiliar("familiar");
                paciente.setDomicilio("domicilio");
                paciente.setLocalidad("localidad");
                paciente.setMunicipio("municipio");
                */
                lista.add(paciente);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar los pacientes para la tabla");
        }
        return lista;
    }
    
    //Funcion para extraer los prestamos
    public ArrayList<paciente_tabla> consultarDefunciones() {

        ArrayList<paciente_tabla> lista = new ArrayList<paciente_tabla>();
        paciente_tabla paciente;

        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT expediente, curp, nombre, domicilio FROM defunciones");
            while (rs.next()) {
                paciente = new paciente_tabla();
                paciente.setExpediente(rs.getString("expediente"));
                paciente.setCurp(rs.getString("curp"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                lista.add(paciente);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar los pacientes para la tabla");
        }
        return lista;
    }
    
    //Funcion para ver datos del paciente
    public ArrayList<paciente_tabla> verPaciente(String expediente){
        ArrayList<paciente_tabla> listver = new ArrayList<paciente_tabla>();
        paciente_tabla ver;
        
        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pacientes where expediente = '"+expediente+"' ");
            
            while (rs.next()) {
                ver = new paciente_tabla();
                ver.setExpediente(rs.getString("expediente"));
                ver.setCurp(rs.getString("curp"));
                ver.setNombre(rs.getString("nombre"));
                ver.setFecha(rs.getString("fecha"));
                ver.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                ver.setSexo("sexo");
                //ver.setClasificacion(rs.getString("calsificacion"));
                ver.setTelefono(rs.getString("telefono"));
                ver.setFamiliar(rs.getString("familiar"));
                System.out.println(ver.getFamiliar());
                ver.setDomicilio(rs.getString("domicilio"));
                ver.setLocalidad(rs.getString("localidad"));
                ver.setMunicipio(rs.getString("municipio"));
                ver.setLugar(rs.getString("lugar")); 
                listver.add(ver);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar la informacion del paciente");
        }
        
        return listver;
    
    }
    
    //Funcion para ver datos del paciente
    public ArrayList<paciente_tabla> verPrestados(String expediente){
        ArrayList<paciente_tabla> listver = new ArrayList<paciente_tabla>();
        paciente_tabla ver;
        
        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pacientes where expediente = '"+expediente+"' ");
            
            while (rs.next()) {
                ver = new paciente_tabla();
                ver.setExpediente(rs.getString("expediente"));
                ver.setCurp(rs.getString("curp"));
                ver.setNombre(rs.getString("nombre"));
                ver.setFecha(rs.getString("fecha"));
                ver.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                ver.setSexo("sexo");
                //ver.setClasificacion(rs.getString("calsificacion"));
                ver.setTelefono(rs.getString("telefono"));
                ver.setFamiliar(rs.getString("familiar"));
                System.out.println(ver.getFamiliar());
                ver.setDomicilio(rs.getString("domicilio"));
                ver.setLocalidad(rs.getString("localidad"));
                ver.setMunicipio(rs.getString("municipio"));
                ver.setLugar(rs.getString("lugar")); 
                listver.add(ver);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar la informacion del paciente");
        }
        
        return listver;
    
    }    
    //Funcion para ver datos del paciente
    public ArrayList<paciente_tabla> verDefunciones(String expediente){
        ArrayList<paciente_tabla> listver = new ArrayList<paciente_tabla>();
        paciente_tabla ver;
        
        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM pacientes where expediente = '"+expediente+"' ");
            
            while (rs.next()) {
                ver = new paciente_tabla();
                ver.setExpediente(rs.getString("expediente"));
                ver.setCurp(rs.getString("curp"));
                ver.setNombre(rs.getString("nombre"));
                ver.setFecha(rs.getString("fecha"));
                ver.setFecha_nacimiento(rs.getString("fecha_nacimiento"));
                ver.setSexo("sexo");
                //ver.setClasificacion(rs.getString("calsificacion"));
                ver.setTelefono(rs.getString("telefono"));
                ver.setFamiliar(rs.getString("familiar"));
                System.out.println(ver.getFamiliar());
                ver.setDomicilio(rs.getString("domicilio"));
                ver.setLocalidad(rs.getString("localidad"));
                ver.setMunicipio(rs.getString("municipio"));
                ver.setLugar(rs.getString("lugar")); 
                listver.add(ver);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar la informacion del paciente");
        }
        
        return listver;
    
    }

    //Ingresar nuevo expediente
    public Long insertarPacientes(Ingresar s) {
        try {
            pstmt = connect.prepareStatement("INSERT INTO pacientes(curp, expediente, fecha, nombre, fecha_nacimiento, sexo, telefono, familiar, domicilio, localidad, municipio) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, s.curp());
            pstmt.setString(2, s.expediente());
            pstmt.setString(3, s.fecha());
            pstmt.setString(4, s.nombre());
            pstmt.setString(5, s.fecha_nac());
            pstmt.setString(6, s.sexo());
            pstmt.setString(7, s.telefono());
            pstmt.setString(8, s.familiar());
            pstmt.setString(9, s.domicilio());
            pstmt.setString(10, s.localidad());
            pstmt.setString(11, s.municipio());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente agregado con exito");
        } catch (SQLException ex) {
            System.out.println("Error al ingresar un paciente");
        }
        return null;
    }
    
    //Buscar paciente
    public ArrayList<paciente_tabla> buscarPacientes(String buscar) {

        ArrayList<paciente_tabla> lista = new ArrayList<paciente_tabla>();
        paciente_tabla paciente;

        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT expediente, curp, nombre, domicilio, estado FROM pacientes WHERE expediente LIKE '%"+buscar+"%' OR curp LIKE '%"+buscar+"%' ");
            while (rs.next()) {
                paciente = new paciente_tabla();
                paciente.setExpediente(rs.getString("expediente"));
                paciente.setCurp(rs.getString("curp"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setNombre(rs.getString("domicilio"));
                paciente.setNombre(rs.getString("estado"));
                /*
                paciente.setFecha(rs.getString("fecha"));
                paciente.setFecha_nacimiento("fecha_nacimiento");
                paciente.setSexo("sexo");
                paciente.setClasificacion("calsificacion");
                paciente.setTelefono(("telefono"));
                paciente.setFamiliar("familiar");
                paciente.setDomicilio("domicilio");
                paciente.setLocalidad("localidad");
                paciente.setMunicipio("municipio");
                */
                lista.add(paciente);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar los pacientes para la tabla");
        }
        return lista;
    }
    
    public ArrayList<paciente_tabla> buscarPrestados(String buscar) {

        ArrayList<paciente_tabla> lista = new ArrayList<paciente_tabla>();
        paciente_tabla paciente;

        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT expediente, curp, nombre, domicilio, estado FROM prestados WHERE expediente LIKE '%"+buscar+"%' OR curp LIKE '%"+buscar+"%' ");
            while (rs.next()) {
                paciente = new paciente_tabla();
                paciente.setExpediente(rs.getString("expediente"));
                paciente.setCurp(rs.getString("curp"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setNombre(rs.getString("domicilio"));
                paciente.setNombre(rs.getString("estado"));
                /*
                paciente.setFecha(rs.getString("fecha"));
                paciente.setFecha_nacimiento("fecha_nacimiento");
                paciente.setSexo("sexo");
                paciente.setClasificacion("calsificacion");
                paciente.setTelefono(("telefono"));
                paciente.setFamiliar("familiar");
                paciente.setDomicilio("domicilio");
                paciente.setLocalidad("localidad");
                paciente.setMunicipio("municipio");
                */
                lista.add(paciente);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar los pacientes para la tabla");
        }
        return lista;
    }
    
    public ArrayList<paciente_tabla> buscarDefunciones(String buscar) {

        ArrayList<paciente_tabla> lista = new ArrayList<paciente_tabla>();
        paciente_tabla paciente;

        try {
            st = (Statement) connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT expediente, curp, nombre, domicilio, estado FROM defunciones WHERE expediente LIKE '%"+buscar+"%' OR curp LIKE '%"+buscar+"%' ");
            while (rs.next()) {
                paciente = new paciente_tabla();
                paciente.setExpediente(rs.getString("expediente"));
                paciente.setCurp(rs.getString("curp"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setNombre(rs.getString("domicilio"));
                paciente.setNombre(rs.getString("estado"));
                /*
                paciente.setFecha(rs.getString("fecha"));
                paciente.setFecha_nacimiento("fecha_nacimiento");
                paciente.setSexo("sexo");
                paciente.setClasificacion("calsificacion");
                paciente.setTelefono(("telefono"));
                paciente.setFamiliar("familiar");
                paciente.setDomicilio("domicilio");
                paciente.setLocalidad("localidad");
                paciente.setMunicipio("municipio");
                */
                lista.add(paciente);
            }
            rs.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error al consultar los pacientes para la tabla");
        }
        return lista;
    }
    
    
    //Actualizar datos del paciente
    public Long updatePaciente(String update, Visualizar s) {
        try {
            pstmt = connect.prepareStatement("UPDATE pacientes set fecha=?, nombre=?, fecha_nacimiento=?, sexo=?, telefono=?, familiar=?, domicilio=?, localidad=?, municipio=?, lugar=? WHERE expediente = '"+update+"'");
            //pstmt.setString(1, s.curp());
            //pstmt.setString(2, s.expediente());
            pstmt.setString(1, s.fecha());
            pstmt.setString(2, s.nombre());
            pstmt.setString(3, s.fecha_nac());
            pstmt.setString(4, s.sexo());
            pstmt.setString(5, s.telefono());
            pstmt.setString(6, s.familiar());
            pstmt.setString(7, s.domicilio());
            pstmt.setString(8, s.localidad());
            pstmt.setString(9, s.municipio());
            pstmt.setString(10, s.lugarPrestamo());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente actualizado con exito");
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Error al actualizar un paciente");
        }
        return null;
    }
    
    //Actualizar datos del paciente
    public Long updateToPrestado(String update, String lugar) {
        try {
            pstmt = connect.prepareStatement("UPDATE pacientes set estado=?, lugar=? WHERE expediente = '"+update+"'");
            pstmt.setString(1,"PRESTADO");
            pstmt.setString(2,lugar);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Error al actualizar un paciente");
        }
        return null;
    }
    
    //Actualizar datos del paciente
    public Long updateToDefuncion(String update) {
        try {
            pstmt = connect.prepareStatement("UPDATE pacientes set estado=? WHERE expediente = '"+update+"'");
            pstmt.setString(1,"DEFUNCION");
            //pstmt.setString(2,lugar);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Error al actualizar un paciente");
        }
        return null;
    }
    
    public Long updateToDisponible(String update) {
        try {
            pstmt = connect.prepareStatement("UPDATE pacientes set estado=?, lugar=? WHERE expediente = '"+update+"'");
            pstmt.setString(1,"DISPONIBLE");
            pstmt.setString(2,"");
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Error al actualizar un paciente");
        }
        return null;
    }
    
    
    //Pasar registros a la tabla de Prestamos
     public Long insertarRegistroPrestado(String expediente) {
        try {
            pstmt = connect.prepareStatement("INSERT INTO prestados (curp, expediente, fecha, nombre, fecha_nacimiento, sexo, telefono, familiar, domicilio, localidad, municipio, lugar)\n" +
                                             "SELECT curp, expediente, fecha, nombre, fecha_nacimiento, sexo, telefono, familiar, domicilio, localidad, municipio, lugar FROM pacientes WHERE expediente = '"+expediente+"';");
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(pstmt);
            System.out.println(ex);
            System.out.println("Error al ingresar un paciente");
        }
        return null;
    }
    
    //Pasar registros a la tabla de Defunciones
    public Long insertarRegistroDefunciones(String expediente) {
        try {
            pstmt = connect.prepareStatement("INSERT INTO defunciones (curp, expediente, fecha, nombre, fecha_nacimiento, sexo, telefono, familiar, domicilio, localidad, municipio)\n" +
                                             "SELECT curp, expediente, fecha, nombre, fecha_nacimiento, sexo, telefono, familiar, domicilio, localidad, municipio FROM pacientes WHERE expediente = '"+expediente+"';");
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al ingresar un paciente");
        }
        return null;
    }
    
    //Eliminar registros de prestamos
    public Long eliminarRegistroPrestado(String expediente) {
        try {
            pstmt = connect.prepareStatement("DELETE FROM prestados WHERE expediente = '"+expediente+"';");
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro eliminado de prestamos");
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Error al eliminar un paciente");
        }
        return null;
    }
    
    //Eliminar registros en defuncion
    public Long eliminarRegistroDefuncion(String expediente) {
        try {
            pstmt = connect.prepareStatement("DELETE FROM defunciones WHERE expediente = '"+expediente+"';");
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro en Defuncion eliminado con exito ");
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Error al eliminar un paciente");
        }
        return null;
    }
     
}


