package Utilidades;

public class Delegacion {
    static String[] delegaciones = {
        "Azcapotzalco",
        "Coyoacan",
        "Cuajimalpa de Morelos",
        "Gustavo A. Madero",
        "Iztacalco",
        "Iztapalapa",
        "La Magdalena Contreras",
        "Milpa Alta",
        "Alvaro Obregon",
        "Tlahuac",
        "Tlalpan",
        "Xochimilco",
        "Benito Juarez",
        "Cuauhtemoc",
        "Miguel Hidalgo",
        "Venustiano Carranza"};
    
    public static String obtenerDelegacion(int num){
        return delegaciones[num];
    }
}
