package Stack;
import java.util.Stack;

public class NextGreatorElement {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int ans[] = new int[arr.length];
        greator(arr,ans);
        for(int i = 0; i < ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
    static void  greator(int arr[],int ans[]){
        Stack <Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0;i--){
            while(!s.isEmpty() && arr[i] >= arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = arr[s.peek()];
            }
                s.push(i);
        }
    }
}
