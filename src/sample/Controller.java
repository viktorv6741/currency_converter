package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {

    @FXML private TextField usdRate;
    @FXML private TextField eurRate;
    @FXML private TextField result;
    @FXML private TextField uah;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private void usdButton(ActionEvent event){

        if(usdRate.getText().isEmpty() || eurRate.getText().isEmpty() || uah.getText().isEmpty()){
            showAlert();
        }
        else if(!usdRate.getText().matches("(?!0)[0-9]*") || !eurRate.getText().matches("(?!0)[0-9]*") || !uah.getText().matches("(?!0)[0-9]*")){
            showAlert();
        }
        else {
            Model model = new Model(Double.parseDouble(usdRate.getText()), Double.parseDouble(eurRate.getText()), Double.parseDouble(uah.getText()));
            result.setText(Double.toString(model.usdCalculation()));
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private void eurButton(ActionEvent event){

        if(usdRate.getText().isEmpty() || eurRate.getText().isEmpty() || uah.getText().isEmpty()){
            showAlert();
        }
        else if(!usdRate.getText().matches("(?!0)[0-9]*") || !eurRate.getText().matches("(?!0)[0-9]*") || !uah.getText().matches("(?!0)[0-9]*")){
            showAlert();
        }
        else {
            Model model = new Model(Double.parseDouble(usdRate.getText()), Double.parseDouble(eurRate.getText()), Double.parseDouble(uah.getText()));
            result.setText(Double.toString(model.eurCalculation()));
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private void clear(ActionEvent event){
        /*usdRate.clear();
        eurRate.clear();*/
        uah.clear();
        result.clear();
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    public void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR, "Not appropriate value, please try one more time", ButtonType.OK);
        alert.showAndWait();
    }

}
