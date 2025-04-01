package daryaAPI;

import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.annotations.Test;

public class ApiTest implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "dsmolina")
    public void verifyGetAllProductsListCall() {
        GetAllProductsListMethod getAllProductsListMethod = new GetAllProductsListMethod();
        getAllProductsListMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        //- check our status code (200)
        getAllProductsListMethod.callAPI();
        //getAllProductsListMethod.validateResponse();
        //check response body in JSON file
    }
    @Test()
    @MethodOwner(owner = "dsmolina")
    public void verifyPostAllProductsListCall(){
        PostToAllProductsListMethod postToAllProductsListMethod = new PostToAllProductsListMethod();
        postToAllProductsListMethod.expectResponseStatus(HttpResponseStatusType.BAD_REQUEST_400);
        postToAllProductsListMethod.callAPI();

    }
}
