package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import view.MainWindow;

/**
 * This button contacts the inputStringField and grabs the string that the user
 * enters, and inserts it into the DPDA for testing/parsing.
 *
 * @author Joshua
 */
public class SetStringButton extends JButton implements ActionListener {

  private final MainWindow mainWindow;

  public SetStringButton(MainWindow window) {
    this.mainWindow = window;

    super.setText("Set String");
    super.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent _e) {
    this.setEnabled(false);

    this.mainWindow.getDpda().setInputString(this.mainWindow.getButtonPanel().getInputField().getText());
    this.mainWindow.getButtonPanel().getStepButton().setEnabled(true);
    this.mainWindow.getButtonPanel().repaint();
    this.mainWindow.getDrawingPanel().repaint();
    this.mainWindow.getTransitionPanel().repaint();
  }
}
