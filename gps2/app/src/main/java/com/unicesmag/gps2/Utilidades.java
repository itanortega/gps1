package com.unicesmag.gps2;

import android.util.Log;

public class Utilidades {
    public static void msg(String msg) {
        Log.d("Debug->", msg);
    }

    public static void mostrarUbicacion(double longitud, double latitud) {
        msg("------------------");
        msg(String.valueOf("Latitud: " + latitud));
        msg(String.valueOf("Longitud: " + longitud));
        msg("------------------");
    }
}
