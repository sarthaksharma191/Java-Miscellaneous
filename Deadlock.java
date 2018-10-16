class Ticketbooking extends Thread
{
    Object train, comp;
    Ticketbooking(Object train, Object comp)
    {
        this.train=train;
        this.comp=comp;
    }
    public void run()
    {
        synchronized(train)
        {
            System.out.println("Ticket booking lock on train");
            try
            {
                Thread.sleep(150);
            }       
            catch(InterruptedException ie)
            {
                System.out.println("catch "+ie);
            }
        }
        System.out.println("ticket booking waiting to lock on compartment");
        synchronized(comp)
        {
            System.out.println("Ticket booking locked on compartent");
        }
    }
}
class cancelTicket extends Thread
{
    Object train,comp;
    cancelTicket(Object train,Object comp)
    {
        this.train=train;
        this.comp=comp;
    }
    public void run(){
    synchronized(comp)
    {
        System.out.println("cancel ticket locked on compartment");
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e){}
        System.out.println("Cancel Ticket waiting to lock on train");
        synchronized(train)
        {
            System.out.println("Cancel ticket locked on train");
        }
    }
}}
class DeadLock
{
    public static void main(String[] args)throws Exception
    {
        Object train=new Object();
        Object comp=new Object();
        Ticketbooking obj1=new Ticketbooking(train,comp);
        cancelTicket obj2=new cancelTicket(train,comp);
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}