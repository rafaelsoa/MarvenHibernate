
package br.senac.rn.dao;

import br.senac.rn.model.Sexo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class SexoDAO extends GenericDAO<Sexo>{
    
    public Class<Sexo> getClassType(){
     return Sexo.class;
    
    }
    
    public List<Sexo> selectByFilter(String filter) {
        try{
        Query query = em.createQuery("select s from Sexo s where s.nome like :filtro");
        query.setParameter("filtro", "%" + filter + "%");
        return query.getResultList();
        }catch {
        
        }
    
    
//    private EntityManager em;
//    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexaoDB");
//
//    public SexoDAO() {
//  
//            em = emf.createEntityManager();
//       
//
//    }
//
//public boolean insert(Sexo sexo){
//    try {
//        em.getTransaction().begin();
//        em.persist(sexo);
//        em.getTransaction().commit();
//        return true;
//    } catch (Exception error) {
//        System.out.println("ERRO:" + error.toString());
//    }
//return false ;
//}
//    
//public boolean delete(Sexo sexo){
//    try {
//        em.getTransaction().begin();
//        em.remove(sexo);
//        em.getTransaction().commit();
//        return true;
//    } catch (Exception error) {
//        System.out.println("ERRO:" + error.toString());
//    }
//return false ;
//}
//
//public boolean update(Sexo sexo){
//    try {
//        em.getTransaction().begin();
//        em.merge(sexo);
//        em.getTransaction().commit();
//        return true;
//    } catch (Exception error) {
//        System.out.println("ERRO:" + error.toString());
//    }
//return false ;
//}
//
//
//public List<Sexo> selectAll(){
//return em.createQuery("SELECT S FROM Sexo S").getResultList();
//
//
//}
//    
//
//public Sexo selectById(int id){
//   return em.find(Sexo.class, id);
//
//}
//
//public List<Sexo> selectByFilter (String filter){
//    Query query = em.createQuery("select s from Sexo s where s.nome like :filtro");
//    query.setParameter("filtro", "%" + filter + "%");
//    return query.getResultList();
//
//
//}



}
