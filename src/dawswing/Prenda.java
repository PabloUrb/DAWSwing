/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dawswing;

import java.util.Objects;

/**
 *
 * @author DAM
 */
public class Prenda {                                              //aqui basicamente lo que hacemos es dar forma y caracteristicas
                                                                   //al objeto ademas de insertar los constructores, getters, setters,...
    static String getCodigo;                                       
    private String codigo;
    private String descripcion;
    private String color;
    private String talla;
    private double precio;
    private int stock;
    private double precioventa;

    public Prenda() {
    }

    public Prenda(String codigo, String descripcion, String color, String talla, double precio, int stock, double precioventa) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
        this.stock = stock;
        this.precioventa = precioventa;
    }

    Prenda(String codigo, String descripcion, String color, String talla, String precio, String stock, String precioventa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    @Override
    public String toString() {
        return "Prenda{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", color=" + color + ", talla=" + talla + ", precio=" + precio + ", stock=" + stock + ", precioventa=" + precioventa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.codigo);
        hash = 43 * hash + Objects.hashCode(this.descripcion);
        hash = 43 * hash + Objects.hashCode(this.color);
        hash = 43 * hash + Objects.hashCode(this.talla);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        hash = 43 * hash + this.stock;
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.precioventa) ^ (Double.doubleToLongBits(this.precioventa) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prenda other = (Prenda) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioventa) != Double.doubleToLongBits(other.precioventa)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.talla, other.talla)) {
            return false;
        }
        return true;
    }

    void add(Prenda prenda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}