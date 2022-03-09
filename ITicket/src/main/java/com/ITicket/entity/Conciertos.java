package com.ITicket.entity;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="conciertos")
public class Conciertos implements Serializable{
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    private long id;
    private long costo;
    private String fecha;
    private int capacidadMax;
    private String lugar;

    @ManyToOne
    @JoinColumn (name="artista_id") 
    private Artistas artista;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Artistas getArtista() {
        return artista;
    }

    public void setArtista(Artistas artista) {
        this.artista = artista;
    }
}

