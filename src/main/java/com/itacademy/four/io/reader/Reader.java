package com.itacademy.four.io.reader;

/**
 * ako se desi Exception, necu gledat sve klase gledat cu samo one kojeimplements Reader interface
 * Detekcija - gdje se desila greska,
 * Obrada - nacin na koji reagiramo na tu gresku
 *
 * Closable klase  ubaci u try with resource
 *
 * samo mi je interfejs javan
 */
public interface Reader {
    String read(String path) throws ReaderException;

}
