package br.prat.controller;

import br.prat.entitys.Cargo;
import br.prat.entitys.Feedback;
import br.prat.entitys.Setor;
import br.prat.entitys.Usuario;
import br.prat.entitys.tipoUsuario;
import br.prat.persistence.controllerPersistence;
import java.util.Date;
import java.util.List;

public class controller {

    controllerPersistence controlPersis;
    private final Usuario user = new Usuario();
    private tipoUsuario tipUsr = new tipoUsuario();

    public controller() {
        controlPersis = new controllerPersistence();
    }

    public Usuario validarUsuario(String nome, String senha) {
        //String mensagem = "";
        Usuario usr = null;
        List<Usuario> listaUsuario = controlPersis.buscaUsuarios();
        for (Usuario usu : listaUsuario) {
            if (usu.getNome().equals(nome) && usu.getSenha().equals(senha)) {
                usr = usu;
                return usr;
            } else {
                //mensagem = "usuario não encontrado";
                usr = null;
            }
        }
        return usr;
    }

    public void cadastroUser(String nomeCad, String senhaCad) {

        tipUsr.setId(2);
        tipUsr.setDescrição("para usuario user");
        tipUsr.setTipo("user");

        user.setNome(nomeCad);
        user.setSenha(senhaCad);
        user.setUmtipo(tipUsr);
        controlPersis.cadastrar(user);
    }

    public void criarFeedback(String usua, String setor, String cargo,
            int perg1, int perg2, int perg3, int perg4, String aMelhorar) {
        Feedback fdbck = new Feedback();
        fdbck.setUsuario(usua);
        fdbck.setSetor(setor);
        fdbck.setCargo(cargo);
        fdbck.setPerg1(perg1);
        fdbck.setPerg2(perg2);
        fdbck.setPerg3(perg3);
        fdbck.setPerg4(perg4);
        fdbck.setData(new Date(System.currentTimeMillis()));
        fdbck.setaMelhorar(aMelhorar);

        controlPersis.criarFeedback(fdbck);
    }

    public List<Feedback> trazerFeedbcks() {
        return controlPersis.buscaFeedback();
    }

    public List<Usuario> trazerUsuarios() {
        return controlPersis.buscaUsuarios();
    }

    public List<tipoUsuario> trazerTipos() {
        return controlPersis.buscaTipo();
    }

    public void criarUser(String nome, String senha, String tipo) {
        user.setNome(nome);
        user.setSenha(senha);

        tipUsr = this.trazerTipo(tipo);
        if (tipUsr != null) {
            user.setUmtipo(tipUsr);
        }
        controlPersis.cadastrar(user);
    }

    private tipoUsuario trazerTipo(String tipo) {
        List<tipoUsuario> listTip = controlPersis.buscaTipo();
        //compara string tipo com os tipos da tabela e retorna o que for igual
        for (tipoUsuario tip : listTip) {
            if (tip.getTipo().equals(tipo)) {
                return tip;
            }
        }
        return null;
    }

    public Usuario trazerUsuario(int id_usu) {
        return controlPersis.buscaUsuario(id_usu);
    }

    public void editaUser(Usuario usu, String nome, String senha, String tipo) {
        usu.setNome(nome);
        usu.setSenha(senha);

        tipUsr = this.trazerTipo(tipo);
        if (tipUsr != null) {
            usu.setUmtipo(tipUsr);
        }

        controlPersis.editaUser(usu);
    }

    public void excluirUser(int id_usr) {
        controlPersis.excluirUser(id_usr);
    }

    public List<Setor> trazerSetores() {
        return controlPersis.trazerSetores();
    }

    public List<Cargo> trazerCargos() {
        return controlPersis.trazerCargos();
    }
}
