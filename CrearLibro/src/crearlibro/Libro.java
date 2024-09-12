/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crearlibro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofía
 */
public class Libro {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private String Sinopsis;
    private String Genero;
    private boolean leido;
    private boolean loTengo;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String Autor, String Sinopsis, String Genero, boolean leido, boolean loTengo) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Sinopsis = Sinopsis;
        this.Genero = Genero;
        this.leido = leido;
        this.loTengo = loTengo;
    }
    

    
    
    
    

    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public boolean isLoTengo() {
        return loTengo;
    }

    public void setLoTengo(boolean loTengo) {
        this.loTengo = loTengo;
    }
    
    
    public void guardarArchivo(Libro libro){
        try{
            FileWriter fw = new FileWriter("./src/crearlibro/Libro.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(libro.getISBN());
            pw.print("," + libro.getTitulo());
            pw.print("," + libro.isLeido());
            pw.print("," + libro.isLoTengo());
            pw.print("," + libro.getAutor());
            pw.print("," + libro.getSinopsis());
            pw.println("," + libro.getGenero());
            
            
           
            pw.close();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    

    
    
    
}
