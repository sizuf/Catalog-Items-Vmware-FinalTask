package com.example.models;

import java.util.ArrayList;
import java.util.List;


public class CatalogItemsList {

	private List<CatalogItems> content;

	public List<CatalogItems> getContent() {
		return content;
	}

	public void setContent(ArrayList<CatalogItems> content) {
		this.content = content;
	}

	public void setCatalogItems(CatalogItems c) {
		content.add(c);
	}
	
	public  List<CatalogItems> getCatalogItems() {
		return content;
	}
}