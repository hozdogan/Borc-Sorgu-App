/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import static java.lang.Thread.*;
import net.proteanit.sql.DbUtils;



public class Anasayfa extends javax.swing.JFrame {

    Connection con;
    public Anasayfa() 
    {
        initComponents();
        Image img = new ImageIcon(this.getClass().getResource("img/profil.png")).getImage();
        _adminimg.setIcon(new ImageIcon(img));
        Image img1 = new ImageIcon(this.getClass().getResource("img/bananas-icon.png")).getImage();
        _banana.setIcon(new ImageIcon(img1));
        loadclock();
        connectdb();
       
    }
    public void connectdb() 
    {
        
        try
        {
            con=DriverManager.getConnection("jdbc:sqlite:D:\\borc.db");
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Veritabanına Bağlanılamadı");
        }
        
    }
    
    public void loadclock()
    {
        Thread clk = new Thread()
        {
            public void run()//süreci oluşturduk bu da sürec kosarken yapacaklarıdır
            {
                try
                {
                 while(true)
                 {
                    Calendar cal = new GregorianCalendar();
                    
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    int month=cal.get(Calendar.MONTH);//ay index 0 dan baslar 1 ay ileri al
                    int year=cal.get(Calendar.YEAR);
        
                    int second=cal.get(Calendar.SECOND);
                    int minute=cal.get(Calendar.MINUTE);
                    int hourofday = cal.get(Calendar.HOUR_OF_DAY);
                    
                    
                    jLabel2.setText("Tarih:"+day+"/"+(month+1)+"/"+year);
                    jLabel3.setText("Saat:"+hourofday+":"+minute+":"+second);
                    sleep(1000);//ms cinsinden 1 sn uyu tekrar çalıştır bu sefer hep saati alır verir sana
                    
                 }  
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
            
        };
        clk.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        _adminimg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        _banana = new javax.swing.JLabel();
        _info = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        _kayitad = new javax.swing.JLabel();
        _kayitsoyad = new javax.swing.JLabel();
        _kayitmiktar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        kayitexad = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        kayitexsoy = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        kayitexmiktar = new javax.swing.JTextPane();
        btnyenikayit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        _girisad = new javax.swing.JLabel();
        _girissoyad = new javax.swing.JLabel();
        _girismiktar = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        giristexad = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        giristexsoyad = new javax.swing.JTextPane();
        btngiris = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        giristexmiktar = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        _sorguad = new javax.swing.JLabel();
        _sorgusoy = new javax.swing.JLabel();
        btnsorgu = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        sorgutexad = new javax.swing.JTextPane();
        sorgutexsoyad = new javax.swing.JScrollPane();
        jTextPane8 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btntumkayit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        _silad = new javax.swing.JLabel();
        _silsoyad = new javax.swing.JLabel();
        _silmiktar = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        siltexad = new javax.swing.JTextPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        siltexsoyad = new javax.swing.JTextPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        siltexmiktar = new javax.swing.JTextPane();
        cboxsifirla = new javax.swing.JCheckBox();
        btnsil = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnkytsil = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        kytsilad = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        kytsilsoyad = new javax.swing.JTextPane();

        jTextField1.setText("jTextField1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("İnteraktif Borç Sorgulama Anasayfa");
        setResizable(false);

        _adminimg.setText("kullaniciimage");

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setBackground(new java.awt.Color(51, 204, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("jLabel3");

        _banana.setText("banana ");

        _info.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Unvan:Patron");

        jTabbedPane2.setBackground(new java.awt.Color(102, 204, 255));
        jTabbedPane2.setForeground(new java.awt.Color(51, 0, 51));
        jTabbedPane2.setAlignmentX(3.0F);
        jTabbedPane2.setAlignmentY(23.0F);
        jTabbedPane2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jTabbedPane2.setInheritsPopupMenu(true);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        _kayitad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        _kayitad.setText("Müşteri Adı:");

        _kayitsoyad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        _kayitsoyad.setText("Müşteri Soyadı:");

        _kayitmiktar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        _kayitmiktar.setText("Borç Miktarı:");

        kayitexad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(kayitexad);

        kayitexsoy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(kayitexsoy);

        kayitexmiktar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(kayitexmiktar);

        btnyenikayit.setBackground(new java.awt.Color(255, 255, 0));
        btnyenikayit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnyenikayit.setText("Onayla");
        btnyenikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyenikayitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_kayitad)
                    .addComponent(_kayitsoyad)
                    .addComponent(_kayitmiktar))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btnyenikayit, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_kayitad)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnyenikayit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_kayitsoyad))))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_kayitmiktar)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Yeni Kayıt", jPanel1);

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        _girisad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        _girisad.setText("Müşteri Adı:");

        _girissoyad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        _girissoyad.setText("Müşteri Soyadı:");

        _girismiktar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        _girismiktar.setText("Eklenen Borç Miktarı:");

        giristexad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane4.setViewportView(giristexad);

        giristexsoyad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane5.setViewportView(giristexsoyad);

        btngiris.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btngiris.setForeground(new java.awt.Color(255, 51, 102));
        btngiris.setText("Onayla");
        btngiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngirisActionPerformed(evt);
            }
        });

        giristexmiktar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane13.setViewportView(giristexmiktar);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_girisad)
                            .addComponent(_girissoyad)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(_girismiktar)))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(btngiris)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_girisad)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_girissoyad)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btngiris)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(_girismiktar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Borç Girişi", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 204, 255));

        _sorguad.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        _sorguad.setText("Müşteri Adı:");

        _sorgusoy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        _sorgusoy.setText("Müşteri Soyadı:");

        btnsorgu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnsorgu.setForeground(new java.awt.Color(255, 0, 0));
        btnsorgu.setText("Sorgula");
        btnsorgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsorguActionPerformed(evt);
            }
        });

        sorgutexad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane8.setViewportView(sorgutexad);

        jTextPane8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sorgutexsoyad.setViewportView(jTextPane8);

        jTable2.setBackground(new java.awt.Color(255, 255, 102));
        jTable2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable2);

        btntumkayit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btntumkayit.setForeground(new java.awt.Color(255, 0, 0));
        btntumkayit.setText("Tüm Kayıtlar");
        btntumkayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntumkayitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(_sorguad))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(_sorgusoy)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(sorgutexsoyad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 264, Short.MAX_VALUE)
                        .addComponent(btnsorgu)
                        .addGap(79, 79, 79)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btntumkayit)
                .addGap(176, 176, 176))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_sorguad)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_sorgusoy)
                    .addComponent(sorgutexsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(btnsorgu)
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btntumkayit)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Borç Sorgula", jPanel4);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        _silad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        _silad.setText("Müşteri Adı:");

        _silsoyad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        _silsoyad.setText("Müşteri Soyadı:");

        _silmiktar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        _silmiktar.setText("Miktar:");

        siltexad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane10.setViewportView(siltexad);

        siltexsoyad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane11.setViewportView(siltexsoyad);

        siltexmiktar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane12.setViewportView(siltexmiktar);

        cboxsifirla.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cboxsifirla.setText("Borcu Sıfırla");

        btnsil.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnsil.setText("Onayla");
        btnsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_silad)
                            .addComponent(_silsoyad)
                            .addComponent(_silmiktar))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(jScrollPane11)
                            .addComponent(jScrollPane12)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(cboxsifirla)
                        .addGap(84, 84, 84)
                        .addComponent(btnsil)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(_silad)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(_silsoyad)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(_silmiktar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxsifirla)
                    .addComponent(btnsil))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Borç Silme", jPanel2);

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Müşteri Adı:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Müşteri Soyadı:");

        btnkytsil.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnkytsil.setForeground(new java.awt.Color(255, 0, 0));
        btnkytsil.setText("Onayla");
        btnkytsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkytsilActionPerformed(evt);
            }
        });

        jScrollPane7.setViewportView(kytsilad);

        jScrollPane9.setViewportView(kytsilsoyad);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane9))
                .addContainerGap(337, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnkytsil)
                .addGap(426, 426, 426))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnkytsil)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Kayıt Sil", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(_adminimg, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_banana, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(_info, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(_adminimg, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(_info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(_banana, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnyenikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyenikayitActionPerformed
        String kayittime;
        String islem;
        String query="insert into borclular (isim,soyisim,borcmiktari,islemtar,sonislem) values(?,?,?,?,?)";
        try
        {
            PreparedStatement stm = con.prepareStatement(query);
            Calendar cl = new GregorianCalendar();
            
            int day=cl.get(Calendar.DAY_OF_MONTH);
            int month=cl.get(Calendar.MONTH);//ay index 0 dan baslar 1 ay ileri al
            int year=cl.get(Calendar.YEAR);
        
            int second=cl.get(Calendar.SECOND);
            int minute=cl.get(Calendar.MINUTE);
            int hourofday = cl.get(Calendar.HOUR_OF_DAY);
            
            kayittime=day+"."+month+"."+year+"  "+hourofday+":"+minute+":"+second;
            islem=kayitexmiktar.getText()+" "+"Lira Eklendi";
            stm.setString(1, kayitexad.getText());
            stm.setString(2, kayitexsoy.getText());
            stm.setString(3, kayitexmiktar.getText());
            stm.setString(4, kayittime);
            stm.setString(5, islem);
            
            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Kayıt Oluşturuldu.");
            kayitexad.setText(null);
            kayitexsoy.setText(null);
            kayitexmiktar.setText(null);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
                
                    
                
        
    }//GEN-LAST:event_btnyenikayitActionPerformed

    private void btngirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngirisActionPerformed
        String kayittime;
        String islem,yenibakiye;
        Integer miktar=0,eklenen,isfind=0;
        
        
        String query="update borclular set borcmiktari=?,islemtar=?,sonislem=? where isim=? and soyisim=?";
        String ilkmiktarquery ="select * from borclular where isim=? and soyisim=?";
        try
        {
            PreparedStatement stm = con.prepareStatement(query);
            PreparedStatement stm2 = con.prepareStatement(ilkmiktarquery);
           
            eklenen=Integer.parseInt(giristexmiktar.getText());//alinan sayiyi inte cevirdi bide bu kişinin veritabanındaki borcunu öğrenip toplayıp tekrar stringe çevirecez
            stm2.setString(1, giristexad.getText());
            stm2.setString(2, giristexsoyad.getText());
            
            ResultSet rs = stm2.executeQuery();
            while(rs.next())
            {
                miktar=rs.getInt("borcmiktari");
                isfind++;
            }
            
            if(isfind==1)
            {
                yenibakiye=String.valueOf(miktar+eklenen);
                Calendar cl = new GregorianCalendar();
                int day=cl.get(Calendar.DAY_OF_MONTH);
                int month=cl.get(Calendar.MONTH);//ay index 0 dan baslar 1 ay ileri al
                int year=cl.get(Calendar.YEAR);
                int second=cl.get(Calendar.SECOND);
                int minute=cl.get(Calendar.MINUTE);
                int hourofday = cl.get(Calendar.HOUR_OF_DAY);
                int hour=cl.get(Calendar.HOUR);
                kayittime=day+"."+month+"."+year+"  "+hourofday+":"+minute+":"+second;
                islem=giristexmiktar.getText()+" "+"TL Eklendi";
                stm.setString(1,yenibakiye );
                stm.setString(2, kayittime);
                stm.setString(3, islem);
                stm.setString(4, giristexad.getText());
                stm.setString(5, giristexsoyad.getText());
            
                stm.execute();
            
  
                stm.close();
                stm2.close();
                rs.close();
            
                JOptionPane.showMessageDialog(null, "Kayıt Düzenlendi.");
                //bugs fixed
                giristexad.setText(null);
                giristexsoyad.setText(null);
                giristexmiktar.setText(null);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Kayıt Bulunamadı");
                giristexad.setText(null);
                giristexsoyad.setText(null);
                giristexmiktar.setText(null);
            }
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
                
    }//GEN-LAST:event_btngirisActionPerformed

    private void btnsorguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsorguActionPerformed
       String query="select * from borclular where isim=? and soyisim=?";
       try
       {
           PreparedStatement st = con.prepareStatement(query);
           st.setString(1, sorgutexad.getText());
           st.setString(2, jTextPane8.getText());
           ResultSet rs = st.executeQuery();
           
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
           sorgutexad.setText(null);
           jTextPane8.setText(null);
           st.close();
           rs.close();
           
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }//GEN-LAST:event_btnsorguActionPerformed

    private void btntumkayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntumkayitActionPerformed
         String query="select * from borclular";
       try
       {
           PreparedStatement st = con.prepareStatement(query);
           ResultSet rs = st.executeQuery();
           
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
               
           st.close();
           rs.close();
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
    }//GEN-LAST:event_btntumkayitActionPerformed

    private void btnsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsilActionPerformed
       String q1="select * from borclular where isim=? and soyisim=?";
       String q2 = "update borclular set borcmiktari=?,islemtar=?,sonislem=? where isim=? and soyisim=?";
       Integer miktar=0,ödenen,borc,action=JOptionPane.showConfirmDialog(null, "Silmek İstiyor musunuz?", "Uyarı",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);;
       String kayittime,islem;
       
       try
       {
           PreparedStatement st1 = con.prepareStatement(q1);
           PreparedStatement st2 = con.prepareStatement(q2);
           
           if(action==0)
           {
                Calendar cl = new GregorianCalendar();
                int day=cl.get(Calendar.DAY_OF_MONTH);
                int month=cl.get(Calendar.MONTH);//ay index 0 dan baslar 1 ay ileri al
                int year=cl.get(Calendar.YEAR);
                int second=cl.get(Calendar.SECOND);
                int minute=cl.get(Calendar.MINUTE);
                int hourofday = cl.get(Calendar.HOUR_OF_DAY);
                
                kayittime=day+"."+month+"."+year+"  "+hourofday+":"+minute+":"+second;
                islem=siltexmiktar.getText()+" "+"TL Ödendi";
           
                st1.setString(1, siltexad.getText());
                st1.setString(2,siltexsoyad.getText());
                ResultSet rs = st1.executeQuery();
                while(rs.next())
                {
               miktar=Integer.parseInt(rs.getString("borcmiktari"));
                }
                rs.close();
                st1.close();
                if(miktar==0)
                {
                   st2.close();
                   JOptionPane.showMessageDialog(null, "Bu kişinin Borcu Yoktur.");
                }
           
                if(cboxsifirla.isSelected())
                {
                    ödenen=miktar;
                    islem="Borç Sıfırlandı";
                }
                else 
                {
                    ödenen=Integer.parseInt(siltexmiktar.getText());
                }
                if(miktar>0&&ödenen>miktar)
                {
                     JOptionPane.showMessageDialog(null, "Kişi Borcundan Fazla Ödeyemez");
                    st2.close();
                }
           
                st2.setString(1, String.valueOf(miktar-ödenen));
                st2.setString(2, kayittime);
                st2.setString(3, islem);
                st2.setString(4, siltexad.getText());
                st2.setString(5, siltexsoyad.getText());
                st2.execute();
                st2.close();
                JOptionPane.showMessageDialog(null, "Kayıt Düzenlendi");
                siltexad.setText(null);
                siltexsoyad.setText(null);
                siltexmiktar.setText(null);
            }
       }
       catch(Exception e)
       {
           e.printStackTrace();
           
       }
       
       
    }//GEN-LAST:event_btnsilActionPerformed

    private void btnkytsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkytsilActionPerformed
        String query ="delete from borclular where isim=? and soyisim=?";
        int action=JOptionPane.showConfirmDialog(null, "Silmek İstiyor musunuz?", "Uyarı",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        try
        {
            PreparedStatement st = con.prepareStatement(query);
            if(action==0)
            {
                st.setString(1, kytsilad.getText());
                st.setString(2, kytsilsoyad.getText());
                st.execute();
            }
            st.close();
            JOptionPane.showMessageDialog(null, "Kayıt Silindi.");
            kytsilad.setText(null);
            kytsilsoyad.setText(null);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnkytsilActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel _adminimg;
    protected javax.swing.JLabel _banana;
    protected javax.swing.JLabel _girisad;
    protected javax.swing.JLabel _girismiktar;
    protected javax.swing.JLabel _girissoyad;
    protected javax.swing.JLabel _info;
    protected javax.swing.JLabel _kayitad;
    protected javax.swing.JLabel _kayitmiktar;
    protected javax.swing.JLabel _kayitsoyad;
    protected javax.swing.JLabel _silad;
    protected javax.swing.JLabel _silmiktar;
    protected javax.swing.JLabel _silsoyad;
    protected javax.swing.JLabel _sorguad;
    protected javax.swing.JLabel _sorgusoy;
    protected javax.swing.JButton btngiris;
    protected javax.swing.JButton btnkytsil;
    protected javax.swing.JButton btnsil;
    protected javax.swing.JButton btnsorgu;
    protected javax.swing.JButton btntumkayit;
    protected javax.swing.JButton btnyenikayit;
    protected javax.swing.JCheckBox cboxsifirla;
    protected javax.swing.JTextPane giristexad;
    protected javax.swing.JTextPane giristexmiktar;
    protected javax.swing.JTextPane giristexsoyad;
    protected javax.swing.JLabel jLabel1;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabel4;
    protected javax.swing.JLabel jLabel5;
    protected javax.swing.JLabel jLabel6;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    protected javax.swing.JPanel jPanel4;
    protected javax.swing.JPanel jPanel5;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JScrollPane jScrollPane10;
    protected javax.swing.JScrollPane jScrollPane11;
    protected javax.swing.JScrollPane jScrollPane12;
    protected javax.swing.JScrollPane jScrollPane13;
    protected javax.swing.JScrollPane jScrollPane2;
    protected javax.swing.JScrollPane jScrollPane3;
    protected javax.swing.JScrollPane jScrollPane4;
    protected javax.swing.JScrollPane jScrollPane5;
    protected javax.swing.JScrollPane jScrollPane6;
    protected javax.swing.JScrollPane jScrollPane7;
    protected javax.swing.JScrollPane jScrollPane8;
    protected javax.swing.JScrollPane jScrollPane9;
    protected javax.swing.JTabbedPane jTabbedPane2;
    protected javax.swing.JTable jTable2;
    protected javax.swing.JTextField jTextField1;
    protected javax.swing.JTextPane jTextPane8;
    protected javax.swing.JTextPane kayitexad;
    protected javax.swing.JTextPane kayitexmiktar;
    protected javax.swing.JTextPane kayitexsoy;
    protected javax.swing.JTextPane kytsilad;
    protected javax.swing.JTextPane kytsilsoyad;
    protected javax.swing.JTextPane siltexad;
    protected javax.swing.JTextPane siltexmiktar;
    protected javax.swing.JTextPane siltexsoyad;
    protected javax.swing.JTextPane sorgutexad;
    protected javax.swing.JScrollPane sorgutexsoyad;
    // End of variables declaration//GEN-END:variables
}
