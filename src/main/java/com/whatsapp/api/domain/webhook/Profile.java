package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Optional.
 *
 * @param name Specifies the sender's profile name.
 */
public record Profile(

        @JsonProperty("name") String name

) implements Serializable {
}