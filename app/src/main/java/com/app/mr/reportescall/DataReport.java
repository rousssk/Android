package com.app.mr.reportescall;

/**
 * Created by r.contreras on 29/01/2018.
 */

public class DataReport {

    private String fecha, tipo_producto;

    public DataReport(String fecha, String tipo_producto) {
        this.fecha = fecha;
        this.tipo_producto = tipo_producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }
}
