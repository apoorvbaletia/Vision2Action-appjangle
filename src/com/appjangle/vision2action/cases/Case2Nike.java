package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case2Nike {

	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/docs/case2-nike -->
// Common case data
c.append("Nike", "./brandName").append(t.brandName);
c.append(
        "To bring inspiration and innovation to every athlete in the world.",
        "./brandVision").append(t.vision);
c.append("http://vince08.edublogs.org/files/2008/11/logonike.gif",
        "./brandImage").append(t.brandImage);
c.append("http://www.youtube.com/watch?v=45mMioJ5szc",
        "./brandVideo").append(t.brandVideo);

c.append("Sporting Apparel Footwear and Accessories", "./industry").append(t.industry);

// Game 1, Strategy

c.append("differentiation", "./correctStrategy").append(
        t.correctStrategy);

c.append(
        "Broad market: Nike appeals to a wide range of diverse consumers at all ends of the spectrum.",
        "./competitveScope").append(t.competitiveScope);

c.append(
        "High cost: Nike sells high quality products and therefore can sell at inflated prices. It also attempts to use its brand name as a distinctive selling point.",
        
        "./costStrategy").append(t.costStrategy);

// Game 2, Porter's five forces

// see
// http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Industry_Structure
c.append("low:low:high:high:high", "./industryStructure").append(
        t.correctIndustryStructure);

c.append(
        "In this day and age where nearly everyone who engages in physical activity 'must have' appropriate gear, there is no adequate substitute for sporting apparel footwear.",
        "./threatOfSubsitutes").append(t.threatOfSubsitutes);

c.append(
        "Most of the raw materials used in this industry are not difficult to procure, and are widely available.",
        "./supplierPower").append(t.supplierPower);

c.append(
        "There is a lot of competition between the already established companies as they have to distinguish between very similar products. Brand loyalty is very high and so competitors struggle to gain market share.",
        "./rivarly").append(t.rivarly);

c.append(
        "In this day and age there are many players in the industry that make what are traditionally similar products. However the players in the industry seek to reduce this by product innovation.",
        "./buyerPower").append(t.buyerPower);

c.append(
        "The technology behind the apparel can be easily manufactured. However, the existing brand loyalty shown by customers will make it extremely hard for any new entrant to gain traction once in the market place.",
        "./newEntrants").append(t.newEntrants);

// Game 3, Value chain

// see http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Value_Chain_Activites
c.append("marketing,makeProjectOrService,technologyDevelopment",
        "./valueChainActivites").append(t.correctValueChainActivites);

c.append(
        "Market and Sell the Product or Service: As shown in the video above, Nike relies on its marketing to enhance its famous brand image (which is its highest selling point). Nike focuses on the importance of self-belief and true effort in order to be the best, and attempts to show how their products can take you there.\n"
                + "Make the product or service: Nike has to ensure that its products are of the highest quality to ensure that it stands up to the image that it portrays in its marketing strategy.\n"
                + "Research and Development: In order to differentiate their product, and compete with rivals, Nike must continually produce new offerings. ",
        "./valueChainJustification").append(t.valueChainJustification);
        
// Game 4, Business Process


c.append("Manufacturing Process").append(t.processName);
c.append(
        "The Manufacturing Process is important for Nike as they must ensure that their products are constantly of the highest standard available. This process therefore concerns the direct manufacturing of the product, but also the quality testing that needs to be done in order to ensure its products are of the highest quality.")
        .append(t.importantProcess);
c.append(
        "Receive Manufacturing Request:Make Product:Test for Quality")
        .append(t.processSteps);

// Game 5, Systems and Org Units
c.append(
        "Inventory Management System:Product Specification System:Quality Control System")
        .append(t.systems);
c.append("Factory Clerk:Factory Labourer:Supervisor").append(
        t.orgUnits);
// <!-- one.end -->
	}

}
