public class BinaryTreeArray20 {
    Mahasiswa20[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray20() {
        this.dataMahasiswa = new Mahasiswa20[10];
    }

    void pupulateData (Mahasiswa20 dataMHS[], int idxLast) {
        this.dataMahasiswa = dataMHS;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
