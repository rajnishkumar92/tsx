import java.io.Serializable;

public class Request2 implements Serializable {
	
	private String accountNo;  
	private String amount; 
	private String inFavourOf;
	private String payableAt,total; 
	  

	public Request2(String accountNo, String amount,String inFavourOf, String payableAt, String total)
         	{ 

		super();
		this.accountNo = accountNo;
		this.amount = amount;
		this.inFavourOf = inFavourOf;
		this.payableAt = payableAt;
		this.total = total;


	}
	
	public Request2()
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

	public String getInFavourOf() {
		return inFavourOf;
	}

	public void setInFavourOf(String InFavourOf) {
		this.inFavourOf = InFavourOf;
	}
	
	public String getPayableAt() {
		return payableAt;
	}

	public void setPayableAt(String payableAt) {
		this.payableAt = payableAt;
	}

	public String getTotal() {
		return total;
	}

	public void settotal(String total) {
		this.total = total;
	}


	
}
