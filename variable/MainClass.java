package variable;


public class MainClass {
    public static void main(String[] args) {
       // three  kinds of variables in Java −
        //Local variables

//       LocalVariable object=new LocalVariable();
//       object.Age();
        //Instance variables

//        InstanceVariable object =new InstanceVariable("dip",22);
//        object.setTitle("developer");
//        object.print();
//        //Class/Static variables
        InstanceVariable.name="Diponkar";
        InstanceVariable.salary=20000;
        System.out.println("name : "+InstanceVariable.name+"\nsalary : "+
                InstanceVariable.salary);


    }

}
