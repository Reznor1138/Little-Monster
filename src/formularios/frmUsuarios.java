/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import clases.Datos;
import clases.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author leandraroque
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmUsuarios
     */
    public frmUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIDUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbIDRol = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtConfirma = new javax.swing.JPasswordField();
        txtConsultar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel1.setText("IDUsuario");

        txtIDUsuario.setText("lea");
        txtIDUsuario.setActionCommand("<Not Set>");

        jLabel2.setText("Rol");

        cmbIDRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Empleado" }));

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellidos");

        jLabel6.setText("Clave");
        jLabel6.setToolTipText("");

        jLabel7.setText("Repetir Clave");

        txtConsultar.setText("Consultar");
        txtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.setToolTipText("");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setToolTipText("");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.setToolTipText("");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(153, 153, 153)
                                                        .addComponent(jLabel2)
                                                        .addGap(17, 17, 17)
                                                        .addComponent(cmbIDRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtNombre))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtApellidos)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtConsultar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnLimpiar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnNuevo)
                                                .addGap(12, 12, 12)
                                                .addComponent(btnModificar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBorrar)))
                                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)
                                        .addComponent(cmbIDRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(txtConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtConsultar)
                                        .addComponent(btnLimpiar)
                                        .addComponent(btnNuevo)
                                        .addComponent(btnModificar)
                                        .addComponent(btnBorrar))
                                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void txtConsultarActionPerformed(java.awt.event.ActionEvent evt) {
        String idUsuario =txtIDUsuario.getText();
        if(idUsuario.equals("")){
            JOptionPane.showMessageDialog(this,"Debe ingresas IdUsuario");
            return;
        }
        Datos misDatos = new Datos();
        Usuario miUsuario =misDatos.getUsuario(idUsuario);

        if(miUsuario == null){
            JOptionPane.showMessageDialog(this,"Usuario no existe");
            misDatos.cerrarConexion();
            return;
        }
        misDatos.cerrarConexion();
        txtNombre.setText(miUsuario.getNombre());
        txtApellidos.setText(miUsuario.getApellidos());
        txtClave.setText(miUsuario.getClave());
        txtConfirma.setText(miUsuario.getClave());
        if(miUsuario.getIdRol()==1){
            cmbIDRol.setSelectedIndex(0);
        }else{
            cmbIDRol.setSelectedIndex(1);
        }

    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        txtIDUsuario.setText("");
        txtNombre.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtClave.setText("");
        txtConfirma.setText("");
    }

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        String idUsuario = txtIDUsuario.getText();
        if(idUsuario.equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar IdUsuario");
            return;
        }
        Datos misDatos = new Datos();
        Usuario miUsuario = misDatos.getUsuario(idUsuario);

        if(miUsuario != null) {
            JOptionPane.showMessageDialog(this,"Usuario ya existe");
            misDatos.cerrarConexion();
            return;
        }


        String nombre =txtNombre.getText();
        if(nombre.equals("")){
            JOptionPane.showMessageDialog(this,"Debe de ingresar el nombre");
            return;
        }
        String apellidos =txtApellidos.getText();
        if(apellidos.equals("")){
            JOptionPane.showMessageDialog(this,"Debe de ingresar los apellidos");
            return;
        }
        String clave = new String (txtClave.getPassword());
        if(clave.equals("")){
            JOptionPane.showMessageDialog(this,"Debe de ingresar una clave");
            return;
        }
        String confirma = new String (txtConfirma.getPassword());
        if(confirma.equals("")){
            JOptionPane.showMessageDialog(this,"Repita clave");
            return;
        }
        if(!clave.equals(confirma)){
            JOptionPane.showMessageDialog(this,"No son iguales");
            return;
        }
        int idRol;
        if(cmbIDRol.getSelectedIndex() == 0) {
            idRol = 1;

        }else{

            idRol=2;
        }
        miUsuario = new Usuario(
                idUsuario,
                nombre,
                apellidos,
                clave,
                idRol);
        if(misDatos.newUsuario(miUsuario)){
            JOptionPane.showMessageDialog(this,"Listo!");

        }else{
            JOptionPane.showMessageDialog(this,"No creado");

        }
        misDatos.cerrarConexion();

    }

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {
        String idUsuario = txtIDUsuario.getText();
        if(idUsuario.equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar IdUsuario");
            return;
        }
        Datos misDatos = new Datos();
        Usuario miUsuario = misDatos.getUsuario(idUsuario);

        if(miUsuario == null) {
            JOptionPane.showMessageDialog(this,"Usuario no existe");
            misDatos.cerrarConexion();
            return;
        }


        String nombre =txtNombre.getText();
        if(nombre.equals("")){
            JOptionPane.showMessageDialog(this,"Debe de ingresar el nombre");
            return;
        }
        String apellidos =txtApellidos.getText();
        if(apellidos.equals("")){
            JOptionPane.showMessageDialog(this,"Debe de ingresar los apellidos");
            return;
        }
        String clave = new String (txtClave.getPassword());
        if(clave.equals("")){
            JOptionPane.showMessageDialog(this,"Debe de ingresar una clave");
            return;
        }
        String confirma = new String (txtConfirma.getPassword());
        if(confirma.equals("")){
            JOptionPane.showMessageDialog(this,"Repita clave");
            return;
        }
        if(!clave.equals(confirma)){
            JOptionPane.showMessageDialog(this,"No son iguales");
            return;
        }
        int idRol;
        if(cmbIDRol.getSelectedIndex() == 0) {
            idRol = 1;

        }else{

            idRol=2;
        }
        miUsuario = new Usuario(
                idUsuario,
                nombre,
                apellidos,
                clave,
                idRol);
        if(misDatos.updateUsuario(miUsuario)){
            JOptionPane.showMessageDialog(this,"Actualizado!");

        }else{
            JOptionPane.showMessageDialog(this,"No actualizado");

        }
        misDatos.cerrarConexion();
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        String idUsuario = txtIDUsuario.getText();
        if(idUsuario.equals("")) {
            JOptionPane.showMessageDialog(this,"Debe ingresar IdUsuario");
            return;
        }
        Datos misDatos = new Datos();
        Usuario miUsuario = misDatos.getUsuario(idUsuario);

        if(miUsuario == null) {
            JOptionPane.showMessageDialog(this,"Usuario no existe");
            misDatos.cerrarConexion();
            return;
        }


        int rta = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de "
                + "borrar el registro");
        if(rta != 0){
            return;
        }
        if(misDatos.deleteUsuario(miUsuario)){
            JOptionPane.showMessageDialog(this,"Registro borrado");
            btnLimpiarActionPerformed(evt);

        }else{
            JOptionPane.showMessageDialog(this,"Registro no borrado");

        }
        misDatos.cerrarConexion();
    }





    // Variables declaration - do not modify
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbIDRol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JPasswordField txtConfirma;
    private javax.swing.JButton txtConsultar;
    private javax.swing.JTextField txtIDUsuario;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration
}
