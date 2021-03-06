package com.solvd.apitesting;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetRepoMethod extends AbstractApiMethodV2 {

    public GetRepoMethod() {
        super(null, "api/repos/_get/rs.json", "api/repos/repos.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
