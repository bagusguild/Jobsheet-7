public class StrukService {

    int size, top;
    Struk data[];

    public StrukService(int size) {
        this.size = size;
        data = new Struk[size];
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

    public void push(Struk str) {
        if (!isFull()) {
            top++;
            data[top] = str;
        } else {
            System.out.println("Isi stack sudah penuh !");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Struk x = data[top];
            top--;
            System.out.println("Data sudah diambil");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas : " + data[top].noTransaksi + " " + data[top].tglBulan + " " + data[top].jumBarang + " "
                + data[top].totalBayar);
    }

    public void print() {
        System.out.println("Isi stack :");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].noTransaksi + " " + data[i].tglBulan + " " + data[i].jumBarang + " " + data[i].totalBayar);
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
}