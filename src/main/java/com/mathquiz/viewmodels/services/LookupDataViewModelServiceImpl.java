package com.mathquiz.viewmodels.services;

import com.mathquiz.domain.LookupData;
import com.mathquiz.services.LookupDataService;
import com.mathquiz.transformers.LookupDataTransformer;
import com.mathquiz.viewmodels.LookupDataViewModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LookupDataViewModelServiceImpl implements LookupDataViewModelService {

    @Autowired
    private LookupDataService lookupDataService;

    @Override
    public String save(LookupDataViewModel viewModel) {
        
        LookupData lookupData = LookupDataTransformer.transformToBusinessObject(viewModel);
        return lookupDataService.save(lookupData);
    }

    @Override
    public LookupDataViewModel findById(String id) {
        LookupData lookupData =  lookupDataService.findLookupDataById(id);
        return LookupDataTransformer.transformToViewModel(lookupData);
    }

	@Override
	public List<LookupDataViewModel> getByType(String type) {
		List<LookupData> dataList = lookupDataService.findAllLookupDataByType(type);
		return LookupDataTransformer.transformToViewModel(dataList);
	}

}
