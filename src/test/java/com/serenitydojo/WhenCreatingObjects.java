package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        String name = "Fido";
        String favoriteToy = "Bone";
        int age = 5;

        // Create an object of Dog class
        Dog fido = new Dog(name,favoriteToy,age);
        Assert.assertEquals(fido.getName(),name);
        Assert.assertEquals(fido.getFavoriteToy(),favoriteToy);
        Assert.assertEquals(fido.getAge(),age);
    }
}
