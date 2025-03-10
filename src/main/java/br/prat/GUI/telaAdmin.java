package br.prat.GUI;

import br.prat.GUI.AdminManage.dashboardFeedbacks;
import br.prat.GUI.AdminManage.gerenciaFuncoes;
import br.prat.GUI.AdminManage.gerenciaUsuarios;
import br.prat.GUI.AdminManage.tableFeedback;
import br.prat.controller.controller;
import br.prat.entitys.Usuario;

public class telaAdmin extends javax.swing.JFrame {
controller control;
Usuario usr;

    public telaAdmin(controller control, Usuario usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
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
        jLabel1 = new javax.swing.JLabel();
        btnGerenciaUser = new javax.swing.JButton();
        btnTableFeedbck = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnGerenciaFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Tela administrador");

        btnGerenciaUser.setText("gerencia dos usuarios");
        btnGerenciaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciaUserActionPerformed(evt);
            }
        });

        btnTableFeedbck.setText("tabela de feedbacks");
        btnTableFeedbck.setMaximumSize(new java.awt.Dimension(144, 23));
        btnTableFeedbck.setMinimumSize(new java.awt.Dimension(144, 23));
        btnTableFeedbck.setPreferredSize(new java.awt.Dimension(144, 23));
        btnTableFeedbck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableFeedbckActionPerformed(evt);
            }
        });

        btnDashboard.setText("dashboard dos feedbacks");
        btnDashboard.setMaximumSize(new java.awt.Dimension(144, 23));
        btnDashboard.setMinimumSize(new java.awt.Dimension(144, 23));
        btnDashboard.setPreferredSize(new java.awt.Dimension(144, 23));
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        lblNome.setText(".");

        btnLogout.setText("logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnGerenciaFunc.setText("gerencia de funções");
        btnGerenciaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciaFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTableFeedbck, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGerenciaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGerenciaFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNome)
                    .addComponent(btnLogout))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerenciaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerenciaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTableFeedbck, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
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

    private void btnGerenciaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciaUserActionPerformed
        gerenciaUsuarios gerenc = new gerenciaUsuarios(control, usr);
        
        gerenc.setVisible(true);
        gerenc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGerenciaUserActionPerformed

    private void btnTableFeedbckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableFeedbckActionPerformed
        tableFeedback table = new tableFeedback(control, usr);
        
        table.setVisible(true);
        table.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTableFeedbckActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        dashboardFeedbacks dash = new dashboardFeedbacks(control, this);
        
        dash.setVisible(true);
        dash.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        telaLogin inicio = new telaLogin();
        
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblNome.setText(usr.getNome());
    }//GEN-LAST:event_formWindowOpened

    private void btnGerenciaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciaFuncActionPerformed
        gerenciaFuncoes gera = new gerenciaFuncoes(control, this);
        
        gera.setVisible(true);
        gera.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGerenciaFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnGerenciaFunc;
    private javax.swing.JButton btnGerenciaUser;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTableFeedbck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
