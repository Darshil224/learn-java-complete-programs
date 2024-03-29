
enum Status{ //Status is like a class
    Running, Failed, Pending, Success;  //These all are like objects of Status (constants). we can use any of these objects.

} 
 
 
 class Demo{
    public static void main(String[] args) {
        //int i = 5;
      
        Status s =Status.Running;   //int i = 5; it is like this.
        Status f =Status.Failed;   //int i = 5; it is like this.
        Status p =Status.Pending;   //int i = 5; it is like this.
        System.out.println(s);
        System.out.println(f);
        System.out.println(p);
        
        System.out.println(s.ordinal()); //printing index of objects, in java starts from 0
        System.out.println(f.ordinal());
        System.out.println(p.ordinal());

        Status[] a = Status.values(); ///printing values  by creating array.

        System.out.println(a[1]);

         
        }

    }
 
 /**Theory:-
  * 
In this lecture we will learn:
- Enumeration in Java
- What is an enum in Java?
- How to use an enum in Java?
- Methods used with enum

#1
Enum is a short term used for Enumeration.
Enumerations serve the purpose of representing a group of named constants in a programming language.

#2
-Java Enums can be thought of as classes that have a fixed set of constants 
- Enum is named constants that we create for specific constants or error codes.
- Enum is created in place of an object for constants.
- Enum is pre-defined that contains all name constants.
- Enums are used to create our data type like classes.
- In enum, instead of returning a string format or a specific object, we can simply return a status or a value present inside an enum.
e.g.,  enum Status{
   Running, Failed, Pending, Success;
  }
- enum is also treated as a class in Java. Objects can also be created for enum like:
 Status s= Status.Running;
- Every enum constant represents an object of type enum.
- enum type can be passed as an argument to switch statement

#3
- In enum, all the name constants are defined by using numbers.
- ordinal() method is used to get the index of the name constant present in the enum.
- values() method is used to get all the statuses or name constants of enums.
 Status [][] s= Status.values();
*values() method will give an array.
  */