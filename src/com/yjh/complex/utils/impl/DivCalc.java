package com.yjh.complex.utils.impl;

import com.yjh.complex.domain.Complex;
import com.yjh.complex.ui.CalcUI;
import com.yjh.complex.utils.ICalcRole;

public class DivCalc implements ICalcRole{

	private static String r1 = CalcUI.realpartText1.getText();
	private static String i1 = CalcUI.imagpartText1.getText();
	private static String r2 = CalcUI.realpartText2.getText();
	private static String i2 = CalcUI.imagpartText2.getText();
	
	private static Complex c1 = new Complex(Double.valueOf(r1),Double.valueOf(i1));
	private static Complex c2 = new Complex(Double.valueOf(r2),Double.valueOf(i2));
	private static Complex result = new Complex();
	
	@Override
	public void calcComplex() {
		result.setRealpart(c1.getRealpart()*c2.getRealpart()+c1.getImagpart()*c2.getImagpart());
		result.setImagpart(((-c1.getRealpart())*c2.getImagpart()+c1.getImagpart()*c2.getRealpart())/(Math.pow(c1.getImagpart(), 2)+Math.pow(c2.getImagpart(), 2)));
		
		CalcUI.realpartResult.setText(result.getRealpart()+"");
		CalcUI.imagpartResult.setText(result.getImagpart()+"");
	}
	
}
