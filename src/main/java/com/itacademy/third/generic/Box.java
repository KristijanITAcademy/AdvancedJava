package com.itacademy.third.generic;

/**
 * F - > genericni tip -  > unbounded nemaju ogranicenja
 * - ovaj F mozes koristit kao tip podatka
 * - genericni tip mozes koristit na nivou klase
 *
 * @param <F>
 */
public class Box <F, E>{
    private F field;
    private E element;

    public F getField() {
        return field;
    }

    public void setField(F field) {
        this.field = field;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
