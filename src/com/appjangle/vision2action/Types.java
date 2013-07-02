package com.appjangle.vision2action;

import io.nextweb.Link;
import io.nextweb.Session;

public class Types {

	public Link brandName;

	public Link vision;

	public Link brandImage;

	public Link brandVideo;

	public Link industry;

	public Link correctStrategy;

	public Link competitiveScope;

	public Link costStrategy;

	public Link correctIndustryStructure;

	public Link threatOfSubsitutes;

	public Link supplierPower;

	public Link rivarly;

	public Link buyerPower;

	public Link newEntrants;

	public Link correctValueChainActivites;

	public Link valueChainJustification;
	
	public Link importantProcess;
	
	public Link processName;
	
	public Link processSteps;
	
	public Link systems;
	
	public Link orgUnits;

	public Types(Session session) {
		Types t = this;
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/docs/110-types -->
// required data types
t.brandName = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Brand_Name");
t.vision = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Vision");
t.brandImage = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Brand_Image");
t.brandVideo = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Video_Link");
t.industry = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Industry");

// game 1 types
t.correctStrategy = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Correct_Strategy");
t.competitiveScope = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Competitive_Scope");
t.costStrategy = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Cost_Strategy");

// game 2 types
t.correctIndustryStructure = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Industry_Structure");
t.threatOfSubsitutes = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Threat_of_Substitutes");
t.supplierPower = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Supplier_Power");
t.rivarly = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Rivalry_Among_Competitors");
t.buyerPower = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Buyer_Power");
t.newEntrants = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Threat_of_New_Entrants");

// game 3 types
t.correctValueChainActivites = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Value_Chain_Activites");
t.valueChainJustification = session
        .node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Activities_Justiciation");
        
// game 4 types
t.processName = session.node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Business_Process_Question/Process_Name");
t.importantProcess = session.node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Business_Process_Question/Important_Process");
t.processSteps = session.node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Business_Process_Question/Steps");

// game 5 types
t.systems = session.node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Systems_Question/Systems");
t.orgUnits = session.node("http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Systems_Question/Organizational_Units");
// <!-- one.end -->
	}

	/**
	 * @see <a
	 *      href="http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Question_Bag">Question
	 *      Bag Repository type</a>
	 */
	public static final String aQuestionBag = "http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Question_Bag";

	public static final String aStrategyQuadrantQuestion = "http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Strategy_Quadrant_Questi";

}
