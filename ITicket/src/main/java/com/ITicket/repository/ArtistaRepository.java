package com.ITicket.repository;

import com.ITicket.entity.Artistas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends CrudRepository<Artistas,Long>{

}
