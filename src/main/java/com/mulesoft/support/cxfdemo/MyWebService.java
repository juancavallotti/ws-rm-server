package com.mulesoft.support.cxfdemo;

import com.mulesoft.support.cxfdemo.domain.Customer;
import com.mulesoft.support.cxfdemo.domain.CustomerRequest;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author juancavallotti
 */
@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MyWebService {

    @WebMethod
    String doSomeWork(String work);
    
    
    public String beRestful(String name);
    
    
    @WebMethod
    public ArrayList<Customer> findCustomers(CustomerRequest request);
}
