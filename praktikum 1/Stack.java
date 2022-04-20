public class Stack {

    int size, top;
    Pakaian data[];

    public Stack(int size) {
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Pakaian pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack sudah penuh !");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar ");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " "
                + data[top].ukuran + " " + data[top].harga);
    }

    public void print() {
        System.out.println("Isi stack :");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " "
                    + data[i].harga);
        }
        System.out.println("");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void getMin() {
        double min = data[0].harga;
        int posisi = 0;
        for (int i = top; i >= 0; i--) {
            if (data[i].harga < min){
                min = data[i].harga;
                posisi = i;
            }
        }
        System.out.println("Data termurah adalah : "+data[posisi].jenis + " " + data[posisi].warna + " " + data[posisi].merk + " "+ data[posisi].ukuran + " " + data[posisi].harga);
    }
}
