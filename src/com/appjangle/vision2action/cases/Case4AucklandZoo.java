package com.appjangle.vision2action.cases;

import io.nextweb.Query;

import com.appjangle.vision2action.Types;

public class Case4AucklandZoo {

	
	public static void injectData(Types t, Query c) {
		// <!-- one.download https://u1.linnk.it/qc8sbw/usr/apps/textsync/files/case4-auckland-zoo -->

c.append("Auckland Zoo", "./brandName").append(t.brandName);
c.append("A future where people value wildlife, and species are safe from extinction.", "./vision").append(t.vision);
c.append("http://www.isitemedia.co.nz/user_files/Sponsorship/zoologo.jpg", "./brandImage").append(t.brandImage);
c.append("http://www.youtube.com/watch?v=pVstbADVT_U", "./brandVideo").append(t.brandVideo);
c.append("The Zoo Industry", "./industry").append(t.industry);

c.append("differentiation", "./correctStrategy").append(t.correctStrategy);
c.append("Broad Market: The Zoo targets all customers in the industry, by having a borad range of animals on exhibition, and offering events such as Zoo music and hire for Corporate Functions.", "./competitiveScope").append(t.competitiveScope);
c.append("High Cost: As a non-profit organisation, Auckland Zoo depends on donations as well as income from visitors in order to cover costs. The strategy is differentiation, as the Zoo attempts to provide a unique point of difference to donors as well as visitors, from other organisations within their industry", "./costStrategy").append(t.costStrategy);

c.append("high:high:low:low:low", "./correctIndustryStructure").append(t.correctIndustryStructure);
c.append("A substitute to visiting a zoo would be to watch a nature documentary (easier), or visit the animals in their natural habitat (harder).", "./threatOfSubsitutes").append(t.threatOfSubsitutes);
c.append("Zoos are supplied with animals, which need to be appropriately bred and selected. There is often a focus on endangered animals and conservation, so finding endangered species to house is also difficult.", "./supplierPower").append(t.supplierPower);
c.append("Each zoo is very different due to a different array of animals and exhibits. Some zoos have specific well-known animals that attract visitors.", "./rivarly").append(t.rivarly);
c.append("In New Zealand there are few choices of zoos. Each zoo is very different, so consumers do not get the same experience at different venues, and even on different visits.", "./buyerPower").append(t.buyerPower);
c.append("Because the supplier power is so high, as well as the infrastructure, training and resource costs, there is little chance of a large scale competitor entering the market. Smaller, native-species zoos pose a higher threat.", "./newEntrants").append(t.newEntrants);

c.append("firmInfrastructure,delivery,afterSales", "./correctValueChainActivites").append(t.correctValueChainActivites);
c.append("Infrastructure: The zoo covers a wide land area, and houses many different creatures. The physical buildings and land give value by adding to the experience for the visitor: to see wildlife in what is close to their natural habitat, while feeling safe and secure.\n"+
"Deliver the service: Visitors attend the zoo to experience the animals in their natural habitat. Value is added when they are able to see them interaction (rather than sleeping or hiding), and hear from the keepers.\n"+
"Service after the Sale: The value for the zoo is in a return visit for the customer. Programs such as Friends of the Zoo and Adopt-an-animal help to ensure there is an engagement and repeat visit from their customers.",
 "./valueChainJustification").append(t.valueChainJustification);

c.append("Facility Maintenance Process", "./processName").append(t.processName);
c.append("All facilities and exhibits are regularly maintained so as to remain safe and tidy for both visitors and animals. This process involves regular scheduling and recording of maintenance work, and includes a method of notifying teams when maintenance is due to occur, or needs performing. Value is added as the zoo maintains a clean, tidy and safe appeal.", "./importantProcess").append(t.importantProcess);
c.append("Notify scheduled maintenance:Order maintenance materials:Record maintenance performed", "./processSteps").append(t.processSteps);

c.append("ERP System:Inventory Management System:ERP System", "./systems").append(t.systems);
c.append("Maintenance:Maintenance, Accounting, Warehouse:Maintenance", "./orgUnits").append(t.orgUnits);


// <!-- one.end -->
	}
	
	
}
