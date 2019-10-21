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
public class Prestamo {
    Connection conect;
    CallableStatement cs = null;
    String nombre,titulo,inicio,fin,plazo;
    
    public void insertarPrestamo(int usuario, int libro) throws SQLException{
        conect = Conexion.getConnection();
        cs = conect.prepareCall("{call INSERTAR_PRESTAMOS(?,?)}");
        cs.setInt(1, usuario);
        cs.setInt(2, libro);
        
        cs.execute();
        
        conect.close();
        cs.close();
    }
    
    public void borrarPrestamo(int prestamo) throws SQLException{
        conect = Conexion.getConnection();
        cs = conect.prepareCall("{call BORRAR_PRESTAMO(?)}");
        cs.setInt(1, prestamo);
        
        cs.execute();
        
        conect.close();
        cs.close();
    }
    
    public DefaultTableModel listarPrestamos() {

		int tamano=0;
		String[] headers = { "ID","Carnet Usuario", "Nombre Usuario","Codigo Libro", "Clase Libro", "Autor", "Titulo", "Editor", "Prestado","Inicio","Fin","Plazo"};
		DefaultTableModel plantilla = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		try {
			conect=Conexion.getConnection();
			cs=conect.prepareCall("{call FETCH_PRESTAMOS.GET_PRESTAMOS(?)}");
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

		String[][] filas = new String[tamano][12];

		try {
			int id,codigo,disponibilidad,clase;
			String titulo,genero,autor,editor;
			conect=Conexion.getConnection();
			cs=conect.prepareCall("{call FETCH_PRESTAMOS.GET_PRESTAMOS(?)}");
		    cs.registerOutParameter(1, OracleTypes.CURSOR);
		    cs.executeQuery();
		    ResultSet cursor = (ResultSet)cs.getObject(1);
			int i = 0;
			while (cursor.next()) {
                              
				filas[i][0] = cursor.getString("COD");
				filas[i][1] = cursor.getString("USUARIO.NUM_CARNET");
                                filas[i][2] = cursor.getString("USUARIO.NOMBRE");
                                filas[i][3] = cursor.getString("USUARIO.PENALIZADO");
				filas[i][4] = cursor.getString("LIBRO.COD");
                                filas[i][5] = cursor.getString("LIBRO.CLASE");
                                filas[i][6] = cursor.getString("LIBRO.AUTOR");
                                filas[i][7] = cursor.getString("LIBRO.TITULO");
                                filas[i][8] = cursor.getString("LIBRO.EDITOR");
				filas[i][9] = cursor.getString("INICIO");
				filas[i][10] = cursor.getString("FIN");
				filas[i][11] = cursor.getString("PLAZO");
				
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
