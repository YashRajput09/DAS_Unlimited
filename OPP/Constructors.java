public class Constructors {
    public static void main(String[] args) {
        StudyTime st = new StudyTime("Yash", 7);
        st.setStudyTime();
    }
}

class StudyTime {
    private String name;
    private int hours;

    // Constructor is a special type of method which is invoked automatically at the
    // time of object creation

    // - Constructor have same name as class.
    // - Constructor don't have any return type.
    // - Constructor are only called, at object creation.
    // - Memory allocation happens when constructor is called.
    // - Java automatically create constructor if we can not create.
    StudyTime(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    // set method
    void setStudyTime() {
        System.out.println("Student name : " + name);
        System.out.println("Study time : " + hours);
    }
}
