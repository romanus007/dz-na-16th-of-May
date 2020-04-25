package ru.sch2.b.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Type_of_organizationController {
    @Autowired
    private Type_of_organizationAction type_of_organizationAction;

    @GetMapping("/listType")
    public @ResponseBody
    Iterable<Type_of_organization> getAllType_of_organization() {
        return type_of_organizationAction.findAll();
    }
    @GetMapping("/addType")
    public @ResponseBody String addNewType_of_organization(@RequestParam String name){
        Type_of_organization t =new Type_of_organization();
        t.setName(name);
        type_of_organizationAction.save(t);
        return "Type saved!!!";
    }
}
