/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caval;


/**
 *
 * @author rss58
 */
public class ManipulaProductos {

//    public static int menu(String[] mnu, String s) {
//        System.out.println("=== MENÚ " + s + " ===");
//        for (int i = 0; i < mnu.length; i++) {
//            System.out.println((i + 1) + ".-" + mnu[i]);
//        }
//        //return Lecturas.entero(true);
//    }

//    public static Productos creaObjeto(int opc) {
//
//        String nom;
//        int existencias;
//        int lote;
//        String fechaCad;
//
//        System.out.println("dame el nombre : ");
//        nom = Lecturas.cadena();
//        System.out.println("dame las existencias: ");
//        existencias = Lecturas.entero(true);
//        //if (opc == 1) {
//            //System.out.println("dame la fecha de caducidad: ");
//            //fechaCad = Lecturas.cadena();
//            //return new Perecede(fechaCad, nom, existencias);
//        /*} else {
//            System.out.println("dame el lote: ");
//            lote = Lecturas.entero(true);
//            return new NoPerecederos(lote, nom, existencias);
//        }*/
//    }

    public static Productos[] inserta(Productos p[], Productos obj) {
        if (p == null) {
            p = new Productos[1];
            p[0] = obj;
        } else {
            Productos tmp[] = new Productos[p.length + 1];
            System.arraycopy(p, 0, tmp, 0, p.length);
            tmp[p.length] = obj; //posicion donde se va a guardar
            p = tmp; //pasa el arreglo temporal al arreglo original, para no perder 
        }
        return p;
    }
    
    public static String consulta(Productos[] p, int opc) {
        String s = "";
        if (p == null) {
            s = "No hay datos que mostrar...";
        } else {
            for (int i = 0; i < p.length; i++) {
                //if (p[i] instanceof Perecederos && opc == 1) {
                    s += p[i].desp();
                /*} else {
                    if (p[i] instanceof NoPerecederos && opc == 2) {
                        s += p[i].desp();
                    }
                }*/
            }
            if (s == "") {
                s = "no se encontraron datos de este tipo";
            }
        }
        return s;
    }

//    public static String consultaIva(Productos[] p, int opc) {
//        String s = "";
//        if (p == null) {
//            s = "No hay datos que mostrar...";
//        } else {
//            for (int i = 0; i < p.length; i++) {
//                if (p[i] instanceof Perecederos && opc == 1) {
//                    s += p[i].desp();
//                } else {
//                    if (p[i] instanceof NoPerecederos && opc == 2) {
//                        s += p[i].desp();
//
//                    }
//                }
//            }
//            if (s == "") {
//                s = "no se encontraron datos de este tipo";
//            }
//        }
//        return s;
//    }
    
    

    public static int busca(Productos p[], int opc, String s, String pBusca) //se llama para el otro punto
    {
        if (p == null) {
            s = "No hay datos que..." + s + "...";
        } else {
            System.out.println("DAME EL PRODUCTO A ELIMINAR/MODIFICAR");
            String nom = pBusca;

            for (int i = 0; i < p.length; i++) {
                //lo quite p[i] instanceof Perecederos && opc == 1 && 
                if (nom.equals(p[i].getNom())) {
                    return i;
                }/* else {
                    if (p[i] instanceof NoPerecederos && opc == 2 && nom.equals(p[i].getNom())) {
                        return i;
                    }
                }*/
            }
            if (s == "") {
                s = "no se encontraron datos de este tipo";
            }
        }
        System.out.println("DATO NO ENCONTRADO...");
        return -1;
    }

    public static Productos[] elimina(Productos[] p, int pos) {
        if (pos == 0 && p.length == 1) {

            return null;

        } else {
            Productos tmp[] = new Productos[p.length - 1];
            int j = 0;
            for (int i = 0; i < p.length; i++) {
                if (pos != i) {
                    tmp[j++] = p[i]; //preguntar porque no se puede incrementar j despues.
                }
            }
            return tmp;
        }
    }

    public static Productos[] modifica(Productos[] p, int pos, Productos obj) {

        if (pos == 0 && p.length == 1) {

            return null;

        } else {
            Productos tmp[] = new Productos[p.length];

            for (int i = 0; i < p.length; i++) {

                if (pos == i) {
                    System.arraycopy(p, 0, tmp, 0, p.length);
                    tmp[i] = obj;
                } else {
                    tmp[i] = p[i];
                }
            }
            return tmp;
        }
    }
}



//intentar hacer el otro, se crea el objeto, pero en vez de mandar a insertar en el arreglo se manda a la posicion
