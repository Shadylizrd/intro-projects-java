// Task set: practice manual compilation via the terminal
public class Compiling {
    public static void main(String[] args) {
    
        System.out.println("Java is a class-based language.");
        System.out.println("Java classes have a 'main' method.");
        System.out.println("Java statements end with a semicolon.");
    
        System.out.println("Programming is... fun!");  
      }
    
}

/*
 use "javac FILENAME.java" to manually compile code so you can see errors.
 Use the gitbash terminal, must start with "$" sign.
 */

// output from manual compilation:

 /*
$ javac Compiling.java
Compiling.java:7: error: ';' expected
        System.out.println("Java statements end with a semicolon.")
1 error
  */

// type "ls" to list all available files

/*  
Manual compilation creates an executable "class" file,
e.g FileName.class, this means you can run it from the terminal.
To run this class file you would write "java FileName", leaving
out the "class" part
*/