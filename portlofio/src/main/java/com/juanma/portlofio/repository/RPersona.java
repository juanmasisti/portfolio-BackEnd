
package com.juanma.portlofio.repository;

import com.juanma.portlofio.entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface RPersona extends JpaRepository<Persona,Long>{
    
  
}
