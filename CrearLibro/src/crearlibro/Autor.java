/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearlibro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofía
 */
public class Autor {
    private String nombreAutor;

    public Autor() {
    }
    
    

    public Autor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    
    public void guardarArchivo(Autor autor){
        try{
            FileWriter fw = new FileWriter("./src/crearlibro/Autor.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(autor.getNombreAutor());
           
            pw.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void jComboBoxAutores(JComboBox autores){
        autores.removeAllItems();
        
    }

    @Override
    public String toString() {
        return "Autor{" + "nombreAutor=" + nombreAutor + '}';
    }
    
}
