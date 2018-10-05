package co.edu.uniminuto.arqSw.proyecto.hibernate;
// Generated 29/09/2018 01:38:11 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Video generated by hbm2java
 */
public class Video  implements java.io.Serializable {


     private Integer idVideo;
     private InfoVideo infoVideo;
     private Isan isan;
     private String nombreCapitulo;
     private String duracion;
     private String video;
     private Set<VideoHasLenguaje> videoHasLenguajes = new HashSet<VideoHasLenguaje>(0);
     private Set<VideoHasSubtitulo> videoHasSubtitulos = new HashSet<VideoHasSubtitulo>(0);

    public Video() {
    }

	
    public Video(InfoVideo infoVideo, Isan isan, String nombreCapitulo, String duracion, String video) {
        this.infoVideo = infoVideo;
        this.isan = isan;
        this.nombreCapitulo = nombreCapitulo;
        this.duracion = duracion;
        this.video = video;
    }
    public Video(InfoVideo infoVideo, Isan isan, String nombreCapitulo, String duracion, String video, Set<VideoHasLenguaje> videoHasLenguajes, Set<VideoHasSubtitulo> videoHasSubtitulos) {
       this.infoVideo = infoVideo;
       this.isan = isan;
       this.nombreCapitulo = nombreCapitulo;
       this.duracion = duracion;
       this.video = video;
       this.videoHasLenguajes = videoHasLenguajes;
       this.videoHasSubtitulos = videoHasSubtitulos;
    }
   
    public Integer getIdVideo() {
        return this.idVideo;
    }
    
    public void setIdVideo(Integer idVideo) {
        this.idVideo = idVideo;
    }
    public InfoVideo getInfoVideo() {
        return this.infoVideo;
    }
    
    public void setInfoVideo(InfoVideo infoVideo) {
        this.infoVideo = infoVideo;
    }
    public Isan getIsan() {
        return this.isan;
    }
    
    public void setIsan(Isan isan) {
        this.isan = isan;
    }
    public String getNombreCapitulo() {
        return this.nombreCapitulo;
    }
    
    public void setNombreCapitulo(String nombreCapitulo) {
        this.nombreCapitulo = nombreCapitulo;
    }
    public String getDuracion() {
        return this.duracion;
    }
    
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public String getVideo() {
        return this.video;
    }
    
    public void setVideo(String video) {
        this.video = video;
    }
    public Set<VideoHasLenguaje> getVideoHasLenguajes() {
        return this.videoHasLenguajes;
    }
    
    public void setVideoHasLenguajes(Set<VideoHasLenguaje> videoHasLenguajes) {
        this.videoHasLenguajes = videoHasLenguajes;
    }
    public Set<VideoHasSubtitulo> getVideoHasSubtitulos() {
        return this.videoHasSubtitulos;
    }
    
    public void setVideoHasSubtitulos(Set<VideoHasSubtitulo> videoHasSubtitulos) {
        this.videoHasSubtitulos = videoHasSubtitulos;
    }




}


