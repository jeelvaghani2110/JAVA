import java.util.* ;

class ExceptionHandling2
{
    static void test()
    {
        try 
        {
            System.out.println("jeel");
            System.out.println("vaghani");
            System.out.println(20/0);
        } 

        catch(NullPointerException ae)
        {
            System.out.println("Inside try(): ");
            System.out.println(20/0);
           // throw ae ;
        }

        // System.out.println("good Bye."); //aa statment execute na thay(aerithmetic exception create thay and 
        //Nullponter catch kare aetle default catch thashe and tya j pograme end thay jashe.)

        // finally  //execute karva finally block ma lakhvana and finally block hamesha try catch and then finally
        // j aave(middle ma koi statement lakhi pachhi lakhiyr to error aave)
         
         finally
         {
             System.out.println("good Bye.");
         }

         System.out.println("asd");
}

    public static void main(String args[])
    {
        try
        {
            test();
        }

        catch(NullPointerException ae)
        {
            System.out.println("Inside main(): "+ae);
        }

        finally
        {
            System.out.println("End Of The Programe.");
        }
    }
}  