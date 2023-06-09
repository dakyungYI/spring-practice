package com.codestates.order;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {
/*
요청에 필요한 주문(Order) 정보
1. 회원 식별자: memberId
2. 커피 식별자: coffeeId
 */
    @PostMapping
    public String postOrder(@RequestParam("memberId") long memberId,
                            @RequestParam("coffeeId") long coffeId) {
        System.out.println("# memberId: " + memberId);
        System.out.println("# coffeeId: " + coffeId);

        String response =
                "{\"" +
                    "memberId\":\""+memberId+"\"," +
                    "\"coffeeId\":\""+coffeId+"\"" +
                "}";
        return response;
    }

    @GetMapping("/{order-id}")
    public String getOrder(@PathVariable("order-id") long orderId) {
        System.out.println("# orderId: " + orderId);

        return null;
    }

    @GetMapping
    public String gerOrders() {
        System.out.println("# get Orders");

        return null;
    }
}
