package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case13StateInsurance {

	
	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/case12-state-insurance -->


c.append("State Insurance", "./brandName").append(t.brandName);
c.append("Keep New Zealanders moving forward by offering a premium insurance experience.", "./vision").append(t.vision);
c.append("http://www.state.co.nz/Style%20Library/statewebsite/images/state-logo.png", "./brandImage").append(t.brandImage);
c.append("http://www.youtube.com/watch?v=NBTcNMwmm2E", "./brandVideo").append(t.brandVideo);
c.append("Insurance industry", "./industry").append(t.industry);

c.append("differentiation", "./correctStrategy").append(t.correctStrategy);
c.append("Broad Market:  State manages over a million policies for more than 460,000 Kiwis.", "./competitiveScope").append(t.competitiveScope);
c.append("High Cost:  State offers a premium insurance experience, and putting the customer at the centre of everything. They 'try to set themselves apart' by doing so.", "./costStrategy").append(t.costStrategy);

c.append("low:high:high:high:low", "./correctIndustryStructure").append(t.correctIndustryStructure);
c.append("The only substitute to insurance is paying for the costs of the incident yourself.", "./threatOfSubsitutes").append(t.threatOfSubsitutes);
c.append("Suppliers for the NZ insurance industry are the large insurance corporations overseas.", "./supplierPower").append(t.supplierPower);
c.append("There are many  insurance companies in NZ: State, AA, Tower, AMI, FinTel who are in intense competition.", "./rivarly").append(t.rivarly);
c.append("Buyer power is high as the buyers have many insurance companies to choose from. However, most insurance companies provide some distinct benefits and loyalty programmes in association with other organisations. For example, State insurance earns customers Flybuy points.  They are attempting to limit the buyers power through these programmes.", "./buyerPower").append(t.buyerPower);
c.append("Insurance companies tend to have high set up costs, and most companies in the NZ market have spent several years establishing themselves. For example, State has been serving customers for 100 years!", "./newEntrants").append(t.newEntrants);

c.append("delivery,afterSales,marketing", "./correctValueChainActivites").append(t.correctValueChainActivites);
c.append("Deliver the service: State insurance aim to excel in their ability to pay claims.\n"+
"Service after Sale: It is important for them to ensure that customers are happy with the whole claims process.\n"+
"Marketing: Marketing is important because State insurance targets a broad market, always looking to expand both their personal and business customer base.", "./valueChainJustification").append(t.valueChainJustification);

c.append("Claims process", "./processName").append(t.processName);
c.append("Processing claims efficiently, and to the satisfaction of the customers is of utmost importance to State.", "./importantProcess").append(t.importantProcess);
c.append("Receive claim:Analyse claim:Reject or accept claim", "./processSteps").append(t.processSteps);

c.append("Online claims processing system: Claims analysis system: Claims processing system (DSS)", "./systems").append(t.systems);
c.append("Customer service:Customer service:Customer service", "./orgUnits").append(t.orgUnits);


// <!-- one.end -->
	}
	
	
}
