//Class:		CSE 1322L
//Section: 		04
//Term:			Fall 2020
//Instructor:	Joseph Tierno
//Name:			Jason Flores
//Assignment#:			8

/* Got help from a lot of youtube tutorials on how to use GUI and create calculators.
 */

package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class Controller implements Initializable
{
    @FXML
    private TextField calclabel;
    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnSubtract;
    @FXML
    private Button btnMultiply;
    @FXML
    private Button btnDivide;
    @FXML
    private Button btnEqual;
    @FXML
    private Button btnClear;


    @FXML
    private void btn0Action()
    {
        btn0.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "0");
            }
        });
    }

    @FXML
    private void btn1Action()
    {
        btn1.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "1");
            }
        });
    }

    @FXML
    private void btn2Action()
    {
        btn2.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "2");
            }
        });
    }

    @FXML
    private void btn3Action()
    {
        btn3.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "3");
            }
        });
    }

    @FXML
    private void btn4Action()
    {
        btn4.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "4");
            }
        });
    }

    @FXML
    private void btn5Action()
    {
        btn5.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "5");
            }
        });
    }

    @FXML
    private void btn6Action()
    {
        btn6.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "6");
            }
        });
    }

    @FXML
    private void btn7Action()
    {
        btn7.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "7");
            }
        });
    }

    @FXML
    private void btn8Action()
    {
        btn8.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "8");
            }
        });
    }

    @FXML
    private void btn9Action()
    {
        btn9.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + "9");
            }
        });
    }

    private void btnAddAction()
    {
        btnAdd.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + " + ");
            }
        });
    }

    @FXML
    private void btnSubtractAction()
    {
        btnSubtract.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + " - ");
            }
        });
    }

    @FXML
    private void btnMultiplyAction()
    {
        btnMultiply.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + " * ");
            }
        });
    }

    @FXML
    private void btnDivideAction()
    {
        btnDivide.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(calclabel.getText() + " / ");
            }
        });
    }

    @FXML
    private void btnEqualAction()
    {
        btnEqual.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.setText(getAnswer(calclabel.getText().trim()) + "");
            }
        });
    }

    @FXML
    private void btnClearAction()
    {
        btnClear.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                calclabel.clear();
            }
        });
    }

    private double getAnswer(String str)
    {
        ArrayList<String> operationList = new ArrayList<String>();
        StringTokenizer st = new StringTokenizer(str, "+-*/", true);

        String operator = "";

        while (st.hasMoreTokens())
        {
            String token = st.nextToken();

            if ("+-/*".contains(token))
                operator = token.trim();
            else
                operationList.add(token.trim());

        }

        double ans = 0;

        switch(operator)
        {
            case "+":
            {
                double num1 = Double.parseDouble(operationList.get(0));
                double num2 = Double.parseDouble(operationList.get(1));
                ans = (num1 + num2);
                break;
            }

            case "-":
            {
                double num1 = Double.parseDouble(operationList.get(0));
                double num2 = Double.parseDouble(operationList.get(1));
                ans = (num1 - num2);
                break;
            }

            case "*":
            {
                double num1 = Double.parseDouble(operationList.get(0));
                double num2 = Double.parseDouble(operationList.get(1));
                ans = (num1 * num2);
                break;
            }

            case "/":
            {
                double num1 = Double.parseDouble(operationList.get(0));
                double num2 = Double.parseDouble(operationList.get(1));

                if(num2 == 0)
                    ans = 0;
                else
                    ans = (num1 / num2);
                break;
            }

        }

        return ans;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        btn0Action();
        btn1Action();
        btn2Action();
        btn3Action();
        btn4Action();
        btn5Action();
        btn6Action();
        btn7Action();
        btn8Action();
        btn9Action();
        btnAddAction();
        btnSubtractAction();
        btnMultiplyAction();
        btnDivideAction();
        btnEqualAction();
        btnClearAction();
    }

}

