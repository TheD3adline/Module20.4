public class Student implements Comparable {

    private String firstName;
    private int age;

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {                //Setting up out own data types obviously requires us to tell Java how we want them sorted
        if(o instanceof Student) {                  //Regular overwrite to sort by this.age attribute
            Student other = (Student) o;
            if(this.age < other.age) {
                return -1;
            }
            if(this.age > other.age) {
                return 1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {                                      //Overwrite for .toString()
        return "Age: " + this.age + ", Name: " + this.firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
