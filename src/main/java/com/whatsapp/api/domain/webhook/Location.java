package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * The type Location.
 */
public record Location(

        @JsonProperty("address") String address,

        @JsonProperty("latitude") double latitude,

        @JsonProperty("name") String name,

        @JsonProperty("longitude") double longitude,

        @JsonProperty("url") String url

) implements Serializable {
}