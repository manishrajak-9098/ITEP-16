import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PomodoroTimer extends JFrame {
    private int seconds =  10; // 25 minutes = 1500 seconds
    private Timer timer;
    private JLabel timeLabel;
    private JButton startBtn, stopBtn, resetBtn;

    public PomodoroTimer() {
        setTitle("Focus Timer - Pomodoro");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Time label
        timeLabel = new JLabel(formatTime(seconds), JLabel.CENTER);
        timeLabel.setFont(new Font("SansSerif", Font.BOLD, 40));

        // Buttons
        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");
        resetBtn = new JButton("Reset");

        JPanel panel = new JPanel();
        panel.add(startBtn);
        panel.add(stopBtn);
        panel.add(resetBtn);

        add(timeLabel, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        // Timer logic – countdown every second
        timer = new Timer(1000, e -> {
            if (seconds > 0) {
                seconds--;
                timeLabel.setText(formatTime(seconds));
            } else {
                timer.stop();
                
                //  Beep sound jab timer khatam ho
                Toolkit.getDefaultToolkit().beep();
                
               //  multiple beep ke liye
                 for (int i = 0; i < 12; i++) {
                     Toolkit.getDefaultToolkit().beep();
                     try { Thread.sleep(1000); } catch (InterruptedException ex) {}
                 }

                JOptionPane.showMessageDialog(this, "Time's up! Take a short break ");
            }
        });

        // Button actions
        startBtn.addActionListener(e -> timer.start());
        stopBtn.addActionListener(e -> timer.stop());
        resetBtn.addActionListener(e -> {
            timer.stop();
            seconds =  10; // reset to 25 minutes
            timeLabel.setText(formatTime(seconds));
        });

        setVisible(true);
    }

    // Format time in mm:ss
    private String formatTime(int totalSeconds) {
        int mins = totalSeconds / 60;
        int secs = totalSeconds % 60;
        return String.format("%02d:%02d", mins, secs);
    }
       
    public static void main(String[] args) {
        new PomodoroTimer();
    }
}
