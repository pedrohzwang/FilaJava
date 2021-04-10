package estruturas;

public class FilaEncadeamento<T> {
    private NoLista<T> ini;
    private NoLista<T> fim;
    private int counter;
    
    public FilaEncadeamento(){
        this.ini = null;
        this.fim = null;
        this.counter = 0;
    }
    
    public void inserir(T obj){
        NoLista<T> novoObj = null;
        novoObj.setInfo(obj);
        if(ini == null || counter == 0){
            ini = novoObj;
            ini.setNext(fim);
            fim = novoObj;
        } else {
            
        }
    }
}
