package com.mycompany.view;

import com.mycompany.dao.DetalleReciboDao;
import com.mycompany.dao.ProductoDao;
import com.mycompany.dao.ReciboDao;
import com.mycompany.dao.TipoProductoDao;
import com.mycompany.entity.DetalleReciboEntity;
import com.mycompany.entity.ProductoEntity;
import com.mycompany.entity.ReciboEntity;
import com.mycompany.entity.TipoProductoEntity;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JJAB
 */
public class ReciboView extends javax.swing.JInternalFrame {

    private TipoProductoDao tpDao = new TipoProductoDao();
    private DefaultTableModel tbl;
    private String precioListo = "";
    private int i = 0;
    private String num = "";
    //
    ReciboEntity reciboE = new ReciboEntity();
    ReciboDao rDao = new ReciboDao();
    //
    private ProductoEntity productoE = new ProductoEntity();
    private ProductoDao pDao = new ProductoDao();
    //
    DetalleReciboEntity detalleRE = new DetalleReciboEntity();
    DetalleReciboDao drDao = new DetalleReciboDao();

    /**
     * Creates new form ReciboView
     */
    public ReciboView() {
        initComponents();
        comboTipoDocumento();
//        crearTabla();
        tbl = (DefaultTableModel) tblProductos.getModel();
        if (SeleccionarProveedorView.datosProveedor != null) {
            lblProveedor.setText(SeleccionarProveedorView.datosProveedor);
        }

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
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        elaboracion = new com.toedter.calendar.JDateChooser();
        caducidad = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        cmbTipoProducto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnSelecionarProveedor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnRecibo = new javax.swing.JButton();
        lblProveedor = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(775, 665));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Precio");

        elaboracion.setDateFormatString("yyyy-MM-dd");

        caducidad.setDateFormatString("yyyy-MM-dd");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel4.setText("Fecha Elaboracion");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel5.setText("Fecha Caducidad");

        btnAgregar.setBackground(new java.awt.Color(0, 0, 255));
        btnAgregar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setText("Tipo Producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbTipoProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(elaboracion, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addGap(113, 113, 113))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(elaboracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbTipoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnSelecionarProveedor.setBackground(new java.awt.Color(0, 0, 255));
        btnSelecionarProveedor.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnSelecionarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarProveedor.setText("Seleccionar Proveedor");
        btnSelecionarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarProveedorActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo Producto", "nombre", "Cantidad", "Elaboracion", "Caducidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(1).setResizable(false);
            tblProductos.getColumnModel().getColumn(2).setResizable(false);
            tblProductos.getColumnModel().getColumn(3).setResizable(false);
            tblProductos.getColumnModel().getColumn(3).setPreferredWidth(30);
            tblProductos.getColumnModel().getColumn(4).setResizable(false);
            tblProductos.getColumnModel().getColumn(5).setResizable(false);
            tblProductos.getColumnModel().getColumn(6).setResizable(false);
            tblProductos.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRecibo.setBackground(new java.awt.Color(0, 153, 0));
        btnRecibo.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        btnRecibo.setForeground(new java.awt.Color(255, 255, 255));
        btnRecibo.setText("Recibo");
        btnRecibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        lblProveedor.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSelecionarProveedor)
                                .addGap(50, 50, 50)
                                .addComponent(lblProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSelecionarProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(lblProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
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

    public void comboTipoDocumento() {

        ArrayList<TipoProductoEntity> listaTD = tpDao.mostrarTipoProducto();

        cmbTipoProducto.removeAllItems();

        for (int i = 0; i < tpDao.mostrarTipoProducto().size(); i++) {
            int id = listaTD.get(i).getIdtipoproducto();
            String tipoP = listaTD.get(i).getTipoproducto();
            cmbTipoProducto.addItem(new TipoProductoEntity(id, tipoP));
        }

    }

    public void limpiar() {
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        elaboracion.setCalendar(null);
        caducidad.setCalendar(null);
        i = 0;
        txtPrecio.setText("");
        num = "";
    }


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (lblProveedor.getText().length() > 0) {

            if (!txtNombre.getText().trim().isEmpty() && !txtCantidad.getText().trim().isEmpty() && !txtPrecio.getText().trim().isEmpty() && elaboracion.getDate() != null && caducidad.getDate() != null) {

                Object fila[] = new Object[7];
                fila[0] = crearCodigoProducto();
                fila[1] = cmbTipoProducto.getSelectedItem().toString();
                fila[2] = txtNombre.getText();
                fila[3] = txtCantidad.getText();
                fila[4] = ((JTextField) elaboracion.getDateEditor().getUiComponent()).getText();
                fila[5] = ((JTextField) caducidad.getDateEditor().getUiComponent()).getText();
                fila[6] = txtPrecio.getText();

                tbl.addRow(fila);

//                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados", "Campos obligatorios", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione primero un proveedor", "", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSelecionarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarProveedorActionPerformed

        JefeBodegaPrincipalView.dkpPrincipal.removeAll();
        JefeBodegaPrincipalView.dkpPrincipal.repaint();

        SeleccionarProveedorView seleccionarP = new SeleccionarProveedorView();
        seleccionarP.setVisible(true);

        JefeBodegaPrincipalView.dkpPrincipal.add(seleccionarP);
    }//GEN-LAST:event_btnSelecionarProveedorActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped

        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (numeros) {
            evt.consume();
            if (i <= 7) {
                num = num + String.valueOf(evt.getKeyChar());
                txtPrecio.setText(num);
                ayudaPrecio(num);
                i++;
            }
            if (i == 7) {
                i = 0;
                txtPrecio.setText("");
                num = "";
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Precio excedido - 10.000", "Campo precio", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed

        if (evt.getKeyCode() == evt.VK_BACK_SPACE) {
            evt.consume();
            i = 0;
            txtPrecio.setText("");
            num = "";
            Toolkit.getDefaultToolkit().beep();
        }
        if (evt.getKeyCode() == evt.VK_LEFT || evt.getKeyCode() == evt.VK_RIGHT) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed

        try {
            int numeros = Integer.parseInt(txtCantidad.getText());
            if (txtCantidad.getText().length() <= 5) {
                if (numeros >= 10000) {
                    JOptionPane.showMessageDialog(null, "Precio excedido cantidad menor a 100.000", "Campo precio", JOptionPane.INFORMATION_MESSAGE);
                    txtCantidad.setText("");
                }
            } else {
                txtCantidad.setText("");
            }

        } catch (Exception e) {
            System.out.println("e" + e);
        }

    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped

        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblProductos.getSelectedRow();
        if (fila != -1) {
            tbl.removeRow(fila);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Tabla", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnReciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciboActionPerformed

        if (!lblProveedor.getText().isEmpty()) {

            guardarRecibo();
            guardarProductos();
            detalleRecibo();

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione primero un proveedor", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnReciboActionPerformed

    private Random r = new Random();
    int codRecibo = crearCodigoReciboUnico();

    public int crearCodigoReciboUnico() {

        Random r = new Random();
        int cru = r.nextInt(10000, 100000);

        ArrayList<String> arr = rDao.buscarCodigoProducto();

        while (arr.contains(cru + "")) {

            cru = r.nextInt(10000, 100000);
            if (!arr.contains(cru + "")) {
                break;
            }

        }

        return cru;

    }

//    String ccP = crearCodigoProducto();
    public String crearCodigoProducto() {
        //UPC-A
        Random ran = new Random();

        String idTipoProducto = (1 + cmbTipoProducto.getSelectedIndex()) + "";
        String codProducto = ran.nextInt(10000, 100000) + "";
        String idTipoProveedor = SeleccionarProveedorView.idproveedor;

        return idTipoProducto + "" + codProducto + "" + codRecibo + "" + idTipoProveedor;
    }

    public void guardarRecibo() {

        long miliseconds = System.currentTimeMillis();
        Date date = new Date(miliseconds);
        System.out.println("date " + date);

        reciboE.setcodigoRecibo(codRecibo + "");
        reciboE.setFechaRecibo(date);
        reciboE.setProveedor_idproveedor(Integer.parseInt(SeleccionarProveedorView.idproveedor));
        reciboE.setEmpleado_idempleado(LoginView.listaE.get(0).getIdempleado());
        rDao.guardarRecibo(reciboE);
    }

    public void guardarProductos() {
        for (int i = 0; i < tbl.getRowCount(); i++) {

            productoE.setCodigo(tbl.getValueAt(i, 0).toString());//codigo
            productoE.setIdTipoProducto(idTipoProductoCombo(tbl.getValueAt(i, 1)));//idtipoproducto
            productoE.setNombre(tbl.getValueAt(i, 2).toString());//nombre
            productoE.setCantidad(Integer.parseInt(tbl.getValueAt(i, 3).toString()));//cantidad
            productoE.setFechaElaboracion((Date.valueOf((String) tbl.getValueAt(i, 4))));//fechaelabarion
            productoE.setFechaCaducidad((Date.valueOf((String) tbl.getValueAt(i, 5))));//fechacaducidad
            productoE.setPrecio(Double.parseDouble(tbl.getValueAt(i, 6).toString()));//precio

            arr.add(tbl.getValueAt(i, 0).toString());

            //guardar todos los productos
            pDao.agregarProducto(productoE);
        }
    }
    ArrayList<String> arr = new ArrayList<String>();

    public void detalleRecibo() {

        for (int j = 0; j < arr.size(); j++) {

            detalleRE.setProductoIdProducto(pDao.obtenerIdProducto(arr.get(j)));
            System.out.println("obtenerIdProducto" + pDao.obtenerIdProducto("" + arr.get(j)));
            detalleRE.setReciboIdRecibo(rDao.obtenerIdRecibo(codRecibo + ""));

            //guardar detalle detalle recibo
            drDao.guardarDetalleRecibo(detalleRE);

        }

    }

    public int idTipoProductoCombo(Object columna) {
        int id = 0;
        String tipoP = columna.toString();
        if (tipoP.equals("bebidas")) {
            id = 1;
        }
        if (tipoP.equals("Licores")) {
            id = 2;
        }
        if (tipoP.equals("frutas verduras")) {
            id = 3;
        }
        if (tipoP.equals("enlatados")) {
            id = 4;
        }
        if (tipoP.equals("carnes")) {
            id = 5;
        }
        if (tipoP.equals("embutidos")) {
            id = 6;
        }
        if (tipoP.equals("dulces")) {
            id = 7;
        }
        return id;
    }

    public void ayudaPrecio(String precio) {

        if (precio.length() == 1) {
            precioListo = "00.0" + precio + "";
        }
        if (precio.length() == 2) {
            precioListo = "00." + precio + "";
        }
        if (precio.length() == 3) {
            String cortea = precio.substring(0, 1);
            String corteab = precio.substring(1, 3);
            precioListo = "0" + cortea + "." + corteab;
        }
        if (precio.length() == 4) {
            String cortea = precio.substring(0, 2);
            String corteab = precio.substring(2, 4);
            precioListo = cortea + "." + corteab;
        }
        if (precio.length() == 5) {
            String cortea = precio.substring(0, 3);
            String corteab = precio.substring(3, 5);
            precioListo = cortea + "." + corteab;
        }
        if (precio.length() == 6) {
            String cortea = precio.substring(0, 4);
            String corteab = precio.substring(4, 6);
            precioListo = cortea + "." + corteab;
        }
        txtPrecio.setText(precioListo);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRecibo;
    private javax.swing.JButton btnSelecionarProveedor;
    private com.toedter.calendar.JDateChooser caducidad;
    private javax.swing.JComboBox<TipoProductoEntity> cmbTipoProducto;
    private com.toedter.calendar.JDateChooser elaboracion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProveedor;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
