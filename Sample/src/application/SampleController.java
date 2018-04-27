package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class SampleController implements Initializable {

	@FXML
	private void clickLoginButton(ActionEvent event) {
		System.out.println("Login success");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
}
