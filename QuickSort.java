import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuickSortUI extends JFrame {

    private JTextField inputField;
    private JLabel outputLabel;

    public QuickSortUI() {
        setTitle("QuickSort Algorithm");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create UI components
        JPanel panel = new JPanel();
        inputField = new JTextField(10);
        JButton sortButton = new JButton("Sort");
        outputLabel = new JLabel();

        // Add components to the panel
        panel.add(inputField);
        panel.add(sortButton);

        // Add panel and output label to the frame
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(outputLabel, BorderLayout.SOUTH);

        // Add event listener to the sort button
        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String[] numbers = input.split("\\s+");
                int[] arr = new int[numbers.length];
                for (int i = 0; i < numbers.length; i++) {
                    arr[i] = Integer.parseInt(numbers[i]);
                }

                quickSort(arr, 0, arr.length - 1);
                outputLabel.setText(Arrays.toString(arr));
            }
        });
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        QuickSortUI app = new QuickSortUI();
        app.setVisible(true);
    }
}
