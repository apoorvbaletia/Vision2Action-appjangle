package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case10Amazon {

	
	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/case10-amazon -->

c.append("Amazon", "./brandName").append(t.brandName);
c.append("To be earth's most customer centric company.", "./vision").append(t.vision);
c.append("http://www.republicreport.org/wp-content/uploads/2012/04/amazonlogo.jpg", "./brandImage").append(t.brandImage);
c.append("http://www.youtube.com/watch?v=Ec4kWhEuhYE", "./brandVideo").append(t.brandVideo);
c.append("Global online shopping industry", "./industry").append(t.industry);

c.append("costLeadership", "./correctStrategy").append(t.correctStrategy);
c.append("Broad Market:  Amazon sells everything to everyone.  Their vision is about being 'the earth's' company.", "./competitiveScope").append(t.competitiveScope);
c.append("Low Cost: They have no physical stores so can significantly undercut traditional brick and mortar stores.", "./costStrategy").append(t.costStrategy);

c.append("low:low:high:high:high", "./correctIndustryStructure").append(t.correctIndustryStructure);
c.append("Consumer retail is such a broad industry that all substitutes are likely to be included.", "./threatOfSubsitutes").append(t.threatOfSubsitutes);
c.append("There are a multitude of suppliers to the global online shopping industry ", "./supplierPower").append(t.supplierPower);
c.append("There are a multitude of companies competing in the global online shopping industry .", "./rivarly").append(t.rivarly);
c.append("Buyers have a wide variety of companies to choose from in the global online shopping industry .", "./buyerPower").append(t.buyerPower);
c.append("Competitors are entering every segment of the global online shopping industry  all the time.", "./newEntrants").append(t.newEntrants);

c.append("procurement,delivery,afterSales", "./correctValueChainActivites").append(t.correctValueChainActivites);
c.append("Procurement: Amazon needs to source all of it's products hence procurement is important.\n"+
"Customer Service is obviously important as being customer centric is part of their vision.\n"+
"Delivery is vital as Amazon doesn't have physical stores so actually getting the goods to the customer in one piece quickly is vital.", "./valueChainJustification").append(t.valueChainJustification);

c.append("Recommend Items to Customer Process", "./processName").append(t.processName);
c.append("Amazon prides itself on being customer centric and part of this is being able to suggest items to customers that they might like based on past sales data.", "./importantProcess").append(t.importantProcess);
c.append("Get Customer Data:Analyze Sales Patterns:Make Purchase Recommendation", "./processSteps").append(t.processSteps);

c.append("S1:S2:S3", "./systems").append(t.systems);
c.append("O1:O2:O3", "./orgUnits").append(t.orgUnits);


// <!-- one.end -->
	}
	
	
}
