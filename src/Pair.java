import java.util.Objects;
public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null!");
        }
        this.key = key;
        this.value = value;
    }

    /*Getters*/
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    /*toString method*/
    @Override
    public String toString() {
        return String.format("(Key: %s, Value: %s)", key, value);
    }

    /* equals method for comparing key and value*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pair)) return false;
        Pair<?, ?> other = (Pair<?, ?>) obj;
        return Objects.equals(key, other.key) && Objects.equals(value, other.value);
    }

    /*hashCode method*/
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    /*Static factory method*/
    public static <K, V> Pair<K, V> create(K key, V value) {
        return new Pair<>(key, value);
    }
}
