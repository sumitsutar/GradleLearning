/*
 * Copyright (c) @author : Sumit Sutar
 */

package org.example;


public class Consumer {

    DummyPojo dummyObject;

    public Consumer(DummyPojo dummyObject) {
        this.dummyObject = dummyObject;
    }


    /**
     * This method will get the name of the dummyObject.
     * @return Class Name of Dummy Object
     */
    public String getDummyClassName() {
        return this.dummyObject.getClassName();
    }

    /**
     * This method will get the description of the dummyObject.
     * @return Description of Dummy Object
     */
    public String getDummyClassDescription(){
        return this.dummyObject.getClassDescription();
    }
}
