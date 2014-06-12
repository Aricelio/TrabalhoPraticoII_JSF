
package br.edu.ifnmg.tads.MeuPrimeiroJSF.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author celio
 */
@Entity
@Table(name = "Pessoas")
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;    
    
    //Atributo ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PessoaID")
    private Long id;

    //Atributo Nome
    @Column(length = 50)
    private String nome;
    
    //Atributo CPF
    @Column(length = 14) 
    private String cpf; 
    
    //Atributo RG
    @Column(length = 20) 
    private String rg;    
    
    //Atributo Funcao
    @ManyToOne(fetch = FetchType.EAGER)
    Funcao funcao;
    
    //Atributo DataNascimento
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    
    //Getters e Setters.........................................................
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }  

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }
    
    //HashCode e Equals.........................................................
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    //toString..................................................................
    @Override
    public String toString() {
        return nome;
    }
    
}
