package com.yjh.complex.utils;

import javax.swing.JOptionPane;

import com.yjh.complex.ui.CalcUI;

/**
 * 该类负责检测数据
 * @author 15159
 *
 */
public class DataChecker {
	public static boolean checkData() {
		if(CalcUI.realpartText1.getText().isEmpty() ||
		   CalcUI.imagpartText1.getText().isEmpty() ||
		   CalcUI.realpartText2.getText().isEmpty() ||
		   CalcUI.imagpartText2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null,"数据为空！");
			return false;
		}
		return true;	
	}
}
