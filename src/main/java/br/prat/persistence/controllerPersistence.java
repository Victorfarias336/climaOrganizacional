package br.prat.persistence;

import br.prat.entitys.Usuario;
import br.prat.jpaController.UsuarioJpaController;
import java.util.List;


public class controllerPersistence {
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public List<Usuario> buscaUsuario() {
        List<Usuario> listaUsuario = usuJpa.findUsuarioEntities();
        return listaUsuario;
    }

    public void cadastrar(Usuario user) {
        usuJpa.create(user);
    }
    
    
}
