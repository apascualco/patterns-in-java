package com.apascualco.pattern.creational.mfactory;

import com.apascualco.pattern.creational.mfactory.creator.AlgorithmFactory;
import com.apascualco.pattern.creational.mfactory.creator.AlgorithmFactoryImpl;
import com.apascualco.pattern.creational.mfactory.domain.Algorithm;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AlgorithmFactoryImplEpsonTest {

    private final AlgorithmFactory algorithmFactory = new AlgorithmFactoryImpl();

    @Test
    public void encode_sha256() {
        final Algorithm algorithm = algorithmFactory.getInstance("SHA256");
        final String encoded = algorithm.encode("Factory method");
        assertNotNull(encoded);
        assertEquals(64, encoded.length());
        assertEquals("686ff519ebed29be89d6b45ad913276dba8d61ee8244dd0ba4fff4117e7ecf11", encoded);
    }

    @Test
    public void encode_sha384() {
        final Algorithm algorithm = algorithmFactory.getInstance("SHA384");
        final String encoded = algorithm.encode("Factory method");
        assertNotNull(encoded);
        assertEquals(96, encoded.length());
        assertEquals("04283e692a55bdf50b28055190965538d1d5803fce927b2cfe06bc559dd4906d43d82ec741befd0fa08e35f777ed360f", encoded);
    }

    @Test
    public void encode_sha512() {
        final Algorithm algorithm = algorithmFactory.getInstance("SHA512");
        final String encoded = algorithm.encode("Factory method");
        assertNotNull(encoded);
        assertEquals(128, encoded.length());

        assertEquals("92a7603ba987d60f1e29ae8998d3dea1eaf9beff94c6a16edaf8edede038cdc7d786180f0d76361168140d692e3276f3927a6735beb7da8b16e6b7ea16eb6977", encoded);
    }

    @Test(expected = IllegalArgumentException.class)
    public void algorithm_not_implemented() {
        algorithmFactory.getInstance("SHA52");
    }
}
