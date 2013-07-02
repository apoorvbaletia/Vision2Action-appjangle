package com.appjangle.vision2action.game3;

import io.nextweb.Link;
import io.nextweb.Node;
import io.nextweb.Query;
import io.nextweb.Session;

import com.appjangle.vision2action.Types;

public class LoadValueChainQuestion {

	public static ValueChainQuestion getQuestionFromNode(final Session session,
			final Link link) {

		final Node node = link.get();

		final Types t = new Types(session);

		final Query correctValueChainActitivies = node
				.select(t.correctValueChainActivites);
		final Query valueChainJustification = node
				.select(t.valueChainJustification);

		final Query brandVision = node.select(t.vision);
		final Query brandVideoLink = node.select(t.brandVideo);
		final Query brandName = node.select(t.brandName);
		final Query brandImage = node.select(t.brandImage);
		final Query brandIndustry = node.select(t.industry);

		// getAll is optional but clearer since when using it all data is
		// downloaded at the same time
		session.getAll(correctValueChainActitivies, valueChainJustification,
				brandVision, brandVideoLink, brandName, brandImage,brandIndustry);

		return new ValueChainQuestion() {

			@Override
			public String getCorrectValueChainActivites() {
				return correctValueChainActitivies.get().value(String.class);
			}

			@Override
			public String getValueChainJustification() {

				return valueChainJustification.get().value(String.class);
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
