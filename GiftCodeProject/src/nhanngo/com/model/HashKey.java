package nhanngo.com.model;

public class HashKey {
	private String hashKey;

	public String getHashKey() {
		return hashKey;
	}

	public void setHashKey(String hashKey) {
		this.hashKey = hashKey;
	}

	public HashKey(String hashKey) {
		super();
		this.hashKey = hashKey;
	}

	public HashKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.hashKey;
	}

}
