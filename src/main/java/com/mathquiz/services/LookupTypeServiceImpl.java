package com.mathquiz.services;

import com.mathquiz.domain.LookupType;
import com.mathquiz.repositories.LookupTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LookupTypeServiceImpl implements LookupTypeService {

    @Autowired
    private LookupTypeRepository lookupTypeRepository;

	@Override
	public String save(LookupType lookupType) {
        LookupType savedLookupType = lookupTypeRepository.save(lookupType);
        return savedLookupType.getId();
	}

	@Override
	public LookupType findById(String id) {
		return lookupTypeRepository.getOne(id);
	}

}
