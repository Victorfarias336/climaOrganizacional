package br.prat.controller;

import br.prat.entitys.Usuario;
import br.prat.persistence.controllerPersistence;
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

    public void cadastrar(String nomeCad, String senhaCad) {
        Usuario user = new Usuario();
        user.setNome(nomeCad);
        user.setSenha(senhaCad);
        controlPersis.cadastrar(user);
    }
}
