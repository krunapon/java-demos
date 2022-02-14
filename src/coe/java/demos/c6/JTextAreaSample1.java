package coe.java.demos.c6;

import javax.swing.*;
import java.awt.*;

public class JTextAreaSample1 {
	public static void addComponents(Container cp) {
		JTextArea ta = new JTextArea(3,10);
		ta.append("������ѹ��� 2 �á�Ҥ� 2554 " +
				"�.��.�ѵ��� �ѹ���� �ͧ���˹���Ҥ�Ԫ����ǡ����¸ҽ��¾Ѳ�ҹѡ�֡�� ��� ��.��.��ȡ� ��ó�ѵ���Ż� " +
				"���˹��Ἱ����ǡ������� �ӹѡ�֡��" +
				"�дѺ��ԭ�ҵ�� � ��� �͡�ӹǹ 40 �� " +
				"�Թ�ҧ��֡�Ҵ٧ҹ���¡�дѺ������ʶ" +
				"����٧���������ա����§�ѭ�ҹ�ӷ��� ����Ѵ��ǿ�� " +
				"����ͺҧ���� �ѧ��Ѵ������� " +
				"�¾�����ʶ���¡�дѺ�����ػ���ҳ 460 �� " +
				"���ҧ�������ª�ǧ��ҧ��ا�����ظ�����Ҫ�ҹ� " +
				"������͹��ó������ä��ͧ��������ǿ�� " +
				"㹡���֡�Ҵ٧ҹ�� �.��� �������� ");
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

