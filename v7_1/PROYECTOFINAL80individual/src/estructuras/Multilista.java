/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import javax.swing.JOptionPane;
import mensajeWhats.Datos;

/**
 *
 * @author David Vergara
 */
public class Multilista
{

    private static Nodo mov = null;

    public static Nodo inserta(Nodo r, Nodo n, int nivel, String etqs[])
    {
        if (nivel == etqs.length - 1)
        {
            if (r == null)
            {
                System.out.println("raiz null");
            }
            System.out.println("nodo nuevo: " + n.getEtq());
            LSL ls = new LSL();
            ls.setR(r);//aqui se pasa mi r al isnerta
            ls.inserta(n);
            r = ls.getR();
            return r;
        } else
        {
            Nodo aux = busca(r, etqs[nivel]);
            if (aux != null)
            {
                aux.setAbj(inserta(aux.getAbj(), n, nivel + 1, etqs));
            } else
            {
                System.out.println("No encontre el dato " + etqs[nivel] + " en el nivel " + nivel);
            }
            return r;
        }
    }

    public static Nodo insertaMensaje(Nodo r, int nivel, String etqs[], Datos alma)
    {
        if (nivel == etqs.length - 1)
        {
            System.out.println("nodo: " + r.getEtq());
            r.setObj(alma);
            return r;
        } else
        {
            Nodo aux = busca(r, etqs[nivel]);
            if (aux != null)
            {
                aux.setAbj(insertaMensaje(aux.getAbj(), nivel + 1, etqs, alma));
            } else
            {
                System.out.println("No encontre el dato " + etqs[nivel] + " en el nivel " + nivel);
            }
            return r;
        }
    }

    public static Nodo busca(Nodo r, String e)
    {
        Nodo aux = null;
        while (r != null)
        {
            if (r.getEtq().equals(e))
            {
                aux = r;
                break;
            } else
            {
                r = r.getSig();
            }
        }
        return aux;
    }

    public static String prb(Nodo r)
    {
        String nom = "";
        Nodo aux = r;
        int nivel = 0;
        while (r != null)
        {
            nom += r.getEtq() + "\n";
            if (aux != null)
            {
                nom = abajo(nom, aux, nivel);
            }
            r = r.getSig();
            aux = r;
        }
        return nom;
    }

    public static String abajo(String nom, Nodo aux, int nivel)
    {
        while (aux != null)
        {
            aux = aux.getAbj();
            while (aux != null)
            {
                for (int i = 0; i <= nivel; i++)
                {
                    nom += "\t";
                }
                nom += "→ " + aux.getEtq() + "\n";

                if (aux.getAbj() != null)
                {
                    nom = abajo(nom, aux, nivel + 1);
                }
                aux = aux.getSig();
            }
        }
        return nom;

    }

    public static Nodo[] elimina(Nodo r, int nivel, String etqs[], String comparar)
    {
        Nodo[] ret = new Nodo[2];
        if (nivel == etqs.length - 1)
        {
            LSL ls = new LSL();
            ls.setR(r);//aqui se pasa mi r a la lsl
            ret[1] = ls.eliminar(etqs[nivel]);
            r = ls.getR();
            ret[0] = r;
            return ret;
        } else
        {
            Nodo aux = busca(r, etqs[nivel]);
            if (aux != null)
            {
                ret = elimina(aux.getAbj(), nivel + 1, etqs, comparar);
                aux.setAbj(ret[0]);
                ret[0] = r;
            } else
            {
                System.out.println("No encontre el dato " + etqs[nivel] + " en el nivel " + nivel);
            }
            return ret;
        }
    }

    /*public static Nodo elimina(Nodo r, int nivel, String etqs[])
    {
        if (nivel == etqs.length - 1)
        {
            LSL ls = new LSL();
            ls.setR(r);
            Nodo aux = ls.eliminar(etqs[nivel]);
            mov = aux;
            if (aux == null)
            {
                JOptionPane.showMessageDialog(null, "No se encontro el dato", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else
            {
                r = ls.getR();
            }
            return r;
        } else
        {
            Nodo aux = busca(r, etqs[nivel]);
            if (aux != null)
            {
                aux.setAbj(elimina(aux.getAbj(), nivel + 1, etqs));
            } else
            {
                System.out.println("No se encontro " + etqs[nivel] + " En el nivel " + nivel);
            }
            return r;
        }
    }*/
}
