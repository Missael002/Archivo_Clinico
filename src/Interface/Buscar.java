package Interface;

import javax.swing.table.DefaultTableModel;
import Conexion.conexion;
import java.util.ArrayList;
import informacion.paciente_tabla;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Buscar extends javax.swing.JFrame {

    int expediente_user;

    public Buscar() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IconoFrame/Icono.png")).getImage());
        transparencia();
        this.setLocationRelativeTo(null);
        mostrarIni();

        //Regresar.setIcon(setIcono("/Imagenes/atras1.png", Regresar));
    }

    public void transparencia() {
        btnVer.setOpaque(false);
        btnBuscar.setOpaque(false);
        btnPrestamo.setOpaque(false);
        Regresar.setOpaque(false);
        btnVer.setBorderPainted(false);
        btnBuscar.setBorderPainted(false);
        btnPrestamo.setBorderPainted(false);
        Regresar.setBorderPainted(false);

        btnVer.setContentAreaFilled(false);
        btnBuscar.setContentAreaFilled(false);
        Regresar.setContentAreaFilled(false);
        btnPrestamo.setContentAreaFilled(false);
    }

    private String[][] obtenerMatrizIni() {

        conexion c = new conexion();
        ArrayList<paciente_tabla> miInfo = c.consultarPacientes();
        c.cerrarConexion();
        String matrizInfo[][] = new String[miInfo.size()][5];

        for (int i = 0; i < miInfo.size(); i++) {
            matrizInfo[i][0] = miInfo.get(i).getExpediente() + "";
            matrizInfo[i][1] = miInfo.get(i).getCurp() + "";
            matrizInfo[i][2] = miInfo.get(i).getNombre() + "";
            matrizInfo[i][3] = miInfo.get(i).getDomicilio() + "";
            matrizInfo[i][4] = miInfo.get(i).getEstado() + "";
        }
        return matrizInfo;
        
    }

    private void mostrarIni() {
        DefaultTableModel Pacientes = new DefaultTableModel();
        Pacientes.addColumn("Expediente");
        Pacientes.addColumn("CURP");
        Pacientes.addColumn("Nombre");
        Pacientes.addColumn("Domicilio");
        Pacientes.addColumn("Estado");

        Object[][] datos = obtenerMatrizIni();

        for (Object[] paciente : datos) {
            Pacientes.addRow(paciente);
        }
        Tabla_Pacientes.setModel(Pacientes);
    }

    //Metodos para buscar pacientes
    private String[][] obtenerNuevaMatriz(String buscar) {

        conexion c = new conexion();
        ArrayList<paciente_tabla> miInfo = c.buscarPacientes(buscar);
        c.cerrarConexion();
        String matrizInfo[][] = new String[miInfo.size()][5];
        
        for (int i = 0; i < miInfo.size(); i++) {
            matrizInfo[i][0] = miInfo.get(i).getExpediente() + "";
            matrizInfo[i][1] = miInfo.get(i).getCurp() + "";
            matrizInfo[i][2] = miInfo.get(i).getNombre() + "";
            matrizInfo[i][3] = miInfo.get(i).getDomicilio() + "";
            matrizInfo[i][4] = miInfo.get(i).getEstado() + "";
            }   
        return matrizInfo;
    }

    private void mostrarBusqueda(String buscar) {
        DefaultTableModel Pacientes = new DefaultTableModel();
        Pacientes.addColumn("Expediente");
        Pacientes.addColumn("CURP");
        Pacientes.addColumn("Nombre");
        Pacientes.addColumn("Domicilio");
        Pacientes.addColumn("Estado");

        Object[][] datos = obtenerNuevaMatriz(buscar);

        for (Object[] paciente : datos) {
            Pacientes.addRow(paciente);
            
                
        }
        Tabla_Pacientes.setModel(Pacientes);
        System.out.println(Pacientes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Regresar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnPrestamo = new javax.swing.JButton();
        btnDefuncion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Pacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Regresar.setForeground(new java.awt.Color(0, 0, 0));
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-izquierda.png"))); // NOI18N
        Regresar.setToolTipText("Regresar al menu");
        Regresar.setBorder(null);
        Regresar.setBorderPainted(false);
        Regresar.setContentAreaFilled(false);
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        txtBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBuscar.setToolTipText("Buscar archivo por..");

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnVer.setBackground(new java.awt.Color(255, 255, 255));
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papel.png"))); // NOI18N
        btnVer.setToolTipText("Ver datos del paciente");
        btnVer.setBorder(null);
        btnVer.setBorderPainted(false);
        btnVer.setContentAreaFilled(false);
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnPrestamo.setBackground(new java.awt.Color(255, 255, 255));
        btnPrestamo.setForeground(new java.awt.Color(0, 0, 0));
        btnPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/libro (1).png"))); // NOI18N
        btnPrestamo.setToolTipText("Archivo en prestamo");
        btnPrestamo.setBorder(null);
        btnPrestamo.setBorderPainted(false);
        btnPrestamo.setContentAreaFilled(false);
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        btnDefuncion.setBackground(new java.awt.Color(255, 255, 255));
        btnDefuncion.setForeground(new java.awt.Color(0, 0, 0));
        btnDefuncion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acta-de-defuncion.png"))); // NOI18N
        btnDefuncion.setToolTipText("Archivo en defuncion");
        btnDefuncion.setBorder(null);
        btnDefuncion.setBorderPainted(false);
        btnDefuncion.setContentAreaFilled(false);
        btnDefuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefuncionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnVer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Regresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDefuncion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Tabla_Pacientes.setBackground(new java.awt.Color(255, 255, 255));
        Tabla_Pacientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabla_Pacientes.setForeground(new java.awt.Color(0, 0, 0));
        Tabla_Pacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Pacientes);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Menu a = new Menu();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        conexion c = new conexion();
        ArrayList<paciente_tabla> miInfo = c.consultarPacientes();

        if (Tabla_Pacientes.getSelectedRow() > -1 && !miInfo.isEmpty()) {
            paciente_tabla p = miInfo.get(Tabla_Pacientes.getSelectedRow());
            String exp_user = p.getExpediente();

            Visualizar a = new Visualizar();

            ArrayList<paciente_tabla> datos = c.verPaciente(exp_user);
            for (paciente_tabla paciente : datos) {
                Visualizar.expediente.setText(paciente.getExpediente());
                Visualizar.Fecha.setText(paciente.getFecha());
                Visualizar.Nombre.setText(paciente.getNombre());
                Visualizar.Nacimiento.setText(paciente.getFecha_nacimiento());
                Visualizar.Direccion.setText(paciente.getDomicilio());
                Visualizar.Localidad.setText(paciente.getLocalidad());
                Visualizar.Municipio.setText(paciente.getMunicipio());
                Visualizar.Nombre_madre.setText(paciente.getFamiliar());
                Visualizar.Curp.setText(paciente.getCurp());
                Visualizar.Telefono.setText(paciente.getTelefono());
                Visualizar.LugarPrestamo.setText(paciente.getLugar());
            }
            a.setVisible(true);
            this.dispose();

            System.out.println(exp_user);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un paciente para continuar");
        }
        c.cerrarConexion();
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscar = txtBuscar.getText();
        mostrarBusqueda(buscar);
        txtBuscar.setText("");

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        String lugar = JOptionPane.showInputDialog("¿A qué Area se prestará el archivo?");
        
        conexion c = new conexion();
        ArrayList<paciente_tabla> miInfo = c.consultarPacientes();
        
        if (Tabla_Pacientes.getSelectedRow() > -1 && !miInfo.isEmpty()) {
            paciente_tabla p = miInfo.get(Tabla_Pacientes.getSelectedRow());
            String expediente = p.getExpediente();
            System.out.println(expediente);
            c.updateToPrestado(expediente, lugar);
            c.insertarRegistroPrestado(expediente);
            c.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Registro actualizado a PRESTAMOS");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un paciente para continuar");
        }
    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void btnDefuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefuncionActionPerformed
        conexion c = new conexion();
        ArrayList<paciente_tabla> info = c.consultarPacientes();

        if (Tabla_Pacientes.getSelectedRow() > -1 && !info.isEmpty()) {
            paciente_tabla p = info.get(Tabla_Pacientes.getSelectedRow());
            String expediente = p.getExpediente();
            c.updateToDefuncion(expediente);
            c.insertarRegistroDefunciones(expediente);
            JOptionPane.showMessageDialog(null, "Registro actualizado a DEFUNCIONES");
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un paciente para continuar");
        }
        c.cerrarConexion();
    }//GEN-LAST:event_btnDefuncionActionPerformed

    public int getExpediente_user() {
        return expediente_user;
    }

    public void setExpediente_user(int expediente_user) {
        this.expediente_user = expediente_user;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    public javax.swing.JTable Tabla_Pacientes;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDefuncion;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JButton btnVer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
