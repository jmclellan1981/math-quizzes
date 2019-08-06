package com.mathquiz.viewmodels.services;

import com.mathquiz.viewmodels.LookupTypeViewModel;

public interface LookupTypeViewModelService {
    public String save(LookupTypeViewModel viewModel);
    public LookupTypeViewModel findById(String id);
}
