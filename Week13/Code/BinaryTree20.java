public class BinaryTree20 {
    Node20 root;

    public BinaryTree20() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa20 mahasiswa) {
        Node20 newNode = new Node20(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node20 current = root;
            Node20 parent = null;
            while (true) {
                parent = root;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node20 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node20 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node20 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node20 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node20 getSuccessor(Node20 del) {
        Node20 successor = del.right;
        Node20 successorParent = del;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node20 parent = root;
        Node20 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            parent = current;
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node20 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(Mahasiswa20 data) {
        root = addRekursif(root, data);
    }

    private Node20 addRekursif(Node20 current, Mahasiswa20 data) {
        if (current == null) {
            return new Node20(data);
        }

        if (data.ipk < current.mahasiswa.ipk) {
            current.left = addRekursif(current.left, data);
        } else {
            current.right = addRekursif(current.right, data);
        }
        return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
            return;
        }

        Node20 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Data mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }
    
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong.");
            return;
        }

        Node20 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Data mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
    System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
    tampilIPKDiAtasRekursif(root, ipkBatas);
}

    private void tampilIPKDiAtasRekursif(Node20 node, double ipkBatas) {
        if (node != null) {
            tampilIPKDiAtasRekursif(node.left, ipkBatas);
                if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
        tampilIPKDiAtasRekursif(node.right, ipkBatas);
        }
    }
}