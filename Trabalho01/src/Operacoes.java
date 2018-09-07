
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
public class Operacoes extends javax.swing.JFrame {

    /**
     * Creates new form Operacoes
     */
    public Operacoes() {
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

        sacar = new javax.swing.JButton();
        depositar = new javax.swing.JButton();
        transferir = new javax.swing.JButton();
        reajustar = new javax.swing.JButton();
        saldos = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Operações");

        sacar.setText("Sacar");
        sacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarActionPerformed(evt);
            }
        });
        sacar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sacarKeyPressed(evt);
            }
        });

        depositar.setText("Depositar");
        depositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarActionPerformed(evt);
            }
        });

        transferir.setText("Transferir");
        transferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirActionPerformed(evt);
            }
        });

        reajustar.setText("Reajustar");
        reajustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reajustarActionPerformed(evt);
            }
        });

        saldos.setText("Ver Saldos");
        saldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldosActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(saldos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(depositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sacar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reajustar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sacar)
                    .addComponent(transferir))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reajustar)
                    .addComponent(depositar))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldos)
                    .addComponent(sair))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void saldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldosActionPerformed
        JOptionPane.showMessageDialog(null, "Titular: "+ GabrielBancoPrincipal.conta.getNome() + "\n"
                                          + "numero: "+ GabrielBancoPrincipal.conta.getNumero() +"\n"
                                          +"Conta Comum: " + GabrielBancoPrincipal.conta.getSaldo() + "\n\n"
                
                                          + "Titular: "+ CriarContaPoupanca.contaPoup.getNome() + "\n"
                                          + "numero: "+ CriarContaPoupanca.contaPoup.getNumero() +"\n"
                                          + "Conta Poupança: " + CriarContaPoupanca.contaPoup.getSaldo() + "\n\n"
                
                                          + "Titular: "+ CriarContaEspecial.contaEsp.getNome() + "\n"
                                          + "numero: "+ CriarContaEspecial.contaEsp.getNumero() +"\n"
                                          + "Conta Especial: " + CriarContaEspecial.contaEsp.getSaldo());
    }//GEN-LAST:event_saldosActionPerformed

    private void sacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarActionPerformed
        new Sacar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sacarActionPerformed

    private void depositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarActionPerformed
        new Depositar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depositarActionPerformed

    private void transferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirActionPerformed
        new Transferir().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_transferirActionPerformed

    private void reajustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reajustarActionPerformed
        new Reajustar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reajustarActionPerformed

    private void sacarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sacarKeyPressed

    }//GEN-LAST:event_sacarKeyPressed

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
            java.util.logging.Logger.getLogger(Operacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositar;
    private javax.swing.JButton reajustar;
    private javax.swing.JButton sacar;
    private javax.swing.JButton sair;
    private javax.swing.JButton saldos;
    private javax.swing.JButton transferir;
    // End of variables declaration//GEN-END:variables
}
