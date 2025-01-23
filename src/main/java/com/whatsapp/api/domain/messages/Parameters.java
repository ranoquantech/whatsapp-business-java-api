package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Parameters {
    @JsonProperty("display_text")
    private String displayText;
    @JsonProperty("url")
    private String url;

    public String getDisplayText() {
        return displayText;
    }

    public String getUrl() {
        return url;
    }

    public Parameters setDisplayText(String displayText) {
        this.displayText = displayText;
        return this;
    }

    public Parameters setUrl(String url) {
        this.url = url;
        return this;
    }
}
