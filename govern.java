/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginform;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class govern extends javax.swing.JFrame {

    
    public govern() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        getContentPane().setBackground(Color.LIGHT_GRAY);
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtBirthday = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();


        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Firstname", "Lastname", "Email Address", "Birthday"
            }
        ));

       
        setTitle("");
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Firstname: ");

        jLabel2.setText("Lastname: ");

        jLabel3.setText("Email Address: ");

        jLabel4.setText("Brithday: ");


        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Table);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        setTitle("Philippine Statistics Authority");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstname)
                            .addComponent(txtLastname)
                            .addComponent(txtEmail)
                            .addComponent(txtBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    
    
    DefaultTableModel mod;
    String project, owner, email, budget, line;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        mod = (DefaultTableModel)Table.getModel();
        mod.addColumn("Firstname");
        mod.addColumn("Lastname");
        mod.addColumn("Email Address");
        mod.addColumn("Brithday");
        
        try{
        BufferedReader bfw = new BufferedReader(new FileReader("data.txt"));
        while( (line = bfw.readLine() ) != null ) {
        mod.addRow( line.split(",") );
        }
            bfw.close();
        }
        catch(Exception ex){
        }

    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        this.project = txtFirstname.getText();
        this.owner = txtLastname.getText();
        this.email = txtEmail.getText();
        this.budget = txtBirthday.getText();
        
        this.txtFirstname.setText("");
        this.txtLastname.setText("");
        this.txtEmail.setText("");
        this.txtBirthday.setText("");
        
        String st[] = {project, owner, email, budget};
        mod.addRow(st);
        saveFile();
    }

    private void saveFile(){
        try{
          File file = new File("mydata.txt");
          if(!file.exists()){
              file.createNewFile();
          }
          FileWriter fw = new FileWriter(file.getAbsoluteFile());
          BufferedWriter bw = new BufferedWriter(fw);
          
          for(int i=0; i<Table.getRowCount(); i++){
              for(int j=0; j<Table.getColumnCount(); j++){
                  bw.write((String)Table.getModel().getValueAt(i,j)+",");
              }
              bw.write("\n");
          }
        bw.close();
        fw.close();
      }catch(Exception ex){
          
      }
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {
        this.txtFirstname.setText("");
        this.txtLastname.setText("");
        this.txtEmail.setText("");
        this.txtBirthday.setText("");
    }

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {
        int index =Table.getSelectedRow();
        TableModel model = Table.getModel();
        project = model.getValueAt(index, 0).toString();
        owner = model.getValueAt(index, 1).toString();
        email = model.getValueAt(index, 2).toString();
        budget = model.getValueAt(index, 3).toString();
        
        txtFirstname.setText(project);
        txtLastname.setText(owner);
        txtEmail.setText(email);
        txtBirthday.setText(budget);
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        mod = (DefaultTableModel) Table.getModel();
        
        if(Table.getSelectedRow()==-1){
            if(Table.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane,"Table is Empty");
            }else{
                JOptionPane.showMessageDialog(rootPane, "You must select a record");
            }
        }else{
            mod.setValueAt(txtFirstname.getText(),Table.getSelectedRow(), 0);
            mod.setValueAt(txtLastname.getText(), Table.getSelectedRow(), 1);
            mod.setValueAt(txtEmail.getText(), Table.getSelectedRow(), 2);
            mod.setValueAt(txtBirthday.getText(), Table.getSelectedRow(), 3);
        }
        saveFile();
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        mod = (DefaultTableModel) Table.getModel();
        
        if(Table.getSelectedRow()==-1){
            if(Table.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane,"Table is Empty");
            }else{
                JOptionPane.showMessageDialog(rootPane, "You must select a record");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Record is deleted!");
            mod.removeRow(Table.getSelectedRow());
            this.txtFirstname.setText("");
            this.txtLastname.setText("");
            this.txtEmail.setText("");
            this.txtBirthday.setText("");
        }
        saveFile();
    }

   
    public static void main(String args[]) {
         new govern().setVisible(true);
           
    }

    
    private javax.swing.JTable Table;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtEmail;
   
}