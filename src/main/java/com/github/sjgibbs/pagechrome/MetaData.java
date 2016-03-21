package com.github.sjgibbs.pagechrome;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;


/**
 * MetaData
 *
 * @author Simon
 */
public class MetaData {


	@NotNull
	@JsonProperty
	private java.lang.String title;

	@NotNull
	@JsonProperty
	private java.lang.String description;

	public MetaData() {
	}

	public MetaData(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}
}
