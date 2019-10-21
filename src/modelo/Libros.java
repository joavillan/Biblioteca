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
public class Libros {
    
    Connection conect;
    CallableStatement cs = null;
    
    private int cod;
    private int clase;
    private String autor;
    private String titulo;
    private String editor;
    private boolean prestado;
    
    /*Libros(){
        
    }
    
    Libros(int cod, int clase, String autor, String titulo, String editor, boolean prestado){
        this.cod = cod;
        this.clase = clase;
        this.autor = autor;
        this.titulo = titulo;
        this.editor = editor;
        this.prestado = prestado;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getClase() {
        return clase;
    }

    public void setClase(int clase) {
        this.clase = clase;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }*/
    
    public void insertarLibro(int clase, String autor, String titulo, String editor, int estado) throws SQLException{
        
        int control=0;
        
        conect = Conexion.getConnection();
        cs = conect.prepareCall("{call INSERTAR_LIBRO(?,?,?,?,?)}");
        cs.setInt(1, clase);
        cs.setString(2, autor);
        cs.setString(3, titulo);
        cs.setString(4, editor);
        cs.setInt(5, estado);
        
        cs.execute();
        
        conect.close();
        cs.close();
    }
    
    public void actualizarLibro(int cod ,int clase, String autor, String titulo, String editor, int estado) throws SQLException{
        conect = Conexion.getConnection();
        cs = conect.prepareCall("{call ACTUALIZAR_LIBRO(?,?,?,?,?,?)}");
        cs.setInt(1, cod);
        cs.setInt(2, clase);
        cs.setString(3, autor);
        cs.setString(4, titulo);
        cs.setString(5, editor);
        cs.setInt(6, estado);
        
        cs.execute();
        
        conect.close();
        cs.close();
    }
    
    public void borrarLibro(int cod) throws SQLException{
        conect = Conexion.getConnection();
        cs = conect.prepareCall("{call BORRAR_LIBRO(?)}");
        cs.setInt(1, cod);
        
        cs.execute();
        
        conect.close();
        cs.close();
    }
    
    public DefaultTableModel listarLibros() {

		int tamano=0;
		String[] headers = { "ID","Clase","Autor","Titulo","Editor","Prestado"};
		DefaultTableModel plantilla = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		try {
			conect=Conexion.getConnection();
			cs=conect.prepareCall("{call FETCH_LIBROS.GET_libros(?)}");
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
			cs=conect.prepareCall("{call FETCH_LIBROS.GET_LIBROS(?)}");
		    cs.registerOutParameter(1, OracleTypes.CURSOR);
		    cs.executeQuery();
		    ResultSet cursor = (ResultSet)cs.getObject(1);
			int i = 0;
			while (cursor.next()) {
                              
				filas[i][0] = cursor.getString("COD");
				filas[i][1] = cursor.getString("CLASE");
				filas[i][2] = cursor.getString("AUTOR");
				filas[i][3] = cursor.getString("TITULO");
				filas[i][4] = cursor.getString("EDITOR");
				filas[i][5] = cursor.getString("PRESTADO");
				
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
