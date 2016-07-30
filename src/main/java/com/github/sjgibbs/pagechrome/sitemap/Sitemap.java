package com.github.sjgibbs.pagechrome.sitemap;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Sitemap
 *
 * @author Simon
 */
public class Sitemap {

	@NotNull
	@JsonProperty(value="sitemap", required = true)
	public List<NavigationItem> sitemap;

	public List<NavigationItem> getSitemap() {
		return sitemap;
	}
}