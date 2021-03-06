package com.light.with_if_and_mutable_state;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LightBulbTest {

    private LightBulb lightBulb;

    @Before
    public void setUp() throws Exception{
        lightBulb = new LightBulb();
    }

    @Test
    public void a_new_light_is_always_off(){
        assertThat(lightBulb.is_off(), is(true));
    }

    @Test
    public void an_off_light_can_be_turned_on(){
        assertThat(lightBulb.on().is_on(), is(true));
    }

    @Test
    public void an_on_light_can_be_turned_off(){
        LightBulb on_light = lightBulb.on();
        assertThat(on_light.is_on(), is(true));

        assertThat(on_light.off().is_off(), is(true));
    }

    @Test(expected = IllegalStateException.class)
    public void an_off_light_cannot_be_turned_off(){
       lightBulb.off();
    }

    @Test(expected = IllegalStateException.class)
    public void an_on_light_cannot_be_turned_on(){
        lightBulb.on().on();
    }

}
