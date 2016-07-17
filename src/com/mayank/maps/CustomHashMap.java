package com.mayank.maps;

public class CustomHashMap<K,V> {
	private Entry<K,V>[] table;   //Array of Entry.
    private final int capacity= 4;  //Initial capacity of HashMap
    
    static class Entry<K, V> {
        K key;
        V value;
        Entry<K,V> next;
    
        public Entry(K key, V value, Entry<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    
    @SuppressWarnings("unchecked")
    public CustomHashMap(){
       table = new Entry[capacity];
    }
    
    
    public void put(K newKey, V data){
        if(newKey==null)
            return;    //does not allow to store null.
       
        int hash=hash(newKey);
        Entry<K,V> newEntry = new Entry<K,V>(newKey, data, null);
       
         if(table[hash] == null){
          table[hash] = newEntry;
         }else{
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];
            
            while(current != null){ //we have reached last entry of bucket.
            if(current.key.equals(newKey)){                  
                if(previous==null){  //node has to be insert on first of bucket.
                      newEntry.next=current.next;
                      table[hash]=newEntry;
                      return;
                }
                else{
                newEntry.next=current.next;
                previous.next=newEntry;
                return;
                }
            }
            previous=current;
              current = current.next;
          }
          previous.next = newEntry;
         }
     }
    
    private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }

}