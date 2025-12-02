
import java.util.ArrayList;
import java.util.HashMap;

//!Generic supports multiple types of definitions
//Entry
public class CustomMap<K, V> {
  private ArrayList<CustomEntry<K, V>> entries;//HashMap can store many types of entries, see DemoHashMap (eg fruits, animals...)

  public CustomMap(){//empty constructor
  this.entries = new ArrayList<>();//new ArrayList<>() default be ArrayList<CustomEntry<K, V>>?
  }
  
  public void put(K key, V value){//put new entry into old entries
    this.entries.add(new CustomEntry<>(key, value));
  }

  public V get(K key){
    if(key == null)
      return null; //in case there are no key
    for(CustomEntry<K, V> entry : entries){
      if(entry.getKey().equals(key)){ //see enum(similar intermsof 2 linkd values)
        return entry.getValue();
      }
    }
    return null; //in case there are no value
  }


  //!DIY
  //containsKey()
  public boolean containsKey(K key){
    for(CustomEntry<K,V> entry : entries){
      if(entry.getKey().equals(key)){
        return true;
    }
      }
    return false;
    }
  
  //containsValue()
  public boolean containsValue(V value){
    for(CustomEntry<K,V> entry : entries){
      if(entry.getValue().equals(value)){
        return true;
    }
      }
    return false;
    }

  //size()
  public int size(){
    int count = 0;
    for(CustomEntry<K,V> entry : entries){
      count++;
  }
  return count;
}
  //isEmpty()
  public boolean isEmpty(){
    return this.size()==0;
  }

  public static void main(String[] args) {
      HashMap<String, String> map1 = new HashMap<>();
      map1.put("banana", "John");
  

  CustomMap<String, String> map2 = new CustomMap<>();
  map2.put("banana", "John");

  System.out.println(map1.get("banana"));//John

  }
}

