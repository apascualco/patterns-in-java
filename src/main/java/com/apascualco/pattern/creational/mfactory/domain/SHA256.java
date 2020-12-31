package com.apascualco.pattern.creational.mfactory.domain;

import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;

public class SHA256 extends Algorithm {

    @Override
    @SuppressWarnings("UnstableApiUsage")
    public String encode(String plainText) {
        return Hashing.sha256()
                .hashString(plainText, StandardCharsets.UTF_8)
                .toString();
    }

}
