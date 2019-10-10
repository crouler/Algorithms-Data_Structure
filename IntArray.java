public class IntArray {
    int [] arr;
    int size;

    public IntArray(int size) {
        this.arr = new int [size];
        this.size = 0;
    }
    /*
    Инициализация IntArray массивом
    */
    public IntArray(int [] mass){
        int len = mass.length;
        this.arr = new int [len+5];     // при добавлении элемента не выйдем из массива
        this.size = len;
        for (int i = 0; i < len; i++) {
            this.arr[i] = mass[i];
        }
    }




    public void intArrayElementAdd(int elem){
        arr[size] = elem;
        size++;
    }

    public void intArraySortElemAdd(int elem){
        int i;
        for (i = 0; i < size; i++) {
            if(elem < arr[i]) break;
        }
        for (int j = size; j > i; j--) {
            this.arr[j] = this.arr[j-1];
        }
        this.arr[i] = elem;
        this.size++;
    }

    public void intArrayPrint(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void intArraySetElem(int pos, int elem){
        this.arr[pos-1] = elem;
    }

    /*
    * Линейный поиск
    *
    * */
    public boolean intArrayFindElem(int elem){
        for (int i = 0; i < this.size; i++) {
            if(arr[i] == elem)
                return true;
        }
        return false;
    }

    public void intArrayRemoveElem(int elem){
        int j;
        boolean isAbsent = false;
        for (j = 0; j < size; j++) {
            if (arr[j] == elem){
                break;}
            if (arr[j] != elem && j == size-1) {
                System.out.println("Элемент в массиве не найден");
                isAbsent = true;
            }

        }
        if (!isAbsent){
            for (int i = j; i < size-1; i++) {
                arr[i] = arr[i+1];
            }
            size--;

        }
    }

    public boolean intArrayBinaryFindElem(int elem){
        int low = 0;
        int high = this.size - 1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(elem > arr[mid]){
                low = mid+1;
            }
            else if(elem < arr[mid]){
                high = mid-1;
            }
            else return true;
        }
        return false;
    }

    public void intArrayBubbleSort(){
        int in, out;
        for(out = this.size-1; out >= 1; out--){
            for(in = 0; in < out; in++){
                if (this.arr[in] > this.arr[in+1]){
                    change(in, in+1);
                }
            }
        }
    }

    public void intArraySelectSort(){
        int marker, out, in;
        for (out = 0; out < this.size; out++) {
            marker = out;
            for (in = out+1; in < this.size; in++) {
                if(this.arr[in]<this.arr[marker]){
                    marker = in;
                }
            }
            change(out, marker);
        }
    }

    public void intArrayInsertSort(){
        int in, out;
        for(out = 1; out < this.size; out++){
            int tmp = this.arr[out];
            in = out;
            while(in > 0 && this.arr[in-1] >= tmp){
                this.arr[in] = this.arr[in -1];
                --in;
            }
            this.arr[in] = tmp;
        }
    }

    private void change(int a,int b){
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }
}
