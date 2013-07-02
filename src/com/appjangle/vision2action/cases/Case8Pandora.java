package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case8Pandora {

	
	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/case8-pandora -->

c.append("Pandora", "./brandName").append(t.brandName);
c.append("To play only music people will love", "./vision").append(t.vision);
c.append("http://cdn.thetechjournal.com/wp-content/uploads/2012/10/pandora.jpg", "./brandImage").append(t.brandImage);
c.append("http://www.youtube.com/watch?v=NVYHq3M1ByI", "./brandVideo").append(t.brandVideo);
c.append("Internet Radio", "./industry").append(t.industry);

c.append("costLeadership", "./correctStrategy").append(t.correctStrategy);
c.append("Pandora targets everyone who listens to music", "./competitiveScope").append(t.competitiveScope);
c.append("Pandora offers their service for free", "./costStrategy").append(t.costStrategy);

c.append("high:low:high:high:high", "./correctIndustryStructure").append(t.correctIndustryStructure);
c.append("There are lots of alternatives to listening to music such as watching TV, Movies, browsing the web etc.", "./threatOfSubsitutes").append(t.threatOfSubsitutes);
c.append("The music labels have attempted to shut down Pandora and failed so I would suggest their power is low.  The Internet infrastructure suppliers have little power as there are many of them in the market.", "./supplierPower").append(t.supplierPower);
c.append("There are quite a few companies in the Internet radio space and they all offer their core service for free.", "./rivalry").append(t.rivarly);
c.append("Buyers can very easily switch to a rival provider.  Pandora attempts to reduce their power by using IT to make sure that customers only get music they love.", "./buyerPower").append(t.buyerPower);
c.append("There are no major impediments to starting up an online radio business.", "./newEntrants").append(t.newEntrants);

c.append("afterSales,makeProjectOrService,technologyDevelopment", "./correctValueChainActivites").append(t.correctValueChainActivites);
c.append("Service After The Sale is critical to Pandora to continually provide only the music that listeners love.\n"+
"Make the Product or Service is important as they need to deliver the music that listeners love when they want it.\n"+
"Technology Development is vital in that they use their music selection algorithm as their key competitive advantage over their competitors. ", "./valueChainJustification").append(t.valueChainJustification);

c.append("Acquire new music process", "./processName").append(t.processName);
c.append("Pandora has to continually add new and existing songs to it's music database for analysis and distribution to listeners.", "./importantProcess").append(t.importantProcess);
c.append("Add songs to database:Analyse songs:Generate song profiles", "./processSteps").append(t.processSteps);

c.append("S1:S2:S3", "./systems").append(t.systems);
c.append("O1:O2:O3", "./orgUnits").append(t.orgUnits);


// <!-- one.end -->
	}
	
	
}
