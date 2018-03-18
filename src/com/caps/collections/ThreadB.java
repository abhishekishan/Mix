package com.caps.collections;

public class ThreadB implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Within run Method ThreadB");
		for(int i=10; i > 0; i--)
		{
			System.out.println("i= "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
