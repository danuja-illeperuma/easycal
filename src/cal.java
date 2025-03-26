import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//danuja
public class cal  extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JPanel mainpanel;
    private JLabel simplecal;
    private JButton btnadd;
    private JButton btndivide;
    private JButton btnmultiply;
    private JButton button4;
    private JLabel answer;
    private JButton clearButton;

    public cal() {




        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText();
                String num2 = textField2.getText();
                double value;




                if (textField1.getText().equals("") || textField2.getText().equals("")) {
                    answer.setText("Please enter all fields");


                } else if (!(num1.matches("-?\\d+(\\.\\d+)?")) || !(num2.matches("-?\\d+(\\.\\d+)?"))) {
                    answer.setText("Please enter valid numbers");
                    
                }

                else {

                    value = Double.parseDouble(num1) + Double.parseDouble(num2);
                    answer.setText("The result is: " + value);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText();
                String num2 = textField2.getText();

                double value;

                if (textField1.getText().equals("") || textField2.getText().equals("")) {
                    answer.setText("Please enter all fields");


                } else if (!(num1.matches("-?\\d+(\\.\\d+)?")) || !(num2.matches("-?\\d+(\\.\\d+)?"))) {
                    answer.setText("Please enter valid numbers");

                }

                else {
                    value = Double.parseDouble(num1) - Double.parseDouble(num2);
                    answer.setText("The result is: " + value);
                }

            }
        });
        btnmultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText();
                String num2 = textField2.getText();

                double value;

                if (textField1.getText().equals("") || textField2.getText().equals("")) {
                    answer.setText("Please enter all fields");


                } else if (!(num1.matches("-?\\d+(\\.\\d+)?")) || !(num2.matches("-?\\d+(\\.\\d+)?"))) {
                    answer.setText("Please enter valid numbers");

                }

                else {
                    value = Double.parseDouble(num1) * Double.parseDouble(num2);
                    answer.setText("The result is: " + value);
                }
            }
        });
        btndivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText();
                String num2 = textField2.getText();

                double value;

                if (textField1.getText().equals("") || textField2.getText().equals("")) {
                    answer.setText("Please enter all fields");


                } else if (!(num1.matches("-?\\d+(\\.\\d+)?")) || !(num2.matches("-?\\d+(\\.\\d+)?"))) {
                    answer.setText("Please enter valid numbers");

                }

                else {
                    value = Double.parseDouble(num1) / Double.parseDouble(num2);
                    answer.setText("The result is: " + value);
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
            }
        });
    }


        public static void main (String[] args){


            cal frame = new cal();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(frame.mainpanel);
            frame.setTitle("bmical");
            frame.setSize(450, 450);
            frame.setVisible(true);

        }
    }



