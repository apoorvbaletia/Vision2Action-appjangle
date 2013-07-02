package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case1Starbucks {

	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/docs/case1-starbucks -->
// Common case data
c.append("Starbucks", "./brandName").append(t.brandName);
c.append(
        "To inspire and nurture the human spirit - one person, one cup and one neighborhood at a time.",
        "./brandVision").append(t.vision);
c.append(
        "http://hollywoodandswine.com/wp-content/uploads/2012/03/Starbucks-2.jpg",
        "./brandImage").append(t.brandImage);
c.append("http://www.youtube.com/watch?v=JagNph-q9LU&feature=relmfu",
        "./brandVideo").append(t.brandVideo);
c.append("Cafe industry", "./industry").append(t.industry);

// Game 1, Strategy

c.append("differentiation", "./correctStrategy").append(
        t.correctStrategy);

c.append(
        "Starbucks markets to all customers of the cafe industry, which is broad market.",
        "./competitveScope").append(t.competitiveScope);

c.append(
        "Starbucks has a focus on high quality and customer service, indicative of a high cost strategy.",
        "./costStrategy").append(t.costStrategy);
  

// Game 2, Porter's five forces

// see
// http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Industry_Structure
c.append("high:low:high:high:high", "./industryStructure").append(
        t.correctIndustryStructure);

c.append(
        "A substitute to the cafe industry is to prepare food and drink at home, or purchase from a supermarket.",
        "./threatOfSubsitutes").append(t.threatOfSubsitutes);

c.append(
        "Suppliers provide mainly commodity products, such as milk and coffee beans, where there are plenty of alternative suppliers to choose from.",
        "./supplierPower").append(t.supplierPower);

c.append(
        "There are many participants in this industry, all doing similar things. Rivalry can be reduced through innovation and differentiation.",
        "./rivarly").append(t.rivarly);

c.append(
        "Buyer power can be reduced through loyalty programmes, product differentiation, and switching costs.",
        "./buyerPower").append(t.buyerPower);

c.append(
        "There are low start-up costs required to enter the cafe industry.",
        "./newEntrants").append(t.newEntrants);

// Game 3, Value chain

// see
// http://slicnet.com/mxrogm/mxrogm/apps/nodejump/docs/8/n/Types/Value_Chain_Activites
c.append("procurement,makeProjectOrService,technologyDevelopment",
        "./valueChainActivites").append(t.correctValueChainActivites);

c.append(
        "Procurement: Starbucks needs to get the best quality, certified fairtrade coffee beans.\n"
                + "Make the product or service: Starbucks' strategy involves quality, and pleasing people - this is achieved through providing the best possible cup of coffee\n"
                + "Research and Development: In order to differentiate their product, and compete with rivals,  Starbucks must continually produce new offerings. ",
        "./valueChainJustification").append(t.valueChainJustification);
        
        
//Game 4, Business Process


c.append("Raw materials sourcing process").append(t.processName);
c.append(
        "The quality of coffee beans is very important for Starbucks. They need to select the hightest quality suppliers in order to be able to produce the best coffee ground.")
        .append(t.importantProcess);
c.append(
        "Obtain quotes from suppliers:Compare quotes:Select best supplier")
        .append(t.processSteps);

// Game 5, Systems and Org Units
c.append(
        "SCM:Accounting System:Accounting DSS System")
        .append(t.systems);
c.append("Manufacturing:Accounting:Manufacturing management").append(
        t.orgUnits);
        
// <!-- one.end -->
	}

}
