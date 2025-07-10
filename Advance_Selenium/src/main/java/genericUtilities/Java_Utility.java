package genericUtilities;

import java.util.Random;

public class Java_Utility {
/**
 * This methods is used to avoid duplicates 
 * @return
 */
	public int getRandomNum()
{
	Random ranNum = new Random(1000);	
	int ran = ranNum.nextInt();
	return ran;
}
}
