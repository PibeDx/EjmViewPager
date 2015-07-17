package com.jcuentas.sampletabandviewpager.data.model;

/**
 * Created by Jose Cuentas Turpo on 17/07/2015 - 09:42 AM.
 * E-mail: jcuentast@gmail.com
 */
public class Usuario {
    private String preNombres;
    private String apCompleto;
    private String nuEdad;

    public String getApCompleto() {
        return apCompleto;
    }

    public void setApCompleto(String apCompleto) {
        this.apCompleto = apCompleto;
    }

    public String getNuEdad() {
        return nuEdad;
    }

    public void setNuEdad(String nuEdad) {
        this.nuEdad = nuEdad;
    }

    public String getPreNombres() {
        return preNombres;
    }

    public void setPreNombres(String preNombres) {
        this.preNombres = preNombres;
    }
}
