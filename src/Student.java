public class Student {
    String FullName;
    String University;
    String Faculty;
    int kurs;
    int ReceiptDate;
    int ORT;

    Student(String FullName, String University, String Faculty, int kurs, int ReceiptDate, int ORT){
    this.FullName=FullName;
    this.University=University;
    this.Faculty=Faculty;
    this.kurs=kurs;
    this.ReceiptDate=ReceiptDate;
    this.ORT=ORT;
    }
    String getInfo (){
        return "FullName: "+FullName+";\nUniversity: "+University+";\nFaculty: "+
            Faculty+";\nKurs: "+kurs+";\nReceiptDate: "+ReceiptDate+";\nORT: "+ORT;
    }
}
