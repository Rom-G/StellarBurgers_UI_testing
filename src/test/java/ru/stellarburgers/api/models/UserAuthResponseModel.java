package ru.stellarburgers.api.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAuthResponseModel {

    private boolean success;
    private String accessToken;
    private String refreshToken;
    private UserEmailNameModel user;
}
