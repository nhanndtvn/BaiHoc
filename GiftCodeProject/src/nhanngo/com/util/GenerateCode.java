package nhanngo.com.util;

import java.awt.RadialGradientPaint;
import java.util.ArrayList;
import java.util.Random;

import nhanngo.com.model.HashKey;

public class GenerateCode {

	public static ArrayList<String> generateSequenceNumber(int length)
	{

		ArrayList<String> result=new ArrayList<>();

		try
		{
			double initLoop=Math.pow(10, length);
			for(int i=0;i<initLoop;i++)
			{
				result.add(i, "" + i);

				while(result.get(i).length()<length)
				{
					result.set(i,"0"+result.get(i));					
				}			
			}			
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			result=null;
		}

		return result;
	}
	public static String generateNumberRandom(int length)
	{
		String msg="";
		Random rd=new Random();
		for (int i=0;i<length;i++)
		{
			msg=msg+rd.nextInt(10)+"";
		}
		
		return msg;
	}
}
