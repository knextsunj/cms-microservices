package com.github.knextsunj.cms.service.validation.impl

import com.github.knextsunj.cms.domain.Country
import com.github.knextsunj.cms.repository.CountryRepository
import com.github.knextsunj.cms.service.validation.GenericValidationService
import com.github.knextsunj.cms.util.CmsUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component("countryValidationService")
open class CountryValidationServiceImpl:GenericValidationService {

    @Autowired
    open lateinit var countryRepository: CountryRepository


    override fun deDup(name: String?): Boolean? {
        var country: Country? = countryRepository.findByName(name);
        return CmsUtil.isNull(country);
    }
}