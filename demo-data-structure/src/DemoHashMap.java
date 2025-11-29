import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoHashMap {
  public static void main(String[] args) {
    // Key & Value
    //!Value-> can be any type of object

    //eg.
    //Fruits : Orange, Apple, Banana
    //Animals: Rabbit, Monkey
    ArrayList<String> fruits = new ArrayList<>(List.of("Orange","Apple","Banana"));
    ArrayList<String> animals = new ArrayList<>(List.of("Rabbit","Monkey"));

    //<Key,Value>
    HashMap<String, ArrayList<String>> dictionary1 = new HashMap<>();
    dictionary1.put("fruits",fruits);
    dictionary1.put("animals",animals);

    //use Key to find corresponding value
    ArrayList<String> listOfFruits = dictionary1.get("fruits");
    System.out.println(listOfFruits);
    ArrayList<String> listOfAnimals = dictionary1.get("animals");
    System.out.println(listOfAnimals);

    //Add a new animal
    dictionary1.get("animals").add("Tiger");//dictionary1.get("animal") returns list "animal"
    System.out.println(listOfAnimals);//[Rabbit, Monkey, Tiger]

    animals.add("Lion"); //directly use obj.ref also ok, but what if dictionary1.put(new ArrayList<>(List.of("Rabbit","Monkey")));
    System.out.println(listOfAnimals);//[Rabbit, Monkey, Tiger, Lion]


    //! Definition of put()
    //Function: 1. if key exist, override the value, otherwise, add a new entry
    dictionary1.put("fruits",new ArrayList<>(List.of("lemon")));
    System.out.println(dictionary1);//{fruits=[lemon], animals=[Rabbit, Monkey, Tiger, Lion]}
    //!Key"fruits" direct to another list
    System.out.println(fruits);//!Obj-Ref fruits still exist ,still consuming memory

    //Example2 : key=Integer(not int), value=String
    HashMap<Integer, String> classmates = new HashMap<>();
    classmates.put(1,"John");
    classmates.put(2,"Peter");
    System.out.println(classmates.get(2));//"Peter"
    //replace key=2 by Mary
    classmates.put(2,"Mary");
    System.out.println(classmates.get(2));//"Mary"
    //if key not exist
    System.out.println(classmates.get(3));//null

    System.out.println(classmates.size());//# of entries //2
    System.out.println(classmates.isEmpty());//false
    System.out.println(classmates.remove(1));//!remove key and return removed value
    System.out.println(classmates.get(2));//!Mary won't become 1
    System.out.println(classmates.size());//1

    //loop hashMap ->loop entry
    //Entry Object has two methods: getKey(), getValue()
    for(Map.Entry<Integer,String> student: classmates.entrySet()){ //classmates.entrySet() become a set
      System.out.println("student no=" + student.getKey() + ", student name=" + student.getValue());
      //student no=2, student name=Mary
    }

    System.out.println(classmates.containsKey(2));//true
    System.out.println(classmates.containsKey(1));//false, has been removed

    System.out.println(classmates.containsValue("Mary"));//true
    System.out.println(classmates.containsValue("mary"));//false



  }
}
