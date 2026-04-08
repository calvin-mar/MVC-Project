package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class AdderModel {
	
	DoubleProperty resultNum = new SimpleDoubleProperty();
	
	/**
	 * @return the resultNum
	 */
	public DoubleProperty getResultNum() {
		return resultNum;
	}
	
	/**
	 * @param resultNum the resultNum to set
	 */
	public void setResultNum(DoubleProperty resultNum) {
		this.resultNum = resultNum;
	} 

	
	// Adding function
	public void addNumbers(double first, double second) {
		resultNum.set(first + second);
	}

}
