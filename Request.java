import java.io.Serializable;

public class Request implements Serializable {
	
	private String accountNo;  
	private String amount; 

	public Request(String accountNo, String amount)
         	{ 

		super();
		this.accountNo = accountNo;
		this.amount = amount;


	}
	
	public Request()
	{
		
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	
}
