package com.github.sjgibbs.pagechrome.sitemap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;

import static junit.framework.Assert.assertNotNull;

/**
 * SitemapTest
 *
 * @author Simon
 */
public class SitemapTest {

	public static final String EXAMPLE = "sitemap:\n" +
			"  - label: Example\n" +
			"    uri: http://example.com/\n" +
			"";

	@Test
	public void canBeLoaded() throws IOException {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		Sitemap result = mapper.readValue(EXAMPLE, Sitemap.class);

		assertNotNull(result);

	}

	@Test
	public void canBeLoadedThroughReader() throws IOException {
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		Sitemap result = mapper.readValue( new StringReader(EXAMPLE), Sitemap.class);

		assertNotNull(result);

	}
}
