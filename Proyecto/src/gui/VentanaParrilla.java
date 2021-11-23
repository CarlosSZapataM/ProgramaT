package gui;

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

    private AgendaParrilla miAgenda;
    private Parrilla productoseleccionado;

    public VentanaParrilla() {
        
        miAgenda = new AgendaParrilla();

        initComponents();
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
        txtTipo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setText("Parrilla");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 30, 160, 56);

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("Nombre del programa:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 190, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setText("Fecha de transmision:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 210, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setText("Hora de inicio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 200, 122, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setText("Hora final:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 240, 120, 30);

        txtNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtNombre);
        txtNombre.setBounds(200, 120, 400, 30);

        txtTipo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtTipo);
        txtTipo.setBounds(200, 240, 400, 30);

        txtMarca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtMarca);
        txtMarca.setBounds(200, 160, 400, 30);

        txtCantidad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(200, 200, 400, 30);

        btnGuardar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(630, 160, 210, 27);

        btnEditar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnEditar.setText("Editar");
        getContentPane().add(btnEditar);
        btnEditar.setBounds(40, 520, 210, 27);

        btnBorrar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar);
        btnBorrar.setBounds(280, 520, 210, 27);

        btnLimpiar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(630, 200, 210, 27);

        btnSalir.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(620, 600, 210, 27);

        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 286, 820, 210);

        jLabel6.setText("________________________________________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-30, 20, 920, 14);

        jLabel7.setText("________________________________________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-20, 80, 920, 14);

        setSize(new java.awt.Dimension(876, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.borrarProducto();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.adicionarProducto();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        vnCanales();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        // TODO add your handling code here:
        this.seleccionarProducto();
    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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

    private void adicionarProducto() {
        if (txtNombre.getText().isEmpty() || txtCantidad.getText().isEmpty() || txtMarca.getText().isEmpty() || txtTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Favor no dejar campos vacios");
        } else {
            String nombre = txtNombre.getText();
            String cantidad = txtCantidad.getText();
            String marca = txtMarca.getText();
            String tipoProducto = txtTipo.getText();

            Parrilla p = new Parrilla();
            p.setNombrePrograma(nombre);
            p.setFechaTransmision(cantidad);
            p.setHoraInicio(marca);
            p.setHoraFinal(tipoProducto);

            boolean r = miAgenda.adicionarProducto(p);

            if (r) {
                JOptionPane.showMessageDialog(this, "Se Almaceno el programa", "Atencion", JOptionPane.INFORMATION_MESSAGE);
                cargarDatos();
                limpiar();

            } else {
                JOptionPane.showMessageDialog(this, "No se almaceno el programa", "Atencion", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void borrarProducto() {

        if (productoseleccionado == null) {
            return;
        }

        boolean rta = miAgenda.borrarProducto(productoseleccionado);
        if (rta) {
            JOptionPane.showMessageDialog(this, "Se Borro el programa", "Atencion", JOptionPane.INFORMATION_MESSAGE);
            cargarDatos();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "No se Borro el programa", "Atencion", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void vnCanales(){
        Ventana c = new Ventana();
        c.setVisible(true);
        this.setVisible(false);
    }

    private void cargarDatos() {

        ArrayList<Parrilla> lista = miAgenda.getProductos();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora inicio");
        modelo.addColumn("Hora fin");

        for (Parrilla producto : lista) {

            Object[] datos = {
                producto.getId(),
                producto.getNombrePrograma(),
                producto.getFechaTransmision(),
                producto.getHoraInicio(),
                producto.getHoraFinal()
            };
            modelo.addRow(datos);

        }
        this.tablaProductos.setModel(modelo);

    }

    private void limpiar() {
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnBorrar.setEnabled(true);
        this.txtNombre.setText("");
        this.txtCantidad.setText("");
        this.txtMarca.setText("");
        this.txtTipo.setText("");

    }

    private void seleccionarProducto() {
        int fila = tablaProductos.getSelectedRow();
        Long identificacion = (Long) tablaProductos.getValueAt(fila, 0);
        productoseleccionado = this.miAgenda.buscarProductos(identificacion);
        this.txtNombre.setText(productoseleccionado.getNombrePrograma());
        this.txtCantidad.setText(productoseleccionado.getFechaTransmision());
        this.txtMarca.setText(productoseleccionado.getHoraInicio());
        this.txtTipo.setText(productoseleccionado.getHoraFinal());
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
