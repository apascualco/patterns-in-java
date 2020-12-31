package com.apascualco.pattern.creational.singleton;

import com.apascualco.pattern.creational.singleton.domain.ShopApplication;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingletonTest {

    @Test
    public void same_instance() {
        final ShopApplication shopApplicationFirstInstance = ShopApplication.getInstance(1,"Shop");
        final ShopApplication shopApplicationSecondInstance =  ShopApplication.getInstance(1,"Shop");
        assertTrue("The instance should have the same instance",shopApplicationFirstInstance == shopApplicationSecondInstance);
    }
}
