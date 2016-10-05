
package br.senac.rn.dao;

import br.senac.rn.model.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ProdutoDAO {
   
     private EntityManager em;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexaoDB");

    public ProdutoDAO() {
  
            em = emf.createEntityManager();
       

    }

public boolean insert(Produto produto){
    try {
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        return true;
    } catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return false ;
}
    
public boolean delete(Produto produto){
    try {
        em.getTransaction().begin();
        em.remove(produto);
        em.getTransaction().commit();
        return true;
    } catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return false ;
}

public boolean update(Produto produto){
    try {
        em.getTransaction().begin();
        em.merge(produto);
        em.getTransaction().commit();
        return true;
    } catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return false ;
}


public List<Produto> selectAll(){
return em.createQuery("SELECT p FROM Produto p").getResultList();


}
    

public Produto selectById(int id){
   return em.find(Produto.class, id);

}

public List<Produto> selectByFilter (String filter){
    Query query = em.createQuery("select p from Produto p where p.nome like :filtro");
    query.setParameter("filtro", "%" + filter + "%");
    return query.getResultList();


}


    
}
