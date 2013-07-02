package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case7Coke {

	
	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/case7-coke -->

c.append("Coca Cola Enterprises (CCE)", "./brandName").append(t.brandName);
c.append("To refresh the world - in mind, body and spirit", "./vision").append(t.vision);
c.append("http://www.picgifs.com/wallpapers/wallpapers/coca-cola/Coca_Cola03.jpg", "./brandImage").append(t.brandImage);


c.append("http://www.youtube.com/watch?v=WVRT16-dNsw", "./brandVideo").append(t.brandVideo);
c.append("Soft drink industry", "./industry").append(t.industry);

c.append("differentiation", "./correctStrategy").append(t.correctStrategy);
c.append("Broad Market. CCE target everybody, everywhere!", "./competitiveScope").append(t.competitiveScope);
c.append("High Cost.  Coke uses it brand loyalty and market dominance to charge a premium price for it's products.  ", "./costStrategy").append(t.costStrategy);

c.append("high:low:high:high:high", "./correctIndustryStructure").append(t.correctIndustryStructure);
c.append("People don't have to purchase soft drinks and can switch to water, tea, coffee etc.", "./threatOfSubsitutes").append(t.threatOfSubsitutes);
c.append("Suppliers provide mainly commodity products, such as sugar, cocoa, aluminium, where there are plenty of alternative suppliers for cafes to choose from.", "./supplierPower").append(t.supplierPower);
c.append("There are many participants in this industry, even though the industry is dominated by two major players (Coca Cola Enterprises and PepsiCo).", "./rivalry").append(t.rivarly);
c.append("Customers can get similar products from many sellers with little or no switching costs. Buyer power can be reduced through brand loyalty programmes.", "./buyerPower").append(t.buyerPower);
c.append("There are low start-up costs required to enter the soft drink industry although significant distribution challenges would need to be overcome.", "./newEntrants").append(t.newEntrants);

c.append("marketing,makeProjectOrService,delivery", "./correctValueChainActivites").append(t.correctValueChainActivites);
c.append("Market and Sell: Coke is all about brand loyalty so marketing is of the utmost importance.\n"+
        "Make the product or service:  Coke has huge product manufacturing facilities that have to churn out perfect product 24/7 in order to keep up with demand.\n"+
        "Deliver the product: Coke is sold everywhere so the logistics of delivering the product to all the resellers is of vital importance.", "./valueChainJustification").append(t.valueChainJustification);

c.append("Create Marketing Campaign", "./processName").append(t.processName);
c.append("Coke is in a fierce battle with it's rivals and has to saturate the market with advertising to maintain it's dominance.", "./importantProcess").append(t.importantProcess);
c.append("Analyse customer segment:Create creative content:Monitor campaigns", "./processSteps").append(t.processSteps);

c.append("S1:S2:S3", "./systems").append(t.systems);
c.append("O1:O2:O3", "./orgUnits").append(t.orgUnits);
// <!-- one.end -->
	}
	
	
}
