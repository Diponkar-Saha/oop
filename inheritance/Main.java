package inheritance;

public class Main {
    public static void main(String[] args) {
        Animal object=new Animal();
        object.dog();
        object.cat();
        System.out.println( "cat class variable : "+object.name);

    }
}
