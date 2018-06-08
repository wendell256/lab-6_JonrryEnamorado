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
    ArrayList<mys> pref= new ArrayList();
    int x;
    String user;
    
    public usuario() {
    }

    public usuario(String correo, String contra, String fecha, int x, String user) {
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

    public ArrayList<mys> getPref() {
        return pref;
    }

    public void setPref(ArrayList<mys> pref) {
        this.pref = pref;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return correo;
    }
    
    
    
}
