
class Que{
    int n;
    int[] arr;
    int top = -1;
    Que(int n){
        this.n = n;
        arr = new int[n];
    }

    void push(int val){
        top++;
        arr[top] = n;
    }

    void pop(){
        if(top != -1){
            arr[top] = 0;
            top--;
        }else{
            System.out.println("No elm to pop");
        }
        
    }

    void top(){
        if(top != -1){
            System.out.println(arr[top]);
        }else{
            System.out.println("Que empty");
        }
    }

    int size(){
        return top+1;
    }
}
    


public class StackUsingArr {

    
    public static void main(String[] args){
        Que Q = new Que(10);
        Q.push(10);
        System.out.println(Q.size());
        Q.top();
        Q.pop();
        Q.top();
    }
}
