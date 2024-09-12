/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.daynine.bibliotecabuscar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author C2A601-13
 */
public class BuscarLibro extends javax.swing.JFrame {

    /**
     * Creates new form BuscarLibro
     */
    
    DefaultComboBoxModel listaFillAutores = new DefaultComboBoxModel();
    
    public BuscarLibro() {
        initComponents();
        cboAutor.setModel(llenarComboAutores());
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cboAutor = new javax.swing.JComboBox<>();
        btnBuscarLibro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ISBN:");

        jLabel2.setText("Titulo:");

        jLabel3.setText("Autor:");

        cboAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboAutor.setSelectedItem(listaFillAutores.getElementAt(0)
        );

        btnBuscarLibro.setText("Buscar Libro");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Titulo", "Leido", "Lo tengo", "Autor"
            }
        ));
        jScrollPane2.setViewportView(tblResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTitulo)
                    .addComponent(txtIsbn)
                    .addComponent(cboAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBuscarLibro)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnBuscarLibro)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel modelResult = (DefaultTableModel) tblResult.getModel();
        modelResult.setRowCount(0);
        tblResult.setModel(modelResult);
        
        
        List<String> fileList = new ArrayList<>();
        String codIsbn = "";
        String titulo = "";
        String nombreAutor = "";
        /*if(Obtener_Codigo_Alumno.getText().isEmpty()){
            showMessageDialog(null, "Porfavor ingrese el codigo de alumno!");
            return;
        }*/
        
        try{
            FileReader fr = new FileReader("./src/main/java/com/daynine/bibliotecabuscar/Libro.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String d;
            while((d=br.readLine())!= null){
                    fileList.add(d);
            }
            br.close();
            
            
            for(int i=0; i < fileList.size(); i++){
                String txtLine = fileList.get(i);
                String[] parts = new String[0];
                parts = txtLine.split(",");
                
                String part1 = parts[0];
                String part2 = parts[1];
                String part3 = parts[2];
                String part4 = parts[3];
                String part5 = parts[4];
                if(part1.equals(txtIsbn.getText()) || part2.equals(txtTitulo.getText()) || part5.equals(cboAutor.getSelectedItem().toString())){
                    modelResult.setRowCount(fileList.size());
                    //Setea ISBN
                    modelResult.setValueAt(part1, i, 0);
                    //Setea Titulo
                    modelResult.setValueAt(part2, i, 1);
                    //Setea si es Leido
                    modelResult.setValueAt(part3, i, 2);
                    //Setea si Lo tengo
                    modelResult.setValueAt(part4, i, 3);
                    //Setea Autor
                    modelResult.setValueAt(part5, i, 4);
                }
            }
            
            /*if(listaCursoPorCod.size() == 0){
                listaCursoPorCod.addElement("No existe el Libro que desea buscar!");
            }*/
            tblResult.setModel(modelResult);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
       
        //}
        
    }//GEN-LAST:event_btnBuscarLibroActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarLibro().setVisible(true);
            }
        });
    }
    
    
    private DefaultComboBoxModel llenarComboAutores(){
        
        List<String> fileLineList = new ArrayList<>();
        
        try{
            FileReader fr = new FileReader("./src/main/java/com/daynine/bibliotecabuscar/Autor.txt");
            BufferedReader br = new BufferedReader(fr);
         
            String d;
            while((d=br.readLine())!= null){
                    fileLineList.add(d);
            }
            br.close();
            
            
            for(int i=0; i < fileLineList.size(); i++){
                boolean duplicado = false;
                String line = fileLineList.get(i);
                String[] parts = new String[0];
                parts = line.split(",");
                
                String part1 = parts[0];
                
                
                /*if(listaFillAutores.isEmpty()){
                listaCursoPorCod.addElement(part1);
                } 
                else{
                for( int j=0; j < listaCursoPorCod.size(); j++){
                    if(Objects.equals(part1, listaCursoPorCod.getElementAt(j))){
                        duplicado = true;
                        break;
                    }
                }
                    if(!duplicado){
                    listaCursoPorCod.addElement(part1);
                    }
                }*/
            }
            
            for (int i = 0; i < fileLineList.size(); i++) {
                listaFillAutores.addElement(fileLineList.get(i));
                System.out.println("Autor txt " + fileLineList.get(i));
                System.out.println("Autor: " + listaFillAutores.getElementAt(i));
            }
            
            
            }catch(Exception e){
            e.printStackTrace();
        }
        return listaFillAutores;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLibro;
    private javax.swing.JComboBox<String> cboAutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
