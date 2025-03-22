package org.miumg;

import ArbolBinario.Arbol;
import Datos.ArbolPersona;
import Datos.Personas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Arbol aarbol = new Arbol();
        aarbol.insertar(6);
        aarbol.insertar(10);
        aarbol.insertar(4);
        aarbol.insertar(8);
        aarbol.insertar(5);
        aarbol.insertar(3);
        aarbol.insertar(15);

        //Recorer el arbol en preorden
        System.out.println("\nRecorrido en preorden");
        aarbol.preorden();


        // Recorrer el arbol en postorden
        System.out.println("\nRecorrido en postorden");
        aarbol.postorden();

        //Recorrer el arbol en Inorden
        System.out.println("\necorrido en inorden");
        aarbol.inorden();
    }
}

        // aarbol.insertar(8);
        //aarbol.insertar(11);
/*
        ArbolCadena ar = new ArbolCadena();
        ar.insertar("Farore");
        ar.insertar("Impa");
        ar.insertar("Navi");
        ar.insertar("Farore");


        System.out.println("fin!");
    }*/


/*
        ArbolPersona perso = new ArbolPersona();

        //Nodo Padre
        Personas p1 = new Personas();
        p1.setNumeroTelefono(7896302);
        p1.setNombre("Xiomara");
        p1.setDireccion("El Progreso Jutiapa");

        Personas p2 = new Personas();
        p2.setNumeroTelefono(78965533);
        p2.setNombre("Nayeli");
        p2.setDireccion("Chiquimula");

        Personas p3 = new Personas();
        p3.setNumeroTelefono(85236974);
        p3.setNombre("Robinson");
        p3.setDireccion("Zacapa");

        Personas p4 = new Personas();
        p4.setNumeroTelefono(12369854);
        p4.setNombre("Alexander");
        p4.setDireccion("Mita");

        Personas p5 = new Personas();
        p5.setNumeroTelefono(18569854);
        p5.setNombre("Keyra");
        p5.setDireccion("Huehue");

        Personas p6 = new Personas();
        p6.setNumeroTelefono(85236974);
        p6.setNombre("Alejandro");
        p6.setDireccion("ReU");

        //Insertar
        perso.insertar(p1);
        perso.insertar(p2);
        perso.insertar(p3);
        perso.insertar(p4);
        perso.insertar(p5);
        perso.insertar(p6);

        System.out.println("\nMostrando el árbol en ORDEN:");

        perso.mostrarInOrden();

        System.out.println("\nProceso Finalizado");
    }

}


 }*/