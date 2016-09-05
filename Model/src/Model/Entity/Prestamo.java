package Model.Entity;

import java.io.Serializable;


import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Prestamo implements Serializable {
    private static final long serialVersionUID = 4334979011962235980L;
    @Column(nullable = false, length = 30)
    private String estado;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaLimite;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaPrestamo;
    @Id
    @Column(nullable = false)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "ID_RECURSO")
    private Recurso recurso;
    @ManyToOne
    @JoinColumn(name = "ID_PERSONA")
    private Persona persona;


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
}
