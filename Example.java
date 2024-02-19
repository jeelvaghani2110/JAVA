// class Exc1
// {
//     static void subroutine()
//     {
//         int d = 0;
//         int a = 10 / d;
//     }
  
//     public static void main(String args[])
//     {
//         Exc1.subroutine();
//     }
// }


// class Exc2 
// {
//     public static void main(String args[])
//     {
//         int d, a;
    
//         try 
//         {
//             // monitor a block of code.
//             d = 0;
//             a = 42 / d;
//             System.out.println("This will not be printed.");
//         } 
        
//         catch (ArithmeticException e) 
//         {
//             // catch divide-by-zero error
//             System.out.println("Division by zero.");
//         }
        
//         System.out.println("After catch statement.");
//     }
// }


// Handle an exception and move on.
// import java.util.Random;

// class HandleError 
// {
//     public static void main(String args[])
//     {
//         int a=0, b=0, c=0;
//         Random r = new Random();

//         for(int i=0; i<20 ; i++) 
//         {
//             try 
//             {
//                 b = r.nextInt();
//                 c = r.nextInt();
//                 a = 12345 / (b/c);
//             }
            
//             catch (ArithmeticException e) 
//             {
//                 System.out.println("Division by zero.");
//                 a = 0; // set a to zero and continue
//             }
//             System.out.println("a: " + a);
//         }
//     }
// }



// import java.util.*;

// class MultipleCatches
// {
//     public static void main(String args[]) 
//     {
//         try 
//         {
//             int a = args.length;
//             System.out.println("a = " + a);
//             int b = 42 / a;
//             int c[] = { 1 };
//             c[42] = 99;
//         } 
        
//         catch(ArithmeticException e) 
//         {
//             System.out.println("Divide by 0: " + e);
//         } 
        
//         catch(ArrayIndexOutOfBoundsException e) 
//         {
//             System.out.println("Array index oob: " + e);
//         }
   
//         System.out.println("After try/catch blocks.");
//     }
// }


// import java.util.* ;

// class SuperSubCatch
// {
//     public static void main(String args[]) 
//     {
//         try 
//         {
//             int a = 0;
//             int b = 42 / a;
//         } 
        
//         catch(Exception e) 
//         {
//             System.out.println("Generic Exception catch.");
//         }
        
//         /* This catch is never reached because
//         ArithmeticException is a subclass of Exception. */
        
//         catch(ArithmeticException e) 
//         { 
//             // ERROR - unreachable
//             System.out.println("This is never reached.");
//         }
//     }
// }