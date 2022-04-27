package org.jfree.chart.axis;


import java.util.List;
import java.io.Serializable;

public class SymbolAxisProduct implements Serializable, Cloneable {
	private List symbols;

	public List getSymbols2() {
		return symbols;
	}

	public void setSymbols(List symbols) {
		this.symbols = symbols;
	}

	/**
	* Returns an array of the symbols for the axis.
	* @return  The symbols.
	*/
	public String[] getSymbols() {
		String[] result = new String[this.symbols.size()];
		result = (String[]) this.symbols.toArray(result);
		return result;
	}

	/**
	* Converts a value to a string, using the list of symbols.
	* @param value   value to convert.
	* @return  The symbol.
	*/
	public String valueToString(double value) {
		String strToReturn;
		try {
			strToReturn = (String) this.symbols.get((int) value);
		} catch (IndexOutOfBoundsException ex) {
			strToReturn = "";
		}
		return strToReturn;
	}

	public Object clone() throws CloneNotSupportedException {
		return (SymbolAxisProduct) super.clone();
	}
}