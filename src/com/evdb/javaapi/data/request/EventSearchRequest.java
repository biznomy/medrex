/**
 * (c) 2007 Eventful, Inc.
 * All rights reserved
 * 
 * Please see the accompanying LICENSE file for licensing information
 */
package com.evdb.javaapi.data.request;

/**
 * Event Search Request object
 * @author tylerv
 *
 */
public class EventSearchRequest extends SearchRequest {
	
	private String category;
	private String dateRange = "future";
	
	private SortOrder sortOrder = SortOrder.RELEVANCE;
	
	/**
	 * Sort order for searches
	 * @author tylerv
	 *
	 */
	public enum SortOrder {
		RELEVANCE,
		DATE,
		TITLE,
		VENUE_NAME,
		DISTANCE
		
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the dateRange
	 */
	public String getDateRange() {
		return dateRange;
	}

	/**
	 * @param dateRange the dateRange to set
	 */
	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
	}

	/**
	 * @return the sortOrder
	 */
	public String getSortOrder() {
		return sortOrder.toString().toLowerCase();
	}
	
	/**
	 * @param sortOrder the sortOrder to set
	 */
	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}

}
