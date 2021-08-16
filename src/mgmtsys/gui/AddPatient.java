/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgmtsys.gui;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mgmtsys.dao.AddPatientdao;
import mgmtsys.dao.Bedmanagedao;
import mgmtsys.po.BedmanagePo;
import mgmtsys.po.PatientPO;


public class AddPatient extends javax.swing.JFrame {
    public AddPatient() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        Heading = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        per_lab = new javax.swing.JLabel();
        phval_lab = new javax.swing.JLabel();
        FName_Validation = new javax.swing.JLabel();
        age_Validation_Texrt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(80, 113, 199));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons/Backframe.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Patient Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 86, 85, 27));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Full Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Phone NO.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 105, -1));

        jLabel91.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel91.setText("Blood Group");
        jPanel1.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel61.setText("Address");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 70, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 84, -1));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.setText("Generated Automatically");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 180, 30));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 249, 32));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 140, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 242, 50));

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons/add.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 134, 35));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField7MousePressed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 164, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Time");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField8MousePressed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 158, 30));

        Heading.setBackground(new java.awt.Color(255, 153, 153));
        Heading.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 255));
        Heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Heading.setText("Admit Covid Patients");
        Heading.setOpaque(true);
        jPanel1.add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 56));

        jButton3.setBackground(new java.awt.Color(0, 51, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons/cancel.png"))); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 145, 35));

        jButton4.setBackground(new java.awt.Color(0, 51, 204));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons/search.png"))); // NOI18N
        jButton4.setText("View");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 149, 36));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home Isolation", "General", "Icu" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 170, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Age");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 118, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Percentage of Positivity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 190, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Bed");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 50, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 250, 30));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 118, 30));

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 100, -1));

        per_lab.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        per_lab.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(per_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 410, 380, 20));

        phval_lab.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        phval_lab.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(phval_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 250, 20));

        FName_Validation.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        FName_Validation.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(FName_Validation, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 250, 20));

        age_Validation_Texrt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        age_Validation_Texrt.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(age_Validation_Texrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 244, 180, 20));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 930, 560));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed

       
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 1.get values from textfields
        String p_id;
        String fname;
        String contactno;
        String gender;
        String address;   
        String age;
        String  perpos;
        String  bldgrp;
        String date;
        String time;
        String bed;
        p_id=jTextField1.getText();
        fname=jTextField2.getText();
        contactno=jTextField3.getText();
        age=jTextField4.getText();
        address=jTextArea1.getText();
        gender=(String)jComboBox1.getSelectedItem();
        bed=(String)jComboBox2.getSelectedItem();
        bldgrp=(String)jComboBox3.getSelectedItem();
        date=jTextField7.getText();
        perpos=jTextField6.getText();
        time=jTextField7.getText();
        if(fname.isEmpty()||contactno.isEmpty()||address.isEmpty()||age.isEmpty()|| bldgrp.isEmpty()||date.isEmpty()||perpos.isEmpty()||time.isEmpty()||gender.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Fill the information Currectly!","Opps..",JOptionPane.ERROR_MESSAGE);
        }
         else if(jTextField3.getText().length()<10)
        {
             JOptionPane.showMessageDialog(null,"Something Went Wrong!","Opps..",JOptionPane.ERROR_MESSAGE);
            phval_lab.setText("Enter 10 Digit Number");
            
        }
        else
        {
            PatientPO ptpo=new PatientPO();
            ptpo.setP_id(p_id);
            ptpo.setFname(fname);
            ptpo.setContactno(contactno);
              ptpo.setAddress(address);
              ptpo.setAge(age);
             ptpo.setPerpos(perpos);
             ptpo.setBldgrp(bldgrp);
             ptpo.setBed(bed);
              ptpo.setGender(gender);
              ptpo.setDate(date);
             ptpo.setTime(time);
             
            int  rs;
            try {
                rs = AddPatientdao.addPatient(ptpo);
                if(rs!=0)
                {
                    JOptionPane.showMessageDialog(null,"1 Record Added Successfully!","Entry Successfull",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Something Went Wrong!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MousePressed
  // current date
       Date date=new Date();
          SimpleDateFormat dformat=new SimpleDateFormat("yyyy--MM--dd");
          jTextField7.setText(dformat.format(date));             
         jTextField7.setEditable(false);
    }//GEN-LAST:event_jTextField7MousePressed

    private void jTextField8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MousePressed
              // show curent  time
       Date time=Calendar.getInstance().getTime();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("hh:mm:ss aa");
         jTextField8.setText(sdf.format(time));
         jTextField8.setEditable(false);
    }//GEN-LAST:event_jTextField8MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // clear all
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField6.setText("");
        jTextField4.setText("");
        jTextArea1.setText("");
      //  jTextField5.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AdminOptions ado=new AdminOptions();
        ado.setVisible(true);
        ado.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   //view patient table
        ViewPatient vpt=new ViewPatient();
        vpt.setVisible(true);
        vpt.show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    String perpos=(String)jComboBox2.getSelectedItem();
    PatientPO ptpo=new PatientPO();
            ptpo.setBed(perpos);
  if(perpos.equals("General"))
  {
        try {
              String rs=AddPatientdao.checkgeneral(ptpo);
              BedmanagePo bmpo=new BedmanagePo();
               Bedmanagedao.tGeneral(bmpo);
               String tgeneral=bmpo.gettGeneral();//total general beds in hospital
               if((Integer.parseInt(rs))>=(Integer.parseInt(tgeneral)))
            {
             JOptionPane.showMessageDialog(null,rs+" General Beds are Booked Already","Opps..",JOptionPane.WARNING_MESSAGE);
             jComboBox2.removeItemAt(1);
            }
        } catch (Exception ex) {
            Logger.getLogger(AddPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  else if(perpos.equals("Icu"))
  {
        try {
             String rs=AddPatientdao.checkicu(ptpo);
              BedmanagePo bmpo=new BedmanagePo();
               Bedmanagedao.tIcu(bmpo);
                String ticu=bmpo.gettIcu(); //total icu bed booked
            if(Integer.parseInt(rs)>Integer.parseInt( ticu))
            {
               JOptionPane.showMessageDialog(null,rs+"Beds of Icu are Booked Already","Opps..",JOptionPane.WARNING_MESSAGE);
               jComboBox2.removeItemAt(2);
            }
        } catch (Exception ex) {
            Logger.getLogger(AddPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped

    }//GEN-LAST:event_jTextField6KeyTyped

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
     //check positivity percentage.
     if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
     {
       int p=Integer.parseInt(jTextField6.getText());
        if(p>0 && p<=20)
       {
           per_lab.setText("Hospital prefer you for Home Isolation");
       }
       else if(p>20 && p<=50)
       {
           per_lab.setText("Hospital prefer you for General Bed");
       }
       else if(p>50 && p<=100)
       {
           per_lab.setText("Hospital prefer you for Icu Bed");
       }
     }
     else
        {
           per_lab.setText("**!Invalide Input!**");
        }
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
       // Accept only phone correct number
        String phoneno=jTextField3.getText();
        int length=phoneno.length();
        char c=evt.getKeyChar();
        //check for number.
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            //check length not more than 10
            if(length<10)
            {
                jTextField3.setEditable(true);
                  phval_lab.setText("");
            }
            else{
                jTextField3.setEditable(false);
//               Validation_Texrt.setText("Enter Valid Phone Number");
            }
          
        }
          else{
                    if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                    {
                        jTextField3.setEditable(true);
                      phval_lab.setText("");
                    }
                    else
                    {
                            jTextField4.setEditable(false);
                           phval_lab.setText("Enter Valid Phone Number");
                    }
                        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
      //check the name
        char c=evt.getKeyChar();
        if(Character.isLetter(c) || Character.isISOControl(c) || evt.getExtendedKeyCode() == KeyEvent.VK_CAPS_LOCK || evt.getExtendedKeyCode() == KeyEvent.VK_SPACE){
            jTextField2.setEditable(true);
             FName_Validation.setText("");
        }
        else{
              jTextField2.setEditable(false);
              FName_Validation.setText("Enter Valid Name");
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // age always in number
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
                        jTextField4.setEditable(true);
                          age_Validation_Texrt.setText("");
       }
       else if(evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                    {
                            jTextField4.setEditable(true);
                         age_Validation_Texrt.setText("");
                       
                    }
                    else
                    {
                        jTextField4.setEditable(false);
                             age_Validation_Texrt.setText("Enter Valid Age");
                    }
    }//GEN-LAST:event_jTextField4KeyPressed

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FName_Validation;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel age_Validation_Texrt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel per_lab;
    private javax.swing.JLabel phval_lab;
    // End of variables declaration//GEN-END:variables
}
