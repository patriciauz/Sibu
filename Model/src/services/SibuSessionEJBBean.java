package services;

import Model.Entity.Autor;
import Model.Entity.Categoria;
import Model.Entity.Deuda;
import Model.Entity.Entrega;
import Model.Entity.Obra;
import Model.Entity.Persona;
import Model.Entity.Prestamo;
import Model.Entity.Recurso;
import Model.Entity.Reserva;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "SibuSessionEJB", mappedName = "SIBU-Model-SibuSessionEJB")
public class SibuSessionEJBBean implements  SibuSessionEJBLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "Model")
    private EntityManager em;

    public SibuSessionEJBBean() {
    }

    public Reserva persistReserva(Reserva reserva) {
        em.persist(reserva);
        return reserva;
    }

    public Reserva mergeReserva(Reserva reserva) {
        return em.merge(reserva);
    }

    public Persona persistPersona(Persona persona) {
        em.persist(persona);
        return persona;
    }

    public Persona mergePersona(Persona persona) {
        return em.merge(persona);
    }

    public Categoria persistCategoria(Categoria categoria) {
        em.persist(categoria);
        return categoria;
    }

    public Categoria mergeCategoria(Categoria categoria) {
        return em.merge(categoria);
    }

    public Prestamo persistPrestamo(Prestamo prestamo) {
        em.persist(prestamo);
        return prestamo;
    }

    public Prestamo mergePrestamo(Prestamo prestamo) {
        return em.merge(prestamo);
    }

    public Recurso persistRecurso(Recurso recurso) {
        em.persist(recurso);
        return recurso;
    }

    public Recurso mergeRecurso(Recurso recurso) {
        return em.merge(recurso);
    }

    public Obra persistObra(Obra obra) {
        em.persist(obra);
        return obra;
    }

    public Obra mergeObra(Obra obra) {
        return em.merge(obra);
    }

    public Autor persistAutor(Autor autor) {
        em.persist(autor);
        return autor;
    }

    public Autor mergeAutor(Autor autor) {
        return em.merge(autor);
    }

    public Deuda persistDeuda(Deuda deuda) {
        em.persist(deuda);
        return deuda;
    }

    public Deuda mergeDeuda(Deuda deuda) {
        return em.merge(deuda);
    }

    public Entrega persistEntrega(Entrega entrega) {
        em.persist(entrega);
        return entrega;
    }

    public Entrega mergeEntrega(Entrega entrega) {
        return em.merge(entrega);
    }
}
