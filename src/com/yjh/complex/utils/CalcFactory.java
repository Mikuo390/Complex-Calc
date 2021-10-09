package com.yjh.complex.utils;

import com.yjh.complex.utils.impl.AbsCalc;
import com.yjh.complex.utils.impl.AddCalc;
import com.yjh.complex.utils.impl.DivCalc;
import com.yjh.complex.utils.impl.MultCalc;
import com.yjh.complex.utils.impl.SubCalc;

/**
 * 计算器工厂类
 * @author 15159
 *
 */
public class CalcFactory {
	
	//私有化实例
	private static final CalcFactory CALC_FACTORY = new CalcFactory();
	
	//私有化构造方法
	private CalcFactory() {
	}
	
	//创建一个用于获取实例的方法
	public static CalcFactory getInstance() {
		return CALC_FACTORY;
	}
	
	public ICalcRole getCalcRole(CalcType type) {
//		System.out.println(type);
		ICalcRole calcRole = null;
		
		if(type==CalcType.ADD_CALC)
			calcRole = new AddCalc();
		else if(type==CalcType.SUB_CALC)
			calcRole = new SubCalc();
		else if(type==CalcType.MULT_CALC)
			calcRole = new MultCalc();
		else if(type==CalcType.DIV_CALC)
			calcRole = new DivCalc();
		else if(type==CalcType.ABS_CALC)
			calcRole = new AbsCalc();
			
		return calcRole;	
	}
}
