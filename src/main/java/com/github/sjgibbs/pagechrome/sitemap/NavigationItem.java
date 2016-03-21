package com.github.sjgibbs.pagechrome.sitemap;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Strings;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * NavigationItem
 *
 * @author Simon
 */
public class NavigationItem {

	@NotNull
	@JsonProperty("label")
	String label;

	@JsonProperty("uri")
	String uri;

	@Valid
	@JsonProperty("items")
	List<NavigationItem> items;

	public boolean getDropdown() {
		if(Strings.isNullOrEmpty(uri)) {
			if(items == null || items.isEmpty()) {
				throw new IllegalStateException("Item has no uri and no items");
			}
			return true;
		}

		if(items != null && !items.isEmpty()) {
			throw new IllegalStateException("Item has both uri and items");
		}

		return false;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public List<NavigationItem> getItems() {
		return items;
	}

	public void setItems(List<NavigationItem> items) {
		this.items = items;
	}
}
