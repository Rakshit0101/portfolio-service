package com.site.portfolio.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotEmpty;

import java.util.List;

@Data
@NoArgsConstructor
public class WebLinkRequestDto {

    @NotEmpty(message = "URL list must not be empty")
    private List<String> urls;
}
