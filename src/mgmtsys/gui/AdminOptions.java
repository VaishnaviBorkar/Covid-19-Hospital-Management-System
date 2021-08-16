package mgmtsys.gui;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mgmtsys.dao.CountAppointments;
import mgmtsys.dao.CountPatientdao;
import mgmtsys.dao.Countdoctordao;
public class AdminOptions extends javax.swing.JFrame {
    public AdminOptions() {
         String countd ;
         String countp;
         String  countap;
        initComponents();
        try {
            countd = Countdoctordao.countDoctors();
            jLabel2.setText("Total Doctors= "+countd);
            countp = CountPatientdao.countPatients();
             jLabel3.setText("Total Patients= "+countp);
             countap=CountAppointments.countAppointment();
              jLabel4.setText("Total Appointments= "+countap);
        }catch (Exception ex) {
            Logger.getLogger(AdminOptions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        background_panel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminOptions");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(80, 113, 199));

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText(" Welcome To Admin Options !");
        jLabel8.setOpaque(true);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons/Exitic.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log Out");

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons/Logouticon1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(10, 10, 10)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        jLabel6.setBackground(new java.awt.Color(204, 0, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/patientIcon.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 110));

        background_panel.setBackground(new java.awt.Color(80, 113, 199));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(0, 51, 204));
        jButton7.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Manage Beds");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 180, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 204));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 160, 40));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Doctor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(540, 120));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton1.setText("Add Doctor");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton2.setText("Update Doctor");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton3.setText("Remove Doctor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jRadioButton3)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(20, 20, 20))
        );

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, 120));

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage patients", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Add Patient");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton5.setText("Update Patient");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton6.setText("Remove Patient");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jRadioButton4)
                .addGap(65, 65, 65)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jRadioButton6)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addGap(20, 20, 20))
        );

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Appointments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton7.setText("Add Appointment");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton8.setText("Update Appointment");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton9.setText("Remove Appointment");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jRadioButton8)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9))
                .addGap(20, 20, 20))
        );

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        jLabel3.setBackground(new java.awt.Color(51, 51, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 220, 30));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons/search.png"))); // NOI18N
        jButton5.setText("View Appointments");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 190, 30));

        jLabel4.setBackground(new java.awt.Color(51, 51, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 220, 30));

        jLabel7.setBackground(new java.awt.Color(204, 0, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/AppontmentIcon.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons/search.png"))); // NOI18N
        jButton3.setText("View Doctors");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, 30));

        jLabel5.setBackground(new java.awt.Color(204, 0, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/DoctorIcon.png"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 110));

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 220, 31));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setText("Active");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 50, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buttons/search.png"))); // NOI18N
        jButton4.setText("View Patients");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 150, 30));

        jButton8.setBackground(new java.awt.Color(0, 51, 204));
        jButton8.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Live Status");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 180, 40));

        javax.swing.GroupLayout background_panelLayout = new javax.swing.GroupLayout(background_panel);
        background_panel.setLayout(background_panelLayout);
        background_panelLayout.setHorizontalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_panelLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        background_panelLayout.setVerticalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(background_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1000, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
 
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //back to login page
        Login lg=new Login();
        lg.setVisible(true);
        lg.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
           AddDoctor addr=new AddDoctor();
            addr.setVisible(true);
            addr.show();
            this.dispose();
        }
        else if(jRadioButton2.isSelected())
        {   
            UpdateDoctor uddr=new  UpdateDoctor();
            uddr.setVisible(true);
            uddr.show();
            this.dispose();
        }
        else if(jRadioButton3.isSelected())
        {
             RemoveDoctor rdr=new   RemoveDoctor();
            rdr.setVisible(true);
            rdr.show();
            this.dispose();
          
        }
        else if(jRadioButton4.isSelected())
        {
            AddPatient adp=new AddPatient();
            adp.setVisible(true);
           adp.show();
            this.dispose();
        }
         else if(jRadioButton5.isSelected())
        {
            UpdatePatient udp=new  UpdatePatient();
            udp.setVisible(true);
            udp.show();
             this.dispose();
    }
         else if(jRadioButton6.isSelected())
        {
            RemovePatient rdp=new  RemovePatient();
            rdp.setVisible(true);
            rdp.show();
            this.dispose();
        }
         else if(jRadioButton7.isSelected())
        {
            AddAppointment adap=new    AddAppointment();
            adap.setVisible(true);
           adap.show();
            this.dispose();
     }
             else if(jRadioButton8.isSelected())
        {
            UpdateAppointment udap=new  UpdateAppointment();
            udap.setVisible(true);
           udap.show();
            this.dispose();
      }
             else if(jRadioButton9.isSelected())
        {
         RemoveAppointment rapp=new  RemoveAppointment();
           rapp.setVisible(true);
           rapp.show();
            this.dispose();
            }
             else{
             JOptionPane.showMessageDialog(null,"Please Select At Least One Option!");
             }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Exit from the system
          System.exit(0);
      
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      // Open ViewDoctors FRAME
        ViewDoctor vd=new ViewDoctor();
        vd.setVisible(true);
        vd.show();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //view patient table
        ViewPatient vpt=new ViewPatient();
        vpt.setVisible(true);
        vpt.show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       // open appointments to view:
        ViewAppointment vap=new ViewAppointment();
         vap.setVisible(true);
         vap.show();
         this.dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ManageBeds mnbds=new  ManageBeds();
        mnbds.show();
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        LiveCOVIdStatus lcs=new LiveCOVIdStatus();
        lcs.show();
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
     
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
            java.util.logging.Logger.getLogger(AdminOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_panel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
