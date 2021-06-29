package org.examaple;

import org.example.Consumer;
import org.example.DummyPojo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsumerTest {

    DummyPojo dummyPojo;
    Consumer consumer;

    @Before
    public void setup() {
        dummyPojo = DummyPojo.builder().className("Dummy1").classDescription("DummyOneDesc").build();
        consumer = new Consumer(dummyPojo);
    }

    @Test
    public void testGetDummyClassName() {
        assertEquals(consumer.getDummyClassName(), "Dummy1");
    }

    @Test
    public void testGetDummyClassDescription() {
        assertEquals(consumer.getDummyClassDescription(), "DummyOneDesc");
    }

}
