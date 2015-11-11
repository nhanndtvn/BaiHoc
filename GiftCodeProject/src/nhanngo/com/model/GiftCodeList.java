package nhanngo.com.model;

import java.util.HashMap;
import java.util.Random;

public class GiftCodeList {
	HashMap<String, GiftCode> giftCodeList;

	public HashMap<String, GiftCode> getGiftCodeList() {
		return giftCodeList;
	}

	public void setGiftCodeList(HashMap<String, GiftCode> giftCodeList) {
		this.giftCodeList = giftCodeList;
	}

	public GiftCodeList() {
		super();
		this.giftCodeList=new HashMap<>();
	}

	//Generate Number[0-9] giftcode with Specified leght
	public void numberGenerateCode(int lenght)
	{
		
		int hashKeyLenght=lenght/2;
		switch (hashKeyLenght)
		{
		case 1:
		{
			break;
		}
		case 2:
		{			
			compileCode(hashKeyLenght, lenght-hashKeyLenght);			
			break;
		}
		default:
		{
			break;
		}
		}
		
		
	}
	private void compileCode(int hashKey, int lenght)
	{
		
		Random rd=new Random();
		GiftCode giftCode=new GiftCode();
		String sHashKey="";

		for(int i=0;i<hashKey;i++)
		{
			giftCode.setHashKey("");
			giftCode.setGiftCode("");
			
			if(hashKey <100)
			{
				if(i<10)
				{
					sHashKey="0"+i;
				}
				else
				{
					sHashKey=""+i;
				}
			}
			giftCode.setHashKey(sHashKey);
			
			for(int j=0;j<lenght;j++)
			{
				if(giftCode.getGiftCode()==null)
				{
					giftCode.setGiftCode(rd.nextInt(10)+"");					
				}
				else
					
					giftCode.setGiftCode(giftCode.getGiftCode()+rd.nextInt(10)+"");	

			}
			if(!giftCodeList.containsKey(giftCode.getGiftCode()))
				giftCodeList.put(giftCode.getGiftCode(), giftCode);
			
		}
		


		
	}

	public void showGiftCodeList()
	{
		int i=1;
		for (GiftCode gc: this.giftCodeList.values())
		{
			System.out.print(i);
			System.out.println("\t"+gc);
			i++;
		}
	}

}
