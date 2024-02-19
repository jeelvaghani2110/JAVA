//by extending thread class

class Threadcreation1 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0 ; i<10 ; i++)
            {
                System.out.println(getId() + " ");
                System.out.println("Thread Run : " + i);
                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {}
    }
}

class main
{
    public static void main(String args[]) 
    {
        Threadcreation1 t1 = new Threadcreation1();
        Threadcreation1 t2 = new Threadcreation1();
        t1.start();   //if we call run method so thread t1 is run first and then t2
        t2.start();   //if we call start method so both object are run same time      
    }
}
