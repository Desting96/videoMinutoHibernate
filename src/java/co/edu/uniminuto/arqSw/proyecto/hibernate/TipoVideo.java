package co.edu.uniminuto.arqSw.proyecto.hibernate;
// Generated 29/09/2018 01:38:11 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoVideo generated by hbm2java
 */
public class TipoVideo  implements java.io.Serializable {


     private Integer idTipoVideo;
     private String tipoVideo;
     private Set<InfoVideo> infoVideos = new HashSet<InfoVideo>(0);

    public TipoVideo() {
    }

	
    public TipoVideo(String tipoVideo) {
        this.tipoVideo = tipoVideo;
    }
    public TipoVideo(String tipoVideo, Set<InfoVideo> infoVideos) {
       this.tipoVideo = tipoVideo;
       this.infoVideos = infoVideos;
    }
   
    public Integer getIdTipoVideo() {
        return this.idTipoVideo;
    }
    
    public void setIdTipoVideo(Integer idTipoVideo) {
        this.idTipoVideo = idTipoVideo;
    }
    public String getTipoVideo() {
        return this.tipoVideo;
    }
    
    public void setTipoVideo(String tipoVideo) {
        this.tipoVideo = tipoVideo;
    }
    public Set<InfoVideo> getInfoVideos() {
        return this.infoVideos;
    }
    
    public void setInfoVideos(Set<InfoVideo> infoVideos) {
        this.infoVideos = infoVideos;
    }




}


