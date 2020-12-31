package com.apascualco.pattern.creational.mfactory.creator;

import com.apascualco.pattern.creational.mfactory.domain.Algorithm;

public interface AlgorithmFactory {
    Algorithm getInstance(final String algorithm);
}
