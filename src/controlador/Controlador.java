/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Historico;
import modelo.Libros;
import modelo.Prestamo;
import modelo.Usuarios;
import vista.Vista;

/**
 *
 * @author Joaquin
 */
public class Controlador implements ActionListener{
    
    Vista vista = new Vista();
    Prestamo p = new Prestamo();
    Libros l = new Libros();
    Usuarios u = new Usuarios();
    Historico h = new Historico();
    
    public enum AccionMVC{
        _Prestar, _Cerrar, 
        _InsertarUsu, _ActualizarUsu, _BorrarUsu, _PerdonarUsu,
        _InsertarLib, _ActualizarLib, _BorrarLib
    }
    
    public Controlador(){
        
    }
    
    public void iniciar(){
        vista.setVisible(true);
        
        this.vista.tablaLibros.setModel(l.listarLibros());
        this.vista.tablaHistoricos.setModel(h.listarHistorico());
        this.vista.tablaPrestamos.setModel(p.listarPrestamos());
        this.vista.tablaUsuarios.setModel(u.listarUsuario());
        
        this.vista.prestar.setActionCommand("_Prestar");
        this.vista.prestar.addActionListener(this);
        
        this.vista.cerrar.setActionCommand("_Cerrar");
        this.vista.cerrar.addActionListener(this);
        
        this.vista.insertarUsu.setActionCommand("_InsertarUsu");
        this.vista.insertarUsu.addActionListener(this);
        
        this.vista.actualizarUsu.setActionCommand("_ActualizarUsu");
        this.vista.actualizarUsu.addActionListener(this);
        
        this.vista.borrarUsu.setActionCommand("_BorrarUsu");
        this.vista.borrarUsu.addActionListener(this);
        
        this.vista.perdonarUsu.setActionCommand("_PerdonarUsu");
        this.vista.perdonarUsu.addActionListener(this);
        
        this.vista.insertarLib.setActionCommand("_InsertarLib");
        this.vista.insertarLib.addActionListener(this);
        
        this.vista.actualizarLib.setActionCommand("_ActualizarLib");
        this.vista.actualizarLib.addActionListener(this);
        
        this.vista.borrarLib.setActionCommand("_BorrarLib");
        this.vista.borrarLib.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())){
            case _Prestar:
        {
            try {
                p.insertarPrestamo(Integer.parseInt(vista.textUsuarioP.getText()), Integer.parseInt(vista.textLibroP.getText()));
                this.vista.tablaPrestamos.setModel(p.listarPrestamos());
                this.vista.tablaLibros.setModel(l.listarLibros());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case _Cerrar:
        {
            try {
                p.borrarPrestamo(Integer.parseInt(vista.textCodP.getText()));
                this.vista.tablaPrestamos.setModel(p.listarPrestamos());
                this.vista.tablaHistoricos.setModel(h.listarHistorico());
                this.vista.tablaLibros.setModel(l.listarLibros());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case _InsertarUsu:
        {
            try {
                u.insertarUsuario(vista.nombreUs.getText(), Integer.parseInt(vista.codposUs.getText()), vista.calleUs.getText(), Integer.parseInt(vista.numeroUs.getText()), vista.ciudadUs.getText());
                this.vista.tablaUsuarios.setModel(u.listarUsuario());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case _ActualizarUsu:
        {
            try {
                u.actualizarUsuario(Integer.parseInt(vista.codUs.getText()), vista.nombreUs.getText(), Integer.parseInt(vista.codposUs.getText()), vista.calleUs.getText(), Integer.parseInt(vista.numeroUs.getText()), vista.ciudadUs.getText(), Integer.parseInt(vista.penalizadoUs.getText()));
                this.vista.tablaUsuarios.setModel(u.listarUsuario());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case _BorrarUsu:
        {
            try {
                u.borrarUsuario(Integer.parseInt(vista.codUs.getText()));
                this.vista.tablaUsuarios.setModel(u.listarUsuario());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case _InsertarLib:
        {
            try {
                l.insertarLibro(Integer.parseInt(vista.claseLib.getText()), vista.autorLib.getText(), vista.tituloLib.getText(), vista.editorLib.getText(), 0);
                this.vista.tablaLibros.setModel(l.listarLibros());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case _ActualizarLib:
        {
            try {
                l.actualizarLibro(Integer.parseInt(vista.codigoLib.getText()), Integer.parseInt(vista.claseLib.getText()), vista.autorLib.getText(), vista.tituloLib.getText(), vista.editorLib.getText(), 0);
                this.vista.tablaLibros.setModel(l.listarLibros());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case _BorrarLib:
        {
            try {
                l.borrarLibro(Integer.parseInt(vista.codigoLib.getText()));
                this.vista.tablaLibros.setModel(l.listarLibros());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case _PerdonarUsu:
        {
            try {
                u.perdonarUsuario(Integer.parseInt(vista.codUs.getText()));
                this.vista.tablaUsuarios.setModel(u.listarUsuario());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            default:
                throw new AssertionError(AccionMVC.valueOf(e.getActionCommand()).name());
        }
    }
}
            
