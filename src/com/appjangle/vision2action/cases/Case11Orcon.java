package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case11Orcon {

	
	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/case11-orcon -->


c.append("Orcon", "./brandName").append(t.brandName);
c.append("The Internet is Everything.", "./vision").append(t.vision);
c.append("http://topnews.net.nz/data/imagecache/bigthumb/sites/default/files/orcon1.jpg", "./brandImage").append(t.brandImage);
c.append("http://www.youtube.com/watch?v=kxl3yAXHryY", "./brandVideo").append(t.brandVideo);
c.append("NZ Internet Service Provider Industry", "./industry").append(t.industry);

c.append("costLeadership", "./correctStrategy").append(t.correctStrategy);
c.append("Broad scope:  Aimed at everyone in New Zealand", "./competitiveScope").append(t.competitiveScope);
c.append("Low cost:  Aims to provide a low cost package", "./costStrategy").append(t.costStrategy);

c.append("low:high:high:high:high", "./correctIndustryStructure").append(t.correctIndustryStructure);
c.append("There is not really a substitute for internet access.", "./threatOfSubsitutes").append(t.threatOfSubsitutes);
c.append("In the NZ context there is only one international backbone provider and they have significant supplier power.", "./supplierPower").append(t.supplierPower);
c.append("There is a lot of competition in the NZ ISP market.", "./rivarly").append(t.rivarly);
c.append("Consumers want the best price and switching costs are low.  However, the ISPS try to mitigate this via annual contracts.", "./buyerPower").append(t.buyerPower);
c.append("It is very easy to set up an ISP and a number of companies such as SKYTV who are not traditional ISPs are looking at entering into this space.", "./newEntrants").append(t.newEntrants);

c.append("marketing,afterSales,technologyDevelopment,makeProjectOrService", "./correctValueChainActivites").append(t.correctValueChainActivites);
c.append("Marketing: Marketing is vital as this is a very crowded market with plenty of substitutes all competing on price and service.\n"+
"After Salves Service: Making sure the product works as advertised is also vital.\n"+
"Technology Development: Technology development is essential as ISPs are continually having to come up with new products using new technologies.", "./valueChainJustification").append(t.valueChainJustification);

c.append("Fault diagnosis process", "./processName").append(t.processName);
c.append("If the service that the ISP delivers is unreliable then customers will switch to another ISP pretty quickly.  Hence faults need to be tracked and resolved quickly.", "./importantProcess").append(t.importantProcess);
c.append("Receive fault report: Diagnose Fault: Fix Fault", "./processSteps").append(t.processSteps);

c.append("SCM:Accounting System:Accounting DSS System", "./systems").append(t.systems);
c.append("Manufacturing:Accounting:Manufacturing management", "./orgUnits").append(t.orgUnits);


// <!-- one.end -->
	}
	
	
}
