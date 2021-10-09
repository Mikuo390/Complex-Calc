package com.yjh.complex.utils;

import com.yjh.complex.ui.CalcUI;

/**
 * 该类负责清楚数据
 * @author 15159
 *
 */
public class DataCleaner {

	public static void clearData() {
		CalcUI.realpartText1.setText("");
		CalcUI.imagpartText1.setText("");
		CalcUI.realpartText2.setText("");
		CalcUI.imagpartText2.setText("");
		CalcUI.realpartResult.setText("");
		CalcUI.imagpartResult.setText("");
		CalcUI.symbolText.setText("");
	}
}
