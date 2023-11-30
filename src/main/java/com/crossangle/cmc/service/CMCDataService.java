package com.crossangle.cmc.service;

import com.crossangle.cmc.model.CMCMinuteQuoteModel;
import com.crossangle.token.external.TokenCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by whoseop song on 11/30/23.
 */
@Service
@RequiredArgsConstructor
public class CMCDataService {
    private final String apiBaseUrl = "https://price.stage.xangle.io";
    private final RestTemplate restTemplate;
    private final TokenCheckService tokenCheckService;


    public List<CMCMinuteQuoteModel> getCMCQuoteDataBySlug(String token, String slug) throws Exception {
        if (!tokenCheckService.validateToken(token)){
            throw new Exception();
        }
        String apiUrl = apiBaseUrl + "/price/internal/cmc/quote/latest/list?"+"slug="+slug;
        ResponseEntity<List<CMCMinuteQuoteModel>> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<CMCMinuteQuoteModel>>() {});
        return response.getBody();
    }
}