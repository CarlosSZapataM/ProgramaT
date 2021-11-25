package gui;

import datos.Canal;
import datos.Parrilla;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.AgendaParrilla;
/**
 *
 * @author Carlos Z
 */
public class VentanaParrilla extends javax.swing.JFrame {

    private AgendaParrilla miParrilla;
    private Parrilla parrillaSeleccionado;
    private Canal canal;

    public VentanaParrilla() {
        
        miParrilla = new AgendaParrilla();

        initComponents();
        cargarDatos();
    }
    
    public VentanaParrilla(Canal canal) {
        this.canal = canal;
        initComponents();
        miParrilla = new AgendaParrilla();
        this.jLabel8.setText(canal.getNombreCanal());
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtHoraFinal = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtHoraInicio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setText("Parrilla");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 30, 160, 56);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("Nombre del programa:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 190, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setText("Fecha de transmision:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 190, 210, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setText("Hora de inicio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 230, 122, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setText("Hora final:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 270, 120, 30);

        txtNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(200, 150, 400, 30);

        txtHoraFinal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtHoraFinal);
        txtHoraFinal.setBounds(200, 270, 400, 30);

        txtFecha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtFecha);
        txtFecha.setBounds(200, 190, 400, 30);

        txtHoraInicio.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtHoraInicio);
        txtHoraInicio.setBounds(200, 230, 400, 30);

        btnGuardar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(620, 190, 210, 27);

        btnEditar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(30, 550, 240, 27);

        btnBorrar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar);
        btnBorrar.setBounds(310, 550, 240, 27);

        btnLimpiar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(620, 230, 210, 27);

        btnSalir.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(590, 550, 240, 27);

        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 320, 800, 210);

        jLabel6.setText("________________________________________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-30, 20, 920, 14);

        jLabel7.setText("________________________________________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-20, 80, 920, 14);

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 110, 390, 30);

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel9.setText("Nombre del canal:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 110, 190, 30);

        setSize(new java.awt.Dimension(876, 652));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.borrarParrilla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.adicionarParrilla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.vnCanales();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        // TODO add your handling code here:
        this.seleccionarParrilla();
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this.editarParrilla();
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaParrilla().setVisible(true);
            }
        });
    }
    
    private void cargarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora inicio");
        modelo.addColumn("Hora fin");

        for (Parrilla producto : miParrilla.getParrilla()) {
            if (canal.getId().equals(producto.getIdCanal())) {
                Object[] datos = {
                    producto.getId(),
                    producto.getNombrePrograma(),
                    producto.getFechaTransmision(),
                    producto.getHoraInicio(),
                    producto.getHoraFinal()
                };
                modelo.addRow(datos);
            }
        }
        this.tablaProductos.setModel(modelo);

    }

    private void adicionarParrilla() {
        if (txtNombre.getText().isEmpty() || txtFecha.getText().isEmpty() || txtHoraInicio.getText().isEmpty() || txtHoraFinal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor! No dejar campos vacios");
        } else {
            String nombre = txtNombre.getText();
            String fecha = txtFecha.getText();
            String inicio = txtHoraInicio.getText();
            String fin = txtHoraFinal.getText();

            Parrilla p = new Parrilla();
            p.setNombrePrograma(nombre);
            p.setFechaTransmision(fecha);
            p.setHoraInicio(inicio);
            p.setHoraFinal(fin);
            p.setIdCanal(this.canal.getId());

            boolean r = miParrilla.adicionarParrilla(p);

            if (r) {
                JOptionPane.showMessageDialog(this, "Se almaceno el programa", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                cargarDatos();
                limpiar();

            } else {
                JOptionPane.showMessageDialog(this, "No se almaceno el programa, intentelo de nuevo", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void borrarParrilla() {

        if (parrillaSeleccionado == null) {
            return;
        }

        boolean rta = miParrilla.borrarParrilla(parrillaSeleccionado);
        if (rta) {
            JOptionPane.showMessageDialog(this, "Se borro el programa", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            cargarDatos();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "No se borro el programa, intentelo de nuevo", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void editarParrilla(){
        if(parrillaSeleccionado == null)
            return;
    
        String nombre = txtNombre.getText();
        String fecha = txtFecha.getText();
        String horaInicio = txtHoraInicio.getText();
        String horaFinal = txtHoraFinal.getText();
        
        parrillaSeleccionado.setNombrePrograma(nombre);
        parrillaSeleccionado.setFechaTransmision(fecha);
        parrillaSeleccionado.setHoraInicio(horaInicio);
        parrillaSeleccionado.setHoraFinal(horaFinal);
        
        boolean rta = miParrilla.editarParrilla(parrillaSeleccionado);
        if(rta){
            JOptionPane.showMessageDialog(this, "Se modifico el programa","Atencion",JOptionPane.INFORMATION_MESSAGE);
            cargarDatos();
            limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "No se modifico el programa, intente de nuevo","Atencion",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void seleccionarParrilla() {
        int fila = tablaProductos.getSelectedRow();
        Long identificacion = (Long) tablaProductos.getValueAt(fila, 0);
        parrillaSeleccionado = this.miParrilla.buscarParrilla(identificacion);
        this.txtNombre.setText(parrillaSeleccionado.getNombrePrograma());
        this.txtFecha.setText(parrillaSeleccionado.getFechaTransmision());
        this.txtHoraInicio.setText(parrillaSeleccionado.getHoraInicio());
        this.txtHoraFinal.setText(parrillaSeleccionado.getHoraFinal());
    }
    
    private void limpiar() {
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnBorrar.setEnabled(true);
        this.txtNombre.setText("");
        this.txtHoraInicio.setText("");
        this.txtFecha.setText("");
        this.txtHoraFinal.setText("");

    }
    
    public void vnCanales(){
        Ventana c = new Ventana();
        c.setVisible(true);
        this.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
