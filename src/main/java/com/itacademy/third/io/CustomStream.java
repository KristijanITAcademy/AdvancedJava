package com.itacademy.third.io;

import java.io.Closeable;
import java.io.IOException;

public class CustomStream  implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Netko je pozvao metodu close");
    }
}
