public interface Observer<V> {
    public void update(EventType type, V value);
}
