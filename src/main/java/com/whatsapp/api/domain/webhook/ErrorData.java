package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * The type Error data.
 */
public record ErrorData(

        @JsonProperty("details")
        String details
) implements Serializable {
}