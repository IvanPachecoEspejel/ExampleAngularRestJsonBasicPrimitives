package ivan.example.resource;

import ivan.example.bean.BeanEmployee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Employee")
public class ResourceEmployee {
    
    private static List<BeanEmployee> lstEmployees;
    
    private static final Logger LOGGER;
    
    static{
        LOGGER = Logger.getLogger(ResourceEmployee.class.getName());
        
        lstEmployees = new ArrayList<>();
        BeanEmployee boss = new BeanEmployee(1, "Pacheco Espejel Ivan", new Date());
        lstEmployees.add(boss);
        lstEmployees.add(new BeanEmployee(2, "Pacheco Espejel Ivan1", new Date(), boss));
        lstEmployees.add(new BeanEmployee(3, "Pacheco Espejel Ivan2", new Date(), boss));
        lstEmployees.add(new BeanEmployee(4, "Pacheco Espejel Ivan3", new Date(), boss));
        lstEmployees.add(new BeanEmployee(5, "Pacheco Espejel Ivan4", new Date(), boss));
        lstEmployees.add(new BeanEmployee(6, "Pacheco Espejel Ivan5", new Date(), boss));
        lstEmployees.add(new BeanEmployee(7, "Pacheco Espejel Ivan6", new Date(), boss));
        lstEmployees.add(new BeanEmployee(8, "Pacheco Espejel Ivan7", new Date(), boss));
        lstEmployees.add(new BeanEmployee(9, "Pacheco Espejel Ivan8", new Date(), boss));
        lstEmployees.add(new BeanEmployee(10, "Pacheco Espejel Ivan9", new Date(), boss));
        lstEmployees.add(new BeanEmployee(11, "Pacheco Espejel Ivan10", new Date(), boss));
        lstEmployees.add(new BeanEmployee(12, "Pacheco Espejel Ivan11", new Date(), boss));
        lstEmployees.add(new BeanEmployee(13, "Pacheco Espejel Ivan12", new Date(), boss));
        lstEmployees.add(new BeanEmployee(14, "Pacheco Espejel Ivan13", new Date(), boss));
        lstEmployees.add(new BeanEmployee(15, "Pacheco Espejel Ivan14", new Date(), boss));
        lstEmployees.add(new BeanEmployee(16, "Pacheco Espejel Ivan15", new Date(), boss));
        lstEmployees.add(new BeanEmployee(17, "Pacheco Espejel Ivan16", new Date(), boss));
    }
    
    @GET
    @Path("getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BeanEmployee> createSimpleBean() {
        LOGGER.log(Level.INFO, "Looking for employees..." );
        return lstEmployees;
    }

}
