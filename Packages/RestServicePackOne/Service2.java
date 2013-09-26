/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package RestServicePackOne;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 *
 * @author arunmozhi
 */
@Path(value = "/service2")
public class Service2 {
    @GET
    @Produces("application/json")
    public String getName() {
        JSONObject obj = new JSONObject();
        try {
            obj = obj.put("Name", "Sivaguru");
        } catch (JSONException ex) {
            Logger.getLogger(Service1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return obj.toString();
        }
    }

}
