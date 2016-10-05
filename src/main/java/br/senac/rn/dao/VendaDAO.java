
package br.senac.rn.dao;

import br.senac.rn.model.Categoria;
import br.senac.rn.model.Cliente;
import br.senac.rn.model.Produto;
import br.senac.rn.model.Sexo;
import br.senac.rn.model.Venda;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class VendaDAO {
    
    
     private EntityManager em;
     private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexaoDB");
     
     

    public VendaDAO() {
  
            em = emf.createEntityManager();
       
    }

public boolean insert(Venda venda){
    try {
        
        em.getTransaction().begin();
        em.persist(venda);
        em.getTransaction().commit();
        return true;
    } catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return false ;
}
    
public boolean delete(Venda venda){
    try {
        em.getTransaction().begin();
        em.remove(venda);
        em.getTransaction().commit();
        return true;
    } catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return false ;
}

public boolean update(Venda venda){
    try {
        em.getTransaction().begin();
        em.merge(venda);
        em.getTransaction().commit();
        return true;
    } catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return false ;
}


public List<Venda> selectAll(){
return em.createQuery("SELECT v FROM Venda v").getResultList();


}
    

public Venda selectById(int id){
   return em.find(Venda.class, id);

}

public List<Venda> selectByFilter (String filter){
    Query query = em.createQuery("select v from Venda v where v.id like :filtro");
    query.setParameter("filtro", "%" + filter + "%");
    return query.getResultList();


}


    
    
    
}
