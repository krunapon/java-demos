package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class JTextAreaSample1 {
	public static void addComponents(Container cp) {
		JTextArea ta = new JTextArea(3,10);
		ta.append("เมื่อวันที่ 2 กรกฎาคม 2554 " +
				"อ.ดร.รัตมณี นันทสาร รองหัวหน้าภาควิชาวิศวกรรมโยธาฝ่ายพัฒนานักศึกษา และ รศ.ดร.พงศกร พรรณรัตนศิลป์ " +
				"หัวหน้าแผนกวิศวกรรมปฐพี นำนักศึกษา" +
				"ระดับปริญญาตรี โท และ เอกจำนวน 40 คน " +
				"เดินทางไปศึกษาดูงานการยกระดับพระอุโบสถ" +
				"ให้สูงขึ้นเพื่อหลีกเลี่ยงปัญหาน้ำท่วม ที่วัดแก้วฟ้า " +
				"อำเภอบางกรวย จังหวัดนนทบุรี " +
				"โดยพระอุโบสถที่ยกระดับมีอายุประมาณ 460 ปี " +
				"สร้างขึ้นในสมัยช่วงกลางกรุงศรีอยุธยาเป็นราชธานี " +
				"เพื่อเป็นอนุสรณ์การสวรรคตของพระเจ้าแก้วฟ้า " +
				"ในการศึกษาดูงานมี อ.ธเนศ วีระศิริ ");
		ta.insert("US embassies around the region are closely following the Thailand-Cambodia confrontation, and believe Prime Minister Hun Sen touched off the conflict when he saw political gain in the waning days of the pro-Thaksin governments in late 2008.", 5);
		// break text into multiple lines
		ta.setLineWrap(true);
		// cut the text at the whitespace
		ta.setWrapStyleWord(true);
		JScrollPane scroll = new JScrollPane(ta);
		cp.add(scroll);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("JTextAreaSample");
		addComponents(frame.getContentPane());
		frame.pack();
		frame.setLocation(100, 100);
		frame.setVisible(true);
	}
}

