package br.prat.persistence;

import br.prat.entitys.Cargo;
import br.prat.entitys.Feedback;
import br.prat.entitys.Setor;
import br.prat.entitys.Usuario;
import br.prat.entitys.tipoUsuario;
import br.prat.jpaController.CargoJpaController;
import br.prat.jpaController.FeedbackJpaController;
import br.prat.jpaController.SetorJpaController;
import br.prat.jpaController.UsuarioJpaController;
import br.prat.jpaController.exceptions.NonexistentEntityException;
import br.prat.jpaController.tipoUsuarioJpaController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class controllerPersistence {
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    tipoUsuarioJpaController tipoJpa = new tipoUsuarioJpaController();
    FeedbackJpaController feedJpa = new FeedbackJpaController();
    SetorJpaController setorJpa = new SetorJpaController();
    CargoJpaController cargoJpa = new CargoJpaController();

    public List<Usuario> buscaUsuarios() {
        List<Usuario> listaUsuario = usuJpa.findUsuarioEntities();
        return listaUsuario;
    }

    public void cadastrar(Usuario user) {
        usuJpa.create(user);
    }

    public void criarFeedback(Feedback fdbck) {
        feedJpa.create(fdbck);
        }

    public List<Feedback> buscaFeedback() {
        List<Feedback> listaFeedbck = feedJpa.findFeedbackEntities();
        return listaFeedbck;
    }

    public List<tipoUsuario> buscaTipo() {
        return tipoJpa.findtipoUsuarioEntities();
    }

    public Usuario buscaUsuario(int id_usu) {
        return usuJpa.findUsuario(id_usu);
    }

    public void editaUser(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void excluirUser(int id_usr) {
        try {
            usuJpa.destroy(id_usr);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Setor> trazerSetores() {
        return setorJpa.findSetorEntities();
    }

    public List<Cargo> trazerCargos() {
        return cargoJpa.findCargoEntities();
    }

    public void criarSetor(Setor seto) {
        setorJpa.create(seto);
    }

    public void editaSetor(Setor Set) {
        try {
            setorJpa.edit(Set);
        } catch (Exception ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Setor buscaSetor(int id_St) {
        return setorJpa.findSetor(id_St);
    }

    public void excluirSetor(int id_Sto) {
        try {
            setorJpa.destroy(id_Sto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void criarCargo(Cargo carg) {
        cargoJpa.create(carg);
    }

    public void editaCargo(Cargo crg) {
        try {
            cargoJpa.edit(crg);
        } catch (Exception ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cargo buscaCargo(int id_Cg) {
        return cargoJpa.findCargo(id_Cg);
    }

    public void excluirCargo(int id_Cgo) {
        try {
            cargoJpa.destroy(id_Cgo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
