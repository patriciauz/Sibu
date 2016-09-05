package Model.Entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Persona implements Serializable {
    private static final long serialVersionUID = -4153585845478321713L;
    @Column(nullable = false, length = 12)
    private String apellido1;
    @Column(nullable = false, length = 12)
    private String apellido2;
    @Column(nullable = false, length = 12)
    private String identificacion;
    @Column(nullable = false, length = 12)
    private String tipoIdentificacion;
    @Column(nullable = false, length = 10)
    private String celular;
    @Column(nullable = false, length = 50)
    private String contrasenna;
    @Column(nullable = false, length = 50)
    private String email;
    @Column(nullable = false, length = 25)
    private String estado;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false, length = 10)
    private String nombre1;
    @Column(nullable = false, length = 10)
    private String nombre2;
    @Column(nullable = false, length = 30)
    private String rol;
    @Column(nullable = false, length = 7)
    private String telefono;



    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getContrasenna() {
        return contrasenna;
    }
}
