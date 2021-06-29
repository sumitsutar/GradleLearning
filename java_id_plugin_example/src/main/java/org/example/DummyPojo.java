package org.example;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DummyPojo {
    private String className;
    private String classDescription;
}
