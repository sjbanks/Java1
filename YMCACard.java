package cards;
public class YMCACard extends Card{
	//Steven Banks
	
	private String IDnumber;
	
	public YMCACard() {
		
	}
	public YMCACard(String n, String id) {
		super(n);
		setIDnumber(id);
	}

	public String getIDnumber() {
		return IDnumber;
	}

	public void setIDnumber(String iDnumber) {
		IDnumber = iDnumber;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((IDnumber == null) ? 0 : IDnumber.hashCode());
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
		YMCACard other = (YMCACard) obj;
		if (IDnumber == null) {
			if (other.IDnumber != null)
				return false;
		} else if (!IDnumber.equals(other.IDnumber))
			return false;
		return true;
	}
	
	public String format() {
		return super.format() + ", ID: " + IDnumber;
	}
	
}
