package Interface;

import Conexion.conexion;
import informacion.paciente_tabla;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Prestamos extends javax.swing.JFrame {

    String tabla = "";
    String accion = "";
    
    public Prestamos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/IconoFrame/Icono.png")).getImage());
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPyD = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Prestamos");
        jButton1.setToolTipText("Archivos en prestamo");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Defunción");
        jButton2.setToolTipText("Archivos de pacientes en defuncion");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        TablaPyD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaPyD);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Eliminar Archivo");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Ver Archivo");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Buscar Archivo");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Regresar");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(13, 13, 13)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Menu a = new Menu();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrarPrestamos();
        tabla = "prestamos";
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarDefunciones();
        tabla = "defunciones";
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        conexion c = new conexion();
        System.out.println(tabla);
        if (tabla == "prestamos"){
            ArrayList<paciente_tabla> lista_prestamos = c.consultarPrestamos();
            if (TablaPyD.getSelectedRow() > -1 && !lista_prestamos.isEmpty()) {
                paciente_tabla p = lista_prestamos.get(TablaPyD.getSelectedRow());
                String exp = p.getExpediente();
                c.eliminarRegistroPrestado(exp);
                c.updateToDisponible(exp);
                System.out.println("PRESTADO ELIMINADO");
                c.cerrarConexion();
                mostrarPrestamos();
                System.out.println("REGISTRO DE PRESTAMOS");
            } 
        } else {
            ArrayList<paciente_tabla> lista_defunciones = c.consultarDefunciones();
            if (TablaPyD.getSelectedRow() > -1 && !lista_defunciones.isEmpty()) {
                paciente_tabla p = lista_defunciones.get(TablaPyD.getSelectedRow());
                String exp = p.getExpediente();
                c.eliminarRegistroDefuncion(exp);
                System.out.println("DEFUNCION ELIMINADO");
                c.cerrarConexion();
                mostrarDefunciones(); 
                System.out.println("REGISTRO DEFUNCION");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        conexion c = new conexion();
        System.out.println(tabla);
        if (tabla == "prestamos"){
            ArrayList<paciente_tabla> lista_prestamos = c.consultarPrestamos();
            if (TablaPyD.getSelectedRow() > -1 && !lista_prestamos.isEmpty()) {
            paciente_tabla p = lista_prestamos.get(TablaPyD.getSelectedRow());
            String exp_user = p.getExpediente();

            Visualizar a = new Visualizar();

            ArrayList<paciente_tabla> datos = c.verPrestados(exp_user);
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
        } else {
        ArrayList<paciente_tabla> lista_defunciones = c.consultarDefunciones();
            if (TablaPyD.getSelectedRow() > -1 && !lista_defunciones.isEmpty()) {
            paciente_tabla p = lista_defunciones.get(TablaPyD.getSelectedRow());
            String exp_user = p.getExpediente();

            Visualizar a = new Visualizar();

            ArrayList<paciente_tabla> datos = c.verDefunciones(exp_user);
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
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String search = jTextField1.getText();
        busqueda(search);
        jTextField1.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void busqueda(String search){
        ;
    }
    
    
    private void mostrarPrestamos() {
        DefaultTableModel Pacientes = new DefaultTableModel();
        Pacientes.addColumn("Expediente");
        Pacientes.addColumn("CURP");
        Pacientes.addColumn("Nombre");
        Pacientes.addColumn("Domicilio");
        Pacientes.addColumn("Lugar de Prestamo");
    
        Object[][] datos = obtenerMatrizPrestamos();

        for (Object[] paciente : datos) {
            Pacientes.addRow(paciente);
        }
        TablaPyD.setModel(Pacientes);
    }
    
    private String[][] obtenerMatrizPrestamos() {

        conexion c = new conexion();
        
        ArrayList<paciente_tabla> miInfo = c.consultarPrestamos();
        c.cerrarConexion();
        String matrizInfo[][] = new String[miInfo.size()][5];
            
        for (int i = 0; i < miInfo.size(); i++) {
            matrizInfo[i][0] = miInfo.get(i).getExpediente() + "";
            matrizInfo[i][1] = miInfo.get(i).getCurp() + "";
            matrizInfo[i][2] = miInfo.get(i).getNombre() + "";
            matrizInfo[i][3] = miInfo.get(i).getDomicilio() + "";
            matrizInfo[i][4] = miInfo.get(i).getLugar() + "";
        
        }
        return matrizInfo;
        
    }
    
    //FUNCIONES PARA MOSTRAR TABLA DE DEFUNCIONES
    private void mostrarDefunciones() {
        DefaultTableModel Pacientes = new DefaultTableModel();
        Pacientes.addColumn("Expediente");
        Pacientes.addColumn("CURP");
        Pacientes.addColumn("Nombre");
        Pacientes.addColumn("Domicilio");

        Object[][] datos = obtenerMatrizDefunciones();

        for (Object[] paciente : datos) {
            Pacientes.addRow(paciente);
        }
        TablaPyD.setModel(Pacientes);
    }
    
    private String[][] obtenerMatrizDefunciones() {

        conexion c = new conexion();
        ArrayList<paciente_tabla> miInfo = c.consultarDefunciones();
        c.cerrarConexion();
        String matrizInfo[][] = new String[miInfo.size()][4];

        for (int i = 0; i < miInfo.size(); i++) {
            matrizInfo[i][0] = miInfo.get(i).getExpediente() + "";
            matrizInfo[i][1] = miInfo.get(i).getCurp() + "";
            matrizInfo[i][2] = miInfo.get(i).getNombre() + "";
            matrizInfo[i][3] = miInfo.get(i).getDomicilio() + "";
        }
        return matrizInfo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPyD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
