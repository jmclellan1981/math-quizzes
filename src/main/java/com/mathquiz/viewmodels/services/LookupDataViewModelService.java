package com.mathquiz.viewmodels.services;

import java.util.List;

import com.mathquiz.viewmodels.LookupDataViewModel;

public interface LookupDataViewModelService {
    public String save(LookupDataViewModel viewModel);
    public LookupDataViewModel findById(String id);
    public List<LookupDataViewModel> getByType(String type);
}
