package com.yaincoding.hanhinsam.plugin;

import java.util.HashMap;
import java.util.Map;
import com.yaincoding.hanhinsam.filters.chosung.ChosungFilterFactory;
import com.yaincoding.hanhinsam.filters.engtohan.EngToHanFilterFactory;
import com.yaincoding.hanhinsam.filters.hantoeng.HanToEngFilterFactory;
import com.yaincoding.hanhinsam.filters.jamo.JamoDecomposeFilterFactory;
import org.opensearch.index.analysis.TokenFilterFactory;
import org.opensearch.indices.analysis.AnalysisModule.AnalysisProvider;
import org.opensearch.plugins.AnalysisPlugin;
import org.opensearch.plugins.Plugin;

public class HanHinSamPlugin extends Plugin implements AnalysisPlugin {

	@Override
	public Map<String, AnalysisProvider<TokenFilterFactory>> getTokenFilters() {
		Map<String, AnalysisProvider<TokenFilterFactory>> extra = new HashMap<>();
		extra.put("hanhinsam_chosung", ChosungFilterFactory::new);
		extra.put("hanhinsam_jamo", JamoDecomposeFilterFactory::new);
		extra.put("hanhinsam_engtohan", EngToHanFilterFactory::new);
		extra.put("hanhinsam_hantoeng", HanToEngFilterFactory::new);

		return extra;
	}
}
