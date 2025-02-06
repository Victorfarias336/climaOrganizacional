package br.prat.GUI;

import br.prat.entitys.Usuario;
import javax.swing.JOptionPane;

public class telaFeedback extends javax.swing.JFrame {

    Usuario usr;
    telaLogin inicio;        

    public telaFeedback(Usuario usr) {
        initComponents();
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

        pergunta1 = new javax.swing.ButtonGroup();
        pergunta2 = new javax.swing.ButtonGroup();
        pergunta3 = new javax.swing.ButtonGroup();
        pergunta4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        p2Btn5 = new javax.swing.JRadioButton();
        p3Btn1 = new javax.swing.JRadioButton();
        p3Btn2 = new javax.swing.JRadioButton();
        p3Btn3 = new javax.swing.JRadioButton();
        p3Btn4 = new javax.swing.JRadioButton();
        p3Btn5 = new javax.swing.JRadioButton();
        p4Btn1 = new javax.swing.JRadioButton();
        p4Btn2 = new javax.swing.JRadioButton();
        p4Btn3 = new javax.swing.JRadioButton();
        p4Btn4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOpcional = new javax.swing.JTextArea();
        p4Btn5 = new javax.swing.JRadioButton();
        btnConfirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        p1Btn1 = new javax.swing.JRadioButton();
        btnLogout = new javax.swing.JButton();
        p1Btn2 = new javax.swing.JRadioButton();
        p1Btn3 = new javax.swing.JRadioButton();
        p1Btn4 = new javax.swing.JRadioButton();
        p1Btn5 = new javax.swing.JRadioButton();
        p2Btn1 = new javax.swing.JRadioButton();
        p2Btn2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p2Btn3 = new javax.swing.JRadioButton();
        p2Btn4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pergunta2.add(p2Btn5);
        p2Btn5.setText("5");

        pergunta3.add(p3Btn1);
        p3Btn1.setText("1");

        pergunta3.add(p3Btn2);
        p3Btn2.setText("2");

        pergunta3.add(p3Btn3);
        p3Btn3.setText("3");

        pergunta3.add(p3Btn4);
        p3Btn4.setText("4");

        pergunta3.add(p3Btn5);
        p3Btn5.setText("5");

        pergunta4.add(p4Btn1);
        p4Btn1.setText("1");

        pergunta4.add(p4Btn2);
        p4Btn2.setText("2");

        pergunta4.add(p4Btn3);
        p4Btn3.setText("3");

        pergunta4.add(p4Btn4);
        p4Btn4.setText("4");

        txtOpcional.setColumns(20);
        txtOpcional.setRows(5);
        jScrollPane1.setViewportView(txtOpcional);

        pergunta4.add(p4Btn5);
        p4Btn5.setText("5");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel6.setText("Diga algo que deve melhorar na empresa ou no seu ambiente de trabalho(opcional)");

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText(".");

        pergunta1.add(p1Btn1);
        p1Btn1.setText("1");

        btnLogout.setText("logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        pergunta1.add(p1Btn2);
        p1Btn2.setText("2");

        pergunta1.add(p1Btn3);
        p1Btn3.setText("3");

        pergunta1.add(p1Btn4);
        p1Btn4.setText("4");

        pergunta1.add(p1Btn5);
        p1Btn5.setText("5");

        pergunta2.add(p2Btn1);
        p2Btn1.setText("1");

        pergunta2.add(p2Btn2);
        p2Btn2.setText("2");

        jLabel1.setText("Feedback colaborador");

        jLabel2.setText("Quão satisfeito está com a empresa?");

        jLabel3.setText("Quão satisfeito está com seu setor?");

        jLabel4.setText("Quão satisfeito está com sua liderança?");

        jLabel5.setText("Quão satisfeito está com sua função?");

        pergunta2.add(p2Btn3);
        p2Btn3.setText("3");

        pergunta2.add(p2Btn4);
        p2Btn4.setText("4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(p1Btn1)
                                            .addGap(49, 49, 49)
                                            .addComponent(p1Btn2)
                                            .addGap(49, 49, 49)
                                            .addComponent(p1Btn3))
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(p2Btn1)
                                            .addGap(49, 49, 49)
                                            .addComponent(p2Btn2)
                                            .addGap(49, 49, 49)
                                            .addComponent(p2Btn3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(p3Btn1)
                                            .addGap(49, 49, 49)
                                            .addComponent(p3Btn2)
                                            .addGap(49, 49, 49)
                                            .addComponent(p3Btn3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(p4Btn1)
                                            .addGap(49, 49, 49)
                                            .addComponent(p4Btn2)
                                            .addGap(49, 49, 49)
                                            .addComponent(p4Btn3)))
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(p1Btn4)
                                        .addComponent(p2Btn4)
                                        .addComponent(p3Btn4)
                                        .addComponent(p4Btn4))
                                    .addGap(49, 49, 49)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(p2Btn5)
                                        .addComponent(p1Btn5)
                                        .addComponent(p3Btn5)
                                        .addComponent(p4Btn5)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(410, 410, 410)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnLogout)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNome)
                    .addComponent(btnLogout))
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1Btn1)
                    .addComponent(p1Btn2)
                    .addComponent(p1Btn3)
                    .addComponent(p1Btn4)
                    .addComponent(p1Btn5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p2Btn1)
                    .addComponent(p2Btn2)
                    .addComponent(p2Btn3)
                    .addComponent(p2Btn4)
                    .addComponent(p2Btn5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p3Btn1)
                    .addComponent(p3Btn2)
                    .addComponent(p3Btn3)
                    .addComponent(p3Btn4)
                    .addComponent(p3Btn5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4Btn1)
                    .addComponent(p4Btn2)
                    .addComponent(p4Btn3)
                    .addComponent(p4Btn4)
                    .addComponent(p4Btn5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        selectedButtons();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.lblNome.setText(usr.getNome());
    }//GEN-LAST:event_formWindowOpened

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        inicio = new telaLogin();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JRadioButton p1Btn1;
    private javax.swing.JRadioButton p1Btn2;
    private javax.swing.JRadioButton p1Btn3;
    private javax.swing.JRadioButton p1Btn4;
    private javax.swing.JRadioButton p1Btn5;
    private javax.swing.JRadioButton p2Btn1;
    private javax.swing.JRadioButton p2Btn2;
    private javax.swing.JRadioButton p2Btn3;
    private javax.swing.JRadioButton p2Btn4;
    private javax.swing.JRadioButton p2Btn5;
    private javax.swing.JRadioButton p3Btn1;
    private javax.swing.JRadioButton p3Btn2;
    private javax.swing.JRadioButton p3Btn3;
    private javax.swing.JRadioButton p3Btn4;
    private javax.swing.JRadioButton p3Btn5;
    private javax.swing.JRadioButton p4Btn1;
    private javax.swing.JRadioButton p4Btn2;
    private javax.swing.JRadioButton p4Btn3;
    private javax.swing.JRadioButton p4Btn4;
    private javax.swing.JRadioButton p4Btn5;
    private javax.swing.ButtonGroup pergunta1;
    private javax.swing.ButtonGroup pergunta2;
    private javax.swing.ButtonGroup pergunta3;
    private javax.swing.ButtonGroup pergunta4;
    private javax.swing.JTextArea txtOpcional;
    // End of variables declaration//GEN-END:variables
   
    //armzena os botões selecionados e joga para o tratamento
    private void selectedButtons() {
        //"6" para quando não selecionou nenhum botão
        String ask1
                = p1Btn1.isSelected() ? p1Btn1.getText()
                : p1Btn2.isSelected() ? p1Btn2.getText()
                : p1Btn3.isSelected() ? p1Btn3.getText()
                : p1Btn4.isSelected() ? p1Btn4.getText()
                : p1Btn5.isSelected() ? p1Btn5.getText()
                : "6";

        String ask2
                = p2Btn1.isSelected() ? p2Btn1.getText()
                : p2Btn2.isSelected() ? p2Btn2.getText()
                : p2Btn3.isSelected() ? p2Btn3.getText()
                : p2Btn4.isSelected() ? p2Btn4.getText()
                : p2Btn5.isSelected() ? p2Btn5.getText()
                : "6";

        String ask3
                = p3Btn1.isSelected() ? p3Btn1.getText()
                : p3Btn2.isSelected() ? p3Btn2.getText()
                : p3Btn3.isSelected() ? p3Btn3.getText()
                : p3Btn4.isSelected() ? p3Btn4.getText()
                : p3Btn5.isSelected() ? p3Btn5.getText()
                : "6";

        String ask4
                = p4Btn1.isSelected() ? p4Btn1.getText()
                : p4Btn2.isSelected() ? p4Btn2.getText()
                : p4Btn3.isSelected() ? p4Btn3.getText()
                : p4Btn4.isSelected() ? p4Btn4.getText()
                : p4Btn5.isSelected() ? p4Btn5.getText()
                : "6";

        tratamento(ask1, ask2, ask3, ask4);

    }
    /*pega variaveis do metodo selectedButton e se todas estiverem 
      selecionadas, abre o dialogSalvar*/
    private void tratamento(String ask1, String ask2, String ask3, String ask4) {
        //se for igual 6 dá mensagem para preencher tudo
        if ("6".equals(ask1) || "6".equals(ask2) || "6".equals(ask3) || "6".equals(ask4)) {
            JOptionPane.showMessageDialog(null, "preencha todos os campos");
        } else {
            int perg1 = Integer.parseInt(ask1);
            int perg2 = Integer.parseInt(ask2);
            int perg3 = Integer.parseInt(ask3);
            int perg4 = Integer.parseInt(ask4);
            String aMelhorar = txtOpcional.getText();
            
            dialogSalvar dialog = new dialogSalvar(perg1, perg2, perg3, perg4, aMelhorar, usr, this);
            
            dialog.setVisible(true);
            dialog.setLocationRelativeTo(null);
            
        }
    }
    
}
