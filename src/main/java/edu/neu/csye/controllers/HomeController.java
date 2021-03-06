
/**
 * Varsha Bhanushali, 001234580, bhanushali.v@husky.neu.edu
 * Shrikant Mudholkar, 001284732, mudholkar.s@husky.neu.edu
 * Rahul Chandra, 01225683, chandra.ra@husky.neu.edu
 * Manish Patil, 001228956, patil.man@husky.neu.edu
 **/
package edu.neu.csye.controllers;


import com.google.gson.JsonObject;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class HomeController {

    //private final static Logger logger = LoggerFactory.getLogger(HomeController.class);

    @ResponseBody
    public String welcome() {

        JsonObject jsonObject = new JsonObject();

        if (SecurityContextHolder.getContext().getAuthentication() != null
                && SecurityContextHolder.getContext().getAuthentication() instanceof AnonymousAuthenticationToken) {
            jsonObject.addProperty("message", "you are not logged in!!!");
        } else {
            jsonObject.addProperty("message", "you are logged in. current time is " + new Date().toString());
        }

        return jsonObject.toString();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String test() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("message", "authorized for /test");
        return jsonObject.toString();
    }

    @RequestMapping(value = "/testPost", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public String testPost() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("message", "authorized for /testPost");
        return jsonObject.toString();
    }

}
