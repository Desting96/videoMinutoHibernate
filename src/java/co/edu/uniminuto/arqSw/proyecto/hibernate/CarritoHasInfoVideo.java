package co.edu.uniminuto.arqSw.proyecto.hibernate;
// Generated 29/09/2018 01:38:11 AM by Hibernate Tools 4.3.1



/**
 * CarritoHasInfoVideo generated by hbm2java
 */
public class CarritoHasInfoVideo  implements java.io.Serializable {


     private Integer idCarritoHasInfoVideo;
     private Carrito carrito;
     private InfoVideo infoVideo;
     private String cantidad;

    public CarritoHasInfoVideo() {
    }

    public CarritoHasInfoVideo(Carrito carrito, InfoVideo infoVideo, String cantidad) {
       this.carrito = carrito;
       this.infoVideo = infoVideo;
       this.cantidad = cantidad;
    }
   
    public Integer getIdCarritoHasInfoVideo() {
        return this.idCarritoHasInfoVideo;
    }
    
    public void setIdCarritoHasInfoVideo(Integer idCarritoHasInfoVideo) {
        this.idCarritoHasInfoVideo = idCarritoHasInfoVideo;
    }
    public Carrito getCarrito() {
        return this.carrito;
    }
    
    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    public InfoVideo getInfoVideo() {
        return this.infoVideo;
    }
    
    public void setInfoVideo(InfoVideo infoVideo) {
        this.infoVideo = infoVideo;
    }
    public String getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }




}


