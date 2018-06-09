/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_jonrryenamorado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author wende
 */
public class administrarusuario {
    public ArrayList<usuario> listausuario = new ArrayList ();
    private File archivo = null;

    public administrarusuario(String path) {
    archivo = new File(path);
    }

    public ArrayList<usuario> getListausuario() {
        return listausuario;
    }

    public void setListausuario(ArrayList<usuario> listausuario) {
        this.listausuario = listausuario;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "usuario=" + listausuario;
    }

    public void setUsuario(usuario p){
        this.listausuario.add(p);
        
    }

    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter (archivo, false);
            bw = new BufferedWriter(fw);
            for (usuario t : listausuario) {
                bw.write(t.getUser()+";");
                bw.write(t.getContra()+";");
                
                bw.write(t.getCorreo()+";");
                bw.write(t.getFecha()+";");
                for (serie h : t.getSerie()) {
                    if(!h.getNombre().equals("n/a")){
                    bw.write(h.getNombre()+",");
                        
                    }
                    else{
                        bw.write("n/a");
                    }
                }
                bw.write(";");
                for (pelicula p : t.getMovies()) {
                    bw.write(p.getNombre() + ",");
                }
                bw.write(";");
                bw.write(t.getX()+";");
                bw.write("_");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() throws FileNotFoundException, IOException {
        
        Scanner sc = null;
        listausuario = new ArrayList();
       
       
       
        if (archivo.exists()) {
        FileReader r = new FileReader(archivo);
        BufferedReader buff= new BufferedReader(r);
        StringTokenizer token = new StringTokenizer(buff.readLine() , "_");
            try {
                
                
                
                while (token.hasMoreTokens()) {
                   
                    StringTokenizer token2 = new StringTokenizer(token.nextToken() , ";");
                    int card;
                    String usuario, correo, fecha, contra;
                    usuario = token2.nextToken();
                    contra = token2.nextToken();
                    
                    ArrayList<serie> series = new ArrayList();
                    ArrayList<pelicula> movies = new ArrayList();
                    
                    
                  
                    correo = token2.nextToken();
                    fecha = token2.nextToken();
                    StringTokenizer token3 = new StringTokenizer(token2.nextToken() , ",");
                    
                    while (token3.hasMoreTokens()) {
                        series.add(new serie(token3.nextToken()));
                    }
                    StringTokenizer token4 = new StringTokenizer(token2.nextToken() , ",");
                    
                    while (token4.hasMoreTokens()) {
                       movies.add(new pelicula(token4.nextToken()));
                    }
                    
                    card = Integer.parseInt(token2.nextToken());
                    listausuario.add(new usuario(usuario,contra,correo,fecha,card));
                    listausuario.get(listausuario.size() - 1).setMovies(movies);
                    listausuario.get(listausuario.size() - 1).setSerie(series);
                   
                    
                    
                    
                }//fin persona
            } catch (Exception e) {
                System.out.println("exception");
                e.printStackTrace();
            }
            
            
        }//fin if
            
            
    }
    
}
