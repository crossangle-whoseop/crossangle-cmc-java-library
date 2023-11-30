package com.crossangle.cmc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

/**
 * Created by whoseop song on 11/30/23.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CMCQuoteFiatModel extends BaseObject{
    @Serial
    private static final long serialVersionUID = -2800819329867433991L;
    @JsonProperty("price")
    private double price;
    @JsonProperty("volume_24h")
    private double volume24h;
    @JsonProperty("volume_24_reported")
    private double volume24hReported;
    @JsonProperty("volume_change_24h")
    private double volumeChange24h;
    @JsonProperty("percent_change_1h")
    private double percentChange1h;
    @JsonProperty("percent_change_24h")
    private double percentChange24h;
    @JsonProperty("percent_change_7d")
    private double percentChange7d;
    @JsonProperty("percent_change_30d")
    private double percentChange30d;
    @JsonProperty("market_cap")
    private double marketCap;
    @JsonProperty("market_cap_dominance")
    private double marketCapDominance;
    @JsonProperty("fully_diluted_market_cap")
    private double fullyDilutedMarketCap;
    @JsonProperty("last_updated")
    private String lastUpdated;
}
