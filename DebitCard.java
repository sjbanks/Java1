package cards;
public class DebitCard extends Card{
	//Steven Banks
	
	private String cardNumber;
	private String PIN;
	
	public DebitCard() {
		
	}
	public DebitCard(String n, String cNum, String pin) {
		super(n);
		setCardNumber(cNum);
		setPIN(pin);
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPIN() {
		return PIN;
	}
	public void setPIN(String pIN) {
		PIN = pIN;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((PIN == null) ? 0 : PIN.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DebitCard other = (DebitCard) obj;
		if (PIN == null) {
			if (other.PIN != null)
				return false;
		} else if (!PIN.equals(other.PIN))
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		return true;
	}
	
	public String format() {
		return super.format() + ", Card Number: " + cardNumber + ", PIN: " + PIN;
	}
	
}
