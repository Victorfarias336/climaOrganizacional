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
        Usuario user = new Usuario();

        List<tipoUsuario> tipUsr = this.trazerTipos();
        
        user.setNome(nomeCad);
        user.setSenha(senhaCad);
        if (tipUsr != null && !tipUsr.isEmpty()) {
            tipoUsuario TipUsu = tipUsr.get(tipUsr.size() - 1);//pega tipo user
            user.setUmtipo(TipUsu);
        }
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
        Usuario usu = new Usuario();
        tipoUsuario tipUse = new tipoUsuario();

        usu.setNome(nome);
        usu.setSenha(senha);

        tipUse = this.trazerTipo(tipo);
        if (tipUse != null) {
            usu.setUmtipo(tipUse);
        }
        controlPersis.cadastrar(usu);
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
        tipoUsuario tipusr = new tipoUsuario();

        usu.setNome(nome);
        usu.setSenha(senha);

        tipusr = this.trazerTipo(tipo);
        if (tipusr != null) {
            usu.setUmtipo(tipusr);
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

    public void criarSetor(String setor) {

        Setor novoSetor = new Setor();
        novoSetor.setSetor(setor);

        controlPersis.criarSetor(novoSetor);
    }

    public void editaSetor(Setor Set, String Seto) {
        Set.setSetor(Seto);

        controlPersis.editaSetor(Set);
    }

    public Setor trazerSetor(int id_St) {
        return controlPersis.buscaSetor(id_St);
    }

    public void excluirSetor(int id_Sto) {
        controlPersis.excluirSetor(id_Sto);
    }

    public void criarCargo(String cargo) {

        Cargo novoCargo = new Cargo();
        novoCargo.setCargo(cargo);

        controlPersis.criarCargo(novoCargo);
    }

    public void editaCargo(Cargo crg, String carg) {
        crg.setCargo(carg);

        controlPersis.editaCargo(crg);
    }

    public Cargo trazerCargo(int id_Cg) {
        return controlPersis.buscaCargo(id_Cg);
    }

    public void excluirCargo(int id_Cgo) {
        controlPersis.excluirCargo(id_Cgo);
    }
}
