package br.prat.persistence;

import br.prat.entitys.Feedback;
import br.prat.entitys.Usuario;
import br.prat.jpaController.FeedbackJpaController;
import br.prat.jpaController.UsuarioJpaController;
import br.prat.jpaController.tipoUsuarioJpaController;
import java.util.List;


public class controllerPersistence {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    tipoUsuarioJpaController tipoJpa = new tipoUsuarioJpaController();
    FeedbackJpaController feed = new FeedbackJpaController();

    public List<Usuario> buscaUsuario() {
        List<Usuario> listaUsuario = usuJpa.findUsuarioEntities();
        return listaUsuario;
    }

    public void cadastrar(Usuario user) {
        usuJpa.create(user);
    }

    public void criarFeedback(Feedback fdbck) {
        feed.create(fdbck);
        }
    
    
}
