package homework;

public class Main {

	public static void main(String[] args) {
		kodStudent ogr_1 = new kodStudent();
		ogr_1.adi = "orkun";
		ogr_1.soyadi = "tiryaki";
		ogr_1.email = "abcd";
		ogr_1.universite = "f�rat";
		ogr_1.bolum = "adli bili�im";
		ogr_1.duzey= "lisans 2. s�n�f";
		ogr_1.yas = 20;
		ogr_1.sifre = 123456789;
	
		kodInstructor ogrtmn1 = new kodInstructor();
		ogrtmn1.adi = "engin";
		ogrtmn1.soyadi = "demiro�";
		ogrtmn1.email = "demirog123";
		ogrtmn1.egitmen_kodu = "ab123";
		ogrtmn1.uzmanl�k = "yaz�l�m t�m diller";
		ogrtmn1.yas = 50;
		ogrtmn1.sifre = 123456;
		
		studentManager studentmanager = new studentManager();
		studentmanager.add(ogr_1);
		
		
		instructorManager instructormanager= new instructorManager();
		instructormanager.add(ogrtmn1);
		

	}

}
