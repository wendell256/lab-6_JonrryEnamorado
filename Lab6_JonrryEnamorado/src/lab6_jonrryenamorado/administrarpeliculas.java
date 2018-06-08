/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_jonrryenamorado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wende
 */
public class administrarpeliculas {
    public ArrayList<pelicula> listaPelicula = new ArrayList();
    private File archivo = null;

    public administrarpeliculas(String path) {
        archivo = new File(path);
    }

    public ArrayList<pelicula> getListaPelicula() {
        return listaPelicula;
    }

    public void setListaPelicula(ArrayList<pelicula> listaPelicula) {
        this.listaPelicula = listaPelicula;
    }

   
    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Pelicula" + listaPelicula;
    }
    
    
    
    public void setPelicula(pelicula p) {
        this.listaPelicula.add(p);

    }
    
     public void cargarArchivo() throws FileNotFoundException, IOException {
        
        Scanner sc = null;
        listaPelicula = new ArrayList();
       
       
        FileReader r = new FileReader(archivo);
        BufferedReader buff= new BufferedReader(r);
        StringTokenizer token = new StringTokenizer(buff.readLine() , "-");
       
        if (archivo.exists()) {
            try {
                
                
                
                while (token.hasMoreTokens()) {
                   
                    StringTokenizer token2 = new StringTokenizer(token.nextToken() , ";");
                    int id, rating;
                    String nombre, categoria, productora, director, duracion;
                    ArrayList<idioma> idioma = new ArrayList();
                    ArrayList<sub> sub = new ArrayList();
                    ArrayList<comments> comments = new ArrayList();
                    ArrayList<actores> actores = new ArrayList();
                    id = Integer.parseInt(token2.nextToken());
                    nombre = token2.nextToken();
                    categoria = token2.nextToken();
                    StringTokenizer token3 = new StringTokenizer(token2.nextToken() , ",");
                    
                    while (token3.hasMoreTokens()) {
                        idioma.add(new idioma(token3.nextToken()));
                    }
                    StringTokenizer token4 = new StringTokenizer(token2.nextToken() , ",");
                   
                    while (token4.hasMoreTokens()) {
                        sub.add(new sub(token4.nextToken()));
                    }
                    StringTokenizer token5 = new StringTokenizer(token2.nextToken() , ",");
                   
                    while (token5.hasMoreTokens()) {
                        comments.add(new comments(token5.nextToken()));
                    }
                    StringTokenizer token6 = new StringTokenizer(token2.nextToken() , ",");
                   
                    while (token6.hasMoreTokens()) {
                        actores.add(new actores(token6.nextToken()));
                    }
                    
                    productora = token2.nextToken();
                    director = token2.nextToken();
                    duracion = token2.nextToken();
                    rating = Integer.parseInt(token2.nextToken());
                    
                    listaPelicula.add(new pelicula(id,nombre,categoria,productora,director,duracion,rating));
                    listaPelicula.get(listaPelicula.size() - 1).setIdiomas(idioma);
                    listaPelicula.get(listaPelicula.size() - 1).setSubtitulos(sub);
                    listaPelicula.get(listaPelicula.size() - 1).setComentarios(comments);
                    listaPelicula.get(listaPelicula.size() - 1).setActores(actores);
                    
                }//fin persona
            } catch (Exception e) {
                System.out.println("exception");
                e.printStackTrace();
            }
            
            System.out.println(listaPelicula);
        }//fin if
            
            
    }
    
}
