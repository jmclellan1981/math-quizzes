package com.mathquiz.viewmodels.services;

import com.mathquiz.domain.LookupType;
import com.mathquiz.services.LookupTypeService;
import com.mathquiz.transformers.LookupTypeTransformer;
import com.mathquiz.viewmodels.LookupTypeViewModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LookupTypeViewModelServiceImpl implements LookupTypeViewModelService {

    @Autowired
    private LookupTypeService lookupTypeService;

    @Override
    public String save(LookupTypeViewModel viewModel) {
        LookupType lookupType = LookupTypeTransformer.transformToBusinessObject(viewModel);
        return lookupTypeService.save(lookupType);
    }

    @Override
    public LookupTypeViewModel findById(String id) {
        LookupType lookupType = lookupTypeService.findById(id);
        return LookupTypeTransformer.transformToViewModel(lookupType);
    }

}
