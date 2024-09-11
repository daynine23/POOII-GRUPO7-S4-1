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
    private Autor Autor;
    private String Sinopsis;
    private String Genero;

    public Libro() {
    }
    

    public Libro(String ISBN, String Titulo, Autor Autor, String Sinopsis, String Genero) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Sinopsis = Sinopsis;
        this.Genero = Genero;
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

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
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
    public void guardarArchivo(Libro libro){
        try{
            FileWriter fw = new FileWriter("./src/crearlibro/Libro.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.print(libro.getISBN());
            pw.print("," + libro.getTitulo());
            pw.print("," + libro.getAutor());
            pw.print("," + libro.getSinopsis());
            pw.println("," + libro.getGenero());
           
            pw.close();
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    

    
    
    
}
