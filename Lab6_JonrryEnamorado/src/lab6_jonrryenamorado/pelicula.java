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
public class pelicula {

    int id;
    String nombre;
    String categoria;
    ArrayList<idioma> idiomas = new ArrayList();
    ArrayList<sub> subtitulos= new ArrayList();
    ArrayList<comments> comentarios= new ArrayList();
    ArrayList<actores> actores= new ArrayList();
    String productora;
    String director;
    String duracion;
    int rating;

    public pelicula(int id, String nombre, String categoria, String productora, String director, String duracion, int rating) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.productora = productora;
        this.director = director;
        this.duracion = duracion;
        this.rating = rating;
    }

    public pelicula(int id, String nombre, String categoria, ArrayList<idioma> idiomas, ArrayList<sub> subtitulos, ArrayList<comments> comentarios, ArrayList<actores> actores, String productora, String director, String duracion, int rating) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.idiomas = idiomas;
        this.subtitulos = subtitulos;
        this.comentarios = comentarios;
        this.actores = actores;
        this.productora = productora;
        this.director = director;
        this.duracion = duracion;
        this.rating = rating;
    }
    
    
    public pelicula() {
    }
    public pelicula(String name) {
        this.nombre = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<idioma> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<idioma> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<sub> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<sub> subtitulos) {
        this.subtitulos = subtitulos;
    }

    public ArrayList<comments> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<comments> comentarios) {
        this.comentarios = comentarios;
    }

    public ArrayList<actores> getActores() {
        return actores;
    }

    public void setActores(ArrayList<actores> actores) {
        this.actores = actores;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
   
    
}
