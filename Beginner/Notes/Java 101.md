# What is Java?
- Java is Prog language.
- It is high level Language. Which is based on object oriented programming concept
- It is highly secure and platform independent language. It is also often reffered as a platform because it has its on Java Runtime Environment (JRE) and API.

# Features 
- Automatic garbage collection
- Dynamic
- Multithreadding
- Platform independent ---> Write once run anywhere
- Portable
- Secure
- Distributed
- Simple
- High performance
- Interpreted

# Architecture

Java --interpreted--> Source Code --> Java Compiler--> Byte-Code --> JVM --> OS

![img.png](img.png)

<h3> Java Virtual Machine (JVM)</h3>

- It is a component which provides an environment for running java programs.
- It reads bytecode and convert to machine code

![img_1.png](img_1.png)

<h3> How is Java is Platform Independent? </h3>

Since, there is no change in the source code and JVM is different for every OS which does the work for portability.
Hence, its pretty simple and easy to use a Java code once written on Windows to run on Mac or Linux.

Java code  ---> compiler ---> byte code ---> class files

JRE or Java Runtime Environment contains JVM class libraries and other components.

JVM does Just in time compilation (JIT) means it converts source code to machine code jsut in time it goes to a new OS and has to do no change into the source code

<h3> Class Loader </h3>
- It loads all the classes and files required to execute the program.
- It makes the program secure by seperating the namespace for class.

<h3> Byte Code Verifier</h3>
Verifies the byte code to check any security problems are there in code.

# Why Java is secure?

As JRE and Java Arch, the byte code is inspected carefully before execution. Mainly, done by loader and byte code verifier.

# How does Java attains memory management?
It does through garbage collection.

    public class TestGarbage1{  
    public void finalize(){

    System.out.println("garbage collected through object");
    }  
    public static void main(String args[]){

    TestGarbage1 o1=new TestGarbage1();  
    TestGarbage1 o2=new TestGarbage1();  

    o1=null;  
    o2=null; 

    System.gc();  
        }  
    } 
Every object created has some memory allocated for this obj. When not used java assumes it has no need and destroys it.
Hence, memory is reclaimed.

![img 3](img_3.png)

- Java follows unicode that is why it has 2 byte space.

# Data types

![img_2.png](img_2.png)
