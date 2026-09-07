package com.itacademy.four.io.reader;

/**
 * ReaderFactory --> razdvaja kreiranje objekata od njihovog koristenja
 */
public class ReaderFactory {
    public  static Reader createReader(ReaderType readerType){
       // - input u switch moze biti i enumerirani tip
        switch (readerType) {
            case BYTE:
                return new ByteReader();
            case CHAR:
                return new CharacterReader();
            case LINE:
                return new LineReader();
            case OBJECT:
                return new ObjectReader();
            default:
                throw new IllegalArgumentException("unknown reader type %s ".formatted(readerType.getName()));
        }
    }







//    public  static Reader createReader(String type){
//        if (type == null || type.isBlank()){
//            throw new IllegalArgumentException("Type cannot be null or empty");
//        }
//        switch (type.toUpperCase()) {
//            case "BYTE":
//                return new ByteReader();
//            case "CHAR":
//                return new CharacterReader();
//            case "LINE":
//                return new LineReader();
//            case "OBJECT":
//                return new ObjectReader();
//            default:
//                throw new IllegalArgumentException("unknown reader type %s ".formatted(type));
//        }
//    }
}
