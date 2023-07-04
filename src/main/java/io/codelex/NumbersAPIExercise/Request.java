package io.codelex.NumbersAPIExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class Request {

    String apiUrl = "http://numbersapi.com";
    String number;

    public String generateRandomNumber() {
        Random random = new Random();
        String value = Integer.toString(random.nextInt(200 + 1));
        return value;

    }

    public String createARequest() {
        StringBuilder response = new StringBuilder();
        try {
            // Create the URL object with the API endpoint and the number parameter
            URL url = new URL(apiUrl + "/" + generateRandomNumber());

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Check if the request was successful (status code 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;


                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }


                reader.close();

            } else {
                System.out.println("Request failed with response code: " + responseCode);
            }

            // Disconnect the connection
            connection.disconnect();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return response.toString();
    }
}

