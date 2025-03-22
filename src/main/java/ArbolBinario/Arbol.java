package ArbolBinario;

public class Arbol {
    private Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(Nodo padre, int dato) {
        if (dato < padre.valorNodo()) {
            if (padre.getSubarbolIzdo() == null) {
                padre.setRamaIzdo(new Nodo(dato));
            } else {
                insertar(padre.getSubarbolIzdo(), dato);
            }
        } else if (dato > padre.valorNodo()) {
            if (padre.getSubarbolDcho() == null) {
                padre.setRamaDcho(new Nodo(dato));
            } else {
                insertar(padre.getSubarbolDcho(), dato);
            }

        }

    }

    //METODO PARA RECORRIDO EN POSTORDEN
    public void postorden() {
        postorden(this.raiz);
    }

    private void postorden(Nodo nodo) {
        if (nodo!= null){
            postorden(nodo.getSubarbolIzdo());
            postorden(nodo.getSubarbolDcho());
            System.out.print(nodo.valorNodo()+ " ");
        }
    }

    //METODO PARA RECORRIDO EN PREORDEN

    public void preorden() {
        preorden(this.raiz);
    }

    private void preorden(Nodo nodo) {
        if (nodo!= null){
            System.out.print(nodo.valorNodo()+ " ");
            preorden(nodo.getSubarbolIzdo());
            preorden(nodo.getSubarbolDcho());

        }
    }

    //METODO PARA RECORRIDO EN INORDEN
    public void inorden() {
        inorden(this.raiz);
    }

    private void inorden(Nodo nodo) {
        if (nodo!= null){
            inorden(nodo.getSubarbolIzdo());
            System.out.print(nodo.valorNodo()+ " ");
            inorden(nodo.getSubarbolDcho());

        }
    }


}
