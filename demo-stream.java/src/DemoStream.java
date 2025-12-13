
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  
  public static void main(String[] args) {
    List<String> names = List.of("Mary", "Jenny", "Tommy", "Alex", "Sue");
    //w/o stream -> use for+if ->use 4~5 lines

    // With stream, only ONE line
    //! filter()
    List<String> names2 = names.stream()//.stream() -> return Stream<String>
         .filter(n -> n.length()>4) //.filter(Predicate<> condition)       -> if()
         .collect(Collectors.toList());//collect() -> reutrn List<String>

    System.out.println(names);//[Mary, Jenny, Tommy, Alex, Sue]
    System.out.println(names2);//[Jenny, Tommy]

    //! sorted()
    //!Compare is a functional interface
    //Comparator<String> sortedByDecs = (s1, s2) -> s1.compareTo(s2)>0? -1:1;  
    List<String> names3 = names.stream()//
         .filter(n -> n.length() % 2==1)//
         .sorted((s1, s2) -> s1.compareTo(s2)>0? -1:1)//if only sort() ->sort by natural order
         .collect(Collectors.toList());
        System.out.println(names3);//[Tommy, Sue, Jenny]
  
  

  //filter
  //List<Person> Tommy-18, Jenny-30, Benny-42, John-23
  //use stream, filter name,with J, age>25

  List<Person> people = new ArrayList<>();
  people.add(new Person("Tommy", 18));
  people.add(new Person("Jenny", 30));
  people.add(new Person("Benny", 42));
  people.add(new Person("John", 23));

  List<Person> people2 = people.stream()//
                               .filter(p -> p.getName().toLowerCase().contains("J") && p.getAge()>25)//
                               .collect(Collectors.toList());
  System.out.println(people2.toString());


  //! map()  : restruct List type : eg. List<Person>->List<String>
  List<String> personNames = people.stream()//
                                  .filter(p -> p.getName().endsWith("y"))
                                  .map(p -> p.getName())//
                                  .collect(Collectors.toList());
              System.out.println(personNames); //[Tommy, Jenny, Benny]

   List<Integer> personAges = people.stream()//
                                  .filter(p -> p.getName().endsWith("y"))
                                  .map(p -> p.getAge())//
                                  .collect(Collectors.toList());
              System.out.println(personAges); //[18, 30, 42]

  //! print out
  people.stream()//
        .forEach(p -> System.out.println("Person, age=" + p.getAge() + 
      ", name=" + p.getName()));

  
  List<String> staffNames = List.of("Mary", "Jenny", "Tommy", "Alex", "Sue", "Tommy");
  List<String> uniqueStaffName = staffNames.stream()//
                                           .distinct()//!remove duplicate
                                           .collect(Collectors.toList());
  System.out.println(uniqueStaffName);//[Mary, Jenny, Tommy, Alex, Sue]

  //! collect to set
  Set<String> uniqueStaffNames2 = staffNames.stream()//
                                            .collect(Collectors.toSet());
                                            System.out.println(uniqueStaffNames2);

  //Summary: Intermediate operation., terminal opperation
  List<String> names4 = List.of("Sue", "Jenny", "Benny");
  List<Character> chs = names4.stream()//
        .filter(e-> e.endsWith("y"))//Intermediate operation ->Stream<String>
        .map(e -> e.charAt(0))//Intermediate operation       ->Stream<Character>
        .collect(Collectors.toList());//Terminal operation   ->List<Character>  //other than toList,toMap, toSet, etc
        System.out.println(chs);//[J, B]

  List<String> names5 = List.of("Sue", "Jenny", "Benny", "Benny");
  long numberOfName = names5.stream()//
        .distinct()//intermediate ->Stream<String>
        .count();//Terminal operation ->long
  System.out.println(numberOfName);//3
  
  //map + count
  long numberOfName2 = names5.stream()//
                             .map(e->{
                              System.out.println("hello" + e);
                              return e.length();
                             })//
                             .count();//4  //!if map + count -> skip map

  //lambda + block
  Person p1 = Person.builder().name("John").age(12).build();
  Person p2 = Person.builder().name("Kelly").age(40).build();
  Person p3 = Person.builder().name("Jacky").age(25).build();
  List<Person> staffs = List.of(p1, p2, p3);
  List<String> staffName2 = staffs.stream()//
        .filter(e ->{
          System.out.println("filter name=" + e.getName()); 
          return e.getAge()>=20;
        })//
        .map(e -> {
          System.out.println("map name=" + e.getName());
          return e.getName().toUpperCase();
        })//
        .collect(Collectors.toList());
  System.out.println(staffName2);
  /*filter name=John
filter name=Kelly
map name=Kelly
filter name=Jacky
map name=Jacky */ //filter->map-(next element)>filter->map-...>


  //Stream.class
  Stream<String> emails = Stream.of("leo@gmail.com", "jacky@gmail.com", "jenny@gmail.com"); //dont new object  same as List.of
  long numOfValidEmail = emails.filter(e -> e.contains("@"))// use Stream<> not need .stream(), but usally not start from stream
        .count();                                            //usally start from list/map/set...
        System.out.println(numOfValidEmail);//3



  }
}
