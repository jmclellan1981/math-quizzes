package com.mathquiz.transformers;

import javax.annotation.PostConstruct;

import com.mathquiz.domain.LookupType;
import com.mathquiz.services.LookupTypeService;
import com.mathquiz.viewmodels.LookupTypeViewModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LookupTypeTransformer {

    private static LookupTypeService lookupTypeService;

    @Autowired
    private LookupTypeService lookupTypeService_auto;
    
    @PostConstruct
    private void init() {
        lookupTypeService = lookupTypeService_auto;
    }
    
    public static LookupType transformToBusinessObject(LookupTypeViewModel viewModel) {
        LookupType lookupType = null;
        if(viewModel.getId() == null) {
            lookupType = new LookupType();
        } else {
            lookupType = lookupTypeService.findById(viewModel.getId());
        }
        lookupType.setDescription(viewModel.getDescription());
        lookupType.setName(viewModel.getName());
        return lookupType;
    }

    public static LookupTypeViewModel transformToViewModel(LookupType lookupType) {
        LookupTypeViewModel viewModel = new LookupTypeViewModel();
        viewModel.setDescription(lookupType.getDescription());
        viewModel.setId(lookupType.getId());
        viewModel.setName(lookupType.getName());
        return viewModel;
    }

}
