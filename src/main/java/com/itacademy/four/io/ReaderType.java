package com.itacademy.four.io;

/**
 * sa enumom cu ograniciti da se nemoze desiti greska LINE tj LINEAAS krivi unos
 * -> enumerizirano pobrojano mnogo
 *
 * KONSTRUKTOR ENUMA MORA BITI PRIVATNE VIDLJIVOSTI
 */
public enum ReaderType {

    BYTE("ByteReader","Cita byte po byte"),
    CHAR("CharReader", "Cita char po char"),
    LINE("LineReader", "Cita line po line"),
    OBJECT("ObjectReader", "Cita odjednom cijeli objekat");


    private String name;
    private String description;

    private ReaderType(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
