package Json1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class JsonTest {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setName("NAME");
        c1.setCustID("123qwe");
        c1.setOverdue(46.5f);

        Gson gson = new Gson();

        String response = gson.toJson(c1);
//        System.out.println(response);
//
//
//
        Customer c2=gson.fromJson(response, Customer.class);
//        System.out.println(c2.toString());

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);

        String responseAL= gson.toJson(customers);
        System.out.println(responseAL);

        Type customerALType=new TypeToken<ArrayList<Customer>>(){}.getType();

        ArrayList<Customer> customers2 = gson.fromJson(response,customerALType);
       Customer c3=customers2.get(0);
    }
}
