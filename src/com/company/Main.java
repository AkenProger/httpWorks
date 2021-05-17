package com.company;

import com.sun.jndi.toolkit.url.Uri;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {



    }

    private void httpQueryGet() throws Exception {

        String url = "https://www.iip.kg/";
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
        httpURLConnection.setRequestMethod("GET");
        int resultStatusCode = httpURLConnection.getResponseCode();
        System.out.println("Запрос отправлен на адрес: " + url);
        System.out.println("Код ответа:" + resultStatusCode);
        try(BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(httpURLConnection.getInputStream()))) {
            StringBuilder result = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {

                   result.append(line);

            }
            System.out.println("Резултат:"+result);
        }

    }

}


