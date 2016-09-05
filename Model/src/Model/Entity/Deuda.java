package Model.Entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Deuda implements Serializable {
    private static final long serialVersionUID = 3312857370149204928L;
    @Column(nullable = false)
    private Long dias;
    @Column(nullable = false, length = 30)
    private String estado;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false, length = 10)
    private String mora;
    @ManyToOne
    @JoinColumn(name = "ID_ENTREGA")
    private Entrega entrega;


    public Long getDias() {
        return dias;
    }

    public void setDias(Long dias) {
        this.dias = dias;
    }

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


    public String getMora() {
        return mora;
    }

    public void setMora(String mora) {
        this.mora = mora;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
}
