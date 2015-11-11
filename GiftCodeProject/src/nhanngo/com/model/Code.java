package nhanngo.com.model;



public class Code {
	private String giftCode;
	private HashKey hashKey;

	public HashKey getHashKey() {
		return hashKey;
	}

	public void setHashKey(HashKey hashKey) {
		this.hashKey = hashKey;
	}

	public String getGiftCode() {
		return giftCode;
	}

	public void setGiftCode(String giftCode) {
		this.giftCode = giftCode;
	}

	public Code(String giftCode,HashKey hashKey ) {
		super();
		this.giftCode = giftCode;
		this.hashKey=hashKey;
	}

	public Code() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		int hashLeght=hashKey.getHashKey().length();

		if(hashLeght!=0)
		{
			char []splitHashKey=new char[hashLeght];
			for(int i=0;i<hashLeght;i++)
			{
				splitHashKey[i]=this.hashKey.getHashKey().charAt(i);
				if(i==0)
					this.giftCode=splitHashKey[i]+this.giftCode;
				else
					this.giftCode=this.giftCode+splitHashKey[i];
			}
		}
		return this.giftCode;
	}

}
