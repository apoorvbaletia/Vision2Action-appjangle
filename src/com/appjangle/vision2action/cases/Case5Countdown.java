package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case5Countdown {

	
	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/case5-countdown -->

c.append("Countdown", "./brandName").append(t.brandName);
c.append("Shop Smarter. ", "./vision").append(t.vision);
c.append("http://www.nzsca.org.nz/upload/content/CD_MS_H_Pos_cmyk%20web.jpg", "./brandImage").append(t.brandImage);
c.append("http://www.youtube.com/watch?v=aSuaTaefvpg", "./brandVideo").append(t.brandVideo);
c.append("Supermarket Industry", "./industry").append(t.industry);

c.append("costLeadership", "./correctStrategy").append(t.correctStrategy);
c.append("Broad market: Countdown targets all customers in the industry through the use of their advertising such as weekend windbacks (customers looking for bargains), Masterchef cooking demos (adventurous foodies), and the Colemans (the everyday New Zealand family)", "./competitiveScope").append(t.competitiveScope);
c.append("Low cost: As a large, multi-stored supermarket, Countdown uses its significant buying-power to offer customers the best price for their food.", "./costStrategy").append(t.costStrategy);

c.append("low:low:high:high:low", "./correctIndustryStructure").append(t.correctIndustryStructure);
c.append("A substitute to a supermarket would be a greengrocer, or a convenience store, but neither of these offer the range that a supermarket does.", "./threatOfSubsitutes").append(t.threatOfSubsitutes);
c.append("Supermarkets buy in huge bulk quantities so are able to negotiate a good price with suppliers. Suppliers also often sell commodity products so supermarkets have many options to choose from.", "./supplierPower").append(t.supplierPower);
c.append("The NZ industry is dominated by 4 major players.  As they mostly sell the same items, the focus becomes on advertising the latest specials and offering incentives to gain business.", "./rivarly").append(t.rivarly);
c.append("Low switching costs. Companies sell the same products, so competition is based primarily on price and brand image.", "./buyerPower").append(t.buyerPower);
c.append("There are minimal startup costs to establish a small grocery store. However as the industry is dominated by 4 large companies the ability to gain market share would be doubtful.", "./newEntrants").append(t.newEntrants);

c.append("procurement,firmInfrastructure,marketing", "./correctValueChainActivites").append(t.correctValueChainActivites);
c.append("Procurement: As competition is based on price and margins are narrow, it is essential that a supermarket can source and negotiate the best merchandise and ideal quantity, at the best price.\n"
+"Infrastructure: Supermarkets provide convenience to consumers, and a good facility and location adds value.\n"+
"Market and sell: Supermarkets spend considerable amounts on print and television advertising in order to attract customers based on their specials.", 
"./valueChainJustification").append(t.valueChainJustification);

c.append("Inventory Order Process", "./processName").append(t.processName);
c.append("This process adds value for Countdown as it is imperative they are never out of stock of items. Inventory must be ordered at an appropriate time so as to not have too much in stock and it go off, and to have enough to meet the customers needs.", "./importantProcess").append(t.importantProcess);
c.append("Notify inventory is below re-order level:Place inventory order:Record arrival of inventory", "./processSteps").append(t.processSteps);

c.append("Inventory Management System:SCM:Inventory Management System", "./systems").append(t.systems);
c.append("Purchasing:Purchasing:Warehouse/Inbound Logistics/Inwards Goods", "./orgUnits").append(t.orgUnits);


// <!-- one.end -->
	}
	
	
}
