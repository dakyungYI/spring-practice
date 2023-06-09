package com.codestates.coffee;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/coffees", produces = MediaType.APPLICATION_JSON_VALUE)
public class CoffeeController {
/*
요청에 필요한 커피(Coffee) 정보
1. 커피명(영문): engName
2. 커피명(한글): korName
 */

    @PostMapping
    public String postCoffee(@RequestParam("engName") long engName,
                            @RequestParam("korName") long korName) {
        System.out.println("# engName: " + engName);
        System.out.println("# korName: " + korName);

        String response =
                "{\"" +
                        "memberId\":\""+engName+"\"," +
                        "\"coffeeId\":\""+korName+"\"" +
                        "}";
        return response;
    }

    @GetMapping("/{coffee-id}")
    public String getCoffee(@PathVariable("coffee-id") long coffeeId) {
        System.out.println("# coffeeId: " + coffeeId);

        return null;
    }

    @GetMapping
    public String gerCoffees() {
        System.out.println("# get Coffees");

        return null;
    }
}