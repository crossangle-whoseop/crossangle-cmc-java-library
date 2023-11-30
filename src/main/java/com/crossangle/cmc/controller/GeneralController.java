package com.crossangle.cmc.controller;

import com.crossangle.cmc.model.CMCMinuteQuoteModel;
import com.crossangle.cmc.service.CMCDataService;
import com.crossangle.token.external.TokenCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by whoseop song on 11/19/23.
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class GeneralController {

    private final CMCDataService cmcDataService;

    @GetMapping("/g1")
    public String getStringTest(){
        String s = "hello world";
        return s;
    }

    @GetMapping("/c1")
    public List<CMCMinuteQuoteModel> getCmcQuoteData(@RequestParam String slug) throws Exception{
        return cmcDataService.getCMCQuoteDataBySlug("token-1",slug);
    }
}
