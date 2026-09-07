package com.itacademy.four;

import com.itacademy.four.io.reader.Reader;
import com.itacademy.four.io.reader.ReaderException;
import com.itacademy.four.io.reader.ReaderFactory;
import com.itacademy.four.io.reader.ReaderType;

/**
 * Ideja je da ovdje ne pozivamo konstruktor i ne konstruiramo objekte
 * Ovdje ih samo konzumiramo a Factory ce ih za nas kreirati
 *
 * Dvije stvari mi smetaju:
 *  - mogu pozvati char pa nesto nece biti ucitano
 *  - radvoji kreiranje objekata od njihovog koristenja - sad sam popravio tako sto sam klasama
 *  maknuo public modifikator i dobio paketnu vidljivost
 *
 *  samo mi je interfejs javan, a sve njegove implementacije su paketno privatne vidljivosti
 */
public class ConsumerReaderDemo {
    public static void main(String[] args) {

        Reader reader =  ReaderFactory.createReader(ReaderType.LINE);
        try {
            String fileContent = reader.read("output.txt");
            System.err.println(fileContent);
        }catch (ReaderException e){
            System.err.println(e.getMessage());
        }
    }
}
