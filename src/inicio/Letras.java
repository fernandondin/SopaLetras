/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author fernandondin
 */
public class Letras {

    private String[] elegidos;
    private String[] elegidos1;
    private Random random;
    private String[][] sopa;
    public static final int ANIMALES = 1;
    public static final int FRUTAS = 2;
    public static final int PAISES = 3;
    private final int HORIZONTAL = 0;
    private final int VERTICAL = 1;
    private final int ARRIBA = 2;
    private final int ABAJO = 3;
    private int tipo;
    private LinkedList<Coordenada>[] coords;
    private final String ABC = "abcdefghijklmnñopqrstuvwxyz";

    public Letras(int tipo) {
        this.tipo = tipo;
        elegidos1=new String[8];
        coords = new LinkedList[8];
        for (int i = 0; i < coords.length; i++) {
            coords[i] = new LinkedList<Coordenada>();
        }
        random = new Random();
        sopa = new String[8][8];
        elegidos = new String[8];
        llenaSopa(tipo);
        armaSopa();
    }
    public LinkedList<Coordenada>[] getCoordenadas(){
        return coords;
    }
    public String[][] getSopa(){
        return sopa;
    }
    public String[] getElegidos(){
        return elegidos1;
    }
    private void limpia(){
	boolean b =false;
	for(int i=0;i<sopa.length;i++){
	    for(int j=0;j<sopa[i].length;j++){
		Coordenada c = new Coordenada(i,j);
	        for(LinkedList<Coordenada> l:coords){
		    if(l.contains(c)){
			b=true;
			break;
		    }
		    else
			b=false;
		}
		if(!b){
		    sopa[i][j]=null;
		} 
	    }
	}
    }
    private void armaSopa() {
        int inicio = random.nextInt(8);
        int inicio1 = random.nextInt(8);
        int tam = 0;
        for (int i = 0; i < elegidos.length; i++) {
            int direccion = random.nextInt(4);
            switch (direccion) {
	    case HORIZONTAL:
		tam = 8 - elegidos[i].length();
		inicio = random.nextInt(8);
		if (tam != 0) 
		    inicio1 = random.nextInt(tam);
		 else 
		    inicio1 = 0;
		String letra = sopa[inicio][inicio1];
		for (int j = 0; j < elegidos[i].length(); j++) {
		    if (letra == null|| letra.equals(Character.toString(elegidos[i].charAt(j)))) {
			sopa[inicio][inicio1] = "" + Character.toString(elegidos[i].charAt(j));
			coords[i].add(new Coordenada(inicio, inicio1));
		    } else {	
			j = elegidos[i].length();
			while (!coords[i].isEmpty()) {
			    coords[i].removeFirst();
			}
			i--;
		    }
		    inicio1++;
		    if(inicio1<8)
		    letra = sopa[inicio][inicio1];
		    limpia();
		}
		break;
	    case VERTICAL:
		inicio1 = random.nextInt(8);
		tam = 8 - elegidos[i].length();
		if (tam != 0) {
		    inicio = random.nextInt(tam);
		} else {
		    inicio = 0;
		}
		String letra1 = sopa[inicio][inicio1];
		for (int j = 0; j < elegidos[i].length(); j++) {
		    if (letra1 == null|| letra1.equals(Character.toString(elegidos[i].charAt(j)))) {
			sopa[inicio][inicio1] = "" + Character.toString(elegidos[i].charAt(j));
			coords[i].add(new Coordenada(inicio, inicio1));
		    } else {	
			j = elegidos[i].length();
			while (!coords[i].isEmpty()) {
			    coords[i].removeFirst();
			}
			i--;
		    }
		    inicio++;
		    if(inicio<8)
		    letra1 = sopa[inicio][inicio1];
		    limpia();
		}
		break;
	    case ARRIBA:
		tam = 8 - elegidos[i].length();
		if (tam != 0) {
		    inicio = 7 - random.nextInt(tam);
		    inicio1 = random.nextInt(tam);
		} else {
		    inicio = 7;
		    inicio1 = 0;
		}
		String letra2 = sopa[inicio][inicio1];
		for (int j = 0; j < elegidos[i].length(); j++) {
		    if (letra2 == null|| letra2.equals(Character.toString(elegidos[i].charAt(j)))) {
			sopa[inicio][inicio1] = "" + Character.toString(elegidos[i].charAt(j));
			coords[i].add(new Coordenada(inicio, inicio1));
		    } else {	
			j = elegidos[i].length();
			while (!coords[i].isEmpty()) {
			    coords[i].removeFirst();
			}
			i--;
		    }
		    inicio--;
		    inicio1++;
		    if(inicio>0 && inicio1<8)
			letra2 = sopa[inicio][inicio1];
		    limpia();
		}

		break;
	    case ABAJO:
		tam = 8 - elegidos[i].length();
		if (tam != 0) {
		    inicio1 = random.nextInt(tam);
		    inicio = random.nextInt(tam);
		} else {
		    inicio = 0;
		    inicio1 = 0;
		}
		String letra3 = sopa[inicio][inicio1];
		for (int j = 0; j < elegidos[i].length(); j++) {
		    if (letra3 == null|| letra3.equals(Character.toString(elegidos[i].charAt(j)))) {
			sopa[inicio][inicio1] = "" + Character.toString(elegidos[i].charAt(j));
			coords[i].add(new Coordenada(inicio, inicio1));
		    } else {	
			j = elegidos[i].length();
			while (!coords[i].isEmpty()) {
			    coords[i].removeFirst();
			}
			i--;
		    }
		    inicio++;
		    inicio1++;
		    if(inicio<8 && inicio1<8)
			letra3 = sopa[inicio][inicio1];
		    limpia();
		}
		break;
            }
        }
    } 
    private void llenaRandom() {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                sopa[i][j] = ("" + ABC.charAt(random.nextInt(27)));
            }
        }
    }

    private void llenaAnimales() {
        String[] elementos = {"leon", "atun", "zebra", "toro",
			      "gato", "loro", "pollo", "oso", "buey", "rana", "vaca",
			      "asno", "reno", "pez", "raton", "boa", "topo", "panda",
			      "ñandu", "foca"};
        elegidos(elementos);
    }

    private void llenaFrutas() {
        String[] elementos = {"melon", "sandia", "jobo", "tuna",
			      "nuez", "fresa", "uva", "piña", "mango", "kiwi", "mani",
			      "lima", "anon", "cidra", "pera", "higo", "noni", "coco",
			      "limon", "mora"};
        elegidos(elementos);
    }

    private void llenaPaises() {
        String[] elementos = {"laos", "mexico", "iran", "siria",
			      "japon", "china", "canada", "kenia", "rusia", "chile", "libia",
			      "india", "corea", "cuba", "mali", "congo", "fiyi", "malta",
			      "grecia", "irak"};
        elegidos(elementos);
    }

    private void elegidos(String[] elementos) {
        LinkedList<Integer> repetidos = new LinkedList<>();
        for (int i = 0; i < 8; i++) {
            int c = random.nextInt(elementos.length);
            if (repetidos.contains(c)) {
                i--;
                continue;
            }
            repetidos.add(c);
            if (random.nextInt(2) == 0) {
                elegidos1[i]=elementos[c];
                elegidos[i] = new StringBuilder(elementos[c]).reverse().toString();
            } else {
                elegidos1[i]=elementos[c];
                elegidos[i] = elementos[c];
            }
        }
    }

    private void llenaSopa(int tipo) {
        switch (tipo) {
	case 1:
	    llenaAnimales();
	    break;
	case 2:
	    llenaFrutas();
	    break;
	case 3:
	    llenaPaises();
	    break;
        }
    }
    public static void main(String[] args) {
        Letras l = new Letras(Letras.FRUTAS);
    }
}