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
public class Kuis1 extends javax.swing.JFrame {

    /**
     * Creates new form Kuis1
     */
    public Kuis1() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        matpel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nilai = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PENILAIAN SISWA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 20, 240, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NAMA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 100, 60, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ABSEN");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 150, 60, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("MATPEL");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 200, 80, 22);
        jPanel1.add(nama);
        nama.setBounds(180, 100, 330, 26);
        jPanel1.add(absen);
        absen.setBounds(180, 150, 330, 26);
        jPanel1.add(matpel);
        matpel.setBounds(180, 200, 330, 26);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NILAI");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 250, 60, 22);
        jPanel1.add(nilai);
        nilai.setBounds(180, 250, 330, 26);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("PROSES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(260, 310, 120, 40);

        hasil.setColumns(20);
        hasil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 370, 540, 360);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(15, 16, 730, 800);

        setBounds(0, 0, 783, 883);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       try{
       String nm = nama.getText();
       String abs = absen.getText();
       String mp = matpel.getText();
       int n = Integer.valueOf(nilai.getText());
       
       if(n<75){
           hasil.setText("Nama : "+nm+"\nAbsen : "+abs+"\nMata Pelajaran : "+mp+"\nNilai : "+n+"\nKeterangan : TIDAK LULUS");
       }if(n>75){
           hasil.setText("Nama : "+nm+"\nAbsen : "+abs+"\nMata Pelajaran : "+mp+"\nNilai : "+n+"\nKeterangan : LULUS");
       } if(n==100){
           hasil.setText("Nama : "+nm+"\nAbsen : "+abs+"\nMata Pelajaran : "+mp+"\nNilai : "+n+"\nKeterangan : SEMPURNA");
       } if(n>100){
           hasil.setText("Nama : "+nm+"\nAbsen : "+abs+"\nMata Pelajaran : "+mp+"\nNilai : "+n+"\nKeterangan : AMAZING");
       }
    }catch (Exception e){
         JOptionPane.showMessageDialog(null,"Error : "+"Isi inputan dengan lengkap","MESSAGE",
                    JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kuis1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kuis1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JTextArea hasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matpel;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nilai;
    // End of variables declaration//GEN-END:variables
}
