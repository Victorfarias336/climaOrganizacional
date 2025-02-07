package br.prat.controller;

import br.prat.entitys.Feedback;
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
        List<Usuario> listaUsuario = controlPersis.buscaUsuario();
        for(Usuario usu : listaUsuario){
            if(usu.getNome().equals(nome)){
                if(usu.getSenha().equals(senha)){
                    /*mensagem = "usuario encontrado";
                    return mensagem;*/
                    usr = usu;
                    return usr;
                }
                else{
                    //mensagem = "senha ou nome incorreto";
                    //return mensagem;
                    usr = null;
                    return usr;
                }
            }
            else{
                //mensagem = "usuario não encontrado";
                usr = null;
            }
        }
        return usr;
    }   

    public void cadastroUser(String nomeCad, String senhaCad) {
        Usuario user = new Usuario();
        tipoUsuario cadUsr = new tipoUsuario();
        
        cadUsr.setId(2);
        cadUsr.setDescrição("para usuario user");
        cadUsr.setTipo("user");
        
        user.setNome(nomeCad);
        user.setSenha(senhaCad);
        user.setUmtipo(cadUsr);
        controlPersis.cadastrar(user);
    }

    public void criarFeedback(String usua, int perg1, int perg2, int perg3, int perg4, String aMelhorar) {
        Feedback fdbck = new Feedback();
        fdbck.setUsuario(usua);
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
}
