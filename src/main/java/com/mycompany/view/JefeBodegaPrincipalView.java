package com.mycompany.view;

/**
 *
 * @author JJAB
 */
public class JefeBodegaPrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PanelPrincipalView
     */
    public JefeBodegaPrincipalView() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPanelMenuPrincipal = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        dkpPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panPanelMenuPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panPanelMenuPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panPanelMenuPrincipal.setPreferredSize(new java.awt.Dimension(97, 665));

        btnAgregar.setBackground(new java.awt.Color(94, 202, 242));
        btnAgregar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(94, 202, 242));
        btnSalir.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");

        lblUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout panPanelMenuPrincipalLayout = new javax.swing.GroupLayout(panPanelMenuPrincipal);
        panPanelMenuPrincipal.setLayout(panPanelMenuPrincipalLayout);
        panPanelMenuPrincipalLayout.setHorizontalGroup(
            panPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPanelMenuPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addContainerGap())
        );
        panPanelMenuPrincipalLayout.setVerticalGroup(
            panPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPanelMenuPrincipalLayout.createSequentialGroup()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dkpPrincipal.setBackground(new java.awt.Color(204, 204, 255));
        dkpPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dkpPrincipal.setPreferredSize(new java.awt.Dimension(775, 665));

        javax.swing.GroupLayout dkpPrincipalLayout = new javax.swing.GroupLayout(dkpPrincipal);
        dkpPrincipal.setLayout(dkpPrincipalLayout);
        dkpPrincipalLayout.setHorizontalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        dkpPrincipalLayout.setVerticalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPanelMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dkpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPanelMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dkpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed


    }//GEN-LAST:event_btnAgregarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnSalir;
    public javax.swing.JDesktopPane dkpPrincipal;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JPanel panPanelMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
