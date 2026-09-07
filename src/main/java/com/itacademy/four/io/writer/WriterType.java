package com.itacademy.four.io.writer;

public enum WriterType {

    BYTE("Byte Writer", "Upisivanje byte po byte", new ByteWriter()),
    CHAR("Char Writer", "Upisivanje charpo char", new CharWriter()),
    LINE("Line Writer", " Upisivanje line po line", new LineWriter()),
    OBJECT("Object Writer", "Upisivanje cijelog objekta odjednom", new ObjectWriter());

    private String name;
    private String description;
    private Writer writer;

    WriterType(String name, String description, Writer writer) {
        this.name = name;
        this.description = description;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Writer getWriter() {
        return writer;
    }
}
