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
public class CMCMinuteQuoteModel extends BaseObject{
    @Serial
    private static final long serialVersionUID = 5456707872146024389L;
    @JsonProperty("timestamp_utc")
    private String timestampUTC;
    @JsonProperty("USD")
    private CMCQuoteFiatModel USD;

}
