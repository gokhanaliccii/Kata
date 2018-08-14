package com.gokhanaliccii.kata;

import org.hamcrest.core.IsEqual;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class TryWithResourceTest {

    @Test
    public void should_ReadSampleFileCorrectly() {
        Reader reader = new Reader();
        String actualText = reader.readText("sample.txt");

        assertThat(actualText, IsEqual.equalTo("test"));
    }

    @Test
    public void should_AutoCloseTriggerAutomatically() throws Exception {
        Reader spy = Mockito.spy(new Reader());

        try(Reader spyReader = spy){
            spyReader.check();
        }

        Mockito.verify(spy).close();
    }

    static class Reader implements AutoCloseable {

        String readText(String fileName) {

            try (InputStream is = getClass().getClassLoader().getResourceAsStream(fileName);
                 ByteArrayOutputStream os = new ByteArrayOutputStream()) {

                byte[] buffer = new byte[1024];
                int len;
                while ((len = is.read(buffer)) != -1) {
                    os.write(buffer, 0, len);
                }

                return os.toString();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }

        void check() {
        }

        @Override
        public void close() throws Exception {
            System.out.println("closed");
        }
    }
}