package ivan.example.resource;

import ivan.example.bean.BasicPrimitivesItem;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Employees")
public class ResourceEmployee {
    
    private static List<BasicPrimitivesItem> lstItems;
    
    private static final Logger LOGGER;
    
    static{
        LOGGER = Logger.getLogger(ResourceEmployee.class.getName());
        
        lstItems = new ArrayList<>();
        lstItems.add(new BasicPrimitivesItem(1, null, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(2, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(3, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(4, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(5, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(6, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(7, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(8, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(9, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(10, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(11, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(12, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(13, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(14, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(15, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(16, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(17, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(18, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(19, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(20, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(21, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(22, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(23, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(24, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(25, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(26, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(27, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(28, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(29, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        lstItems.add(new BasicPrimitivesItem(30, 1, "Pacheco Espejel Ivan", "Empleado", "imageUrl"));
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<BasicPrimitivesItem> createSimpleBean() {
        LOGGER.log(Level.INFO, "Looking for employees..." );
        return lstItems;
    }

}
