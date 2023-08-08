import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class editStudent extends javax.swing.JDialog {

    /**
     * Creates new form editStudent
     */
    public editStudent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        S_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nam = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        roll_no = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Class = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        grade = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        S_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
             
            },
            new String [] {
                "Roll_no", "Name", "Class", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        S_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
              String rn=(String)S_table.getValueAt(S_table.getSelectedRow(), 0);
              String name=(String)S_table.getValueAt(S_table.getSelectedRow(), 1);
              String cla=(String)S_table.getValueAt(S_table.getSelectedRow(), 2);
              String grade1=(String)S_table.getValueAt(S_table.getSelectedRow(), 3);

              roll_no.setText(rn);
              nam.setText(name);
              Class.setText(cla);
            grade.setText(grade1);                                    
            }
        });
        jScrollPane1.setViewportView(S_table);
        if (S_table.getColumnModel().getColumnCount() > 0) {
            S_table.getColumnModel().getColumn(0).setResizable(false);
            S_table.getColumnModel().getColumn(1).setResizable(false);
            S_table.getColumnModel().getColumn(2).setResizable(false);
            S_table.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setText("Roll_no");

        jLabel2.setText("Name");

        jLabel3.setText("Class");

        jLabel4.setText("Grade");

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roll_no, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Class)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grade)
                            .addComponent(nam)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Update)
                        .addGap(43, 43, 43)
                        .addComponent(Delete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(roll_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Class, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(Delete))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        showd();
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel tbm;
    void showd(){
        try{ 
            //  Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Codesoft", "root", "2004");
          String query="Select * from Student";
          PreparedStatement pst=con.prepareStatement(query);
          ResultSet r=pst.executeQuery();
      
        
          while(r.next()){
              String roll=r.getString(1);
              String name=r.getString(2);
              String class1=r.getString(3);
              String g=r.getString(4);



              String tb[]={roll,name,class1,g};
           tbm=(DefaultTableModel)S_table.getModel();
          tbm.addRow(tb);}

      }catch(Exception e){
          e.printStackTrace();
      }
  }
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Codesoft", "root", "2004");   // Prepare the UPDATE query
        String query = "UPDATE STUDENT SET Name=?, Class=?, Grade=? WHERE roll_no=?";
      PreparedStatement ps=con.prepareStatement(query);
    //    ps.setInt(1,Integer.parseInt(roll_no.getText()));
       ps.setString(1, nam.getText());
       ps.setString(2, Class.getText());
       ps.setString(3, grade.getText());
       ps.setInt(4,Integer.parseInt(roll_no.getText()));
       ps.executeUpdate();
       JOptionPane.showMessageDialog(null, "DATA UPDATE");
            tbm.setRowCount(0);
       showd();
       
    }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Codesoft", "root", "2004");
            String query="Delete from student where roll_no="+roll_no.getText()+";";
            PreparedStatement p=con.prepareStatement(query);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATA DELETE");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_DeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Class;
    private javax.swing.JButton Delete;
    private javax.swing.JTable S_table;
    private javax.swing.JButton Update;
    private javax.swing.JTextField grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nam;
    private javax.swing.JTextField roll_no;
    // End of variables declaration//GEN-END:variables
}
