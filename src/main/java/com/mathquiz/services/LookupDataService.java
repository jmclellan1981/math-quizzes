package com.mathquiz.services;

import java.util.List;
import com.mathquiz.domain.LookupData;

public interface LookupDataService {
    public String save(LookupData lookupData);
    public LookupData findLookupDataById(String id);
    public LookupData findLookupDataByName(String name);
    public List<LookupData> findAllLookupDataByType(String type);
}
