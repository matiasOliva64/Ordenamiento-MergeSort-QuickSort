class QuickSort {
    /*Quick Sort en Java*/

    //Nombre: Nombre del alumno
    //Legajo: INFXXXXX
    //DNI: XXXXXXXX


    /*Esta función toma el ultimo elemento como pivote,
    coloca el elemento pivote en su posición correcta en la matriz ordenada
    y coloca todos los elementos más pequeños(más pequeños que el pivite)
    a la izquierda del pivote y todos los elementos mayores a la derecha de
    pivote*/

    int particion(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low -1); //indice del elemento mas chico
        for(int j = low; j < high; j++){
            //si el elemento actual es mas chico o igual que el pivot
            if(arr[j] <= pivot){
                i++;

                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Intercambia arr[i + 1] y arr[high] (o pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }


    /*Metodo principal que implementa quicksort
    arr[] --> Array a ser ordenado
    low   --> Comienzo de indice
    high  --> Fin de indice*/
    void ordenar(int arr[], int low, int high){

        /*Implementar metodo ordenar*/
        if(low < high){
            int p = particion(arr, low, high);
            ordenar(arr, low, p - 1);
            ordenar(arr, p + 1, high);
        }
    }

    
}
