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
public class Entrega implements Serializable {
    private static final long serialVersionUID = 4537791665513519874L;
    @Column(nullable = false, length = 30)
    private String estado;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date fechaentrega;
    @Id
    @Column(nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ID_PRESTAMO")
    private Prestamo prestamo;


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaentrega() {
        return fechaentrega;
    }

    public void setFechaentrega(Date fechaentrega) {
        this.fechaentrega = fechaentrega;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }


}
