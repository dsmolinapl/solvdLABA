package daryaAPI;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "https://automationexercise.com/api/productsList", methodType = HttpMethodType.GET)

public class GetAllProductsListMethod extends AbstractApiMethodV2 {

    public GetAllProductsListMethod() {   //  --Constructor

    }
}
