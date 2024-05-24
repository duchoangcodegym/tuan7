package staticMethod;
public class Main {
    public static void main(String[] args) {
        StaticMethod.change();

            //creating objects
        StaticMethod s1 = new StaticMethod(111, "Hoang");
        StaticMethod s2 = new StaticMethod(222, "Khanh");
        StaticMethod s3 = new StaticMethod(333, "Minh");
            s1.display();
            s2.display();
            s3.display();
        }

    }