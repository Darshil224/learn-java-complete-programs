class Human {
    private int age;  
    private String name;

 //right click on vs code and go to source action; select generate getters and setters:-
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // this is a keyword which represens the current object. current object:-objevt which is calling the method.
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
      
    // public int getAge() {  
    //     return age;  
    // }

    // public void setAge(int a) {
    //     age = a;

    // }

    // public String getName() {
    //     return name; 
    // }

    // public void setName(String n) {
    //     name = n;
    // }

}

class Demo {
    public static void main(String[] args) {

        Human obj = new Human();
        obj.setAge(19);
        obj.setName("Darshil");

       
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}

//theory:-

/*In this lecture we will see:
- Instance variable and Local variable
- Can we declare two or more variables with the same name?
- This keyword and its uses in Java

#1
Instance variable:- These variables are declared within a class but outside a method.
- These variables are created when we create an object and are destroyed when the object is destroyed.

Local variable:- These variables are declared within a method but do not get any default value.
- They are created when we enter a method or constructor and get destroyed when the call returns from the method.

#2
In Java, it is not allowed to declare two or more variables having the same name inside a scope either in class scope or method scope.
- The preference is always given to the local variable.
- Creating an object is not a good idea to solve the issue of conflicting names of instance and local variables.
- We can differentiate between local and instance variables by passing an object itself.
- Instead of writing and passing an object, we can simply use this keyword.

#3
This keyword:-
This keyword represents the current object.
- Current object is an object which is calling the method.
- This keyword is used to invoke the current class constructor.
- Using the 'this' keyword, we can return the current class instance.
-  This keyword can be used as an argument in the constructor call.
 */