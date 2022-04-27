import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {                            //This data structure is also a set, so there can only ever be one copy of the exact same content
                                                                        //The main difference to HashSet is that this is being SORTED and that the sorting mechanism can be customized via Comparable
        TreeSet<String> treeSet = new TreeSet<String>();                //But this also makes this data structure slower during computing

        treeSet.add("Hannah");
        treeSet.add("Jochen");
        treeSet.add("Franz");
        treeSet.add("Hannah");
        treeSet.add("Karl");

        System.out.println(treeSet.toString());

        System.out.println();

        TreeSet<Student> betterTreeSet = new TreeSet<Student>();    //We can set up our own data types to be stored

        betterTreeSet.add(new Student("Hannah", 22));
        betterTreeSet.add(new Student("Jochen", 24));
        betterTreeSet.add(new Student("Franz", 23));
        betterTreeSet.add(new Student("Hannah", 22));
        betterTreeSet.add(new Student("Karl", 21));

        System.out.println(betterTreeSet.toString());

        Iterator<Student> itr = betterTreeSet.iterator();           //The Iterator allows for customized manipulation of data structures
        while(itr.hasNext()) {                                      //This while loop adds a --- between the content of the structure when printed to console
            Student s = itr.next();
            System.out.print(s + " --- ");
            if(s.getAge() > 22) {                                   //This if junction removes all Student data types from the structure with an age attribute higher than 22
                itr.remove();
            }
        }

        System.out.println();
        System.out.println(betterTreeSet.toString());
    }
}