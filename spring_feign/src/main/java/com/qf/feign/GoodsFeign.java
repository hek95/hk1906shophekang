package com.qf.feign;

import com.qf.entity.Goods;
import com.qf.hystrix.GoodsFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Component
@FeignClient(value = "web-goods", fallback = GoodsFeignHystrix.class)
public interface GoodsFeign {
    @RequestMapping("/goods/list")
    List<Goods> goodsList();
    @RequestMapping("/goods/insert")
    boolean goodsInsert(@RequestBody Goods goods);

}
