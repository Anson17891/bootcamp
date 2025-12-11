
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
  }
}
