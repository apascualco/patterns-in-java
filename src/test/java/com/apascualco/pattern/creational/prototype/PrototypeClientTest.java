package com.apascualco.pattern.creational.prototype;

import com.apascualco.pattern.creational.prototype.domain.Android;
import com.apascualco.pattern.creational.prototype.domain.IOS;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrototypeClientTest {

    private Android androidBaseSystem;
    private IOS iosBaseSystem;

    @Before
    public void setUp() {
        this.androidBaseSystem = new Android("Pie", "9.0");
        this.iosBaseSystem = new IOS("13");
    }

    @Test
    public void new_object_fromAndroid_prototype() throws CloneNotSupportedException {
        final Android androidSystem = this.androidBaseSystem.clone();
        androidSystem.addApplication("Twilight");
        androidSystem.addApplication("Automate");

        assertNotSame("The object shoudn't be the same object reference", this.androidBaseSystem, androidSystem);
        assertEquals("The version shoud be equals", this.androidBaseSystem.getVersion(), androidSystem.getVersion());
        assertEquals("The name shoud be equals", this.androidBaseSystem.getName(), androidSystem.getName());
        assertNull("The base object shoudn't have applucations", this.androidBaseSystem.getApplications());
        assertEquals("The clone object shoud have two applications", 2, androidSystem.getApplications().size());
    }

    @Test
    public void new_object_from_IOS_prototype() throws CloneNotSupportedException {
        final IOS iosSystem = this.iosBaseSystem.clone();
        iosSystem.addApplication("Todoist");
        iosSystem.addApplication("Instapaper");
        iosSystem.addApplication("1Password");

        assertNotSame("The object shoudn't be the same object reference", this.iosBaseSystem, iosSystem);
        assertEquals("The version shoud be equals", this.iosBaseSystem.getVersion(), iosSystem.getVersion());
        assertNull("The base object shoudn't have applucations", this.iosBaseSystem.getApplications());
        assertEquals("The clone object shoud have two applications", 3, iosSystem.getApplications().size());
    }
}
