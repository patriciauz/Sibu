package Model.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autor implements Serializable {
    private static final long serialVersionUID = -6102028965389732471L;
    @Column(length = 12)
    private String apellido1;
    @Column(length = 12)
    private String apellido2;
    @Column(nullable = false, length = 30)
    private String estado;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false, length = 10)
    private String nombre1;
    @Column(length = 10)
    private String nombre2;


    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

}
