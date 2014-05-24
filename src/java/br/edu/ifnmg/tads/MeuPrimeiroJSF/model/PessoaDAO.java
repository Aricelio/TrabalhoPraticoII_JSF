

package br.edu.ifnmg.tads.MeuPrimeiroJSF.model;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
 *
 * @author celio
 */
@Stateless
public class PessoaDAO extends DAOGenerico<Pessoa>{

    public PessoaDAO() {
        super(Pessoa.class);
    }

    //Method Find "Pessoa"
    @Override
    public List<Pessoa> Buscar(Pessoa obj) {
        String consulta = "select l from Pessoa l";
        
        if(obj != null){
            consulta = consulta + " where l.nome like '%" + obj.getNome() + "%'";
        }
        
        Query q = manager.createQuery(consulta);
        return q.getResultList();
    }
    
    
}
