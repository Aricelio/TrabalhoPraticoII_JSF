/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.tads.MeuPrimeiroJSF.model;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

/**
*
* @author ARICELIO
*/
@Stateless
public class FuncaoDAO extends DAOGenerico<Funcao> {

    public FuncaoDAO() {
        super(Funcao.class);
    }

    @Override
    public List<Funcao> Buscar(Funcao obj) {
        String Consulta = "select l from Funcao l";
        if(obj != null){
            Consulta = Consulta + " where l.nome like '%" + obj.getNome() + "%'";
        }
        Query q = manager.createQuery(Consulta);
        return q.getResultList();
    }
}