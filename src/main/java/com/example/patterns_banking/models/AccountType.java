package com.example.patterns_banking.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AccountType {
    SAVING("Ahorros"),
    CREDIT("Crédito");

    private final String title;
}
