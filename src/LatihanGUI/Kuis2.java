/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

import javax.swing.JOptionPane;

/**
 *
 * @author Aby
 */
public class Kuis2 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis2
     */
    public Kuis2() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hb1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        hb2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hb3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hb4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dsk = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PEMBAYARAN ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 30, 180, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Harga Barang1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 80, 140, 20);
        jPanel1.add(hb1);
        hb1.setBounds(240, 80, 270, 26);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Harga Barang2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 140, 140, 20);
        jPanel1.add(hb2);
        hb2.setBounds(240, 140, 270, 26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Harga Barang3");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 200, 140, 22);
        jPanel1.add(hb3);
        hb3.setBounds(240, 200, 270, 26);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Harga Barang4");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 260, 140, 22);
        jPanel1.add(hb4);
        hb4.setBounds(240, 260, 270, 26);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Diskon");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 320, 70, 22);
        jPanel1.add(dsk);
        dsk.setBounds(240, 316, 70, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("PROSES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(110, 380, 120, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("HAPUS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(280, 380, 120, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 380, 120, 40);

        hasil.setColumns(20);
        hasil.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 440, 570, 240);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("%");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 320, 22, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(15, 16, 720, 720);

        setBounds(0, 0, 769, 807);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        int h1 = Integer.valueOf(hb1.getText());
        int h2 = Integer.valueOf(hb2.getText());
        int h3 = Integer.valueOf(hb3.getText());
        int h4 = Integer.valueOf(hb4.getText());
        double d = Integer.valueOf(dsk.getText());
        double disk = d/100;
        int th = h1+h2+h3+h4;
        double dk = th*disk;
        double tb = th-dk;
        
        hasil.setText("Harga Barang1 = "+h1+"\nHarga Barang2 = "+h2+"\nHarga Barang3 = "+h3+"\nHarga Barang4 = "+h4+
                "\nDiskon = "+d+"%"+"\nTotal Harga = "+th+"\nTotal Bayar = "+tb);
        
        }catch (Exception e){
         JOptionPane.showMessageDialog(null,"Error : "+"Isi inputan dengan lengkap","MESSAGE",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        hb1.setText("");
        hb2.setText("");
        hb3.setText("");
        hb4.setText("");
        dsk.setText("");
        hasil.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dsk;
    private javax.swing.JTextArea hasil;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JTextField hb3;
    private javax.swing.JTextField hb4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
