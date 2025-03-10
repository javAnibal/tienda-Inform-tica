package com.example.app.main;


import com.example.app.enums.TipoGamaProducto;
import com.example.app.models.Laptop;
import com.example.app.models.Movil;
import com.example.app.models.Producto;

public class Main {

    public static void main(String[] args) {



        Movil movil1 = new Movil("Samsung Galaxy S21", 999.99, 20, TipoGamaProducto.Gama_Alta,"Android", 6);
        Movil movil2 = new Movil("iPhone 13", 1099.99, 15, TipoGamaProducto.Gama_Baja,"iOS", 6);
        Movil movil3 = new Movil("Google Pixel 16", 899.99, 10, TipoGamaProducto.Gama_Alta,"Android", 6);
        Movil movil4 = new Movil("OnePlus 9", 799.99, 12, TipoGamaProducto.Gama_Alta,"Android", 6);


        Laptop laptop1 = new Laptop("Dell XPS 13", 1199.99, 8,TipoGamaProducto.Gama_Alta, 255, "Intel");
        Laptop laptop2 = new Laptop("MacBook Air", 999.99, 5, TipoGamaProducto.Gama_Baja,128, "A8");


        System.out.println(movil1);
        movil1.calcularDescuento(movil1);




    }



}
