
package br.senac.rn.dao;

import br.senac.rn.model.Cliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ClienteDAO {
    
    private EntityManager em;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexaoDB");

    public ClienteDAO() {

        em = emf.createEntityManager();
       

    }

public boolean insert(Cliente cliente){
    try {
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        return true;
    } catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return false ;
}
    
public boolean delete(Cliente cliente){
    try {
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
        return true;
    } catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return false ;
}

public boolean update(Cliente cliente){
    try {
        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();
        return true;
    } catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return false ;
}


public List<Cliente> selectAll(){
try{
    Query query = em.createQuery("SELECT c FROM tb_cliente c");
    return query.getResultList();
}catch (Exception error) {
        System.out.println("ERRO:" + error.toString());
    }
return null ;

}
    

public Cliente selectById(int id){
   return em.find(Cliente.class, id);

}

public List<Cliente> selectByFilter (String filter){
    Query query = em.createQuery("select c from Tb_cliente c where c.nome like :filtro");
    query.setParameter("filtro", "%" + filter + "%");
    return query.getResultList();


}


    
    
}
