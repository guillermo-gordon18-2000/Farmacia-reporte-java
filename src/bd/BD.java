package bd;

import clases.usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *@author 
  Guillermo Gordon     8-959-2011            Fecha:07/21/2021      Grupo: ISL122
                       Luis ceballo          20-14-4700
                       Gil arauz             8-957-1087
                       Bryan Sanches         8-941-880
                       Jeymar Herrera        20-70-5165 
* 
*/
public class BD {
    

    public static Connection mConection;
    private static Statement mStatement;
    private static ResultSet mResultSet;
    private final String bd;
    private final String user;
    private final String password;

    public BD(String bd, String user, String password) {
        mConection = null;
        mStatement = null;
        mResultSet = null;
        this.bd = bd;
        this.user = user;
        this.password = password;
    }
    
    public BD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public boolean Conectar() {
       try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    mConection = DriverManager.getConnection("jdbc:mysql://localhost:8045/"  + "farmacia", "root", "");
                    return mConection != null;
            }catch (Exception e) {
                    return false;
        }
               
    }
    
    public void Desconectar() {
        try {
              this.mConection.close();
            } catch (Exception e){
            
        }
        
    }
 
    
    public Boolean AddUser(usuario administradores) {
          try {
              mStatement = mConection.createStatement();
              mStatement.execute("INSERT INTO administradores (nombre, apellido_paterno, apellido_materno, telefono, correo, usuario, contrasena) "
              + " VALUES ('" + administradores.getNombre() + "', '" + administradores.getApellido_paterno()+ "','" + administradores.getApellido_materno(
              )+ "','" + administradores.getTelefono()+ "','" + administradores.getCorreo()+ "','" + administradores.getUsuario()+ "','" + administradores.getContrasena()+ "')");
              return true;
            }catch (SQLException e) {
              System.err.println(e.toString());
              return false;
        }
          
    }
    
    public Boolean AddCliente(usuario Cliente) 
    {
              try 
             {
               mStatement = mConection.createStatement();
               mStatement.execute(
                       "INSERT INTO clientes (nombre_cliente, direccion, telefono_movil, fecha_nacimiento) "
                       + " VALUES ('" + Cliente.getNombre() + "', '" + Cliente.getDireccion()+ "','" + Cliente.getTelefono(
                       )+ "','" + Cliente.getUsuario()+ "')");
               return true;
             }catch (SQLException e) {
               System.err.println(e.toString());
               return false;
         }
        
        
    }
    
    public Boolean AddProducto(usuario inventario) 
    {
           try 
           {
            mStatement = mConection.createStatement();
            mStatement.execute("INSERT INTO inventario (descripcion, precio_unitario, cantidad) "
            + " VALUES ('" + inventario.getMedicamento() + "', '" + inventario.getPrecio_unitario()+ "','" + inventario.getCantidad()+ "')");
            return true;
            } catch (SQLException e) {
            System.err.println(e.toString());
            return false;
        }
        
           
    }
    
    public Boolean AddFactura(usuario Factura) 
    {
           try 
             {
                mStatement = mConection.createStatement();
                mStatement.execute("INSERT INTO reportes (id_medica, medicamento, total, cantidad) "
               +" VALUES ('" + Factura.getId_medica() + "','" + Factura.getMedicamento() + "', '" + Factura.getPrecio_unitario()+ "','" + Factura.getCantidad()+ "')");
                return true;
             } catch (SQLException e) {
               System.err.println(e.toString());
               return false;
        }
        
           
    }
    
    public usuario GetUsuario(String correo) {
        usuario Correo = null;
         try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT * FROM administradores WHERE correo = '" + correo + "' ");
            while (mResultSet.next()){
                Correo = new usuario();
                Correo.setUsuario_id(mResultSet.getInt("id_usuario"));
                Correo.setNombre(mResultSet.getString("nombre"));
                Correo.setApellido_paterno(mResultSet.getString("apellido_paterno"));
                Correo.setApellido_materno(mResultSet.getString("apellido_materno"));
                Correo.setUsuario(mResultSet.getString("usuario"));
                Correo.setContrasena(mResultSet.getString("contrasena"));
                Correo.setCorreo(mResultSet.getString("correo"));
                Correo.setTelefono(mResultSet.getString("telefono"));
                return Correo;
             }
            
           } catch (SQLException e) {
            return null;
            
            
        }
         return Correo;
        
    } 
    
    
    
    public usuario GetIDUsuario(String correo) {
        usuario ID = null;
         try {
            mStatement = mConection.createStatement();
            mResultSet = mStatement.executeQuery("SELECT  FROM clientes WHERE nombre_cliente = '"+ correo +"' ");
            while (mResultSet.next()){
                ID = new usuario();
                ID.setUsuario_id(mResultSet.getInt("id_usuario"));
                ID.setNombre(mResultSet.getString("nombre"));
                ID.setApellido_paterno(mResultSet.getString("apellido_paterno"));
                ID.setApellido_materno(mResultSet.getString("apellido_materno"));
                ID.setUsuario(mResultSet.getString("usuario"));
                ID.setContrasena(mResultSet.getString("contrasena"));
                ID.setCorreo(mResultSet.getString("correo"));
                ID.setTelefono(mResultSet.getString("telefono"));
                return ID;
             }
            
           } catch (SQLException e) {
            return null;
            
        }
         return ID;
        
    }
    
    

}
