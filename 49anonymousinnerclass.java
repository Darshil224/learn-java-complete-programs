class A{
    public void show(){
        System.out.println("in A show");
    }
}
// now if we want to deefine new implementation for show() method
// class B extends A{
//     public void show(){
//         System.out.println("in new show");
//     }
// }

//but we are creating a whole new class just for new implementation of a method. solution=anonymous inner class. 

class Demo{
    public static void main(String[] args) {
        // A obj = new A();
        A obj = new A(){
            //anonymous inner class. inner because inside Demo class. anonymous because we their is no name for this class.
            public void show(){      
                System.out.println("in new show");
            }

        };
        obj.show();
    }
}

/**Theory:
 * 
In this lecture we will learn:
- What is the meaning of Anonymous?
- Anonymous inner class in Java
- Syntax of an anonymous inner class
- Important points related to anonymous class

#1
- Anonymous means something that does not have a name.
- In overriding, to provide a new implementation of a method, we need to create a new class and extend it with the parent class. After extending the class, we override the method.
- We can avoid the overriding and do not need to create a new class for this particular task.
- We can use the inner class concept to give a new implementation of a method.

#2
- We can create a new anonymous inner class after creating an object of a class that contains the method.
- We do not need to use a class keyword with an anonymous inner class.
- It just starts with braces and contains the method and its new implementation.
- Anonymous inner class starts just the creation of an object and ends with the semicolon of that object.
e.g., A obj=new A()
  {
   public void show()
   {
    new statement;
   }
  };

#3
- Anonymous class used in the interface, functional interface, lambda expressions.
- Anonymous inner class can implement only one interface at s time.
- It can either extend a class or implement an interface at a time.
- We do not write a constructor for an anonymous inner class because it does not have any class name.
- An anonymous class has access to the members of its enclosing class.
 */