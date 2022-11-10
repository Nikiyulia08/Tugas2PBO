public class jamsibuknya {
  
    public static void main (String [] args) {
     asdos a = new asdos ("Faizurikum", 24,1);               
     dosen b = new dosen ("Raja OP Damanik", 5); 
     elemen c = new asdos ("Angel-chan", 21,1);
     mahasiswa d = new mahasiswa ("Firman",20);
     elemen e = new mahasiswa ("Nid to Pass this sem", 23);
     elemen f = new dosen ("Nivotko",3);
    
    int total = a.getJamSibuk()+b.getJamSibuk()+c.getjamSibuk()+d.getJamSibuk+e.getjamSibuk()+f.getjamSibuk();
   
        System.out.println ("Total Jam Sibuk Elemen Fasilkom adalah" +total);
        a.mailCheck();
        b.mailCheck();
        c.mailCheck();
        d.mailCheck();
        e.mailCheck();
        f.mailCheck();
}
}
