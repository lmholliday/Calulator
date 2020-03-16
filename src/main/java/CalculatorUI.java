import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener {

    Calculator Calculator = new Calculator();
    JLabel displayLabel;

    public CalculatorUI() {

        super("Base 10 Calculator");

        //bigger fonts
        UIManager.put("Label.font", new FontUIResource(new Font("Dialog", Font.PLAIN, 15)));
        UIManager.put("Button.font", new FontUIResource(new Font("Dialog", Font.BOLD, 15)));

        JPanel panel = new JPanel();

        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        setContentPane(panel);

        displayLabel = new JLabel("");

        var displayLabelConstraints = new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(20, 20, 20, 20), 0, 0);
        panel.add(displayLabel, displayLabelConstraints);


        JButton button0 = new JButton("0");

        var button0constraints = new GridBagConstraints(1, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button0.addActionListener(e -> {
            Calculator.addToMainNumber("0");
            displayLabel.setText(Calculator.getMainNumber());
        });
        panel.add(button0, button0constraints);



        JButton button1 = new JButton("1");

        var button1constraints = new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calculator.addToMainNumber("1");
                displayLabel.setText(Calculator.getMainNumber());
            }
        });
        panel.add(button1, button1constraints);



        JButton button2 = new JButton("2");

        var button2constraints = new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calculator.addToMainNumber("2");
                displayLabel.setText(Calculator.getMainNumber());
            }
        });
        panel.add(button2, button2constraints);



        JButton button3 = new JButton("3");

        var button3constraints = new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calculator.addToMainNumber("3");

                displayLabel.setText(Calculator.getMainNumber());
            }
        });
        panel.add(button3, button3constraints);




        JButton button4 = new JButton("4");

        var button4constraints = new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calculator.addToMainNumber("4");

                displayLabel.setText(Calculator.getMainNumber());
            }
        });
        panel.add(button4, button4constraints);




        JButton button5 = new JButton("5");

        var button5constraints = new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calculator.addToMainNumber("5");

                displayLabel.setText(Calculator.getMainNumber());
            }
        });
        panel.add(button5, button5constraints);




        JButton button6 = new JButton("6");

        var button6constraints = new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calculator.addToMainNumber("6");

                displayLabel.setText(Calculator.getMainNumber());
            }
        });
        panel.add(button6, button6constraints);




        JButton button7 = new JButton("7");

        var button7constraints = new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button7.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calculator.addToMainNumber("7");

                displayLabel.setText(Calculator.getMainNumber());
            }
        });
        panel.add(button7, button7constraints);





        JButton button8 = new JButton("8");

        var button8constraints = new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calculator.addToMainNumber("8");

                displayLabel.setText(Calculator.getMainNumber());
            }
        });
        panel.add(button8, button8constraints);






        JButton button9 = new JButton("9");

        var button9constraints = new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button9.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Calculator.addToMainNumber("9");

                displayLabel.setText(Calculator.getMainNumber());
            }
        });
        panel.add(button9, button9constraints);





        JButton plusButton = new JButton("+");

        var plusButtonConstraints = new GridBagConstraints(3, 1, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        plusButton.addActionListener(this);
        panel.add(plusButton, plusButtonConstraints);


        JButton minusButton = new JButton("-");

        var minusButtonConstraints = new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        minusButton.addActionListener(this);
        panel.add(minusButton, minusButtonConstraints);


        JButton multiplicationButton = new JButton("x");

        var multiplicationButtonConstraints = new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        multiplicationButton.addActionListener(this);
        panel.add(multiplicationButton, multiplicationButtonConstraints);


        JButton divisionButton = new JButton("÷");

        var divisionButtonConstraints = new GridBagConstraints(3, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        divisionButton.addActionListener(this);
        panel.add(divisionButton, divisionButtonConstraints);


        JButton equalButton = new JButton("=");

        var equalButtonConstraints = new GridBagConstraints(2, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        equalButton.addActionListener(this);
        panel.add(equalButton, equalButtonConstraints);

        ///extra cred .. clear
        JButton clearButton = new JButton("C");

        var clearButtonConstraints = new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);

        clearButton.addActionListener(this);
        panel.add(clearButton, clearButtonConstraints);



        setPreferredSize(new Dimension(600, 600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Running Base10 Calculator");
        System.out.print("Loading...");
        new CalculatorUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String text = displayLabel.getText();
        String prevText = Calculator.getPrevNumber();
        if (text!=null) {

            if (text.contains("R")) {

                text = text.substring(0, text.indexOf("R"));
            }
        }
        if(prevText != null) {

            if (prevText.contains("R")) {

                Calculator.setPrevNumber(Calculator.getPrevNumber().substring(0, prevText.indexOf("R")));
            }
        }
        if (((JButton) e.getSource()).getText().equals("=")) {

            if(Calculator.getOperation() == "+"){

                Calculator.addNumber(text);
                displayLabel.setText(Calculator.getMainNumber());
            }else if(Calculator.getOperation() == "-"){

                Calculator.subtractNumber(text);
                displayLabel.setText(Calculator.getMainNumber());
            }else if(Calculator.getOperation() == "x"){

                Calculator.multiplyNumber(text);
                displayLabel.setText(Calculator.getMainNumber());
            }else if(Calculator.getOperation() == "÷"){

                Calculator.divideNumber(text);
                displayLabel.setText(Calculator.getMainNumber());

                Calculator.resetMainNumber();
            }
        }
        else if(((JButton) e.getSource()).getText().equals("C")) {

            Calculator.resetMainNumber();
            Calculator.resetPreviousNumber();

            displayLabel.setText("0");
        }
        else{

            Calculator.setOperation(((JButton) e.getSource()).getText());
            Calculator.storeAndResetMainNumber();

            displayLabel.setText(Calculator.getMainNumber());
            displayLabel.setText(Calculator.operation);
        }
    }
}
