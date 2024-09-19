package stack;

public class stack {
    int top;
    int size=10;
    int a[] = new int[size];
    stack(){
        top=-1;
    }
    boolean push(int x){
        if(top==size-1){
            System.out.print("Stack is full");
            return false;
        }
        a[++top]=x;
        return true;
    }
    boolean pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return false;
        }
        System.out.println("Popped Element is:"+a[top]);
        top--;
        return true;
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.println(a[i]);
        }
    }
}
class stackprog{
    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        s.display();

    }
}