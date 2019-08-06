package com.mathquiz.services;

import java.util.Set;

import com.mathquiz.domain.LookupData;

public interface LookupDataService {
    public String save(LookupData lookupData);
    public LookupData findLookupDataById(String id);
    public LookupData findLookupDataByName(String name);
    public Set<LookupData> findAllLookupDataByType(String type);
}
