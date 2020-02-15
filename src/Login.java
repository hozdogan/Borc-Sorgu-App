/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Login extends javax.swing.JFrame {
    
    Connection conn;
    public Login() {
        initComponents();
        Image img1 = new ImageIcon(this.getClass().getResource("img/cash-icon.png")).getImage();
        _giris1.setIcon(new ImageIcon(img1));
        Image img2 = new ImageIcon(this.getClass().getResource("img/store-icon.png")).getImage();
        _giris2.setIcon(new ImageIcon(img2));
        Image img3 = new ImageIcon(this.getClass().getResource("img/onay-icon.png")).getImage();
        jButton1.setIcon(new ImageIcon(img3));
        connectdb();
        
    }
    public void connectdb()
    {
        try
        {
             conn = DriverManager.getConnection("jdbc:sqlite:D:\\borc.db");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Veritabanına Bağlanılamadı");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        _giris1 = new javax.swing.JLabel();
        _giris2 = new javax.swing.JLabel();
        _login = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("İnteraktif Borç Sorgulama Giriş Ekranı");
        setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        setResizable(false);

        _giris1.setText("girislogo");

        _giris2.setText("storelogo");

        _login.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        _login.setText("OTURUM AÇ");

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("GİRİŞ YAP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Kullanıcı Adı:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Parola:");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(128, 128, 128))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(_giris1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(_login, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(_giris2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(_giris2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_giris1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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

        getAccessibleContext().setAccessibleName("ass");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int isfind=0;
        String texx=jTextField1.getText();
        try
        {
            
            String query="select * from admin where kullanici=? and parola=?";//bi sınıf yardımı ile ? işaretleri yerine alınan stringleri işleyeceğiz //bu veritabanının nesnesini sorgusu diye veriyoruz hazırlanmış ifade sınıfına ifadeyi hazırla methodu ile sorguyu veriyoruz
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, jTextField1.getText());//ifade yi hazırlıyoruz veriyoruz o da ? yerlerine 0 ve 1 sırayla alttaki methodlarla yerleştiriyor istediklerimizi
            stmt.setString(2, jPasswordField1.getText());//result set sınıfı sonuç belirleme sınıfı ona göre sorgu yanıt bulacak
            ResultSet rst = stmt.executeQuery(); //satır satır ilerler sorguyu arar yanlış dönerse ilerler doğru dönerse buldu demektir.=rst.next()
               //1 kere calisinca yanlış veriyor else dusuyor sorguyu her satırda yapması için while içine alacaz
            while(rst.next())
            {
                isfind++;
            }
            if(isfind==1)
            {
                JOptionPane.showMessageDialog(null, "Sisteme Hosgeldiniz"+"\n"+jTextField1.getText().toUpperCase());
                Anasayfa f2 = new Anasayfa(); 
                f2._info.setText("Kullanıcı Adı:"+texx.toUpperCase());//protected yaptık sınıflar arası eriştik o forma o kullanıcıyı yazdık
                f2.setVisible(true);
                jTextField1.setText(null);
                jPasswordField1.setText(null);
                       
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Kullanıcı veya Parola Hatalı Tekrar Deneyiniz");
                jTextField1.setText(null);
                jPasswordField1.setText(null);
            }
            rst.close();
            stmt.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
           int isfind=0;
        String texx=jTextField1.getText();
        try
        {
            
            String query="select * from admin where kullanici=? and parola=?";//bi sınıf yardımı ile ? işaretleri yerine alınan stringleri işleyeceğiz //bu veritabanının nesnesini sorgusu diye veriyoruz hazırlanmış ifade sınıfına ifadeyi hazırla methodu ile sorguyu veriyoruz
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, jTextField1.getText());//ifade yi hazırlıyoruz veriyoruz o da ? yerlerine 0 ve 1 sırayla alttaki methodlarla yerleştiriyor istediklerimizi
            stmt.setString(2, jPasswordField1.getText());//result set sınıfı sonuç belirleme sınıfı ona göre sorgu yanıt bulacak
            ResultSet rst = stmt.executeQuery(); //satır satır ilerler sorguyu arar yanlış dönerse ilerler doğru dönerse buldu demektir.=rst.next()
               //1 kere calisinca yanlış veriyor else dusuyor sorguyu her satırda yapması için while içine alacaz
            while(rst.next())
            {
                isfind++;
            }
            if(isfind==1)
            {
                JOptionPane.showMessageDialog(null, "Sisteme Hosgeldiniz"+"\n"+jTextField1.getText().toUpperCase());
                Anasayfa f2 = new Anasayfa(); 
                f2._info.setText("Kullanıcı Adı:"+texx.toUpperCase());//protected yaptık sınıflar arası eriştik o forma o kullanıcıyı yazdık
                f2.setVisible(true);
                jTextField1.setText(null);
                jPasswordField1.setText(null);
                       
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Kullanıcı veya Parola Hatalı Tekrar Deneyiniz");
                jTextField1.setText(null);
                jPasswordField1.setText(null);
            }
            rst.close();
            stmt.close();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel _giris1;
    protected javax.swing.JLabel _giris2;
    protected javax.swing.JLabel _login;
    protected javax.swing.JButton jButton1;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    protected javax.swing.JPasswordField jPasswordField1;
    protected javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
