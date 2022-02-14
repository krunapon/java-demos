package coe.java.demos.c7;
/**
 * This class is to use two-dimensional arrays to
 * store the scores of 2 exams that 5 students take
 * Then, it computes the average score for each student
 * and for each exam
 * @author kanda
 */
import java.util.Scanner;
public class TwoDimArrayDemo {
	private double[][] scores;
	private final int NUM_STUS = 5;
	private final int NUM_EXAMS = 2;
	private double[] avgExamScores;
	private double[] avgStuScores;
	public TwoDimArrayDemo() {
		scores = new double[NUM_EXAMS][NUM_STUS];
		avgExamScores = new double[NUM_EXAMS];
		avgStuScores = new double[NUM_STUS];
	}
	public void init() {
		Scanner readIn = new Scanner(System.in);
		for (int i = 0; i < NUM_EXAMS; i++) {
			for (int j = 0; j < NUM_STUS; j++) {
				double d = readIn.nextDouble();
				scores[i][j] = d;
			}
		}
	}
	public void display() {
		for (int i = 0; i < NUM_EXAMS; i++) {
			System.out.println("The scores of the exam" + (i+1) + " are");
			for (int j = 0; j < NUM_STUS; j++) {
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < NUM_EXAMS; i++)
			System.out.println("The averge score for exam"
					+(i+1)+ " is " + avgExamScores[i]);
		
		for (int i = 0; i < NUM_STUS; i++)
			System.out.println("The averge score for student"
					+(i+1)+ " is " + avgStuScores[i]);
	}
	public void computeAvgExamScores() {
		for (int i = 0; i < NUM_EXAMS; i++) {
			double sum = 0;
			for (int j = 0; j < NUM_STUS; j++) {
				sum = sum + scores[i][j];
			}
			avgExamScores[i] = sum/NUM_STUS;
		}
	}
	public void computeAvgStuScores() {
		for (int i = 0; i < NUM_STUS; i++) {
			double sum = 0;
			for (int j = 0; j < NUM_EXAMS; j++) {
				sum = sum + scores[j][i];
			}
			avgStuScores[i] = sum/NUM_EXAMS;
		}
	}
	public static void main(String[] args) {
		TwoDimArrayDemo td = new TwoDimArrayDemo();
		td.init();
		td.computeAvgExamScores();
		td.computeAvgStuScores();
		td.display();
	}
}
