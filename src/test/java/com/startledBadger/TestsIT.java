package com.startledBadger;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Test;

public class TestsIT 
{
    @Test
    public void whenPostRequestUsingHttpClient_thenCorrect() 
      throws Exception {
        HttpClient client = new DefaultHttpClient();
        HttpGet method = new HttpGet(
          "http://localhost:8080/thinger/mything");

        HttpResponse httpResponse = client.execute(method);

        assertEquals(HttpStatus.SC_NOT_FOUND, httpResponse.getStatusLine().getStatusCode());
    }
}