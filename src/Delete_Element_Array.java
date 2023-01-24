public class Delete_Element_Array {
    public static void main(String[] args) {

        int[] a  ={2,3,4,5,4,23,11,22};
        int delelement=3;
        for (int i=0;i<a.length;i++){
            if (delelement == a[i]){
                for (int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                break;
            }
        }
        for (int i=0;i<a.length-1;i++) {
            System.out.print(a[i] + " ");
        }
    }
}
