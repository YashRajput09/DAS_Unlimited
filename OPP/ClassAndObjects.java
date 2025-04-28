public class ClassAndObjects {

    // main class -> program execution start form here
    public static void main(String[] args) {
        Name n = new Name(); // Name - class name, n - object name, new keyword is used to allocate memory to
                             // the object, Name() is a constructor.
        n.printName(); //call printName method of class Name
        n.setNo(9); 
        System.out.println(n.no);
        n.no = 10; 
        System.out.println(n.no);

    }
}

    // class is a collection of properties and methods,
    // or we can say class is a blue print of object.
     class Name {
        // properties
        String name = "Yash";
        int no = 9;

        // methods
        void printName() {
            System.out.println("Name: " + this.name);
        }
        void setNo(int no) {
            this.no = no;
        }
    }

