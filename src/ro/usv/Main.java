package ro.usv;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
    public interface UnaryPredicate<T> {
        public boolean test(T obj);
    }
    static class OddPredicate implements UnaryPredicate<Integer> {
        public boolean test(Integer i) { return i % 2 != 0; }
    }
    public static void main(String[] args) {
	// write your code here

        // Example 1:Generate 10 random numbers between 1 and 20, which require that the random numbers cannot be repeated and Write a program to traverse(or iterate) HashSet
        TreeSet<Integer>  numbers= new TreeSet<Integer>();
        Random r = new Random();
        int low = 10;
        int high = 20;
        int result = r.nextInt(high-low) + low;
        numbers.add(result);
        for(int i=1;i<10;i++)
        {result=r.nextInt(high-low) + low;

            while(numbers.contains(result))
                result=r.nextInt(high-low) + low;
        numbers.add(result);
        }
        Iterator<Integer> itint = numbers.iterator();

        while(itint.hasNext())
        {
            System.out.print(itint.next()+" ");
        }
        System.out.println();

        //Example 2: Use Scanner to read a line of input from the keyboard, remove duplicate characters, and print out different characters  and Write a program to traverse(or iterate) HashSet
        LinkedHashSet<Character> characters= new LinkedHashSet<>();
        System.out.println("Type a sentence: ");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        for (char c:str.toCharArray())
        {
         characters.add(c);
        }
        Iterator<Character> itchar= characters.iterator();

        while(itchar.hasNext())
        {
            System.out.print(itchar.next()+" ");
        }
        System.out.println();

        //Example 3: Remove duplicate elements in the collection, Write a program to traverse(or iterate) HashSet
        //Example 5:
        // Given an element write a program to check if element exists in ArrayList, HashSet (eg. class Stundent with name, grade and personalCode, given list of students check if the given student is present in the list)
        ArrayList<Student> students= new ArrayList<>();
        Student s1= new Student("Claudiu","Reut",7);
        Student s2= new Student("Denisa","Popovici",33);
        Student s3= new Student("Ionel","Ionescu",6);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(new Student("Claudiu","Reut",7));
        LinkedHashSet<Student> studentSet
                = new LinkedHashSet<Student>();
        Iterator<Student> itstudent= studentSet.iterator();
        studentSet.addAll(students);
        System.out.println(studentSet);
        while(itstudent.hasNext())
        {
            if(s1.equals(itstudent.next()))
            {System.out.println("Element "+s1.toString()+"  was found in hashset");
            break;
            }
        }

        ///Example 6: Write a program to iterate the HashMap

        HashMap<Integer,String> hashmap= new HashMap<>();
        hashmap.put(s1.getId(),s1.getLastName());
        hashmap.put(s2.getId(),s2.getLastName());
        hashmap.put(s3.getId(),s3.getLastName());

        for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }

        //Example 7:  Write a program to sort ArrayList using Comparable and Comparator
        Collections.sort(students);

        System.out.println(students.toString());




        ////Generics
        //Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
        System.out.println();
        System.out.println("**Generics**");
        System.out.println();
        Library<Media> library= new Library<>();
        Book b= new Book("Murder on the Orient Express","Agatha Christie","1935",200,12,"mistery","Adevarul");
        Video v= new Video("ExampleVid","Author",30,1080,1920,"mp4");
        Newspaper n= new Newspaper("Monitorul de Suceava","Nume", "Monitorul","15.07.2022");
        library.addMedia(b);
        library.addMedia(v);
        library.addMedia(n);
        library.showMedia();

        //rite a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes)
        //hint: countIf(collection, strategy)//generic types - the strategy will be what we want to count  (for example, odd integers, prime numbers, palindromes)
        System.out.println(countIf(numbers, new OddPredicate() ));

    }
}
