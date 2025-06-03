package br.com.maocubo.utils;


public class DistanciaHaversine {


    public static Integer calcularDistancia(double lat1, double lon1, double lat2, double lon2) {
        final int RAIO_TERRA = 6371; // Raio da Terra em km

        // Converte graus para radianos
        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        // Diferenças
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;

        // Fórmula de Haversine
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distanciaKm = RAIO_TERRA * c;

        // Retorna a distância em metros
        return (int) Math.round(distanciaKm * 1000);
    }

    public static String calcularDistanciaMetrosOrKm(double lat1, double lon1, double lat2, double lon2) {
        final int RAIO_TERRA = 6371; // Raio da Terra em km

        // Converte graus para radianos
        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        // Diferenças
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;

        // Fórmula de Haversine
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distanciaKm = RAIO_TERRA * c;
        double distanciaMetros = distanciaKm * 1000;

        if (distanciaMetros < 1000) {
            return String.format("%d m", Math.round(distanciaMetros));
        } else {
            return String.format("%.1f km", distanciaKm);
        }
    }

    public static void main(String[] args) {
        double lat1 = -23.761994;
        double lon1 = -46.655485;
        double lat2 = -23.7465875;
        double lon2 = -46.6873959;

        String distancia = calcularDistanciaMetrosOrKm(lat1, lon1, lat2, lon2);
        System.out.println("Distância entre os pontos: "+distancia);
    }

}
