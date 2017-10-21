class Mahasiswa{
public static void main (String arg[]){
  System.out.println("INI Dari Parent");
  Mahasiswa mhs = new Mahasiswa();
  mhs.printNama();
  System.out.println(mhs.calculateUmur());
}

public void printNama (){
  System.out.println("Purwa Darozatun");
} 

public int calculateUmur() {
  int tahunLahir = 1996;
  int tahunSkarang = 2017;
  return  tahunSkarang - tahunLahir;
}
}