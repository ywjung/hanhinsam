package com.yaincoding.hanhinsam.filters.chosung;

import org.apache.lucene.analysis.TokenStream;
import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;
import org.opensearch.index.analysis.AbstractTokenFilterFactory;

public class ChosungFilterFactory extends AbstractTokenFilterFactory {

	public ChosungFilterFactory(IndexSettings indexSettings, Environment env, String name,
			Settings settings) {
		super(indexSettings, name, settings);
	}

	@Override
	public TokenStream create(TokenStream tokenStream) {
		return new ChosungFilter(tokenStream);
	}
}
