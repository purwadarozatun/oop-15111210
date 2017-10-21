import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main{
	int selectedMenu = 0;
	boolean isOn = true;
	public static void main(String arg[]){
		Main main = new Main();
		List<Mahasiswa> list = new ArrayList<Mahasiswa>();

		while(main.isOn == true){
			main.menu();

			if(main.selectedMenu == 4) {
				main.isOn = false;
				main.selectedMenu = 0;
			}else if(main.selectedMenu == 1){
				
				list.add(Mahasiswa.registerMahasiswa());
				main.selectedMenu = 0;
			}else if(main.selectedMenu == 2){
				
				Main.print(list);
				main.selectedMenu = 0;
			}else if(main.selectedMenu == 3){
				main.selectedMenu = 0;
				
			}
		} 
			
	}

	public static void print(List listMhs){
		for (int i = 0; i < listMhs.size(); i++) {
			Mahasiswa mhs = (Mahasiswa) listMhs.get(i);
			System.out.println("Mahasiswa Dengan Nama : " + mhs.nama +  "  Jenis Kelamin :  " + mhs.jenisKelamin +  "  Tinggi Badan  : " + mhs.tinggiBadan + " Dan dia " + (mhs.menikah ? " Sudah " : " Belum ") + " Menikah" );
		}
	}

	public int menu (){
		if(this.selectedMenu !=  0){
			return this.selectedMenu;
		}
		System.out.println("==== Menu=======================");
		System.out.println("1. Tambah Mahasiswa ");
		System.out.println("2. Lihat Mahasiswa ");
		System.out.println("3. Tambah Mahasiswa ");
		System.out.println("4. Exit ");
		System.out.println("================================");
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Menu : ");
		this.selectedMenu = sc.nextInt();
		
		return this.selectedMenu;
		
	}
	
}

class Mahasiswa {
	public String nama;
	public String alamat;
	public String nickname;
	public String kelas;
	public char jenisKelamin;
	public int tinggiBadan;
	public boolean menikah;

	Mahasiswa(){}
	Mahasiswa(String nama, String alamat,  String nickname, String kelas, char jenisKelamin, int tinggiBadan, boolean menikah){
		this.nama = nama;
		this.alamat = alamat;
		this.nickname = nickname;
		this.kelas = kelas;
		this.jenisKelamin = jenisKelamin;
		this.tinggiBadan = tinggiBadan;
		this.menikah = menikah;
	}

	public static Mahasiswa registerMahasiswa(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Nama : ");
		String nama = sc.nextLine();
		System.out.print("Masukan Alamat : ");
		String alamat = sc.nextLine();
		System.out.print("Masukan Nickname : ");
		String nickname = sc.nextLine();
		System.out.print("Masukan Kelas : ");
		String kelas = sc.nextLine();
		System.out.print("Jenis Kelamin(L/P): ");
		char jenisKelamin = sc.next().charAt(0);
		System.out.print("Tinggi Badan(Contoh :200): ");
		int tinggiBadan = sc.nextInt();
		System.out.print("Sudah Menikah(true/false) ?  ");
		boolean menikah = sc.nextBoolean();
		Mahasiswa mhs = new Mahasiswa(nama, alamat, nickname, kelas, jenisKelamin, tinggiBadan, menikah);
		return mhs;
	}
	

}
