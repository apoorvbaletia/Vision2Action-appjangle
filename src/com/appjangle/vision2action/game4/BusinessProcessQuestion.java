package com.appjangle.vision2action.game4;

import com.appjangle.vision2action.CaseQuestion;

/**
 * This interface wraps the data of a Business Process questions.
 *
 */
public interface BusinessProcessQuestion extends CaseQuestion {

	
	public String getProcessName();
	public String getImportantProcess();
	public String getProcessSteps();

}