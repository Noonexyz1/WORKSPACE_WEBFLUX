package com.miempresa.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Playlist {

    @Id
    private String id;
    private String nombre;

    public Playlist(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Playlist() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
