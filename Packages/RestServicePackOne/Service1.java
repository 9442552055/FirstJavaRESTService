/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RestServicePackOne;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import java.util.List;
import javax.ws.rs.Produces;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author arunmozhi
 */
@Path(value = "/service1")
public class Service1 {

    @GET
    @Produces("application/json")
    public String getName() {
        JSONObject obj = new JSONObject();
        try {
            obj = obj.put("Name", "Arun");
        } catch (JSONException ex) {
            Logger.getLogger(Service1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return obj.toString();
        }
    }

    @GET
    @Path(value = "/ids")
//    @Produces(value={"text/xml", "application/json"})
    @Produces("application/json")
    public String getContactIds() {
        JSONObject obj = new JSONObject();
        try {
            JSONArray ids = new JSONArray();
            ids.put(123);
            ids.put(124);
            ids.put(125);
            obj = obj.put("ids", ids);
        } catch (JSONException ex) {
            Logger.getLogger(Service1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return obj.toString();
        }
    }
}
