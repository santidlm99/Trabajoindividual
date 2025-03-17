package es.cie.ordenador.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import es.cie.ordenador.negocio.Ordenador;

@Repository
@Qualifier("jdbc")
public class OrdenadorRepositoryJDBC implements OrdenadorRepository {

    @Autowired
    private JdbcTemplate plantilla;

    @Override
    public List<Ordenador> buscarTodos() {
        return plantilla.query("select * from ordenadores", new OrdenadorRowMapper());
    }

    @Override
    public void insertar(Ordenador ordenador) {
       plantilla.update("insert into ordenadores values (?,?,?,?)",ordenador.getNumeroserie(),ordenador.getMarca()
       ,ordenador.getModelo(),ordenador.getPrecio());
    }

    @Override
    public void borrar(Ordenador ordenador) {
        plantilla.update("delete from ordenadores where numero=?",ordenador.getNumeroserie());
    }

}
