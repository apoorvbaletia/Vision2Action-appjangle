package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case6RainbowsEnd {

	
	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/rainbows-end -->

c.append("Rainbows End", "./brandName").append(t.brandName);
c.append("New Zealand's premier theme park", "./vision").append(t.vision);
c.append("http://rainbowsend.co.nz/template/imgs/rainbows-end-logo.png", "./brandImage").append(t.brandImage);
c.append("http://www.youtube.com/watch?v=P3mMPh59ryU", "./brandVideo").append(t.brandVideo);
c.append("Theme Park Industry", "./industry").append(t.industry);

c.append("differentiation", "./correctStrategy").append(t.correctStrategy);
c.append("Broad Market: Rainbows End appeals to all customers purchasing in the theme park industry.", "./competitiveScope").append(t.competitiveScope);
c.append("High cost. As the industry is very small in New Zealand, there is no apparent competition on price and Rainbows End can charge what they like.", "./costStrategy").append(t.costStrategy);

c.append("high:high:low:low:low", "./correctIndustryStructure").append(t.correctIndustryStructure);
c.append("The theme park industry provides a thrilling experience. This can be substituted by the adventure tourism industry, in the form of extreme sports such as white water rafting, bungee jumping and sky-diving, which in New Zealand are in ready supply.", "./threatOfSubsitutes").append(t.threatOfSubsitutes);
c.append("Rides are supplied by international manufacturing companies. As each ride is unique between manufacturers, theme parks have low purchasing power.", "./supplierPower").append(t.supplierPower);
c.append("Competitors are separated geographically, and in New Zealand there are only two.", "./rivarly").append(t.rivarly);
c.append("There are minimal parks to choose from, each offering completely different rides and attractions. Customers pay for an experience which is hard to place a definitive monetary value on.", "./buyerPower").append(t.buyerPower);
c.append("A theme park needs resource consent, a large land area, and has huge initial capital investment costs.", "./newEntrants").append(t.newEntrants);

c.append("firmInfrastructure,delivery,marketing", "./correctValueChainActivites").append(t.correctValueChainActivites);
c.append("Infrastructure: Rides must be well-maintained and meet safety standards. They are the revenue and value-generating component of the business.\n"
+"Deliver the Service: Value is generated for Rainbows End by providing a quality and trustworthy service to the public.\n"
+"Market and Sell the Service: Customers are a vital component of Rainbows End's revenue generation and this activity adds value for Rainbows End as marketing e.g. promoting new rides or activities and selling Rainbows End's services means reaching more customers and therefore generating more revenue.", 
"./valueChainJustification").append(t.valueChainJustification);

c.append("Sales Analysis Process", "./processName").append(t.processName);
c.append("This process adds value for Rainbows End, as analysis of sales data can show whether they are meeting financial targets, and provide an indication of a need for a new marketing strategy, such as the recent 'Night Rides', to attract more customers.", "./importantProcess").append(t.importantProcess);
c.append("Receive daily sales printout:Analyse data against forecasts and trends:Use information for future financial planning", "./processSteps").append(t.processSteps);

c.append("Accounting System:ERP System:DSS System (ERP)", "./systems").append(t.systems);
c.append("Accounting:Accounting:Board of Directors", "./orgUnits").append(t.orgUnits);


// <!-- one.end -->
	}
	
	
}
