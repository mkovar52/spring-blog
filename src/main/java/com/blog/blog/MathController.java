package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    // default method for request mapping allows us to leave out "path" and the "method"
    @RequestMapping("/add/{number1}/and/{number2}")
    @ResponseBody
    public int addNumbers(@PathVariable int number1, @PathVariable int number2) {
        return number1 + number2;
    }



    @RequestMapping(path = "/subtract/{number1}/from/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int subtractNumbers(@PathVariable int number1, @PathVariable int number2) {
        return number2 - number1;
    }

    @RequestMapping(path = "/multiply/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody

    public int multiplyNumbers(@PathVariable int number1, @PathVariable int number2) {
        return number1 * number2;
    }

    @RequestMapping(path = "/divide/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody

    public int divideNumbers(@PathVariable int number1, @PathVariable int number2) {
        return number1 / number2;
    }





}
