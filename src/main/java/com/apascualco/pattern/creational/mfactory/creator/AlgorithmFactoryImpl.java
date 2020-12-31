package com.apascualco.pattern.creational.mfactory.creator;

import com.apascualco.pattern.creational.mfactory.domain.Algorithm;
import com.apascualco.pattern.creational.mfactory.domain.SHA256;
import com.apascualco.pattern.creational.mfactory.domain.SHA384;
import com.apascualco.pattern.creational.mfactory.domain.SHA512;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AlgorithmFactoryImpl implements AlgorithmFactory {

    private static Map<String, Algorithm> algorithms = new HashMap<>();

    public AlgorithmFactoryImpl() {
        algorithms.put("SHA256", new SHA256());
        algorithms.put("SHA384", new SHA384());
        algorithms.put("SHA512", new SHA512());
    }

    @Override
    public Algorithm getInstance(final String algorithm) {
        return Optional.ofNullable(algorithms.get(algorithm))
                .orElseThrow(() -> new IllegalArgumentException("Algorithm don't implemented"));

    }

}
