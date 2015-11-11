package nhanngo.com.model;



public class GiftCode {
	private String giftCode;
	private String hashKey;

	public String getHashKey() {
		return hashKey;
	}

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

	public String getGiftCode() {
		return giftCode;
	}

	public void setGiftCode(String giftCode) {
		this.giftCode = giftCode;
	}

	public GiftCode(String giftCode,String hashKey ) {
		super();
		this.giftCode = giftCode;
		this.hashKey=hashKey;
	}

	public GiftCode() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		int hashLeght=hashKey.length();

		if(hashLeght!=0)
		{
			char []splitHashKey=new char[hashLeght];
			for(int i=0;i<hashLeght;i++)
			{
				splitHashKey[i]=this.hashKey.charAt(i);
				if(i==0)
					this.giftCode=splitHashKey[i]+this.giftCode;
				else
					this.giftCode=this.giftCode+splitHashKey[i];
			}
		}
		return this.giftCode;
	}

}
