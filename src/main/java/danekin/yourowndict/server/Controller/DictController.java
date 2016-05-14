package danekin.yourowndict.server.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ad on 14.05.2016.
 */

@Controller
@RequestMapping("/dict")
public class DictController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getTranslte(ModelMap model){
        return "My dict";
    }
}
