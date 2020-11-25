package org.acme.validation;

public class ScienceBookResourceImpl implements ScienceBookResource {

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
