package com.gokhanaliccii.kata;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class TryWithResourceTest {

    @Test
    public void should_ReadSampleFileCorrectly() {
        Reader reader = new Reader();
        String actualText = reader.readText("sample.txt");

        assertThat(actualText, IsEqual.equalTo("test"));
    }

    static class Reader {

        String readText(String fileName) {
            InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
            ByteArrayOutputStream os = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];

            try {
                int len;
                while ((len = is.read(buffer)) != -1) {
                    os.write(buffer, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    is.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return os.toString();
        }

    }
}
