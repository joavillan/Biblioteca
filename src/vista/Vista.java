/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Joaquin
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Prestamos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPrestamos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textUsuarioP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textLibroP = new javax.swing.JTextField();
        prestar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textCodP = new javax.swing.JTextField();
        Usuarios = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        nombreUs = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numeroUs = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        codposUs = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ciudadUs = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        calleUs = new javax.swing.JTextField();
        insertarUsu = new javax.swing.JButton();
        actualizarUsu = new javax.swing.JButton();
        borrarUsu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        codUs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        penalizadoUs = new javax.swing.JTextField();
        perdonarUsu = new javax.swing.JButton();
        Libros = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        claseLib = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        editorLib = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        autorLib = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tituloLib = new javax.swing.JTextField();
        insertarLib = new javax.swing.JButton();
        actualizarLib = new javax.swing.JButton();
        borrarLib = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        codigoLib = new javax.swing.JTextField();
        Historico = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaHistoricos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaPrestamos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPrestamos);

        jLabel1.setText("Usuario");

        textUsuarioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioPActionPerformed(evt);
            }
        });

        jLabel3.setText("Libro");

        prestar.setText("Prestar");

        cerrar.setText("Cerrar");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo");

        javax.swing.GroupLayout PrestamosLayout = new javax.swing.GroupLayout(Prestamos);
        Prestamos.setLayout(PrestamosLayout);
        PrestamosLayout.setHorizontalGroup(
            PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrestamosLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(PrestamosLayout.createSequentialGroup()
                        .addComponent(prestar)
                        .addGap(37, 37, 37)
                        .addComponent(cerrar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PrestamosLayout.createSequentialGroup()
                        .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textCodP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textUsuarioP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(textLibroP, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        PrestamosLayout.setVerticalGroup(
            PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrestamosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PrestamosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textUsuarioP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrestamosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textLibroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCodP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prestar)
                    .addComponent(cerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Prestamos", Prestamos);

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaUsuarios);

        jLabel7.setText("Nombre");

        jLabel8.setText("Número");

        jLabel9.setText("Código Postal");

        codposUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codposUsActionPerformed(evt);
            }
        });

        jLabel10.setText("Ciudad");

        jLabel11.setText("Calle");

        insertarUsu.setText("Insertar");
        insertarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarUsuActionPerformed(evt);
            }
        });

        actualizarUsu.setText("Actualizar");

        borrarUsu.setText("Borrar");
        borrarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarUsuActionPerformed(evt);
            }
        });

        jLabel5.setText("Código");

        jLabel6.setText("Penalizado");

        perdonarUsu.setText("Perdonar");
        perdonarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perdonarUsuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsuariosLayout = new javax.swing.GroupLayout(Usuarios);
        Usuarios.setLayout(UsuariosLayout);
        UsuariosLayout.setHorizontalGroup(
            UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuariosLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UsuariosLayout.createSequentialGroup()
                        .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(nombreUs)
                            .addComponent(jLabel7)
                            .addComponent(numeroUs))
                        .addGap(34, 34, 34)
                        .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codposUs)
                            .addComponent(ciudadUs))
                        .addGap(18, 18, 18)
                        .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calleUs)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(codUs))
                        .addGap(18, 18, 18)
                        .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(penalizadoUs)))
                    .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(UsuariosLayout.createSequentialGroup()
                            .addComponent(insertarUsu)
                            .addGap(33, 33, 33)
                            .addComponent(actualizarUsu)
                            .addGap(37, 37, 37)
                            .addComponent(borrarUsu)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(perdonarUsu))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        UsuariosLayout.setVerticalGroup(
            UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuariosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(UsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codposUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ciudadUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(UsuariosLayout.createSequentialGroup()
                        .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calleUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(penalizadoUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(26, 26, 26)))
                .addGap(43, 43, 43)
                .addGroup(UsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarUsu)
                    .addComponent(actualizarUsu)
                    .addComponent(borrarUsu)
                    .addComponent(perdonarUsu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Usuarios", Usuarios);

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaLibros);

        jLabel13.setText("Clase");

        jLabel14.setText("Editor");

        jLabel15.setText("Autor");

        jLabel17.setText("Titulo");

        insertarLib.setText("Insertar");
        insertarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarLibActionPerformed(evt);
            }
        });

        actualizarLib.setText("Actualizar");

        borrarLib.setText("Borrar");
        borrarLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarLibActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo");

        javax.swing.GroupLayout LibrosLayout = new javax.swing.GroupLayout(Libros);
        Libros.setLayout(LibrosLayout);
        LibrosLayout.setHorizontalGroup(
            LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LibrosLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LibrosLayout.createSequentialGroup()
                        .addComponent(insertarLib)
                        .addGap(33, 33, 33)
                        .addComponent(actualizarLib)
                        .addGap(37, 37, 37)
                        .addComponent(borrarLib))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LibrosLayout.createSequentialGroup()
                        .addGroup(LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(claseLib, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15)
                                .addComponent(autorLib, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(tituloLib, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LibrosLayout.createSequentialGroup()
                        .addComponent(editorLib, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(codigoLib, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        LibrosLayout.setVerticalGroup(
            LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LibrosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LibrosLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(claseLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editorLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigoLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LibrosLayout.createSequentialGroup()
                        .addGroup(LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(LibrosLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(autorLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LibrosLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tituloLib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)))
                .addGap(44, 44, 44)
                .addGroup(LibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertarLib)
                    .addComponent(actualizarLib)
                    .addComponent(borrarLib))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Libros", Libros);

        tablaHistoricos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaHistoricos);

        javax.swing.GroupLayout HistoricoLayout = new javax.swing.GroupLayout(Historico);
        Historico.setLayout(HistoricoLayout);
        HistoricoLayout.setHorizontalGroup(
            HistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoricoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        HistoricoLayout.setVerticalGroup(
            HistoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HistoricoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Historico", Historico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarActionPerformed

    private void insertarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertarUsuActionPerformed

    private void borrarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrarUsuActionPerformed

    private void insertarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertarLibActionPerformed

    private void borrarLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarLibActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrarLibActionPerformed

    private void textUsuarioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuarioPActionPerformed

    private void codposUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codposUsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codposUsActionPerformed

    private void perdonarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perdonarUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perdonarUsuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Historico;
    public javax.swing.JPanel Libros;
    public javax.swing.JPanel Prestamos;
    public javax.swing.JPanel Usuarios;
    public javax.swing.JButton actualizarLib;
    public javax.swing.JButton actualizarUsu;
    public javax.swing.JTextField autorLib;
    public javax.swing.JButton borrarLib;
    public javax.swing.JButton borrarUsu;
    public javax.swing.JTextField calleUs;
    public javax.swing.JButton cerrar;
    public javax.swing.JTextField ciudadUs;
    public javax.swing.JTextField claseLib;
    public javax.swing.JTextField codUs;
    public javax.swing.JTextField codigoLib;
    public javax.swing.JTextField codposUs;
    public javax.swing.JTextField editorLib;
    public javax.swing.JButton insertarLib;
    public javax.swing.JButton insertarUsu;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel15;
    public javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField nombreUs;
    public javax.swing.JTextField numeroUs;
    public javax.swing.JTextField penalizadoUs;
    public javax.swing.JButton perdonarUsu;
    public javax.swing.JButton prestar;
    public javax.swing.JTable tablaHistoricos;
    public javax.swing.JTable tablaLibros;
    public javax.swing.JTable tablaPrestamos;
    public javax.swing.JTable tablaUsuarios;
    public javax.swing.JTextField textCodP;
    public javax.swing.JTextField textLibroP;
    public javax.swing.JTextField textUsuarioP;
    public javax.swing.JTextField tituloLib;
    // End of variables declaration//GEN-END:variables
}