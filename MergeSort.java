class MergeSort {
    /*Merge Sort en java*/

    //Nombre: Nombre del alumno
    //Legajo: INFXXXXX
    //DNI: XXXXXXXX

    //Mescla 2 subarrays arr[]
    //El primer subarray es arr[1..m]
    //El segundo subarray es arr[m+1..r]

    void mesclar(int arr[], int l, int m, int r){
        //Obtiene el tamaño de los 2 subarrays a ser mesclados
        int n1 = m - l + 1;
        int n2 = r - m;

        /*Crea arrays temporales*/
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copia los datos a los arrays temporales*/
        for(int i = 0; i < n1;i++){
            L[i] = arr[l + i];
            for(int j = 0; j < n2;j++){
                R[j] = arr[m + 1 + j];
            }
        }

        /*Mescla los Arrays temporales*/

        //indices iniciales del primer y segundo subarray
        int i = 0, j = 0;

        //Indices iniciales de los subarrays mesclados
        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /*Copiar los elementos pendientes de L[] si hay*/
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        /*Copiar los elementos pendientes de R[] si hay*/
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    //Función principal que ordena arr[l..r] usando mezclar()
    void ordenar(int arr[], int l, int r){

        /*Implementar metodo ordenar*/
        if(l < r){
            int mid = (l + r)/2;
            ordenar(arr, l, mid);
            ordenar(arr, mid + 1, r);
            mesclar(arr, l, mid, r);
            
            

        }


    }

    /*Una función que sirve para mostrar un array de tamaño n*/
    static void MostrarArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
            System.out.println();
        }
    }
}
