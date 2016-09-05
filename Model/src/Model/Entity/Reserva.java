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
public class Reserva implements Serializable {
    
    private static final long serialVersionUID = -6837091775122105170L;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaLimite;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaReserva;
    @Id
    @Column(nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ID_RECURSO")
    private Recurso recurso;
    @ManyToOne
    @JoinColumn(name = "ID_PRESTAMO")
    private Prestamo prestamo;


    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }
}
