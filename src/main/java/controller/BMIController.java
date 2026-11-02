/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BMIModel;

public class BMIController {

    @FXML
    private TextField inputTinggi;

    @FXML
    private TextField inputBerat;

    @FXML
    private Label labelHasil;

    // Memanggil kelas logika yang sudah dipisah
    private BMIModel kalkulator = new BMIModel();

    @FXML
    void tombolHitungDitekan(ActionEvent event) {
        try {
            double tinggi = Double.parseDouble(inputTinggi.getText());
            double berat = Double.parseDouble(inputBerat.getText());

            double bmi = kalkulator.hitung(berat, tinggi);
            String kategori = kalkulator.getKategori(bmi);

            labelHasil.setText(String.format("BMI Anda: %.2f\nKategori: %s", bmi, kategori));
        } catch (NumberFormatException e) {
            labelHasil.setText("Error: Harap masukkan angka yang valid!");
        }
    }
}
