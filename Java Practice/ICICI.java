
public class ICICI extends Bank {
    void loan()
	{
		System.out.println("Loan 5%");
	}
	void interestrate()
	{
		System.out.println("Interest is 8%");
	}
	

	public static void main(String[] args) {
		ICICI ic=new ICICI();
		ic.loan();
		ic.interestrate();
		SBI s=new SBI();
		s.loan();
		s.interestrate();
		HDFC h=new HDFC();
		h.loan();
		h.interestrate();
		
		
		// TODO Auto-generated method stub

	}

}
