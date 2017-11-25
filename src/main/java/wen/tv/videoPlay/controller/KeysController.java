package wen.tv.videoPlay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wen on 2017/11/7.
 */
@Controller
public class KeysController {


    @ResponseBody
    @RequestMapping(value = {"keys"},method = {RequestMethod.GET})
    public String getKey(){
        String miyao="1234567812345678";
        return miyao;
    }

}
