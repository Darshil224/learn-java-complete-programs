@FunctionalInterface
interface A{
    public int add(int i, int j);
}


class Demo{
    public static void main(String[] args) {
        // A obj = new A(); //error: Cannot instantiate the type interface A

        //we can use anonymous inner class
        // A obj = new A(){
        //     public int add(int i, int j){
        //         return i+j;
        //     }

        // };

        //using lambda expression:-      lambda expression only works with functional interface(because it has only one method)


        A obj = (i,j) ->  i+j;   //when you have one expression with return, then no need to write return in lambda expression. it becomes return by default.
            

         

        int b=obj.add(4,5);
        System.out.println("the sum is : "+ b);

    }
}

/**Theory: 
 * In this lecture we are discussing about lambda expression:
 
#1
 -- if we have a functional interface 
  interface A{
   int add(int i, int j);
  }
in this case, we return int type from add a method for that we can write a lambda expression 
in different ways.
-- if we have a single statement you do not need of curly braces
A obj1 =(i,j)- return i+j;

-- if we want to return something in a single statement, no need to mention the return keyword
A obj2 =(i,j)-i+j;

#2 
Example:
 class Main{
    public static void main(String[] args){
        // Anonymous class with lambda expression 
        //if you have single statement and want to return something then you need not to write return keyword and curly braces
       A obj= (i,j)- i+j;
         System.out.println(obj.add(5,6));
//lambada expression works with functional interface
    }
 }

 interface A{
    public int add(int i,int j);
 }
 */