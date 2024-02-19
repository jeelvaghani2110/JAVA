//by extending Runnable Interface

class Threadcreation2 implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=1 ; i<11 ; i++)
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

class main2
{
    public static void main(String args[]) 
    {
        Threadcreation2 t3 = new Threadcreation2();
        Threadcreation2 t4 = new Threadcreation2();
        t3.start();   //if we call run method so thread t1 is run first and then t2
        t4.start();   //if we call start method so both object are run same time
        
        System.out.println(t3.currentThread());
    }
}

