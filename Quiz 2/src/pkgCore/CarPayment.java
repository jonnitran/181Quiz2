package pkgCore;

public class CarPayment {
	
	
	private double carTotal;
	private double downPayment;
	private int loanLength;
	private double interestRate;
	private double paymentAmounts;
	private double interestPaid;
	//Last two are made for easier use of getters and setters for test case
	
	public double monthlyPayments(){
		interestRate = interestRate/12;
		//Following three are done just to make the final calculation easier to follow
		double principle = carTotal-downPayment; 
		double loanCalc1 = (interestRate* Math.pow((1+interestRate),loanLength));
		double loanCalc2 = ( Math.pow( (1+interestRate), loanLength) -1 );
		
		paymentAmounts = ( (principle)*(loanCalc1/loanCalc2));
				return paymentAmounts;
	}
	
	public double totalInterest() {
		interestPaid = (paymentAmounts*loanLength)-(carTotal-downPayment);
		return interestPaid;
	}
	//The method that gets called
	public CarPayment(double total, double down, int length, double rate) {
		carTotal = total;
		downPayment = down;
		loanLength = length;
		interestRate = rate;
	}
	
	
	
	
	
	
	
	
	public double getCarTotal() {
		return carTotal;
	}

	public void setCarTotal(double carTotal) {
		this.carTotal = carTotal;
	}

	public double getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}

	public int getLoanLength() {
		return loanLength;
	}

	public void setLoanLength(int loanLength) {
		this.loanLength = loanLength;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getPaymentAmounts() {
		return paymentAmounts;
	}

	public void setPaymentAmounts(double paymentAmounts) {
		this.paymentAmounts = paymentAmounts;
	}

	public double getInterestPaid() {
		return interestPaid;
	}

	public void setInterestPaid(double interestPaid) {
		this.interestPaid = interestPaid;
	}
}