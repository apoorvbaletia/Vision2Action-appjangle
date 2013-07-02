package com.appjangle.vision2action.game1;

import com.appjangle.vision2action.Types;

import io.nextweb.Link;
import io.nextweb.Node;
import io.nextweb.Query;
import io.nextweb.Session;

public class LoadIndustryStructureQuestion {

	public static IndustryStructureQuestion getQuestionFromNode(final Session session, final Link link) {
		
		final Node node = link.get();
		
		final Types t = new Types(session);
		
		
		final Query correctIndustryStructure = node.select(t.correctIndustryStructure);
		final Query threatOfSubsitutes = node.select(t.threatOfSubsitutes);
		final Query supplierPower = node.select(t.supplierPower);
		final Query rivarly = node.select(t.rivarly);
		final Query buyerPower = node.select(t.buyerPower);
		final Query newEntrants = node.select(t.newEntrants);
		
		final Query brandVision = node.select(t.vision);
		final Query brandVideoLink = node.select(t.brandVideo);
		final Query brandName = node.select(t.brandName);
		final Query brandImage = node.select(t.brandImage);
		final Query brandIndustry = node.select(t.industry);
		
		// getAll is optional but clearer since when using it all data is downloaded at the same time
		session.getAll(correctIndustryStructure, threatOfSubsitutes, supplierPower, rivarly, buyerPower, newEntrants, brandVision, brandVideoLink, brandName, brandImage,brandIndustry);
		
		return new IndustryStructureQuestion() {

			@Override
			public String getCorrectIndustryStructure() {
				
				return correctIndustryStructure.get().value(String.class);
			}

			@Override
			public String getThreatOfSubsitutes() {
				
				return threatOfSubsitutes.get().value(String.class);
			}
			
			@Override
			public String getSupplierPower() {	
				
				return supplierPower.get().value(String.class);
			}
			
			@Override
			public String getRivarly() {	
				
				return rivarly.get().value(String.class);
			}
			
			@Override
			public String getBuyerPower() {	
				
				return buyerPower.get().value(String.class);
			}
			
			@Override
			public String getNewEntrants() {	
				
				return  newEntrants.get().value(String.class);
			}
			
			@Override
			public String getBrandVision() {
				return brandVision.get().value(String.class);
			}
			
			@Override
			public String getBrandVideoLink() {
				
				return brandVideoLink.get().value(String.class);
			}
			
			@Override
			public String getBrandName() {
				
				return brandName.get().value(String.class);
			}
			
			@Override
			public String getBrandImageLink() {
				
				return brandImage.get().value(String.class);
			}
			
			@Override
			public String getBrandIndustry() {

				return brandIndustry.get().value(String.class);
			}
			
		};
	}
	
}
