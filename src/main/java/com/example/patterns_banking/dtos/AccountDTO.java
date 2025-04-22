package com.example.patterns_banking.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
    @NotNull
    private String number;

    @Pattern(regexp = "SAVING|CREDIT")
    private String type;

    @NotNull
    @PositiveOrZero
    private Double balance;

    private Boolean isActive = true;
}
