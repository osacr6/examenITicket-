
package com.ITicket.service;

import com.ITicket.entity.Conciertos;
import com.ITicket.repository.ConciertoRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ConciertosService implements IConciertoService{
    
    @Autowired
    private ConciertoRepository conciertoRepository;
    
    @Override
    public List<Conciertos> getAllConciertos(){
        return (List<Conciertos>)conciertoRepository.findAll();
    }
    
    @Override
    public void saveConcierto (Conciertos Persona){
        conciertoRepository.save(Persona);
    }
    
    @Override
    public Conciertos getConciertoById(long id){
        return conciertoRepository.findById(id).orElse(null);
    }
    
    @Override
    public void delete (long id){
        conciertoRepository.deleteById(id);
    }
}
