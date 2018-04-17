package resource;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;



@Stateless
@Path("/converter")
public class Converter {
    
    public Converter(){
    }
    
    @GET
    public String converterDecToBin(@QueryParam("decimal") int decimal){
        String binario = "";
        int resto = 0;
        while(decimal > 0){
            resto = decimal%2;
            binario = Integer.toString(resto) + binario;
            decimal = decimal/2;
        }
        return binario;
    }
    
}

