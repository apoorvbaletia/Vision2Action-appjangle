package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case12Kiwibank {

	
	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/case12-kiwibank -->


c.append("KiwiBank", "./brandName").append(t.brandName);
c.append("Giving Kiwis better value banking.", "./vision").append(t.vision);
c.append("http://www.designworks.co.nz/uploads/images/case-studies/kiwibank/kiwibank.jpg", "./brandImage").append(t.brandImage);
c.append("https://www.youtube.com/watch?v=AOmC0NIGfRE&list=PL36471AF1A649489A", "./brandVideo").append(t.brandVideo);
c.append("New Zealand Banking Industry", "./industry").append(t.industry);

c.append("costLeadership", "./correctStrategy").append(t.correctStrategy);
c.append("Broad scope:  Aimed at everyone in New Zealand.  ", "./competitiveScope").append(t.competitiveScope);
c.append("Low Cost:  They aim at delivering value for money", "./costStrategy").append(t.costStrategy);

c.append("high:low:high:high:high", "./correctIndustryStructure").append(t.correctIndustryStructure);
c.append("It is hard to imagine living in a modern society without a bank.", "./threatOfSubsitutes").append(t.threatOfSubsitutes);
c.append("Capital is the primary resource of any bank and in a NZ context the power of the market dictates that supplier power is likely to be high.", "./supplierPower").append(t.supplierPower);
c.append("Banking has been around for hundreds of years, and just about everyone who need a bank already has one. Because of this, banks must attempt to lure clients away from competitor banks. They do this by offering lower financing, higher rates, investment services, and greater conveniences than their rivals. ", "./rivarly").append(t.rivarly);
c.append("Banks often have relatively high switching costs. If a person has one bank that services their banking needs, mortgage, savings, checking, etc, it can be a huge hassle for that person to switch to another bank. However, some smart banks are using technology to make this process painless thus reducing the switching costs.", "./buyerPower").append(t.buyerPower);
c.append("Banking requires a great deal of trust and there are very stringent legal and financial requirements.", "./newEntrants").append(t.newEntrants);

c.append("technologyDevelopment,afterSales,firmInfrastructure", "./correctValueChainActivites").append(t.correctValueChainActivites);
c.append("Customer Service: KiwiBank prides itself on customer service.\n"+
"Technology Development: KiwiBank uses technology to give better service at a cheaper cost.\n"+
"Marketing: Marketing is important due to the intense rivalry in the banking industry.", "./valueChainJustification").append(t.valueChainJustification);

c.append("Customer support", "./processName").append(t.processName);
c.append("When a customer has a query it is vital that Kiwibank gives them the correct answer as quickly as possible.  This is especially true as they pride themselves on their customer service.", "./importantProcess").append(t.importantProcess);
c.append("Receive query:Evaluate answers:Answer query", "./processSteps").append(t.processSteps);

c.append("S1:S2:S3", "./systems").append(t.systems);
c.append("O1:O2:O3", "./orgUnits").append(t.orgUnits);

// <!-- one.end -->
	}
	
	
}
