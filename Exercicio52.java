package application;

import java.math.BigDecimal;

public class Exercicio52 {
	public static void main(String[] args) {
		int totalHouses = 64;
        BigDecimal totalGrains = BigDecimal.ZERO;

        for (int house = 1; house <= totalHouses; house++) {
            BigDecimal grainsToAdd = new BigDecimal(2).pow(house - 1);
            totalGrains = totalGrains.add(grainsToAdd);
        }

        System.out.println("O súdito receberia um total de " + totalGrains + " grãos de arroz.");

        BigDecimal grainsPerBag = new BigDecimal("50000");
        BigDecimal totalBags = totalGrains.divide(grainsPerBag);

        System.out.println("Isso equivale a aproximadamente " + totalBags + " sacos de arroz, considerando que cada saco possui " + grainsPerBag + " grãos.");
    }
}
