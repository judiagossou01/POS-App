/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first;

import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXComboBox;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author PCLand
 */
public class NewJFrame extends javax.swing.JFrame {

   String cashiername;
   double remainstock;
    /**
     * Creates new form NewJFrame
     */
    DefaultTableModel model;
    public NewJFrame() {
        initComponents();
        setIcon();
         dis.setText("0.0");
         jTextField3.setText("0.0");
         jLabel3.setText(cashiername);
        showdate();
        showtime();
        
          model = (DefaultTableModel) jTable1.getModel();
          
          itemcode.requestFocusInWindow();
         // AutoCompleteDecorator.decorate(jComboBox1);
        
    }
    
    public NewJFrame(String name) {
    
   
    initComponents();
    jTextField3.setText("0.0");
        dis.setText("0.0");
         cashiername = name;
        
        jLabel3.setText(cashiername);
        showdate();
        showtime();
        
          model = (DefaultTableModel) jTable1.getModel();
          
         itemcode.requestFocusInWindow();
      //    AutoCompleteDecorator.decorate(jComboBox1);
    
    
    }
    
    
    
    void showdate(){
    
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        label8.setText(s.format(d));
      
        
    
    
    }
    
    
      void showtime(){
    
        new Timer(0,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
          Date d = new Date();
          SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
        label9.setText(s.format(d));
    
                
                
                
            }
        }).start();

    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        label9 = new java.awt.Label();
        label8 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        itemcode = new javax.swing.JTextField();
        itemname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setFocusable(false);

        jTextField1.setEditable(false);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("ADD Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM ID", "ITEM NAME", "ITEM QAUNTITY", "UNIT PRICE", "DISCOUNT", "TOTAL PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jScrollPane1.setViewportView(jTable1);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField3.setFocusable(false);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("REMOVE ITEM");
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("CHECKOUT");
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL");
        jLabel1.setFocusable(false);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CASH", "CARD" }));
        jComboBox2.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAYMENT TYPE");
        jLabel2.setFocusable(false);

        label9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("label9");

        label8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("label8");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        jLabel3.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cashier Name :");
        jLabel4.setFocusable(false);

        itemcode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        itemcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemcodeFocusLost(evt);
            }
        });
        itemcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemcodeKeyPressed(evt);
            }
        });

        itemname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        itemname.setFocusable(false);
        itemname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itemnameFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BILL NO :");
        jLabel5.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ITEM CODE");
        jLabel6.setFocusable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ITEM NAME");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("QUANTITY");
        jLabel8.setFocusable(false);

        dis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disActionPerformed(evt);
            }
        });
        dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                disKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DISCOUNT");
        jLabel9.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6)
                                .addGap(203, 203, 203)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton3)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemname, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(itemcode)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       
      
        

        try {
          //   String kole = jComboBox1.getSelectedItem().toString();
            String kole = itemname.getText();
            double discount = Double.parseDouble(dis.getText());
            //JOptionPane.showMessageDialog(null,discount);
            int ummaekak = Integer.parseInt(jTextField2.getText());
            //  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/photocopy","root","");

            String sql = "SELECT * FROM inventory WHERE Pname = ?";
            PreparedStatement pstmt = connecting.db().prepareStatement(sql);
            pstmt.setString(1,kole);

            ResultSet rs =pstmt.executeQuery();

            while(rs.next()){
                
               
                double matapuluwan = rs.getDouble("soldprice");
                String suraya = rs.getString("PID");
                int  stocks = rs.getInt("Pqauntity");
                
                
                
                if (stocks == 0){
                
                     jTextField2.setText(null);
                      itemname.setText(null);
                      itemcode.setText(null);
                       dis.setText("0.0");
                      JOptionPane.showMessageDialog(null,"out of stock");
                     // jComboBox1.requestFocusInWindow();  
                      itemcode.requestFocusInWindow();
                      break;
                
                }

                // JOptionPane.showMessageDialog(null,"STOCK ID  is " + suraya);

                

                  
                  
                  
                    if (stocks < ummaekak) {
                       
                         jTextField2.setText(null);
                      itemname.setText(null);
                      itemcode.setText(null);
                       dis.setText("0.0");
                      JOptionPane.showMessageDialog(null,"out of range");
                    //  jComboBox1.requestFocusInWindow();
                      itemcode.requestFocusInWindow();
                      

                     }
             
                 
                 

                    if(stocks >= ummaekak){
                     
                    double suratha = (matapuluwan * ummaekak)-discount;
                    double goiyo = Math.round(suratha*100.0)/100.0;
                  
                
              //  double total = (matapuluwan * ummaekak) - discount ;

                    model.insertRow(model.getRowCount(),new Object[]{suraya,kole,ummaekak,matapuluwan,discount,goiyo});

                    double sum = 0;
                    for (int i = 0; i < jTable1.getRowCount(); i++)
                    {
                        sum = sum + Double.parseDouble(jTable1.getValueAt(i,5).toString());

                        String oi = Double.toString(sum);

                        jTextField3.setText(oi);

                    }

                   // jComboBox1.setSelectedItem("");
                    itemname.setText("");
                    jTextField2.setText("");
                    dis.setText("0.0");
                    itemcode.setText(null);
                    itemcode.requestFocusInWindow();

                    }

                

            }

            // conn.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);

            new NewJFrame(cashiername).setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int i = jTable1.getSelectedRow();

        double araya = Double.parseDouble(jTextField3.getText());

        // JOptionPane.showMessageDialog(null, araya);

        int harido = jTable1.getSelectedRow();

        String uuew = model.getValueAt(i,5).toString();
        double samma = Double.parseDouble(uuew);

        double qq =(araya - samma);
        
        double ss = Math.round(qq*100.0)/100.0;

        jTextField3.setText(Double.toString(ss));

        model.removeRow(harido);

        jTextField2.setText(null);
          dis.setText("0.0");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {

            // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/photocopy","root","");
            String sql = "insert into sales (bill_no,item,unitprice,qauntity,subtotal,date,time,cashier,discount) values (?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst = connecting.db().prepareStatement(sql);

            for (int i = 0; i < jTable1.getRowCount();  i++ )

            {

                String name = jTable1.getValueAt(i,1).toString();
                String price = jTable1.getValueAt(i,3).toString();
                String qaun = jTable1.getValueAt(i,2).toString();
                String billa = jTextField1.getText();
                String totalya = jTable1.getValueAt(i,5).toString();
                String dateeka = label8.getText();
                String time = label9.getText();
                String cash = jLabel3.getText();
                String discount = jTable1.getValueAt(i,4).toString();

                pst.setString(1,billa);
                pst.setString(2,name);
                pst.setString(3,price);
                pst.setString(4,qaun);
                pst.setString(5,totalya);
                pst.setString(6, dateeka);
                pst.setString(7,time);
                pst.setString(8,cash);
                pst.setString(9,discount);

                pst.execute();

            }

            for (int i = 0; i < jTable1.getRowCount();i++ ){
                String suraya = jTable1.getValueAt(i,0).toString();
              //  int suraya = Integer.parseInt(sarath);

                String sqli = "SELECT * FROM inventory WHERE PID = ?";
                PreparedStatement pstmti = connecting.db().prepareStatement(sqli);
                pstmti.setString(1,suraya);

                ResultSet rsi = pstmti.executeQuery();

                while (rsi.next())
                {

                    // JOptionPane.showMessageDialog(null,"awea");

                    int stocks = rsi.getInt("Pqauntity");
                    String qaun =  jTable1.getValueAt(i,2).toString();

                    int values = Integer.parseInt(qaun);

                    int ithuru = stocks - values;
                    //    String eyia = Double.toString(ithuru);
                    // JOptionPane.showMessageDialog(null,ithuru);

                    String sqlii = "UPDATE `inventory` SET `Pqauntity`= ? WHERE PID = ? ";
                    PreparedStatement pstdii = connecting.db().prepareStatement(sqlii);

                    pstdii.setDouble(1,ithuru);
                    pstdii.setString(2,suraya);

                    pstdii.execute();

                    pstdii.close();

                }

            }

          
            String choice = (String) jComboBox2.getSelectedItem();
            
            if (choice == "CARD"){
            
              String billno = jTextField1.getText();
                String tot = jTextField3.getText();
                String cash = jLabel3.getText();
                String date = label8.getText();
                String time = label9.getText();
                
            
                 new card(billno,tot,cash,date,time).setVisible(true);
                          this.dispose();
            
        
            
            
            }
            
            if (choice == "CASH"){
            
                String billno = jTextField1.getText();
                String tot = jTextField3.getText();
                String cash = jLabel3.getText();
                String date = label8.getText();
                String time = label9.getText();
                
                    
                          new cash(billno,tot,cash,date,time).setVisible(true);
                          this.dispose();
            
            
            
            
            }
            
            

           // new NewJFrame().setVisible(true);
           // this.dispose();
            

        } catch (Exception e) {

          //  JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     //  huakai();
       eeki();
    }//GEN-LAST:event_formWindowActivated

    private void itemcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemcodeFocusLost
        
        

   try {
            
       //int icode = Integer.parseInt(itemcode.getText());
       String icode = itemcode.getText();
       // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/photocopy","root","");
            
            String sql="select * from inventory where PID = ?";
            PreparedStatement pstmt = connecting.db().prepareStatement(sql);
            pstmt.setString(1, icode);
            ResultSet rs =pstmt.executeQuery();
               
                while (rs.next()) {
               
               String namak = rs.getString("Pname");
              
            
                 
             
                itemname.setText(namak);
                        
                 jTextField2.requestFocusInWindow();
                  
                
                
             
                  
              
                
        
                 }
               
            
            
           // conn.close();
            
            
        } catch (Exception e) {
            
            //JOptionPane.showMessageDialog(null, e);
            
        }


    }//GEN-LAST:event_itemcodeFocusLost

    private void itemnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itemnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_itemnameFocusLost

    private void disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disActionPerformed

    private void itemcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcodeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){

            jTextField2.requestFocusInWindow();
        
        }
    }//GEN-LAST:event_itemcodeKeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
      
      
      dis.requestFocusInWindow();
      
      
      }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void disKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_disKeyPressed
       
        
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
      
      
      jButton2.requestFocusInWindow();
      
      
      }
        
        
        
        
        
        
        
    }//GEN-LAST:event_disKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
    
        
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
      
      
      jButton2.doClick();
      
      
      }
        
        
    }//GEN-LAST:event_jButton2KeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private void eeki (){







   try {
            
       
       // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/photocopy","root","");
            
            String sql="select * from sales";
            PreparedStatement pstmt = connecting.db().prepareStatement(sql);
            ResultSet rs =pstmt.executeQuery();
               
                while (rs.next()) {
               
               int apathyo = rs.getInt("bill_no");
              
            
                 int sathyamn = (apathyo + 1);
             
                jTextField1.setText(Integer.toString(sathyamn));
                
                
             
                  
              
                
        
                 }
               
            
            
           // conn.close();
            
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
            
        }













}
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dis;
    private javax.swing.JTextField itemcode;
    private javax.swing.JTextField itemname;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private java.awt.Label label8;
    private java.awt.Label label9;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("k.jpg")));
    }



}
