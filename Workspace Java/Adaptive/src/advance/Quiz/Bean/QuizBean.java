package advance.Quiz.Bean;

import java.util.Scanner;
import advance.Quiz.Model.quiz;
import java.util.List;
import java.util.ArrayList;

public class QuizBean {
	private Scanner scanner = new Scanner(System.in);
	private quiz quiz = null;
	private String [] pertanyaanArray = new String[10];
	private String [] [] pilihanJawabanArray = new String [10][10];
	private String [] kunciJawabanArray = new String [10];
	
	private List<quiz>quizList = new ArrayList<quiz>();
	private List<String>jawabanList = new ArrayList<String>();
	private String jawaban = null;
	private int noPertanyaan = 1;
	int jumlahArray = pertanyaanArray.length;
	private int y = 0;
	boolean aja = true;
	
	public static void main(String[] args) {

	QuizBean quizBean = new QuizBean();
	quizBean.run();
	}
	
	public void run() {
		setQuiz();
		startQuiz();
		resultQuiz();
	}
	
	public void setQuiz() {
		
	pertanyaanArray[0] = "Apakah kepanjangan dari CPU ?";
	pilihanJawabanArray [0] [0] = "A.Central Protokol Unit";
	pilihanJawabanArray [0] [1] = "B.Central Processing Unit";
	pilihanJawabanArray [0] [2] = "C.Central Premium Unit";
	pilihanJawabanArray [0] [3] = "D.Central Pertamax Unit";
	kunciJawabanArray [0] = "B.Central Processing Unit";
	
	pertanyaanArray[1] = "Apakah kepanjangan dari CPU ?";
	pilihanJawabanArray [1] [0] = "A.Central Protokol Unit";
	pilihanJawabanArray [1] [1] = "B.Central Processing Unit";
	pilihanJawabanArray [1] [2] = "C.Central Premium Unit";
	pilihanJawabanArray [1] [3] = "D.Central Pertamax Unit";
	kunciJawabanArray [1] = "B.Central Processing Unit";
	
	pertanyaanArray[2] = "Apakah kepanjangan dari MRT ?";
	pilihanJawabanArray [2] [0] = "A.Moda Raya Terpadu";
	pilihanJawabanArray [2] [1] = "B.Modal Right Transit";
	pilihanJawabanArray [2] [2] = "C.Maskapai Raya Terpadu";
	pilihanJawabanArray [2] [3] = "D.Mass Rapid Transit";
	kunciJawabanArray [2] = "A.Moda Raya Terpadu";
	
	pertanyaanArray[3] = "Apakah kepanjangan dari CPU ?";
	pilihanJawabanArray [3] [0] = "A.Central Protokol Unit";
	pilihanJawabanArray [3] [1] = "B.Central Processing Unit";
	pilihanJawabanArray [3] [2] = "C.Central Premium Unit";
	pilihanJawabanArray [3] [3] = "D.Central Pertamax Unit";
	kunciJawabanArray [3] = "B.Central Processing Unit";
	
	pertanyaanArray[4] = "Siapakah pendiri NU ?";
	pilihanJawabanArray [4] [0] = "A.KH Hasyim Antasari";
	pilihanJawabanArray [4] [1] = "B.KH Wahid Hasyim";
	pilihanJawabanArray [4] [2] = "C.KH Hasyim Asyari";
	pilihanJawabanArray [4] [3] = "D.KH Ahmad Hasyim";
	kunciJawabanArray [4] = "C.KH Hasyim Asyari";
	
	pertanyaanArray[5] = "Siapakah Pendiri Muhammadiyah ?";
	pilihanJawabanArray [5] [0] = "A.KH Dahlan Sofyan";
	pilihanJawabanArray [5] [1] = "B.KH Ahmad Zainuddin";
	pilihanJawabanArray [5] [2] = "C.KH Dewantoro";
	pilihanJawabanArray [5] [3] = "D.KH Ahmad Dahlan";
	kunciJawabanArray [5] = "B.Central Processing Unit";
	
	pertanyaanArray[6] = "Apakah kepanjangan dari CPU ?";
	pilihanJawabanArray [6] [0] = "A.Central Protokol Unit";
	pilihanJawabanArray [6] [1] = "B.Central Processing Unit";
	pilihanJawabanArray [6] [2] = "C.Central Premium Unit";
	pilihanJawabanArray [6] [3] = "D.Central Pertamax Unit";
	kunciJawabanArray [6] = "B.Central Processing Unit";
	
	pertanyaanArray[7] = "Apakah kepanjangan dari CPU ?";
	pilihanJawabanArray [7] [0] = "A.Central Protokol Unit";
	pilihanJawabanArray [7] [1] = "B.Central Processing Unit";
	pilihanJawabanArray [7] [2] = "C.Central Premium Unit";
	pilihanJawabanArray [1] [3] = "D.Central Pertamax Unit";
	kunciJawabanArray [7] = "B.Central Processing Unit";
	
	pertanyaanArray[8] = "Apakah kepanjangan dari CPU ?";
	pilihanJawabanArray [8] [0] = "A.Central Protokol Unit";
	pilihanJawabanArray [8] [1] = "B.Central Processing Unit";
	pilihanJawabanArray [8] [2] = "C.Central Premium Unit";
	pilihanJawabanArray [8] [3] = "D.Central Pertamax Unit";
	kunciJawabanArray [8] = "B.Central Processing Unit";
	
	pertanyaanArray[9] = "Apakah kepanjangan dari CPU ?";
	pilihanJawabanArray [9] [0] = "A.Central Protokol Unit";
	pilihanJawabanArray [9] [1] = "B.Central Processing Unit";
	pilihanJawabanArray [9] [2] = "C.Central Premium Unit";
	pilihanJawabanArray [9] [3] = "D.Central Pertamax Unit";
	kunciJawabanArray [9] = "B.Central Processing Unit";

	
	
	
	for(int i =0;i<pertanyaanArray.length;i++) {
		quiz = new quiz();
		quiz.setPertanyaan(pertanyaanArray[i]);
		quiz.setPilihanA(pilihanJawabanArray[i] [y]);
		quiz.setPilihanB(pilihanJawabanArray[i] [y+1]);
		quiz.setPilihanC(pilihanJawabanArray[i] [y+2]);
		quiz.setPilihanD(pilihanJawabanArray[i] [y+3]);
		quiz.setKunciJawaban(kunciJawabanArray[i]);
		quizList.add(quiz);
	}
	}
		
	public void startQuiz() {
		for(quiz q : quizList) {
			System.out.println("");
			System.out.println(noPertanyaan++ + "." +q.getPertanyaan());
			System.out.println("");
			System.out.printf("%-30s",q.getPilihanA());
			System.out.println(q.getPilihanB());
			System.out.printf("%-30s",q.getPilihanC());
			System.out.println(q.getPilihanD());
			System.out.println("");
			System.out.print("Jawaban : ");
			jawaban = scanner.nextLine();
			while(aja) {
			if(jawaban.trim().isEmpty()) {
				System.out.println("jawaban tidak boleh kosong");
			}
			else if (jawaban.matches("[a-dA-D*]+$")){
					jawabanList.add(jawaban);
					break;
			}
			else{
				System.out.println("Mohon Diisi Dengan A, B, C dan D saja");
			
		
			}
		}
	}
	}
		
	public void resultQuiz() {
	
		int benar = 0;
		int salah = 0;
		for(int x=0; x<jawabanList.size();x++) {
			if(jawabanList.get(x).equalsIgnoreCase(quizList.get(x).getKunciJawaban())) {
				benar += 1;
			}else {
				salah += 1;
			}
		}
		System.out.println("===============");
		System.out.println("Hasil");
		System.out.println("===============");
		System.out.println("benar = " + benar);
		System.out.println("salah = " + salah);
		System.out.println("Nilai = " + getGrade(benar));
		
		
	}
		public String getGrade(int benar) {
			String keterangan = null;
				if (benar <= 2) {
				keterangan = "Grade Anda : E ";
				
				
				} else if (benar <=4) {
				keterangan="Grade Anda : D ";
						
				} else if (benar <=6) {
				keterangan="Grade Anda : C ";
						
				} else if (benar <=8) {
				keterangan="Grade Anda : B ";
						
				} else {
				keterangan="Grade Anda : A ";
						
					
				}
					return keterangan;
		}
}		
			