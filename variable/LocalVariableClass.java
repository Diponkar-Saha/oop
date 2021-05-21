package variable;

class LocalVariable{
    //Local variables are declared in methods, constructors, or blocks.
    //
    //Local variables are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor, or block.
    //
    //Access modifiers cannot be used for local variables.
    //
    //Local variables are visible only within the declared method, constructor,
    // or block.
    //
    //Local variables are implemented at stack level internally.
    //
    //There is no default value for local variables, so local variables
    // should be declared and an initial value should be assigned before
    // the first use.
    public void Age(){
        int age =7;
        String name="diponkar Saha";
        System.out.println("i am "+name+"  and age is :"+age);
    }

}
