package Model.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable {
    private static final long serialVersionUID = -7019785360634991462L;
    @Column(nullable = false, length = 30)
    private String estado;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false, length = 10)
    private String nombre;


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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
