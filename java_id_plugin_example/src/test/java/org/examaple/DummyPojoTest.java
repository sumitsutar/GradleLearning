package org.examaple;

import org.example.DummyPojo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DummyPojoTest {

    @Test
    public void testClassInitialisation()
    {
        DummyPojo obj = DummyPojo.builder().className("Dummy1").classDescription("DummyOneDesc").build();
        assertNotNull(obj);
    }

    @Test
    public void testClassNameAndDesc()
    {
        DummyPojo obj = DummyPojo.builder().className("Dummy2").classDescription("DummyTwoDesc").build();
        assertEquals(obj.getClassName(),"Dummy2");
        assertEquals(obj.getClassDescription(),"DummyTwoDesc");
    }

}
