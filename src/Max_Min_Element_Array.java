public class Max_Min_Element_Array {
    public static void main(String[] args) {
    int arr [] = {20,32,11,22,33,43,55};
    int Max = arr[0];
    int Min = arr[0];

    for (int i=0;i<arr.length;i++){
        if (arr[i]>Max){
            Max =arr[i];
        }else if (arr[i]<Min){
            Min = arr[i];
        }
    }
        System.out.println("MAximun number"+Max);
        System.out.println("Minimun number"+Min);
    }
}
