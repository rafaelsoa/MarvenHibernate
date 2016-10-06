
package br.senac.rn.model;

import br.senac.rn.dao.PersistDB;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sexo implements PersistDB{
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String sigla;

    public Sexo(String outros, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Sexo{" + "id=" + id + ", nome=" + nome + ", sigla=" + sigla + '}';
    }
            
    
    
    
}
