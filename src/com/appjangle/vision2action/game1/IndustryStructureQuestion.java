package com.appjangle.vision2action.game1;

import com.appjangle.vision2action.CaseQuestion;

/**
 * This interface wraps the data of a strategy quadrant questions.
 *
 */
public interface IndustryStructureQuestion extends CaseQuestion {

	
	public String getCorrectIndustryStructure();
	public String getThreatOfSubsitutes();
	public String getSupplierPower();
	public String getRivarly();
	public String getBuyerPower() ;
	public String getNewEntrants();

}