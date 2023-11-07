package pemdasFiles;
public class StackInt {
    private int[] stack;
    private int top;
    private boolean isNum;

    public StackInt(){
        stack = new int[20];
        top = 0;
        isNum = false;
    }

    
    public void setHasNum(boolean x){
        isNum = x;
    }

    public boolean HasNum(){
        return isNum;
    }

    public void push(int x){
        top++;
        stack[top] = x;
    }

    public int pop(){
        if(top == 0){
            return 0;
        }
        return stack[top--];
    }
    
    public int peek(){
        return stack[top];
    }

    public void show(){
        if(top == 0) return;

        for(int i = 1; i <= top; i++){
            System.out.print(stack[i] + " ");
        }
    }
}
