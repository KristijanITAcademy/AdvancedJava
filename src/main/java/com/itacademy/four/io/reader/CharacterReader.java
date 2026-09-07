package com.itacademy.four.io.reader;

import java.io.FileReader;
import java.io.IOException;

 class CharacterReader implements Reader {
    @Override
    public String read(String path) throws ReaderException {

        try (FileReader fileReader = new FileReader(path)){
            StringBuilder stringBuilder = new StringBuilder();
            int c;
            while ((c = fileReader.read()) !=  -1){
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }catch (IOException exception){
            throw new ReaderException(exception.getMessage());
        }
    }
}
