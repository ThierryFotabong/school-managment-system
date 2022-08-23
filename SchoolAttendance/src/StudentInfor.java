import java.awt.HeadlessException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class StudentInfor extends javax.swing.JFrame {

    public StudentInfor() throws SQLException {
        initComponents();
        DisplayTable();
    }

    private void DisplayTable()
            throws SQLException{
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Attendance.db");
            String sql = "select StdMatNo, StdName from Student;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            studentInformation_table1.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stdMat_Num1 = new javax.swing.JLabel();
        studentMatriculationNumber_TextField1 = new javax.swing.JTextField();
        studentName1 = new javax.swing.JLabel();
        studentName_TextField1 = new javax.swing.JTextField();
        updateStudentInfor_Botton1 = new javax.swing.JButton();
        deleteStudent_Botton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addStudent_Botton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentInformation_table1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stdMat_Num1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stdMat_Num1.setText("Mat_Num");

        studentMatriculationNumber_TextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        studentName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentName1.setText("Student Name");

        studentName_TextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        updateStudentInfor_Botton1.setText("Update Student Info");
        updateStudentInfor_Botton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        updateStudentInfor_Botton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentInfor_Botton1ActionPerformed(evt);
            }
        });

        deleteStudent_Botton1.setText("Delete Students");
        deleteStudent_Botton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("STUDENTS");

        addStudent_Botton1.setText("Add Student");
        addStudent_Botton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addStudent_Botton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudent_Botton1ActionPerformed(evt);
            }
        });

        studentInformation_table1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Student Matriculation Number", "Student Name"
                }
        ));
        jScrollPane2.setViewportView(studentInformation_table1);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(stdMat_Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(studentMatriculationNumber_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(162, 162, 162)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(101, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(addStudent_Botton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(updateStudentInfor_Botton1)
                                                .addGap(97, 97, 97)
                                                .addComponent(deleteStudent_Botton1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(studentName1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(120, 120, 120)
                                                .addComponent(studentName_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(stdMat_Num1)
                                        .addComponent(studentMatriculationNumber_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentName_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studentName1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addStudent_Botton1)
                                        .addComponent(updateStudentInfor_Botton1)
                                        .addComponent(deleteStudent_Botton1))
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }// </editor-fold>


    private void updateStudentInfor_Botton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        String Mat_Num=stdMat_Num1.getText();
        String Student_Name=studentName1.getText();

        try {
            Connection con=DriverManager.getConnection("jdbc:sqlite:Attendance.db");
            //String sql="UPDATE `student` SET `StdName`='"+Student_Name+"' WHERE StdMatNo ='"+Mat_Num+"',";
            PreparedStatement ps=con.prepareStatement("UPDATE `Student` SET `StdName`='"+Student_Name+"' WHERE StdMatNo ='"+Mat_Num+"',");
            ps.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }



    private void addStudent_Botton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // TODO add your handling code here:

            String stdMat_Num=studentMatriculationNumber_TextField1.getText();
            String studentName=studentName_TextField1.getText();
            Class.forName("org.sqlite.JDBC");
            Connection con=DriverManager.getConnection("jdbc:sqlite:Attendance.db");
            PreparedStatement ps=con.prepareStatement("insert into student(StdMatNo,StdName)values(?,?)");
            ps.setString(1,stdMat_Num);
            ps.setString(2,studentName);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Insertion Successfull");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentInfor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Homepage homepageForm = new Homepage();
        homepageForm.show();
        dispose();
    }


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
            java.util.logging.Logger.getLogger(StudentInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new StudentInfor().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentInfor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addStudent_Botton1;
    private javax.swing.JButton deleteStudent_Botton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel stdMat_Num1;
    private javax.swing.JTable studentInformation_table1;
    private javax.swing.JTextField studentMatriculationNumber_TextField1;
    private javax.swing.JLabel studentName1;
    private javax.swing.JTextField studentName_TextField1;
    private javax.swing.JButton updateStudentInfor_Botton1;
    // End of variables declaration


}
