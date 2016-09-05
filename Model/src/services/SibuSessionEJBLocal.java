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

import javax.ejb.Local;

@Local
public interface SibuSessionEJBLocal {
    Reserva persistReserva(Reserva reserva);

    Reserva mergeReserva(Reserva reserva);

    Persona persistPersona(Persona persona);

    Persona mergePersona(Persona persona);

    Categoria persistCategoria(Categoria categoria);

    Categoria mergeCategoria(Categoria categoria);

    Prestamo persistPrestamo(Prestamo prestamo);

    Prestamo mergePrestamo(Prestamo prestamo);

    Recurso persistRecurso(Recurso recurso);

    Recurso mergeRecurso(Recurso recurso);

    Obra persistObra(Obra obra);

    Obra mergeObra(Obra obra);

    Autor persistAutor(Autor autor);

    Autor mergeAutor(Autor autor);

    Deuda persistDeuda(Deuda deuda);

    Deuda mergeDeuda(Deuda deuda);

    Entrega persistEntrega(Entrega entrega);

    Entrega mergeEntrega(Entrega entrega);
}
