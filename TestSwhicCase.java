public class TestSwhicCase {
	public static void main(String[] args) {
		char grade = 'D';
		
		switch(grade)
		{
		case 'A':
			System.out.println("优秀");
			break;
		case 'B' :
		case 'C' :
			System.out.println("良好");
			break;
		case 'D' :
			System.out.println("及格");
			break;
		default:
			System.out.println("未知等级");
		}
		System.out.println("等级是" + grade);
	}
}