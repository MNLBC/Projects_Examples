package com.oocl.mnlbc.homework.w2.d3.thread.v2;

public class IncreaseThread extends Thread
{
    private NumberHolder numberHolder;

    public IncreaseThread(NumberHolder numberHolder)
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
            numberHolder.increase();
        }
    }

}