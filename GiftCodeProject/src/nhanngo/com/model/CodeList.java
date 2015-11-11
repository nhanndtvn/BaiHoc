package nhanngo.com.model;

import java.util.HashMap;
import java.util.Random;

import nhanngo.com.util.GenerateCode;

public class CodeList {
	HashMap<String, Code> giftCodeList;

	public HashMap<String, Code> getGiftCodeList() {
		return giftCodeList;
	}

	public void setGiftCodeList(HashMap<String, Code> giftCodeList) {
		this.giftCodeList = giftCodeList;
	}

	public CodeList() {
		super();
		this.giftCodeList=new HashMap<>();
	}
	private void addGiftCode(String key, Code value)
	{
		this.giftCodeList.put(key, value);
	}
	public void generateNumberCode(int length)
	{
		//Generate HashKey
		HashKeyList hashKeyList=new HashKeyList();
		hashKeyList.generateNumKey(length);
		
		
		//Generate code
		for(HashKey key: hashKeyList.getHashKeyList().values())
		{
			String strCode=GenerateCode.generateNumberRandom(length-(length/2));
			Code objCode=new Code(strCode, key);
			addGiftCode(key.getHashKey(), objCode);
		}		
	}
	public void showCodeList()
	{
		for (Code code:giftCodeList.values())
		{
			//System.out.println(code);
		}
	}

}
