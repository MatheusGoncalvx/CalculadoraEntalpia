/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraentalpia;

/**
 *
 * @author ADM
 */
import javax.swing.JOptionPane;

public class CalculadoraEntalpia {
   public static void main(String[] args) {

      // Obter os valores de entrada do usuário
      String strReagente1 = JOptionPane.showInputDialog("Digite o nome do primeiro reagente:");
      String strReagente2 = JOptionPane.showInputDialog("Digite o nome do segundo reagente:");
      String strProduto1 = JOptionPane.showInputDialog("Digite o nome do primeiro produto:");
      String strProduto2 = JOptionPane.showInputDialog("Digite o nome do segundo produto:");
      double deltaH1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o deltaH para " + strReagente1 + " (em kJ/mol):"));
      double deltaH2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o deltaH para " + strReagente2 + " (em kJ/mol):"));
      double deltaH3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o deltaH para " + strProduto1 + " (em kJ/mol):"));
      double deltaH4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o deltaH para " + strProduto2 + " (em kJ/mol):"));

      // Calcular a variação de entalpia
      double deltaHReagentes = deltaH1 + deltaH2;
      double deltaHProdutos = deltaH3 + deltaH4;
      double deltaH = deltaHProdutos - deltaHReagentes;

      // Exibir o resultado para o usuário
      JOptionPane.showMessageDialog(null, "A variação de entalpia para a reação: \n" +
                                          strReagente1 + " + " + strReagente2 + " -> " +
                                          strProduto1 + " + " + strProduto2 + " é: " +
                                          deltaH + " kJ/mol");
   }
}
