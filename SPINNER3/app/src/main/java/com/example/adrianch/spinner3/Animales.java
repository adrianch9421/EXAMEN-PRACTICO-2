package com.example.adrianch.spinner3;

import java.util.ArrayList;

/**
 * Created by Adrian Ch on 13/02/2018.
 */

public class Animales {
    private String Tipoanimal;
    private String Tipos;

    public Animales(String Tipos) {
        this.Tipoanimal = Tipoanimal;
        this.Tipos = Tipos;


    }

    public String getTipos() {
        return Tipos;
    }

    @Override
    public String toString() {
        return Tipos;
    }

    public static ArrayList<Animales> gettipoanimal() {
        ArrayList<Animales> Tipoanimal = new ArrayList<>();
        Tipoanimal.add(new Animales("ACUATIOS"));
        Tipoanimal.add(new Animales("TERRESTRES"));


        return Tipoanimal;


    }

    public static ArrayList<Animales> getAcuaticos() {
        ArrayList<Animales> acuaticos = new ArrayList<>();
        acuaticos.add(new Animales("BALLENA"));
        acuaticos.add(new Animales("TIBURON BLANCO"));
        acuaticos.add(new Animales("DELFIN"));
        acuaticos.add(new Animales("PEZ GLOBO"));
        acuaticos.add(new Animales("FOCA"));
        acuaticos.add(new Animales("MANTA-RAYA"));
        acuaticos.add(new Animales("CABALLITO DE MAR"));
        acuaticos.add(new Animales("PULPO"));
        acuaticos.add(new Animales("TIBURONSIN UHHAHA"));
        acuaticos.add(new Animales("TRUCHA"));
        return acuaticos;
    }

    public static ArrayList<Animales> getTerrestres() {
        ArrayList<Animales> terrestres = new ArrayList<>();
        terrestres.add(new Animales("LEON"));
        terrestres.add(new Animales("TIGRE"));
        terrestres.add(new Animales("ZEBRA"));
        terrestres.add(new Animales("JIRAFA"));
        terrestres.add(new Animales("PUMA"));
        terrestres.add(new Animales("YENA"));
        terrestres.add(new Animales("OSO YOGI"));
        terrestres.add(new Animales("PITON"));
        terrestres.add(new Animales("ARAÑA"));
        terrestres.add(new Animales("RINOSERONTE"));

        return terrestres;


    }
}


