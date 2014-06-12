

package br.edu.ifnmg.tads.MeuPrimeiroJSF.controllers;

import br.edu.ifnmg.tads.MeuPrimeiroJSF.model.Funcao;
import br.edu.ifnmg.tads.MeuPrimeiroJSF.model.FuncaoDAO;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author celio
 */
@Named(value = "funcaoController")
@SessionScoped
public class FuncaoController implements Serializable {

    /**
     * Creates a new instance of FuncaoController
     */
    
    @EJB
    FuncaoDAO dao;
    
    private Funcao entidade,filtro;
    
    private List<Funcao> listagem;
    
    public FuncaoController() {
        entidade = new Funcao();
        filtro = new Funcao();
    }
    
    public void filtrar(){
        listagem = dao.Buscar(filtro);
    }
    
    public String novo(){
        entidade = new Funcao();
        return "editarFuncao.xhtml";
    }

    public Funcao getEntidade() {
        return entidade;
    }

    public void setEntidade(Funcao entidade) {
        this.entidade = entidade;
    }

    public List<Funcao> getListagem() {
        if(listagem == null){
            listagem = dao.Buscar(null);
        }
        
        return listagem;
    }

    public Funcao getFiltro() {
        return filtro;
    }

    public void setFiltro(Funcao filtro) {
        this.filtro = filtro;
    }
    
    public void exibirMensagem(String msg) { 
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(msg));
    }
    
    public void salvar(){
        if(dao.Salvar(entidade)){
            exibirMensagem("Salvo");
            entidade = new Funcao();
        }
        else{
            exibirMensagem("Erro!");
        }        
    }  
    
    public String Apagar(){
        String r = "";
        
        if(dao.Apagar(entidade)){
            r = "listagemFuncao.xhtml";
            return r;
        }
        else{
            return r;
        }
    }
}
