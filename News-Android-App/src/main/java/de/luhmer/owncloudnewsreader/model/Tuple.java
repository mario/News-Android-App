package de.luhmer.owncloudnewsreader.model;

// TODO replace with Pair
public class Tuple<E, T> {
    public final E key;
    public final T value;
    public Tuple(E key, T value) {
        this.key = key;
        this.value = value;
    }
}
