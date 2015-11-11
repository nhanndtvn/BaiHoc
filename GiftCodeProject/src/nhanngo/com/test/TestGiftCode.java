package nhanngo.com.test;

import nhanngo.com.model.GiftCodeList;

public class TestGiftCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GiftCodeList giftCodeList=new GiftCodeList();
		
		giftCodeList.numberGenerateCode(5);
		
		giftCodeList.showGiftCodeList();

	}

}
