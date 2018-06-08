/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_jonrryenamorado;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wende
 */
public class administrarseries {

    public ArrayList<serie> listaSerie = new ArrayList();
    private File archivo = null;

    public administrarseries(String path) {
        archivo = new File(path);
    }

    public ArrayList<serie> getListaSerie() {
        return listaSerie;
    }

    public void setListaSerie(ArrayList<serie> listaSerie) {
        this.listaSerie = listaSerie;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Serie" + listaSerie;
    }

    public void setSerie(serie p) {
        this.listaSerie.add(p);

    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (serie t : listaSerie) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getCategoria() + ";");
                for (idioma i : t.getIdiomas()) {
                    bw.write(i.getIdioma() + ",");
                }
                for (sub i : t.getSubtitulos()) {
                    bw.write(i.getSub() + ",");
                }
                for (comments i : t.getComentarios()) {
                    bw.write(i.getComentario() + ",");
                }
                for (actores i : t.getActores()) {
                    bw.write(i.getActores() + ",");
                }

                bw.write(";");
                bw.write(t.getProductora() + ";");
                bw.write(t.getDirector() + ";");
                bw.write(t.getDuracion() + ";");
                bw.write(t.getRating() + ";");
                bw.write(t.getTemp() + ";");

            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();

    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaSerie = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    int id, rating, temp;
                    String nombre, categoria, productora, director, duracion;
                    ArrayList<idioma> idioma = new ArrayList();
                    ArrayList<sub> sub = new ArrayList();
                    ArrayList<comments> comments = new ArrayList();
                    ArrayList<actores> actores = new ArrayList();
                    id = sc.nextInt();
                    nombre = sc.next();
                    categoria = sc.next();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        idioma.add(new idioma(s2.next()));
                    }
                    Scanner s3 = new Scanner(sc.next());
                    s3.useDelimiter(",");
                    while (s3.hasNext()) {
                        sub.add(new sub(s3.next()));
                    }
                    Scanner s4 = new Scanner(sc.next());
                    s4.useDelimiter(",");
                    while (s4.hasNext()) {
                        comments.add(new comments(s4.next()));
                    }
                    Scanner s5 = new Scanner(sc.next());
                    s5.useDelimiter(",");
                    while (s5.hasNext()) {
                        actores.add(new actores(s5.next()));
                    }
                    
                    productora = sc.next();
                    director = sc.next();
                    duracion = sc.next();
                    rating = sc.nextInt();
                    temp = sc.nextInt();
                    listaSerie.add(new serie(id,nombre,categoria,productora,director,duracion,rating,temp));
                    listaSerie.get(listaSerie.size() - 1).setIdiomas(idioma);
                    listaSerie.get(listaSerie.size() - 1).setSubtitulos(sub);
                    listaSerie.get(listaSerie.size() - 1).setComentarios(comments);
                    listaSerie.get(listaSerie.size() - 1).setActores(actores);
                }//fin persona
            } catch (Exception e) {
            }
            sc.close();
        }//fin if
    }
}
