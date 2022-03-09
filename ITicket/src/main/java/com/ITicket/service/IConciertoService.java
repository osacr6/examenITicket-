package com.ITicket.service;

import com.ITicket.entity.Conciertos;
import java.util.List;

public interface IConciertoService {
    public List<Conciertos> getAllConciertos();
    public void saveConcierto (Conciertos concierto);
    public Conciertos getConciertoById (long id);
    public void delete (long id);
}
