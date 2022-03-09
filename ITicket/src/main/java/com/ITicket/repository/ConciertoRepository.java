package com.ITicket.repository;

import com.ITicket.entity.Conciertos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConciertoRepository extends CrudRepository<Conciertos,Long>{
    
}
