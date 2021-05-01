package oopIntroHomework;

public class Main {

	public static void main(String[] args) {
		
		Lesson lesson1 =new Lesson(1, "Java", "Engin Demiroð", 22.00);
		
		Lesson lesson2 =new Lesson(2, "C#", "Meryem Çim", 20.00);
		
		Lesson[] lessons= {lesson1,lesson2};
		
		for(Lesson lesson: lessons) {
			
			System.out.println(lesson.name); 
		}
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="1.sýnýf";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="2.sýnýf";
		
		LessonManager lessonManager = new LessonManager();
		lessonManager.addLesson(category2, lesson1);
		lessonManager.addLesson(category1, lesson2);

	}

}
