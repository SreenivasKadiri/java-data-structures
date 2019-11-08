public class ArrayReverse{
    public static void main(String[] args) {
        
        int[] arr = {10,20,30,40,50,60};
        //call the method
        reverse(arr, arr.length);

    }

    public static void reverse(int a[], int num){
        int [] b = new int[num];
        int j = num;
        for (int i=0; i < num; i++){
            System.out.println("The Current Array: "+a[i]);
            b[j - 1] = a[i]; 
            j = j - 1; 
        }

        System.out.println("print the reversed array");
        for(int k=0; k<num; k++){
            System.out.println("The reversed Array is: "+b[k]);
        }


    }
}