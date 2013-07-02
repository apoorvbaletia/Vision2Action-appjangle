package com.appjangle.vision2action.game4;

import com.appjangle.vision2action.Types;

import io.nextweb.Link;
import io.nextweb.Node;
import io.nextweb.Query;
import io.nextweb.Session;

public class LoadBusinessProcessQuestion {

	public static BusinessProcessQuestion getQuestionFromNode(final Session session, final Link link) {
		
		final Node node = link.get();
		
		final Types t = new Types(session);
		
		
		final Query processName = node.select(t.processName);
		final Query importantProcess = node.select(t.importantProcess);
		final Query processSteps = node.select(t.processSteps);
		
		final Query brandVision = node.select(t.vision);
		final Query brandVideoLink = node.select(t.brandVideo);
		final Query brandName = node.select(t.brandName);
		final Query brandImage = node.select(t.brandImage);
		final Query brandIndustry = node.select(t.industry);
		
		// getAll is optional but clearer since when using it all data is downloaded at the same time
		session.getAll(processName, importantProcess, processSteps, brandVision, brandVideoLink, brandName, brandImage,brandIndustry);
		
		return new BusinessProcessQuestion() {

			@Override
			public String getProcessName() {
				
				return processName.get().value(String.class);
			}

			@Override
			public String getImportantProcess() {
				
				return importantProcess.get().value(String.class);
			}
			
			@Override
			public String getProcessSteps() {	
				
				return processSteps.get().value(String.class);
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
