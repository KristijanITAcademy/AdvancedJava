package com.itacademy.six.demo;

import com.itacademy.four.io.reader.Reader;
import com.itacademy.four.io.reader.ReaderException;
import com.itacademy.four.io.reader.ReaderFactory;
import com.itacademy.four.io.reader.ReaderType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class PersonReader {

   public List<Person> readPersons (String personFilePath) {
       List<Person> personList = new ArrayList<>();
       Reader reader = ReaderFactory.createReader(ReaderType.LINE);

       try {
           String allPersonsContent = reader.read(personFilePath);
           String lineSeparator = System.lineSeparator();
           //kazemo lineSeparator zbog operativnog sustava koji se nalazi na racunalu
           //moze biti linux, windows, os itd.. tako da Java prepozna i tako ga tretira
           String [] personContentArray = allPersonsContent.split(lineSeparator);
           for (String line : personContentArray){
               String[] personFields = line.split(";");
               Person person = new Person();
               person.setName(personFields[0]);
               person.setSurname(personFields[1]);
               person.setGender(Gender.fromCode(personFields[2].trim()));
//               person.setBirthday(LocalDate.parse(personFields[3]));

               String date = personFields[3].trim();
               String [] dateParts = date.split("-");
               int year = Integer.parseInt(dateParts[0].trim());
               int month = Integer.parseInt(dateParts[1].trim());
               int day = Integer.parseInt(dateParts[2].trim());
               LocalDate birthday = LocalDate.of(year, month, day);
//               String date = personFields[3];
//               LocalDate birthday = LocalDate.parse(date);
               person.setBirthday(birthday);
               personList.add(person);
           }
//           System.out.println(allPersonsContent);
       }catch (ReaderException  readerException){
           System.err.println(readerException.getMessage());
       }
       return personList;
   }

}
