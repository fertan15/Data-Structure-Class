import java.util.ArrayList;

class Stack{
	
    private ArrayList<Integer> list;
    private int top=-1;
    

    public Stack(){
        list = new ArrayList<Integer>();   //initialize
    }


    public void push(int value){
        list.add(value);    //nambah ke arraylist
        top++;
    }

    public void pop(){
        if(!list.isEmpty()){
            list.remove(top);   // kalo ada hapus
            top--;
        }
    }

    public int top(){
        if(list.isEmpty()){
            return -1; //kalo kosong return -1
        }
        return list.get(top); //kalo ada return top
    }

    //buat debug only
    public void printStack(){
        for(int i=top; i>=0; i--){
            System.out.println(list.get(i)); //print dari top ke bawah
        }
    }

}