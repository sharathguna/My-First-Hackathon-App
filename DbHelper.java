package com.thedebuggers.math;
import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DbHelper extends SQLiteOpenHelper {
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "triviaQuiz";
	// tasks table name
	private static final String TABLE_QUEST = "quest";
	// tasks Table Columns names
	private static final String KEY_ID = "id";
	private static final String KEY_QUES = "question";
	private static final String KEY_ANSWER = "answer"; //correct option
	private static final String KEY_OPTA= "opta"; //option a
	private static final String KEY_OPTB= "optb"; //option b
	private static final String KEY_OPTC= "optc"; //option c
	private SQLiteDatabase dbase;
	public DbHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		dbase=db;
		String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
				+ " TEXT, " + KEY_ANSWER+ " TEXT, "+KEY_OPTA +" TEXT, "
				+KEY_OPTB +" TEXT, "+KEY_OPTC+" TEXT)";
		db.execSQL(sql);		
		addQuestions();
		//db.close();
	}
	private void addQuestions()
	{
		Question q1=new Question("By Mathematical  Induction,  what  is   4 + 4.5 + 4. 5^2  +  4. 5^3 so on till + 4. 5^n ?\n"
                ,"5^(n-1)", "5^(n+1)", "5^(n+1)-1", "5^(n+1)-1");
		this.addQuestion(q1);
		Question q2=new Question("4^3n-1 is divisible by  ", "63", "64", "73", "63");
		this.addQuestion(q2);
		Question q3=new Question("n^(2n+1)>= ","n!", "(n!)^2","n^2","n^2");
		this.addQuestion(q3);
		Question q4=new Question("7*4^(4n-3)< ",	"n!", "n^2", "n","n!");
		this.addQuestion(q4);
		Question q5=new Question("7^(2n)-1  is  divisible by ","54","48","36","48");
		this.addQuestion(q5);
        Question q6=new Question("5^n+(2.3^(n-1))+1  is  a multiple of","16","4","8","8");
        this.addQuestion(q6);
        Question q7=new Question("11^(n+2)+12^(2n+1) is divisible by","146","125","133","133");
        this.addQuestion(q7);
        Question q8=new Question("the number of  elements  in  the power set of a set with n elements is ","2n","2(n+1)","2^n","2^n");
        this.addQuestion(q8);
        Question q9=new Question("which of the following laws apply for sets?","commutative","associative & distributive","all of these","all of these");
        this.addQuestion(q9);
        Question q10=new Question("According to addition principle,  for 2 disjoint sets  A and  B,|AUB|=","|A|+|B|","|A|-|B|","|A|+2|B|","|A|+|B|");
        this.addQuestion(q10);
        Question q11=new Question("Among  1 to 200, the number  of  integers  that are  not divisible by 5  are ","50","135","160","160");
        this.addQuestion(q11);
        Question q12=new Question("Out of 50 students in a class, 15 took Maths, 8 took physics, 6 took chemistry and 5 took all the three.  The number of students who took none is atleast","31","35","29","31");
        this.addQuestion(q12);
        Question q13=new Question("In a sample of 100 logic chips, 23 have a defect D1, 26 have  D2, 30 have D3, 7 have D1 and D2, 8 have D1 and D3, 10 have D2 and D3,  3 have all.  How many chips  having  atleast  one defect is ","65","43","57","57");
        this.addQuestion(q13);
        Question q14=new Question("In a class of 52 students, 30 took  C++, 28 pascal , 13 both. How many  took  atleast  one  of  them?","45","28","35","45");
        this.addQuestion(q14);
        Question q15=new Question("A function is said to be if f(a)=f(b), implies a=b.","onto","one-one","many-one","one-one");
        this.addQuestion(q15);
        Question q16=new Question(" The function f(x)=x+1 from the set of integers to itself is what","onto","one-one","many-one","onto");
        this.addQuestion(q16);
        Question q17=new Question("The value of [1/2.[5/2]] is _______________.","1","2","3","1");
        this.addQuestion(q17);
        Question q18=new Question("Which of the following function  f: Z X Z -> Z is not onto?","f(a,b)=a+b","f(a,b)=|b|","f(a,b)=a","f(a,b)=|b|");
        this.addQuestion(q18);
        
        Question q19=new Question("let |A|=m, |B|=n.  then  the total  number of possible  functions  from A to B is ","n^m","m^n","mn","n^m");
        this.addQuestion(q19);
        Question q20=new Question("The inverse of function f(x) = x3 + 2 is __________.","f-1(y)=(yâ“2)^1/2","f-1(y)=(y-2)^1/3","f-1(y)=(y)^1/3","f-1(y)=(y-2)^1/3");
        this.addQuestion(q20);
        Question q21=new Question("A bag contains 2 red, 3 green and 2 blue balls. Two balls are drawn at random. What is the probability that none of the balls drawn is blue?","10/21","11/21","1/7","10/21");
        this.addQuestion(q21);
        Question q22=new Question("Two dice are tossed. The probability that  the total number is a prime number is ¦","1/6","5/12","1/2","5/12");
        this.addQuestion(q22);
        Question q23=new Question("A   non- empty  subset  H of a group G  is called a â€œsub group of G if ¦","H itself is a group under  the binary operation in G.","H is a group under  some  other  binary  operation.","H is  not   a  group.","H itself is a group under  the binary operation in G.");
        this.addQuestion(q23);
        Question q24=new Question("The Klien-4 group is ","abelian","non abelian","cyclic","cyclic");
        this.addQuestion(q24);
        Question q25=new Question("A Multiplicative group of non-zero rational numbers is  ","cyclic","non cyclic","normal","non cyclic");
        this.addQuestion(q25);
        Question q26=new Question("The number of simple digraphs with |V|=3 is ","abelian","non abelian","cyclic","cyclic");
        this.addQuestion(q26);
        Question q27=new Question("B Trees are generally ","very deep and narrow ","very wide and shallow\n","cannot say  \n","cannot say ");
        this.addQuestion(q27);
        Question q28=new Question("A technique for direct search is ","Hashing","Linear Search","Tree Search ","Hashing");
        this.addQuestion(q28);
        Question q29=new Question("If h is any hashing function and is used to hash n \n" +
                "keys in to a table of size m, where n<=m, the \n" +
                "expected number of collisions involving a particular\n" +
                "key x is ","less than 1",". less than n/2.","less than m","less than 1");
        this.addQuestion(q29);
        Question q30=new Question("If G is a finite group and H is a subgroup of G, then the order of ","multiplies with order of G.","adds with order of G.","divides the order of G.","divides the order of G.");
        this.addQuestion(q30);
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
		// Drop older table if existed
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
		// Create tables again
		onCreate(db);
	}
	// Adding new question
	public void addQuestion(Question quest) {
		//SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(KEY_QUES, quest.getQUESTION()); 
		values.put(KEY_ANSWER, quest.getANSWER());
		values.put(KEY_OPTA, quest.getOPTA());
		values.put(KEY_OPTB, quest.getOPTB());
		values.put(KEY_OPTC, quest.getOPTC());
		// Inserting Row
		dbase.insert(TABLE_QUEST, null, values);		
	}
	public List<Question> getAllQuestions() {
		List<Question> quesList = new ArrayList<Question>();
		// Select All Query
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		dbase=this.getReadableDatabase();
		Cursor cursor = dbase.rawQuery(selectQuery, null);
		// looping through all rows and adding to list
		if (cursor.moveToFirst()) {
			do {
				Question quest = new Question();
				quest.setID(cursor.getInt(0));
				quest.setQUESTION(cursor.getString(1));
				quest.setANSWER(cursor.getString(2));
				quest.setOPTA(cursor.getString(3));
				quest.setOPTB(cursor.getString(4));
				quest.setOPTC(cursor.getString(5));
				quesList.add(quest);
			} while (cursor.moveToNext());
		}
		// return quest list
		return quesList;
	}
	public int rowcount()
	{
		int row=0;
		String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
		SQLiteDatabase db = this.getWritableDatabase();
		Cursor cursor = db.rawQuery(selectQuery, null);
		row=cursor.getCount();
		return row;
	}
}
