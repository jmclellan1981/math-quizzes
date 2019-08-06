package com.mathquiz.services;

import java.util.Set;

import com.mathquiz.domain.LookupData;
import com.mathquiz.domain.LookupType;
import com.mathquiz.repositories.LookupDataRepository;
import com.mathquiz.repositories.LookupTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LookupDataServiceImpl implements LookupDataService {

    @Autowired
    private LookupDataRepository lookupDataRepository;
    @Autowired LookupTypeRepository lookupTypeRepository;

    @Override
    public LookupData findLookupDataById(String id) {
        return lookupDataRepository.getOne(id);
    }

    @Override
    public LookupData findLookupDataByName(String name) {
        return lookupDataRepository.findByName(name);
    }

    @Override
    public Set<LookupData> findAllLookupDataByType(String type) {
        LookupType lookupType = lookupTypeRepository.findByName(type);
        return lookupDataRepository.findByLookupType(lookupType);
    }

    @Override
    public String save(LookupData lookupData) {
        LookupData savedLookupData = lookupDataRepository.save(lookupData);
        return savedLookupData.getId();
    }

}
