package com.oocl.mnlbc.homework.w2.d3.thread.v2;

public class HelloThreadTest
{
    public static void main(String[] args)
    {
        HelloThread r = new HelloThread();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

    }

}

class HelloThread implements Runnable
{
    // int i;
    // share i for two threads 
    // the result: 0 to 49
    @Override
    public void run()
    {
        int i = 0;
        // each thread will have one variable i, and there is no effect with each other
        // 0 to 49 double 
        while (true)
        {
            System.out.println("Hello number: " + i++);

            try
            {
                Thread.sleep((long) Math.random() * 1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            if (50 == i)
            {
                break;
            }
        }

    }
}
