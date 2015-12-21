package com.notif;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class LightBulbTest {

    private LightBulb lightBulb;

    @Before
    public void setUp() throws Exception {
        lightBulb = new LightBulb();
    }

    @Test
    public void a_new_light_is_always_off() {
        assertThat(lightBulb.is_off(), is(true));
    }

    @Test
    public void an_off_light_can_be_turned_on(){
        assertThat(lightBulb.on().is_off(), is(false));
    }

}