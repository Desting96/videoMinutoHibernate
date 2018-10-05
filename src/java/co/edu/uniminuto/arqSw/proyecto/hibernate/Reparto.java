package co.edu.uniminuto.arqSw.proyecto.hibernate;
// Generated 29/09/2018 01:38:11 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Reparto generated by hbm2java
 */
public class Reparto  implements java.io.Serializable {


     private Integer idReparto;
     private String reparto;
     private Set<Persona> personas = new HashSet<Persona>(0);

    public Reparto() {
    }

	
    public Reparto(String reparto) {
        this.reparto = reparto;
    }
    public Reparto(String reparto, Set<Persona> personas) {
       this.reparto = reparto;
       this.personas = personas;
    }
   
    public Integer getIdReparto() {
        return this.idReparto;
    }
    
    public void setIdReparto(Integer idReparto) {
        this.idReparto = idReparto;
    }
    public String getReparto() {
        return this.reparto;
    }
    
    public void setReparto(String reparto) {
        this.reparto = reparto;
    }
    public Set<Persona> getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
    }




}

