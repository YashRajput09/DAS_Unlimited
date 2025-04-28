public class AccessModifires {
    public static void main(String[] args){
        Modifires m = new Modifires();
        m.pwd();
        System.out.println(m.a);
        System.out.println(m.Name);
        System.out.println(m.StudyTime);
    }
}

     // Access Modifire Types

     // 1. private - Accessible only within the same class.
     //  - Not accessible from other class or subclasses

     // 2. default - Accessible only within the same package.
     //   -Not visible to classes in different packages, even if they are subclasses.

     // 3. protected - Accessible within the same samae package and in the subclasses, 
     //  -Even if they are in different packages.

     // 4. public - Accessible  from anywhere - any class, package, or subclass.

     class Modifires{
        private String password = "Yasshu...";          // private
        int a = 9;                                      // default        
        protected String Name = "Yash Rajput";          // protected
        public String StudyTime= "Todays study time is 5 hr+";   // public 

        void pwd(){
            System.out.println(password); // private
        }
     }
