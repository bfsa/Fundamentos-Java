package org.example.questao12;

public class TestaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        System.out.println("Raio do círculo = " + circulo.getRaio() + " || Área do círculo: " + circulo.calcularArea());

        Esfera esfera = new Esfera(5.0);
        System.out.println("Raio da esfera = "+ esfera.getRaio() + " || Volume da esfera: " + esfera.calcularVolume());
    }
}
