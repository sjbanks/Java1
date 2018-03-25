package cards;

public class Card {
	//Steven Banks
	
	private String name;
	
	public Card() {
		name = "";
	}
	public Card(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isExpired() {
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public void checkExpiration() {
		System.out.println(isExpired());
	}
	public String format() {
		return "Card holder: " + name;
	}
}
