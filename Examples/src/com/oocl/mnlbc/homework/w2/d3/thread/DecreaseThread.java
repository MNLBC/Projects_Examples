package com.oocl.mnlbc.homework.w2.d3.thread;

public class DecreaseThread extends Thread
{
    private NumberHolder numberHolder;

    public DecreaseThread(NumberHolder numberHolder)
    {
        this.numberHolder = numberHolder;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 20; ++i)
        {
            // 
            try
            {
                Thread.sleep((long) Math.random() * 1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            // 
            numberHolder.decrease();
        }
    }

}
