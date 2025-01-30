package br.prat.controller;

import br.prat.entitys.Usuario;
import br.prat.persistence.controllerPersistence;
import java.util.List;


public class controller {
    controllerPersistence controlPersis;

    public controller() {
        controlPersis = new controllerPersistence();
    }
    
    String mensagem = "";
    public String validarUsuario(String nome, String senha) {
        List<Usuario> listaUsuario = controlPersis.buscaUsuario();
        for(Usuario usu : listaUsuario){
            if(usu.getNome().equals(nome)){
                if(usu.getSenha().equals(senha)){
                    mensagem = "usuario encontrado";
                    return mensagem;
                }
                else{
                    mensagem = "senha ou nome incorreto";
                    return mensagem;
                }
            }
            else{
                mensagem = "usuario não encontrado";
            }
        }
        return mensagem;
    }   
}
