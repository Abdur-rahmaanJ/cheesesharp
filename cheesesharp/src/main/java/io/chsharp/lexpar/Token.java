package io.chsharp.lexpar;

public class Token {
	
	public static enum Type {
		/* Keywords */
		CHEESE, WAS, MAKE, END, OPERATION,
		
		/* General-purpose */
		IDENTIFIER, DECIMAL, STRING,
		
		/* Specials */
		EOF,
	}
	
	public final Type type;
	public final String text;
	
	public Token(Type type, String text) {
		this.type = type;
		this.text = text;
	}
	
	@Override
	public String toString() {
		return type + "(\"" + text + "\")";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Token other = (Token) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
}
