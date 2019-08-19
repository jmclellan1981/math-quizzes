package com.mathquiz.transformers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.mathquiz.domain.LookupData;
import com.mathquiz.services.LookupDataService;
import com.mathquiz.viewmodels.LookupDataViewModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LookupDataTransformer {
    @Autowired
    private LookupDataService lookupService_auto;
    private static LookupDataService lookupDataService;

    @PostConstruct
    private void init() {
        lookupDataService = lookupService_auto;
    }
    
    public static LookupData transformToBusinessObject(LookupDataViewModel viewModel) {
        LookupData lookupData = null;
        if(viewModel.getId() == null) {
            lookupData = new LookupData();
        } else {
            lookupData = lookupDataService.findLookupDataById(viewModel.getId());
        }
        lookupData.setDescription(viewModel.getDescription());
        lookupData.setLookupType(LookupTypeTransformer.transformToBusinessObject(viewModel.getLookupType()));
        lookupData.setName(viewModel.getName());
        return lookupData;
    }

    public static LookupDataViewModel transformToViewModel(LookupData lookupData) {
        LookupDataViewModel viewModel = new LookupDataViewModel();
        viewModel.setDescription(lookupData.getDescription());
        viewModel.setId(lookupData.getId());
        viewModel.setLookupType(LookupTypeTransformer.transformToViewModel(lookupData.getLookupType()));
        viewModel.setName(lookupData.getName());
        return viewModel;
    }

	public static List<LookupDataViewModel> transformToViewModel(List<LookupData> dataList) {
		List<LookupDataViewModel> viewModelList = new ArrayList<>();
		if(dataList != null) {
			for(LookupData data : dataList) {
				viewModelList.add(transformToViewModel(data));
			}
		}
		return viewModelList;
	}
}
