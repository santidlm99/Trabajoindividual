package es.cie.ordenador.repositories;

import java.util.List;

import es.cie.ordenador.negocio.Ordenador;

public interface OrdenadorRepository {

    List <Ordenador> buscarTodos();
    void insertar(Ordenador ordenador);
    void borrar (Ordenador ordenador);

}
