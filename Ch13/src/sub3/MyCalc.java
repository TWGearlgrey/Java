package sub3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MyCalc {

	private JFrame frmMyCalcV;
	private JTextField txtDsp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMyCalcV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	ArrayList<Double> numberList = new ArrayList<>(); // 숫자 저장 리스트
	ArrayList<String> arithList  = new ArrayList<>(); // 연산자 저장 리스트
	static final Double ERROR_NUM = -99999.999; // 오류 넘버
	
	StringBuilder sb = new StringBuilder(); //입력데이터를 저장하는 변수
	char[] arithmetic = {'+', '*', '-', '/'};
	
	
	// 입력된 데이터(숫자, 연산자를 통해 결과 값을 반환하는 메서드
	public Double Cal() {
		if(!distinct()) return ERROR_NUM;
		
		double result = 0;
		
		// 우선순위 1번째인 *, / 연산에 대한 계산 로직
		int size = arithList.size();
		for(int i=0 ; i<size ; i++) {
			String s = arithList.get(i);
			if(s.contains("*") || s.contains("/")) {
				if(s.equals("*")) {
					result = numberList.get(i) * numberList.get(i+1);
				} else if (s.equals("/")) {
					result = numberList.get(i) / numberList.get(i+1);
				}
				arithList.remove(i); // 연산에 사용된 연산자 제거
				numberList.set(i+1, result); // 연산 결과같을 덮어 씌워 저장
				numberList.remove(i); // 2개의 값을 계산후 덮어씌운 하나의 값을 제외하곤 제거
				
				i--;
				size--;
			}
		}
		
		// 우선순위 2번째인 +, - 연산에 대한 로직
		size = arithList.size();
		for(int i=0 ; i<size ; i++) {
			String s = arithList.get(i);
			
			if (s.equals("+")) {
				result = numberList.get(i) + numberList.get(i+1);
			}else if (s.equals("-")) {
				result = numberList.get(i) - numberList.get(i+1);
			}
			
			arithList.remove(i); // 연산에 사용된 연산자 제거
			numberList.set(i+1, result); // 연산 결과값을 덮어씌워 저장
			numberList.remove(i); // 결과값 제외한 값 제거
			
			i--;
			size--;
		}
		return numberList.get(0);
	}
	
	
	// 숫자와 연산자를 구분해 저장하는 메서드
	public boolean distinct() {
		char[] cArr = sb.toString().toCharArray();
		StringBuilder temp = new StringBuilder();
		
		for(int i=0 ; i<cArr.length ; i++) {
			
			if(cArr[i] == '+' || cArr[i] == '-' || cArr[i] == '/' || cArr[i] == '*' ) {
				
				if(i ==0) { //첫번째 값의 부호가 +,-인 경우
					
					if(cArr[i] == '-' || cArr[i] == '+') {
						temp.append(cArr[i]);
						continue;
					}else if(cArr[i] == '*' || cArr[i] =='/') { //첫번째가 /나 *경우 데이터 초기화 및 오류표시
						JOptionPane.showConfirmDialog(null, "잘못된 수식입니다.", "경고", JOptionPane.INFORMATION_MESSAGE);
						reset();
						return false;
					}
				}
				
				numberList.add(Double.parseDouble(temp.toString())); //연산자가 나오기 전까지 numberList에 저장
				arithList.add(String.valueOf(cArr[i])); //연산자를 arithList에 저장
				temp.delete(0, temp.length()); // 다음값을 위해 초기화
				
			} else if (i == cArr.length -1) { //데이터에 저장된 마지막 인덱스일 경우 마지막 연산자후에 숫자를 저장해온 ㅅemp변수에 마지막 인덱스 값을 넣고 numberList에 저장
				temp.append(cArr[i]);
				numberList.add(Double.valueOf(temp.toString()));
				
			} else {
				temp.append(cArr[i]);
			}
		}
		return true;
	}
	
	
	// 모든 데이터를 초기화하는 메섣
	public void reset() {
		sb.delete(0, sb.length());
		numberList.clear();
		arithList.clear();
		txtDsp.setText("0");
	}
	
	// 버튼이 눌릴때마다 텍스트에 해당 버튼의 값을 추가해서 디스플레이에 보이도록 하는 메서드
	public void dataAppend(String btnText) {
		sb.append(btnText);
		txtDsp.setText(sb.toString());
	}
	
	
	// sb변수가 비어있는지 확인하는 메서드
	public boolean isEmpty() {
		return sb.length() == 0;
	}
	
	// sb 변수 마지막에 문자열 값이 연산자인지 확인하는 메서드
	public boolean check() {
		if(isEmpty()) 
			return true;
		
		// '='을 포함한 경우 초기화
		if(sb.toString().contains("=")) {
			reset();
			return false;
		}
			
			char[] cArr = sb.toString().toCharArray();
			
			for(char ch : arithmetic) {
				if(cArr[cArr.length - 1] == ch) {
					changeArit();
					return true;
				}
			}
			
			return true;
		}
	
	// sb변수 마지막에 있는 문자열 삭제 메서드
	public void changeArit() {
		
		char[] cArr = sb.toString().toCharArray();
		
		sb.delete(sb.length() - 1, sb.length());
		System.out.println(sb.toString());
	}
	
	// 프레임 생성
	public MyCalc() { 
		frmMyCalcV = new JFrame();
		frmMyCalcV.setTitle("MyCalc v1.0");
		frmMyCalcV.setBounds(100, 100, 300, 381);
		frmMyCalcV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyCalcV.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setBackground(new Color(255, 255, 255));
		txtDsp.setEditable(false);
		txtDsp.setFont(new Font("굴림", Font.PLAIN, 24));
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setText("0");
		txtDsp.setBounds(12, 10, 256, 56);
		frmMyCalcV.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		
		// 버튼 1
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn1.getText());
			}
		});
		btn1.setBounds(12, 206, 55, 55);
		frmMyCalcV.getContentPane().add(btn1);
		
		
		// 버튼 2
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn2.getText());
			}
		});
		btn2.setBounds(79, 206, 55, 55);
		frmMyCalcV.getContentPane().add(btn2);
		
		
		// 버튼 3
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn3.getText());
			}
		});
		btn3.setBounds(146, 206, 55, 55);
		frmMyCalcV.getContentPane().add(btn3);
		
		
		// 버튼 4
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn4.getText());
			}
		});
		btn4.setBounds(12, 141, 55, 55);
		frmMyCalcV.getContentPane().add(btn4);
		
		
		// 버튼 5
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn5.getText());
			}
		});
		btn5.setBounds(79, 141, 55, 55);
		frmMyCalcV.getContentPane().add(btn5);
		
		
		// 버튼 6
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn6.getText());
			}
		});
		btn6.setBounds(146, 141, 55, 55);
		frmMyCalcV.getContentPane().add(btn6);
		
		
		// 버튼 7
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn7.getText());
			}
		});
		btn7.setBounds(12, 76, 55, 55);
		frmMyCalcV.getContentPane().add(btn7);
		
		
		// 버튼 8
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn8.getText());
			}
		});
		btn8.setBounds(79, 76, 55, 55);
		frmMyCalcV.getContentPane().add(btn8);
		
		
		// 버튼 9
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btn9.getText());
			}
		});
		btn9.setBounds(146, 76, 55, 55);
		frmMyCalcV.getContentPane().add(btn9);
		
		
		// 버튼 0
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn0.getText());
			}
		});
		btn0.setBounds(12, 271, 55, 55);
		frmMyCalcV.getContentPane().add(btn0);

		
		// 버튼 plus
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnPlus.getText());
			}
		});
		btnPlus.setBounds(213, 271, 55, 55);
		frmMyCalcV.getContentPane().add(btnPlus);
		
		
		// 버튼 minus
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnMinus.getText());
			}
		});
		btnMinus.setBounds(213, 206, 55, 55);
		frmMyCalcV.getContentPane().add(btnMinus);
		
		
		// 버튼 multi
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnMulti.getText());
			}
		});
		btnMulti.setBounds(213, 141, 55, 55);
		frmMyCalcV.getContentPane().add(btnMulti);
		
		
		// 버튼 div
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnDiv.getText());
			}
		});
		btnDiv.setBounds(213, 76, 55, 55);
		frmMyCalcV.getContentPane().add(btnDiv);
		
		
		// 버튼 cancel
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sb.delete(0, sb.length());
				txtDsp.setText("0");
				numberList.clear();
				arithList.clear();
			}
		});
		btnCancel.setBounds(79, 271, 55, 55);
		frmMyCalcV.getContentPane().add(btnCancel);
		

		// 버튼 equal
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(check() == false) {//'=' 값이 이미 있는 경우 리턴
					return;
				}
				if(isEmpty()) {//데이터가 비어있는 경우 리턴
					return;
				}
				
				Double result = Cal();
				if(result == ERROR_NUM) return; // result값이 오류번호면 리턴
				
				String formatResult = "";
				result = Double.parseDouble(String.format("%.1f", result)); // 소수첫째자리까지 표현
				
				if(String.valueOf(result).length() > 8) { //결과값(소수점 길이 포함)가 8이상일때
					
					DecimalFormat df = new DecimalFormat("#.####E0");
					formatResult = df.format(result);
				} else {
					formatResult = String.valueOf(result);
				}
				dataAppend(btnEq.getText());
				dataAppend(formatResult);
				numberList.clear();
				arithList.clear();
			}
		});
		btnEq.setBounds(146, 271, 55, 55);
		frmMyCalcV.getContentPane().add(btnEq);
		
		
	}

}
