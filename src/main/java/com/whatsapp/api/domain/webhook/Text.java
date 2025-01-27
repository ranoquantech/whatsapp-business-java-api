package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * The type Text.
 *
 * @param body The text of the text message.
 */
public record Text(

        @JsonProperty("body") String body) implements Serializable {
}