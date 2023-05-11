
package com.juanma.portlofio.repository;


import com.juanma.portlofio.entity.Trabajo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RTrabajo extends JpaRepository<Trabajo,Integer> {
        public Optional<Trabajo> findByTrabajo(String trabajo);
    public boolean existsByTrabajo(String trabajo);
       List<Trabajo> findByPersonaId(Long personaId);
}
