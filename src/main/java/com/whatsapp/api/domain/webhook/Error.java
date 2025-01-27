package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * The type Error.
 */
public record Error(

        @JsonProperty("code")
        int code,

        @JsonProperty("title")
        String title,

        @JsonProperty("message")
        String message,

        @JsonProperty("error_data")
        ErrorData errorData,
        @JsonProperty("href")
        String href
) implements Serializable {
}