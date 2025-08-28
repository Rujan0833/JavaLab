import java.io.*; import java.util.*;

class q14 {
    public static void main(String[] a) throws Exception {
        // a) FileInputStream
        FileInputStream fin = new FileInputStream("in.txt");
        System.out.println("Read: " + fin.read()); fin.close();

        // b) FileOutputStream
        FileOutputStream fout = new FileOutputStream("out.txt");
        fout.write(65); fout.close();

        // c) Copy image
        FileInputStream img = new FileInputStream("a.jpg");
        FileOutputStream imgOut = new FileOutputStream("b.jpg");
        img.transferTo(imgOut); img.close(); imgOut.close();

        // d) DataInput/OutputStream
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("d.txt"));
        dos.writeInt(99); dos.close();
        DataInputStream dis = new DataInputStream(new FileInputStream("d.txt"));
        System.out.println("DIS: " + dis.readInt()); dis.close();

        // e) RandomAccessFile
        RandomAccessFile raf = new RandomAccessFile("out.txt","rw");
        raf.seek(0); System.out.println("RAF: " + (char)raf.read()); raf.close();

        // f) FileReader
        FileReader fr = new FileReader("in.txt");
        System.out.println("FR: " + (char)fr.read()); fr.close();

        // g) FileWriter
        FileWriter fw = new FileWriter("fw.txt"); fw.write("Hello"); fw.close();

        // h) Keyboard → File
        Scanner sc = new Scanner(System.in);
        FileWriter f = new FileWriter("kb.txt");
        f.write(sc.nextLine()); f.close();

        // i) Serialization
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("s.dat"));
        oos.writeObject(new Student(1,"Rujan")); oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("s.dat"));
        Student s = (Student)ois.readObject(); ois.close();
        System.out.println("Deserialized: " + s.id + " " + s.name);

        System.out.println("\nLab No.: 14\nName: Rujan Rajlawat\nRoll No./Section: 22081013");
    }
}

class Student implements Serializable {
    int id; String name;
    Student(int i,String n){id=i;name=n;}
}
