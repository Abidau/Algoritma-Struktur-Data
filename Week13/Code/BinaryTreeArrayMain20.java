public class BinaryTreeArrayMain20 {
    public static void main(String[] args) {
        BinaryTreeArray20 bta = new BinaryTreeArray20();

        Mahasiswa20 mhs1 = new Mahasiswa20("1001", "Ali", "A", 3.57);
        Mahasiswa20 mhs2 = new Mahasiswa20("1002", "Candra", "C", 3.41);
        Mahasiswa20 mhs3 = new Mahasiswa20("1003", "Badar", "B", 3.75);
        Mahasiswa20 mhs4 = new Mahasiswa20("1004", "Dewi", "B", 3.35);

        Mahasiswa20 mhs5 = new Mahasiswa20("1005", "Devi", "A", 3.48);
        Mahasiswa20 mhs6 = new Mahasiswa20("1006", "Ehsan", "D", 3.61);
        Mahasiswa20 mhs7 = new Mahasiswa20("1007", "Fizi", "B", 3.86);
        
        Mahasiswa20[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7}; 
        int idxLast = 6; 

        bta.pupulateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder traversal: ");
        bta.traverseInOrder(0);
    }
}