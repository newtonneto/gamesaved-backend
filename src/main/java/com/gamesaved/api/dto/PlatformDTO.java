package com.gamesaved.api.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PlatformDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private PlatformDataDTO platform;
}
