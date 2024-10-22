import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonProject {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pet Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel instructionLabel = new JLabel("Choose a pet:");
        panel.add(instructionLabel, BorderLayout.NORTH);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(5, 1));

        JLabel petImageLabel = new JLabel();
        petImageLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(petImageLabel, BorderLayout.CENTER);

        JRadioButton birdButton = new JRadioButton("Bird");
        JRadioButton catButton = new JRadioButton("Cat");
        JRadioButton dogButton = new JRadioButton("Dog");
        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        JRadioButton pigButton = new JRadioButton("Pig");

        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);

        panel.add(radioPanel, BorderLayout.WEST);

        ImageIcon birdIcon = new ImageIcon("bird.png");
        ImageIcon catIcon = new ImageIcon("cat.png");
        ImageIcon dogIcon = new ImageIcon("dog.png");
        ImageIcon rabbitIcon = new ImageIcon("rabbit.png");
        ImageIcon pigIcon = new ImageIcon("pig.png");

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (birdButton.isSelected()) {
                    petImageLabel.setIcon(birdIcon);
                } else if (catButton.isSelected()) {
                    petImageLabel.setIcon(catIcon);
                } else if (dogButton.isSelected()) {
                    petImageLabel.setIcon(dogIcon);
                } else if (rabbitButton.isSelected()) {
                    petImageLabel.setIcon(rabbitIcon);
                } else if (pigButton.isSelected()) {
                    petImageLabel.setIcon(pigIcon);
                }
            }
        };

        birdButton.addActionListener(listener);
        catButton.addActionListener(listener);
        dogButton.addActionListener(listener);
        rabbitButton.addActionListener(listener);
        pigButton.addActionListener(listener);

        pigButton.setSelected(true);
        petImageLabel.setIcon(pigIcon);

        frame.add(panel);
        frame.setVisible(true);
    }
}
