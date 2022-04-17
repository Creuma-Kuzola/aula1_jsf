/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.Serializable;
import java.util.Calendar;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



/**
 *
 * @author creuma
 */
@ManagedBean(name = "controleIndex")
@ApplicationScoped
public class ControleIndex implements Serializable {
    
    private String mensagem;
    private Calendar dataHora;
    
    public ControleIndex(){
        
        mensagem = "Olá mundo!! Seja bem-vindo ao Java Server Faces";
        dataHora = Calendar.getInstance();
    }
    
    //Redirecionamento para a página sobre
    public String sobre(){
        return "sobre?faces-redirect=true";
    }
    
    //Redirecionamento para a página Index
    public String index(){
        return "index?faces-redirect=true";
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Calendar getDataHora() {
        return dataHora;
    }

    public void setDataHora(Calendar dataHora) {
        this.dataHora = dataHora;
    }
    
    
    
}
