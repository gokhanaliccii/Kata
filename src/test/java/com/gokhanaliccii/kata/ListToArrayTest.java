package com.gokhanaliccii.kata;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ListToArrayTest {

    @Test
    public void should_ConvertListToArrayCorrectly() {
        String[] names = new String[0];

        List<String> nameList = Arrays.asList("gokhan", "begum", "hasan");
        names = nameList.toArray(names);

        assertThat(nameList.size(), equalTo(names.length));
    }
}
