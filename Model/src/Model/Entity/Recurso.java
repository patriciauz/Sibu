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
public class Recurso implements Serializable {
    private static final long serialVersionUID = 7420061644036972346L;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date anno;
    @Column(nullable = false, length = 100)
    private String descripcion;
    @Column(nullable = false)
    private Long ejemplar;
    @Column(nullable = false, length = 8)
    private String estado;
    @Id
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false, length = 7)
    private String isbn;
    @Column(nullable = false)
    private Long tipo;
    @Column(nullable = false, length = 40)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "ID_CATEGORIA")
    private Categoria categoria;


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Long ejemplar) {
        this.ejemplar = ejemplar;
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


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    public void setAnno(Date anno) {
        this.anno = anno;
    }

    public Date getAnno() {
        return anno;
    }
}
