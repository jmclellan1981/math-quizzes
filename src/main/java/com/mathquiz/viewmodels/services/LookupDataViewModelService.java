package com.mathquiz.viewmodels.services;

import com.mathquiz.viewmodels.LookupDataViewModel;

public interface LookupDataViewModelService {
    public String save(LookupDataViewModel viewModel);
    public LookupDataViewModel findById(String id);
}
