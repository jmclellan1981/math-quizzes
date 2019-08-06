package com.mathquiz.repositories;

import java.util.Set;

import com.opdl.dartstats.domain.LookupData;
import com.opdl.dartstats.domain.LookupType;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LookupDataRepository extends JpaRepository<LookupData, String>{

    LookupData findByName(String name);

	Set<LookupData> findByLookupType(LookupType lookupType);
}
