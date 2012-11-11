package com.stoyanr.concurrent;

public interface EvictionScheduler<K, V> {

    public void scheduleEviction(ConcurrentMapWithTimedEvictionDecorator<K, V> map,
        EvictibleEntry<K, V> e);

    public void cancelEviction(ConcurrentMapWithTimedEvictionDecorator<K, V> map,
        EvictibleEntry<K, V> e);

    public void cancelAllEvictions(ConcurrentMapWithTimedEvictionDecorator<K, V> map);
}
