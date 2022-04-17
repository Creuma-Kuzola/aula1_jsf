/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author creuma
 */
@ManagedBean(name = "controleFormulario")
public class ControleFormulario implements Serializable{
    
    private String nome;
    private String email;
    private Calendar dataNascimento;
    
    private ControleFormulario(){
     
    }
    
    public String acessarFormulario(){
        return "formulario?faces-redirect=true";
    }
    
    public String processarFormulario(){
    
        String msg = "nome: "+ nome + "email: "+ email+ "data de Nascimento: "
                + new SimpleDateFormat("ddd/MM/yyyy").format(dataNascimento.getTime());
        FacesMessage msgFaces = new FacesMessage(msg);
        return "formulario";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
