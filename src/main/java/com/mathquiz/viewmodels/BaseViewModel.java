package com.mathquiz.viewmodels;

import java.io.Serializable;

public class BaseViewModel implements Serializable {
    private static final long serialVersionUID = 8853067067526625288L;
    private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

    
}
