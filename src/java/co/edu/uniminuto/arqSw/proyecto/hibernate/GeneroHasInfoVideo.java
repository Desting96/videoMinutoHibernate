package co.edu.uniminuto.arqSw.proyecto.hibernate;
// Generated 29/09/2018 01:38:11 AM by Hibernate Tools 4.3.1



/**
 * GeneroHasInfoVideo generated by hbm2java
 */
public class GeneroHasInfoVideo  implements java.io.Serializable {


     private Integer idGeneroHasInfoVideo;
     private Genero genero;
     private InfoVideo infoVideo;

    public GeneroHasInfoVideo() {
    }

    public GeneroHasInfoVideo(Genero genero, InfoVideo infoVideo) {
       this.genero = genero;
       this.infoVideo = infoVideo;
    }
   
    public Integer getIdGeneroHasInfoVideo() {
        return this.idGeneroHasInfoVideo;
    }
    
    public void setIdGeneroHasInfoVideo(Integer idGeneroHasInfoVideo) {
        this.idGeneroHasInfoVideo = idGeneroHasInfoVideo;
    }
    public Genero getGenero() {
        return this.genero;
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    public InfoVideo getInfoVideo() {
        return this.infoVideo;
    }
    
    public void setInfoVideo(InfoVideo infoVideo) {
        this.infoVideo = infoVideo;
    }




}


