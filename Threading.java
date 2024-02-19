//default thread (main() is default thread in java)

class Threading
{
    public static void main(String args[])
    {
        Thread t = new Thread().currentThread();
        System.out.println("current thread : " + t);

        t.setName("My First Thread");
        System.out.println("After Change Name : " + t);
    }
}
