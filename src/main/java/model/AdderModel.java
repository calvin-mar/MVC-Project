package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class AdderModel {
	
	DoubleProperty firstNum = new SimpleDoubleProperty(); 
	DoubleProperty secondNum = new SimpleDoubleProperty();
	DoubleProperty resultNum = new SimpleDoubleProperty();
	
	/**
	 * @return the firstNum
	 */
	public DoubleProperty getFirstNum() {
		return firstNum;
	}
	
	/**
	 * @param firstNum the firstNum to set
	 */
	public void setFirstNum(DoubleProperty firstNum) {
		this.firstNum = firstNum;
	}
	
	/**
	 * @return the secondNum
	 */
	public DoubleProperty getSecondNum() {
		return secondNum;
	}
	
	/**
	 * @param secondNum the secondNum to set
	 */
	public void setSecondNum(DoubleProperty secondNum) {
		this.secondNum = secondNum;
	}
	
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
		
	}

}
