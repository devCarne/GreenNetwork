package fileIO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FileCopySwing extends JFrame implements ActionListener {

    JTextField textField;
    JButton button;
    static JLabel label;

    FileCopySwing() {
        setTitle("파일 복사기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        textField = new JTextField(30);
        button = new JButton("찾기");
        label = new JLabel();
        label.setText("텍스트 박스에 입력한 경로로 파일을 복사합니다.");

        add(textField);
        add(button);
        add(label);

        setSize(400, 400);
        setVisible(true);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser fileChooser = new JFileChooser();
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File src = fileChooser.getSelectedFile();

                makeFolder(textField.getText());

                copyFile(src, textField.getText());
            }
        }
    }

    static void makeFolder(String desc) {

        File descFolder = new File(desc);
        if (!descFolder.exists()) descFolder.mkdir();
    }

    static void copyFile(File src, String descFolder) {
        try {
            FileInputStream fileInputStream = new FileInputStream(src);
            FileOutputStream fileOutputStream = new FileOutputStream(descFolder + "//" + src.getName());

            byte[] bytes = new byte[1024 * 10];
            while (true) {
                int n = fileInputStream.read(bytes);
                fileOutputStream.write(bytes, 0, n);
                if (n < bytes.length) {
                    break;
                }
            }

            fileInputStream.close();
            fileOutputStream.close();

        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FileCopySwing();
    }
}