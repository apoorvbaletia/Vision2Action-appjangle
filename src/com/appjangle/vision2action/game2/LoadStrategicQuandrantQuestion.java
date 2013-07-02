package com.appjangle.vision2action.game2;

import com.appjangle.vision2action.Types;

import io.nextweb.Link;
import io.nextweb.Node;
import io.nextweb.Query;
import io.nextweb.Session;

public class LoadStrategicQuandrantQuestion {

	public static StrategicQuandrantQuestion getQuestionFromNode(final Session session, final Link link) {
		
		final Node node = link.get();
		
		final Types t = new Types(session);
		
		final Query correctCompetitiveScope = node.select(t.competitiveScope);
		final Query correctCostStrategy = node.select(t.costStrategy);
		final Query correctStrategy = node.select(t.correctStrategy);
		
		final Query brandVision = node.select(t.vision);
		final Query brandVideoLink = node.select(t.brandVideo);
		final Query brandName = node.select(t.brandName);
		final Query brandImage = node.select(t.brandImage);
		final Query brandIndustry = node.select(t.industry);
		
		// getAll is optional but clearer since when using it all data is downloaded at the same time
		session.getAll(correctCompetitiveScope, correctCostStrategy, correctStrategy, brandVision, brandVideoLink, brandName, brandImage,brandIndustry);
		
		return new StrategicQuandrantQuestion() {

			@Override
			public String getCorrectCompetiveScope() {
				
				return correctCompetitiveScope.get().value(String.class);
			}

			@Override
			public String getCorrectCostStrategy() {
				
				return correctCostStrategy.get().value(String.class);
			}
			
			@Override
			public String getCorrectStrategy() {	
				
				return correctStrategy.get().value(String.class);
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
