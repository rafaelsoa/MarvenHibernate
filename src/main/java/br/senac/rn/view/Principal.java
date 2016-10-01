
package br.senac.rn.view;

import br.senac.rn.dao.ClienteDAO;
import br.senac.rn.dao.SexoDAO;
import br.senac.rn.model.Cliente;
import br.senac.rn.model.Sexo;


public class Principal {
    
    public static void main(String[] args) {
//        
//        Sexo sexo = new Sexo();
////        SexoDAO dao = new SexoDAO();
//       Cliente cliente = new Cliente();
//       ClienteDAO clientedao = new ClienteDAO();
////      
//       clientedao.insert(cliente);
//       cliente.setNome("Jo");
//       cliente.setCpf("098988");
////      for(Sexo sexo: dao.selectById()){
////       System.out.println(dao.selectByFilter("m").toString());
//       
//       
//   
//       System.exit(0); 
//        -------------------------------------------------------
        Cliente cliente = new Cliente();
        cliente.setNome("José");
        cliente.setCpf("0988988");
        cliente.setSexo(new SexoDAO().selectById(1));
        
        ClienteDAO dao = new ClienteDAO();
        
        dao.insert(cliente);
//        
        
//        ClienteDAO cliente = new ClienteDAO();
//        for(Cliente cliente)
//        
//        
//        
//        
//        Sexo s = new Sexo();
//        s.setNome("masculino");
//        SexoDAO dAO = new SexoDAO();
//        dAO.insert(s);
        
        
        System.exit(0);
        
        
        
        
        
        
      }
        
    }
    
    
    

