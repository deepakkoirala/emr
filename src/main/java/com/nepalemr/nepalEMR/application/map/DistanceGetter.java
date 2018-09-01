package com.nepalemr.nepalEMR.application.map;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;

public class DistanceGetter {
    private static GeoApiContext geoApiContext = new GeoApiContext().setApiKey("AIzaSyCrpsZFUOqKeFgkIHCRfr0MF5OCjR-m8O4");


    public static String getDistance() {
        try {
            String[] origin = {"Washington,DC"};
            String[] destination = {"New York City,NY"};

            DistanceMatrixApiRequest distanceMatrixApiRequest = DistanceMatrixApi.newRequest(geoApiContext);
            DistanceMatrix result = distanceMatrixApiRequest.origins(origin).destinations(destination).await();
            long distApart = result.rows[0].elements[0].distance.inMeters;

            return String.valueOf(distApart);
        }
        catch (Exception e){
            return "Not found " + e.getMessage();
        }

    }


}
