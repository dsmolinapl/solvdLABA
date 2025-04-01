package daryaAPI;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.http.HttpMethodType;

@Endpoint(url = "https://automationexercise.com/api/productsList", methodType = HttpMethodType.POST)
public class PostToAllProductsListMethod extends AbstractApiMethodV2 {

    public PostToAllProductsListMethod(){

    }
}
