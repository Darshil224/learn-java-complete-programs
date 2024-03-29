abstract class A
{
 public abstract void show();
}
class Demo{
    public static void main(String[] args) {

        A obj=new A(){
                     //anonymous inner class defining and implementing abstract methods of abstract class.
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
- Abstract and anonymous inner class
- Use of anonymous class with an abstract class
- Example of abstract and anonymous inner class.

#1
When you want to use an interface and an abstract class only once, then you can simply use an anonymous innner class in place of that.
- You can also provide the implementation for multiple methods in an anonymous inner class.
- Anonymous inner class can implement only one interface at s time.
- Anonymous inner class can either extend a class or implement an interface at a time.
- We can create object for abstract class by providing the implementation of an abstract method in an anonymous inner class.
e.g.,
abstract class A
{
 public abstract void show();
}

In main methid:
A obj=new A()
{
 public void shoe()
 {
  statement;
 }
};
 */