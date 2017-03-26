import java.lang.*;

public class WalkingBaby
{
	public static void main(String[] args)
	{
		int timeOnCouch = 0;
		int timeOffCouch = 0;
		int distFromCouch = 0;
		int rand = 0;
		for (int i = 0; i < 1000000000; i++)
		{
			if (distFromCouch == 0)
			{
				timeOnCouch++;
				rand = (int)(Math.random() * 4);
				if (rand == 0)
					distFromCouch++;
			}
			else
			{
				timeOffCouch++;
				rand = (int)(Math.random() * 4);
				if (rand == 0)
					distFromCouch++;
				if (rand == 2 || rand == 3)
					distFromCouch--;
			}
		}
		System.out.println((timeOnCouch * 1.0)/(timeOnCouch + timeOffCouch));
	}
}