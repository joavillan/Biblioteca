/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Joaquin
 */
public class Usuarios {
    
    Connection conect;
    CallableStatement cs = null;
    
    private int num_carnet;
    private String nombre;
    private Direccion direc;

    /*Usuarios() {
    }
    
    Usuarios(int num_carnet, String nombre, Direccion direc){
        this.num_carnet = num_carnet;
        this.nombre = nombre;
        this.direc = direc;
    }

    public int getNum_carnet() {
        return num_carnet;
    }

    public void setNum_carnet(int num_carnet) {
        this.num_carnet = num_carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDirec() {
        return direc;
    }

    public void setDirec(Direccion direc) {
        this.direc = direc;
        
    }*/
    
    public void insertarUsuario(String nom, int cod_pos, String calle, int numero, String ciu) throws SQLException{
        
        conect = Conexion.getConnection();
        cs = conect.prepareCall("{call INSERTAR_USUARIO(?,?,?,?,?)}");
        cs.setString(1, nom);
        cs.setInt(2, cod_pos);
        cs.setString(3, calle);
        cs.setInt(4, numero);
        cs.setString(5, ciu);
        
        cs.execute();
        
        conect.close();
        cs.close();
    }
    
    public void actualizarUsuario(int cod, String nom, int cod_pos, String calle, int numero, String ciu, int pen) throws SQLException{
        
        conect = Conexion.getConnection();
        cs = conect.prepareCall("{call ACTUALIZAR_USUARIO(?,?,?,?,?,?,?)}");
        cs.setInt(1, cod);
        cs.setString(2, nom);
        cs.setInt(3, cod_pos);
        cs.setString(4, calle);
        cs.setInt(5, numero);
        cs.setString(6, ciu);
        cs.setInt(7, pen);
        
        cs.execute();
        
        conect.close();
        cs.close();
    }
    
    public void borrarUsuario(int cod) throws SQLException{
        
        conect = Conexion.getConnection();
        cs = conect.prepareCall("{call BORRAR_USUARIO(?)}");
        cs.setInt(1, cod);
        
        cs.execute();
        
        conect.close();
        cs.close();
    }
    
    public void perdonarUsuario(int cod) throws SQLException{
        
        conect = Conexion.getConnection();
        cs = conect.prepareCall("{call PERDONAR(?)}");
        cs.setInt(1, cod);
        
        cs.execute();
        
        conect.close();
        cs.close();
    }
    
    public DefaultTableModel listarUsuario() {

		int tamano=0;
		String[] headers = { "Carnet","Nombre","Codigo Postal","Calle","Número","Ciudad","Penalizado"};
		DefaultTableModel plantilla = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		try {
			conect=Conexion.getConnection();
			cs=conect.prepareCall("{call FETCH_USUARIOS.GET_USUARIOS(?)}");
		    cs.registerOutParameter(1, OracleTypes.CURSOR);
		    cs.executeQuery();
		    ResultSet cursor = (ResultSet)cs.getObject(1);
		    
		    while(cursor.next()) {
		    	tamano++;
		    }
		    cursor.close();
		    cs.close();
		    conect.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String[][] filas = new String[tamano][8];

		try {
			int id,codigo,disponibilidad,clase;
			String titulo,genero,autor,editor;
			conect=Conexion.getConnection();
			cs=conect.prepareCall("{call FETCH_USUARIOS.GET_USUARIOS(?)}");
		    cs.registerOutParameter(1, OracleTypes.CURSOR);
		    cs.executeQuery();
		    ResultSet cursor = (ResultSet)cs.getObject(1);
			int i = 0;
			while (cursor.next()) {
                              
				filas[i][0] = cursor.getString("NUM_CARNET");
				filas[i][1] = cursor.getString("NOMBRE");
				filas[i][2] = cursor.getString("DIREC.COD_POSTAL");
				filas[i][3] = cursor.getString("DIREC.CALLE");
				filas[i][4] = cursor.getString("DIREC.NUMERO");
				filas[i][5] = cursor.getString("DIREC.CIUDAD");
                                filas[i][6] = cursor.getString("PENALIZADO");
				
				i++;
				System.out.println(filas.toString());
			}
			conect.close();
			plantilla.setDataVector(filas, headers);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return plantilla;
	}
}
