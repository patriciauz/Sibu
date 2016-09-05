package Model.Entity;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Obra implements Serializable {
    private static final long serialVersionUID = 4626249685405430306L;
    @Column(nullable = false, length = 30)
    private String estado;
    @Id
    @Column(nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ID_RECURSO")
    private Recurso recurso;
    @ManyToOne
    @JoinColumn(name = "ID_AUTOR")
    private Autor autor;



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


    
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public Recurso getRecurso() {
        return recurso;
    }
}
