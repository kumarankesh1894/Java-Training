package Encapsulation;

public class ExamResult {
	
	private int result;
	private int hindi,english,maths,science;
	ExamResult(int hindi,int english,int maths,int science){
		
		this.hindi = hindi<0 ? 0:hindi;
		this.english = english<0 ? 0:english;
		this.maths = maths<0 ? 0:maths;
		this.science = science<0 ? 0:science;
		}
	
	public void getResult() {
		result = ((maths+science+english+hindi)*100)/400;
		if(result<40) {
			System.out.println("Result: Fail, Marks: "+result+"%");
		}else {
			System.out.println("Result: Pass, Marks: "+result+"%");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamResult studentResult = new ExamResult(50, 69, 85, 90);
		studentResult.getResult();
	}

}
