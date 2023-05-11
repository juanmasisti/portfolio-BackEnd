
package com.juanma.portlofio.services;

import com.juanma.portlofio.entity.Proyecto;
import com.juanma.portlofio.repository.RProyecto;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional//persistencia en base de datos
public class SProyecto {
    
    
      @Autowired
    RProyecto rProyecto;
    
      
      
      //--------------------------------------------
      //traer todo
     public List<Proyecto> list(){
        return rProyecto.findAll();
     }

      
        
    //traer uno
      public Proyecto getOne(int id){
        Proyecto proye = rProyecto.findById(id).orElse(null);
        return proye;
    }  
      
      
      
    //--------------------------------------------
    //busca lista de relojes por la id de la persona
    public List<Proyecto> findByPersonaId(Long personaId) {
        return rProyecto.findByPersonaId(personaId);
    }
    
    //--------------------------------------------
    
    
    
       public void save(Proyecto proye){
        rProyecto.save(proye);
    }
    
     public void delete(int id){
        rProyecto.deleteById(id);
    }
     
     public void edit(Proyecto proye){
        rProyecto.save(proye);
    }
    
} 
    