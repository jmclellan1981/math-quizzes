package com.mathquiz.services;

import com.mathquiz.LookupType;

public interface LookupTypeService {
    public String save(LookupType lookupType);
    public LookupType findById(String id);
}
