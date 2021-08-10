package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text resultText;

    private Model model = new Model();
    private long num1 = 0, num2 = 0;
    private String operator = "";

    public void processNumbers(ActionEvent e) {
        String numVal = ((Button) e.getSource()).getText();
        String screenVal = resultText.getText().equals("0") ? "" : resultText.getText();
        resultText.setText(screenVal + numVal);

    }

    public void processOperators(ActionEvent e) {
        String opVal = ((Button) e.getSource()).getText();

        if ("=".equals(opVal)) {
            if (operator.isEmpty())
                return;

            num2 = Long.parseLong(resultText.getText());
            resultText.setText(String.valueOf(model.calculate(num1, num2, operator)));
            operator = "";
        }
        else {
            if (!operator.isEmpty()) {
                num1 = model.calculate(num1, Long.parseLong(resultText.getText()), operator);
                resultText.setText("");
                return;
            }

            operator = opVal;
            num1 = Long.parseLong(resultText.getText());
            resultText.setText("");
        }
    }
    public void clear() {
        resultText.setText("0");
        operator = "";
        num1 = num2 = 0;
    }

}
