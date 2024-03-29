  class stringbufferandstringbuilder {
    public static void main(String[] args) {

        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());  //output of these two line is 16. by default stringbuffer has 16 empty spaces.

        StringBuffer sb = new StringBuffer("Darshil");
        System.out.println(sb);
        System.out.println(sb.capacity()); //output = 7+16=23
        System.out.println(sb.length()); //gives length. here =7

        sb.append(" Developer"); //add " Developer" to original sb. it Concatenates not modify.
        System.out.println(sb);

        sb.insert(8,"Java");
        System.out.println(sb); // output:- Darshil JavaDeveloper

        sb.delete(8, 12); //end index not included
        System.out.println(sb);// output:- Darshil Developer
        
    }

}

// Theory:

// In this lecture we are discussing about:
// 1)StringBuffer class and StringBuilder class
// 2)Different method of thes class
// a)capacity()
// b)length()
// c)append()
// d)insert()
// e)deleteCharAt()
// f)convert to String -- toString() 
// and there are many method you should  explore from your side
// 3)Difference Between StringBuilder vs StringBuffer

// #1
// StringBuffer class and StringBuilder class
// --  string buffer and string builder class in java used to create mutable string 

// #2
// Different method
//  --First Create StringBuffer object 
//         StringBuffer sb = new StringBuffer("Hello");
//  --Find capacity of StringBuffer 
//         System.out.println(sb.capacity());
//         -- default capacity is 16

// --Find the length of StringBuffer Created String
//         System.out.println(sb.length());
    
// --To append the content in existing StringBuffer object
//         sb.append(" World");

// --To Convert StringBuffer Object into String Object
//         String str=sb.toString();
//         System.out.println(str);

// -- Delete charcter of particular index
//         sb.deleteCharAt(3);
//         -- delete character at index 3

// -- Insert "hi " at index 0 of existingStringBuffer Object
//         sb.insert(0, "Hi ");
//         System.out.println(sb);

// #3
// Difference between StringBuffer and StringBuilder
//        -- StringBuffer is thread safe
//        -- StringBuilder is not thread safe
// Imp: We will discuss thread safe when we study multithreading

