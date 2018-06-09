/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_jonrryenamorado;

import java.util.ArrayList;

/**
 *
 * @author wende
 */
public class usuario {
    String correo;
    String contra;
    String fecha;
    ArrayList<serie> serie= new ArrayList();
    ArrayList<pelicula> movies= new ArrayList();
    String x;
    String user;
    
    public usuario() {
    }

    public usuario(String user,String contra,String correo, String fecha, ArrayList<serie> serie, ArrayList<pelicula> movies, String x) {
        this.correo = correo;
        this.contra = contra;
        this.fecha = fecha;
        this.serie = serie;
        this.movies = movies;
        this.x = x;
        this.user = user;
    }

        
    public usuario(String user,String contra,String correo, String fecha, String x) {
        this.correo = correo;
        this.contra = contra;
        this.fecha = fecha;
        this.x = x;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

   

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<serie> getSerie() {
        return serie;
    }

    public void setSerie(ArrayList<serie> serie) {
        this.serie = serie;
    }

    public ArrayList<pelicula> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<pelicula> movies) {
        this.movies = movies;
    }

   

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return correo;
    }
    
    
    
}
