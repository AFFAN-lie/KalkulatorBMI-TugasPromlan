/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

/**
 *
 * @author Hendriana
 */
public class BMIModel {
    // Menghitung BMI (Berat dalam kg, Tinggi dalam cm)
    public double hitung(double beratKg, double tinggiCm) {
        double tinggiMeter = tinggiCm / 100.0;
        return beratKg / (tinggiMeter * tinggiMeter);
    }
    
    // Menentukan kategori BMI
    public String getKategori(double bmi) {
        if (bmi < 18.5) {
            return "Kurus (Underweight)";
        } else if (bmi < 24.9) {
            return "Normal";
        } else if (bmi < 29.9) {
            return "Kelebihan Berat Badan (Overweight)";
        } else {
            return "Obesitas";
        }
    }
}
