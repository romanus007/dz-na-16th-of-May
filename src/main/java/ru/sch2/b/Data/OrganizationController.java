package ru.sch2.b.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrganizationController {
    @Autowired
    private OrganizationAction organizationAction;
    @GetMapping("/list")
    public @ResponseBody
    Iterable<Organization> getAllOrganization(){
        return organizationAction.findAll();
    }

    @GetMapping("/add")
    public @ResponseBody String addNewOrganization(@RequestParam String name,@RequestParam String latitude, @RequestParam String type, @RequestParam String longitude, @RequestParam String address){
        Organization o =new Organization();
        o.setType(type);
        o.setLatitude(latitude);
        o.setAddress(address);
        o.setLongitude(longitude);
        o.setName(name);
        organizationAction.save(o);
        return "Saved!!";
    }
}
