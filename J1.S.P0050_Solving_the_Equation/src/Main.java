import controller.EquationManagement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        String title = "=============== Equation program ================";
        String[] s = new String[]{"Calculate Superlative Equation", "Calculate Quadratic Equation","Exit"};
        EquationManagement manage = new EquationManagement(title, s);
        manage.run();
    }
}
